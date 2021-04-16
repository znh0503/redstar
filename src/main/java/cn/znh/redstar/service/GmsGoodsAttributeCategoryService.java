package cn.znh.redstar.service;

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
}
