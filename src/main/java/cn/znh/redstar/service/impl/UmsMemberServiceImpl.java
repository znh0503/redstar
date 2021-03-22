package cn.znh.redstar.service.impl;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.component.mail.MailServer;
import cn.znh.redstar.service.RedisService;
import cn.znh.redstar.service.UmsMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @author : znh
 * @date : 22:21 2021/3/16
 * 会员登录注册管理service的实现类
 */
@Slf4j
@Service
public class UmsMemberServiceImpl implements UmsMemberService {
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
            String message=sb.toString();
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
    public CommonResult verifyAuthCode(String telephone, String authCode) {
        if (StringUtils.isEmpty(authCode))
        {
            return CommonResult.failed("验证码为空");
        }
        //获取正确的验证码
        String correctAuthCode = redisService.get(REDIS_KEY_AUTH_CODE_PREFIX + telephone);
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
}
