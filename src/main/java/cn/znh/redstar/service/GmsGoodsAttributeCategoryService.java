package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.GmsBrand;
import cn.znh.redstar.mbg.model.GmsGoodsAttributeCategory;

import java.util.List;

/**
 * @author : znh
 * @date : 20:03 2021/4/8
 * 商品属性分类service
 */
public interface GmsGoodsAttributeCategoryService {
    /**
     * 获取商品属性分类
     * @return
     */
    List<GmsGoodsAttributeCategory> getGoodsAttributeCategory();

    /**
     * 创建一个属性分类
     * @param attributeCategory
     * @return
     */
    int createAttributeCategory(GmsGoodsAttributeCategory attributeCategory);

    /**
     * 根据id更新属性分类信息
     * @param id
     * @param attributeCategory
     * @return
     */
    int updateAttributeCategory(Long id, GmsGoodsAttributeCategory attributeCategory);

    /**
     * 根据id删除属性分类
     * @param id
     * @return
     */
    int deleteAttributeCategory(Long id);

    /**
     * 根据id批量删除属性分类
     * @param ids
     * @return 删除数量
     */
    int deleteAttributeCategoryByIds(List<Long> ids);
}
