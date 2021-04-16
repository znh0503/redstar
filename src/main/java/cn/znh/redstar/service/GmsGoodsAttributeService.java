package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.GmsGoodsAttribute;

import java.util.List;

/**
 * @author : znh
 * @date : 20:58 2021/4/8
 * 商品属性service
 */
public interface GmsGoodsAttributeService {

    /**
     * 根据商品属性分类id获取分类下的属性信息
     * @param goodsAttributeCategoryId
     * @return
     */
    List<GmsGoodsAttribute> getGoodsAttribute(Long goodsAttributeCategoryId);
}
