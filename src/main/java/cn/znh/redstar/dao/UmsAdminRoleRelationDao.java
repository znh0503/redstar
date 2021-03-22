package cn.znh.redstar.dao;

import cn.znh.redstar.mbg.model.UmsAdminRoleRelation;
import cn.znh.redstar.mbg.model.UmsResource;
import cn.znh.redstar.mbg.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : znh
 * @date : 18:53 2021/3/20
 * 自定义后台用户与角色管理Dao
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 批量插入角色关系
     * @param adminRoleRelationList
     * @return
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 根据id获取用户所有角色
     * @param adminId
     * @return
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     *根据用户id获取所有可访问资源
     * @param adminId
     * @return
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * 根据资源id获取相关用户id列表
     * @param resourceId
     * @return
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);
}
