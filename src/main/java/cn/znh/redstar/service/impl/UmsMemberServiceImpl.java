package cn.znh.redstar.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.common.api.ResultCode;
import cn.znh.redstar.component.mail.MailServer;
import cn.znh.redstar.dto.UmsMemberParam;
import cn.znh.redstar.mbg.mapper.UmsAdminDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.UmsAdminMapper;
import cn.znh.redstar.mbg.mapper.UmsMemberDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.UmsMemberMapper;
import cn.znh.redstar.mbg.model.UmsMember;
import cn.znh.redstar.service.RedisService;
import cn.znh.redstar.service.UmsMemberService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualToWhenPresent;

/**
 * @author : znh
 * @date : 22:21 2021/3/16
 * 会员登录注册管理service的实现类
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class UmsMemberServiceImpl implements UmsMemberService {
    @Resource
    UmsMemberMapper umsMemberMapper;
    @Resource
    PasswordEncoder passwordEncoder;
    /**
     * 邮件服务
     */
    @Resource
    MailServer mailServer;
    /**
     * 注入 RedisService
     */
    @Resource
    private RedisService redisService;
    /**
     * 验证码前缀
     */
    @Value("${redis.key.authCode.prefix}")
    private String  REDIS_KEY_AUTH_CODE_PREFIX;
    /**
     * 验证码过期时间
     */
    @Value("${redis.key.authCode.expire}")
    private Long REDIS_KEY_AUTH_CODE_EXPIRE;
    
    @Override
    public CommonResult generateAuthCode(String email) {
        //验证码位数
        try {
            final int AUTH_CODE_NUM =6;
            StringBuilder sb=new StringBuilder();
            Random random=new Random();
            for (int i=0;i<AUTH_CODE_NUM ;i++)
            {
                sb.append(random.nextInt(10));
            }
            //存入redis
            redisService.set(REDIS_KEY_AUTH_CODE_PREFIX+email,sb.toString());
            redisService.expire(REDIS_KEY_AUTH_CODE_PREFIX+email,REDIS_KEY_AUTH_CODE_EXPIRE);
            //通过邮件发送
            String subject="你的验证码如下";
            String message=sb.toString()+"，有效期为"+REDIS_KEY_AUTH_CODE_EXPIRE+"秒";
            String addr=email;
            int result = mailServer.qqMailSend(subject, message, addr);
            if (result==1)
            {
                //发送成功
                return CommonResult.success(sb.toString(),"验证码获取成功");
            }
            else {
                return CommonResult.failed("验证码获取失败");
            }

        }
        catch (Exception e)
        {
            log.debug("generateAuthCode生成验证码出错:{}",e);
            return CommonResult.failed("验证码获取失败");
        }
    }

    @Override
    public CommonResult verifyAuthCode(String email, String authCode) {
        if (StringUtils.isEmpty(authCode))
        {
            return CommonResult.failed("验证码为空");
        }
        //获取正确的验证码
        String correctAuthCode = redisService.get(REDIS_KEY_AUTH_CODE_PREFIX + email);
        if (correctAuthCode==null)
        {
            return CommonResult.failed("请重新获取验证码");
        }
        boolean result = authCode.equals(correctAuthCode);
        if (result)
        {
            //校验成功
            return CommonResult.success(correctAuthCode,"验证码校验成功");
        }
        else {
            //校验失败
            return CommonResult.failed("验证码校验失败");
        }
    }

    @Override
    public UmsMember register(UmsMemberParam umsMemberParam) {
        UmsMember umsMember=new UmsMember();
        //复制注册的参数到umsMember
        BeanUtil.copyProperties(umsMemberParam,umsMember);
        //查询是否具有相同的用户
        SelectStatementProvider selectStatement = SqlBuilder.select(UmsMemberMapper.selectList)
                .from(UmsMemberDynamicSqlSupport.umsMember)
                .where(UmsMemberDynamicSqlSupport.username, isEqualToWhenPresent(umsMember.getUsername()))
                .build().render(RenderingStrategy.MYBATIS3);
        List<UmsMember> umsMembers = umsMemberMapper.selectMany(selectStatement);
        if (umsMembers.size()>0)
        {
            //账户已经存在
            return null;
        }
        else {
            //密码加密
            String encodePassword = passwordEncoder.encode(umsMember.getPassword());
            umsMember.setPassword(encodePassword);
            //设置账户为启用状态
            umsMember.setStatus(1);
            //注册时间
            umsMember.setCreateTime(new Date());
            umsMemberMapper.insert(umsMember);
            return umsMember;
        }
    }

    @Override
    public CommonResult loginByAuthCode(String username, String authCode) {
        CommonResult verifyResult = verifyAuthCode(username, authCode);
        if (verifyResult.getCode()== ResultCode.SUCCESS.getCode())
        {
            //验证成功
            //查询账户是否存在
            SelectStatementProvider selectStatement = SqlBuilder.select(UmsMemberMapper.selectList)
                    .from(UmsMemberDynamicSqlSupport.umsMember)
                    .where(UmsMemberDynamicSqlSupport.username, isEqualToWhenPresent(username))
                    .build().render(RenderingStrategy.MYBATIS3);
            List<UmsMember> umsMembers = umsMemberMapper.selectMany(selectStatement);
            if (umsMembers.size()>0)
            {
                //账户存在
                return CommonResult.success(umsMembers.get(0),"登录成功");
            }
            else {
                //账户不存在
                return CommonResult.failed("账户不存在");
            }
        }
        else {
            //验证失败
            return CommonResult.validateFailed("账号不存在或验证码错误");
        }
    }

    @Override
    public CommonResult loginByPassword(String username, String password) {
        SelectStatementProvider selectStatement = SqlBuilder.select(UmsMemberMapper.selectList)
                .from(UmsMemberDynamicSqlSupport.umsMember)
                .where(UmsMemberDynamicSqlSupport.username, isEqualToWhenPresent(username))
                .build().render(RenderingStrategy.MYBATIS3);
        List<UmsMember> umsMembers = umsMemberMapper.selectMany(selectStatement);
        if (umsMembers.size()>0)
        {
            //账户存在
            UmsMember umsMember = umsMembers.get(0);
            if (passwordEncoder.matches(password,umsMember.getPassword()))
            {
                //密码正确
              return CommonResult.success(umsMember,"登录成功");
            }
            else {
                //密码错误
                return CommonResult.validateFailed("账号或密码不正确");
            }
        }
        else {
            //账号不存在
            return CommonResult.validateFailed("账号或密码不正确");
        }
    }
}
