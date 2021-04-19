package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.GmsBrand;
import cn.znh.redstar.mbg.model.GmsGoodsCategory;

import java.util.List;

/**
 * @author : znh
 * @date : 16:14 2021/4/5
 * 商品分类管理service
 */
public interface GmsGoodCategoryService {

    /**
     * 获取所有分类信息
     * @return
     */
    List<GmsGoodsCategory> getGoodsCategory();

    /**
     * 根据分类级别查询分类详情
     * @param level
     * @return
     */
    List<GmsGoodsCategory> getGoodsCategoryByLevel(int level);

    /**
     * 根据上级分类id查询出下一级的分类
     * @param parentId
     * @return
     */
    List<GmsGoodsCategory> getGoodsCategoryByParentId(Long parentId);

    /**
     * 根据id查询上一级的分类信息
     * @param id
     * @return
     */
    GmsGoodsCategory getGoodsCategoryById(Long id);

    /**
     * 创建一个分类
     * @param category
     * @return
     */
    int createCategory(GmsGoodsCategory category);

    /**
     * 根据id更新分类信息
     * @param id
     * @param category
     * @return
     */
    int updateCategory(Long id, GmsGoodsCategory category);

    /**
     * 根据id删除分类信息
     * @param id
     * @return
     */
    int deleteCategory(Long id);
}
