package cn.znh.redstar.dao;

import cn.znh.redstar.mbg.model.UmsMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : znh
 * @date : 19:40 2021/3/19
 * 后台角色管理dao
 */
public interface UmsRoleDao {
    /**
     * 根据后台用户id获取菜单
     * @param adminId
     * @return
     */
    List<UmsMenu> getMenuListByAdminId(@Param("adminId") Long adminId);

    /**
     * 根据角色ID获取菜单
     * @param roleId
     * @return
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);

    /**
     * 根据角色id获取资源
     * @param roleId
     * @return
     */
    List<UmsMenu> getResourceListByRoleId(@Param("roleId") Long roleId);
}
