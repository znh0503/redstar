package cn.znh.redstar.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.znh.redstar.bo.AdminUserDetails;
import cn.znh.redstar.common.exception.Asserts;
import cn.znh.redstar.common.utils.JwtTokenUtil;
import cn.znh.redstar.dao.UmsAdminRoleRelationDao;
import cn.znh.redstar.dto.UmsAdminParam;
import cn.znh.redstar.dto.UpdateAdminPasswordParam;
import cn.znh.redstar.mbg.mapper.UmsAdminDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.UmsAdminMapper;
import cn.znh.redstar.mbg.model.UmsAdmin;
import cn.znh.redstar.mbg.model.UmsResource;
import cn.znh.redstar.mbg.model.UmsRole;
import cn.znh.redstar.service.UmsAdminService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.where.condition.IsEqualTo;
import org.mybatis.dynamic.sql.where.condition.IsEqualToWhenPresent;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualToWhenPresent;

/**
 * @author : znh
 * @date : 14:52 2021/3/20
 * 后台用户管理service的实现类
 */
@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class UmsAdminServiceImpl implements UmsAdminService {
    @Resource
    UmsAdminMapper umsAdminMapper;
    @Resource
    PasswordEncoder passwordEncoder;
    @Resource
    JwtTokenUtil jwtTokenUtil;
    @Resource
    UmsAdminRoleRelationDao adminRoleRelationDao;

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        SelectStatementProvider selectStatement = SqlBuilder.select(UmsAdminMapper.selectList)
                .from(UmsAdminDynamicSqlSupport.umsAdmin)
                .where(UmsAdminDynamicSqlSupport.username, isEqualTo(username))
                .build()
                .render(RenderingStrategy.MYBATIS3);
        List<UmsAdmin> umsAdmins = umsAdminMapper.selectMany(selectStatement);
        if (umsAdmins!=null&&umsAdmins.size()>0)
        {
            UmsAdmin umsAdmin = umsAdmins.get(0);
            return umsAdmin;
        }
        return null;
    }

    @Override
    public UmsAdmin register(UmsAdminParam umsAdminParam) {
        UmsAdmin umsAdmin=new UmsAdmin();
        //复制注册的参数到umsAdmin
        BeanUtil.copyProperties(umsAdminParam,umsAdmin);
        umsAdmin.setCreateTime(new Date());
        //设置用户状态为启用
        umsAdmin.setStatus(1);
        //查询是否有相同用户名的用户
        SelectStatementProvider selectStatement = SqlBuilder.select(UmsAdminMapper.selectList)
                .from(UmsAdminDynamicSqlSupport.umsAdmin)
                .where(UmsAdminDynamicSqlSupport.username, isEqualToWhenPresent(umsAdmin.getUsername()))
                .build().render(RenderingStrategy.MYBATIS3);
        List<UmsAdmin> umsAdmins = umsAdminMapper.selectMany(selectStatement);
        if (umsAdmins.size()>0)
        {
            return null;
        }else {
            //对密码加密，存入数据库
            String encodePassword = passwordEncoder.encode(umsAdmin.getPassword());
            umsAdmin.setPassword(encodePassword);
            umsAdminMapper.insert(umsAdmin);
            return umsAdmin;
        }
    }

    @Override
    public String login(String username, String password) {
        String token=null;
        try {
            //将密码和账号进行匹对
            UserDetails userDetails = loadUserByUsername(username);
            if (!passwordEncoder.matches(password,userDetails.getPassword()))
            {
                Asserts.fail("密码不正确");
            }
            if (!userDetails.isEnabled())
            {
                Asserts.fail("账号不可用");
            }
            UsernamePasswordAuthenticationToken authenticationToken=new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            token=jwtTokenUtil.generateToken(userDetails);
        }
        catch (Exception e)
        {
            log.warn("UmsAdminServiceImpl#login,登录异常:{}",e);
        }
        return token;
    }



    @Override
    public String refreshToken(String oldToken) {
        return null;
    }

    @Override
    public UmsAdmin getAdmin(Long id) {
        return null;
    }

    @Override
    public List<UmsAdmin> getAdmins(String keyword, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int updateAdmin(Long id, UmsAdmin umsAdmin) {
        return 0;
    }

    @Override
    public int deleteAdmin(Long id) {
        return 0;
    }

    @Override
    public int updateAdminRole(Long adminId, List<Long> roleIds) {
        return 0;
    }

    @Override
    public List<UmsRole> getAdminRoleList(Long adminId) {
        return null;
    }

    @Override
    public List<UmsResource> getAdminResourceList(long adminId) {
        List<UmsResource> resourceList = adminRoleRelationDao.getResourceList(adminId);
        if (CollUtil.isNotEmpty(resourceList))
        {
            //添加redis缓存
        }
        return resourceList;
    }

    @Override
    public int updateAdminPassword(UpdateAdminPasswordParam updateAdminPasswordParam) {
        return 0;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        UmsAdmin admin = getAdminByUsername(username);
        if (admin != null) {
            List<UmsResource> resourceList = getAdminResourceList(admin.getId());
            return new AdminUserDetails(admin,resourceList);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }
}
