package cn.znh.redstar.service;

import cn.znh.redstar.dto.UmsAdminParam;
import cn.znh.redstar.dto.UpdateAdminPasswordParam;
import cn.znh.redstar.mbg.model.UmsAdmin;
import cn.znh.redstar.mbg.model.UmsResource;
import cn.znh.redstar.mbg.model.UmsRole;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * @author : znh
 * @date : 11:39 2021/3/20
 * 后台用户管理service
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     * @param username 用户名
     * @return
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册
     * @param umsAdminParam 用户参数
     * @return
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

    /**
     * 登录
     * @param username  用户名
     * @param password  密码
     * @return
     */
    String login(String username,String password);

    /**
     * 刷新token
     * @param oldToken 旧的token
     * @return
     */
    String refreshToken(String oldToken);

    /**
     * 根据用户id获取用户
     * @param id 用户id
     * @return
     */
    UmsAdmin getAdmin(Long id);

    /**
     * 根据用户名称或者昵称分页查询用户
     * @param keyword   关键字，用户名称或者昵称
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<UmsAdmin> getAdmins(String keyword,Integer pageSize,Integer pageNum);

    /**
     * 根据id修改指定用户信息
     * @param id    用户id
     * @param umsAdmin 用户信息
     * @return
     */
    int updateAdmin(Long id,UmsAdmin umsAdmin);

    /**
     * 根据id删除指定用户信息
     * @param id
     * @return
     */
    int deleteAdmin(Long id);

    /**
     * 修改用户角色关系
     * @param adminId 用户id
     * @param roleIds 角色id
     * @return
     */
    int updateAdminRole(Long adminId,List<Long> roleIds);

    /**
     * 获取用户对应角色
     * @param adminId 用户id
     * @return
     */
    List<UmsRole> getAdminRoleList(Long adminId);

    /**
     * 根据用户id获取指定用户的可访问资源
     * @param adminId   用户id
     * @return
     */
    List<UmsResource> getAdminResourceList(long adminId);

    /**
     * 修改密码
     * @param updateAdminPasswordParam 用户修改密码参数
     * @return
     */
    int updateAdminPassword(UpdateAdminPasswordParam updateAdminPasswordParam);

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    UserDetails loadUserByUsername(String username);
}
