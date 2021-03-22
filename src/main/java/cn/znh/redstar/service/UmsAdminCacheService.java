package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.UmsAdmin;
import cn.znh.redstar.mbg.model.UmsResource;

import java.util.List;

/**
 * @author : znh
 * @date : 19:52 2021/3/19
 * 后台用户缓存操作service
 */
public interface UmsAdminCacheService {
    /**
     * 根据后台用户id删除后台用户缓存
     * @param adminId
     */
    void deleteAdminCache(Long adminId);

    /**
     *根据后台用户id删除后台用户资源列表缓存
     * @param adminId
     */
    void deleteResourceList(Long adminId);
    /**
     * 当角色相关资源信息改变时删除相关后台缓存
     * @param roleId
     */
    void delResourceListByRole(Long roleId);
    /**
     * 当角色相关资源信息改变时删除相关后台缓存
     * @param roleIds
     */
    void deleteResourceListByRoleIds(List<Long> roleIds);

    /**
     * 当资源信息改变时，删除资源项目后台用户缓存
     * @param resourceId
     */
    void deleteResourceListByResource(Long resourceId);

    /**
     * 获取缓存后台用户信息
     * @param username
     * @return
     */
    UmsAdmin getAdmin(String username);

    /**
     * 设置缓存后台信息
     * @param admin
     */
    void setAdmin(UmsAdmin admin);


    /**
     * 获取缓存后台用户信息
     * @param adminId
     * @return
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * 设置缓存后台用户资源列表
     * @param adminId
     * @param resourceList
     */
    void SetResourceList(Long adminId,List<UmsResource> resourceList);

}
