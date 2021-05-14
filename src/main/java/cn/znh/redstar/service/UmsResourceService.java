package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.UmsResource;
import cn.znh.redstar.mbg.model.UmsResourceCategory;

import java.util.List;

/**
 * @author : znh
 * @date : 19:15 2021/3/19
 * 后台资源管理的service
 */
public interface UmsResourceService {
    /**
     * 添加资源
     * @param umsResource
     * @return
     */
    int create(UmsResource umsResource);

    /**
     * 修改资源
     * @param id
     * @param umsResource
     * @return
     */
    int update (Long id,UmsResource umsResource);

    /**
     * 根据id获取资源详情
     * @param id
     * @return
     */
    UmsResource get(Long id);

    /**
     * 查询全部资源
     * @return
     */
    List<UmsResource> get();

    /**
     * 分页查询资源
     * @param categoryId
     * @param nameKeyword
     * @param urlKeyword
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<UmsResource>get(Long categoryId,String nameKeyword,String urlKeyword,Integer pageSize,Integer pageNum);

    /**
     * 根据id删除资源
    * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 查询资源分类
     * @return
     */
    List<UmsResourceCategory> getCategory();

    /**
     * 创建资源分类
     * @param  resourceCategory
     * @return
     */
    int createCategory(UmsResourceCategory resourceCategory);

    /**
     * 更新资源分类
     * @param id
     * @param resourceCategory
     * @return
     */
    int updateCategory(Long id,UmsResourceCategory resourceCategory);

    /**
     * 根据id删除资源分类
     * @param id
     * @return
     */
    int deleteCategory(Long id);
}
