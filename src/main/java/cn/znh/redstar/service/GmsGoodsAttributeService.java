package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.GmsBrand;
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

    /**
     *
     * @param goodsAttributeCategoryId  属性分类id
     * @param type 0规格，1参数
     * @return
     */
    List<GmsGoodsAttribute> getGoodsAttribute(Long goodsAttributeCategoryId,Integer type);

    /**
     * 创建一个商品属性
     * @param goodsAttribute
     * @return
     */
    int createGoodsAttribute(GmsGoodsAttribute goodsAttribute);

    /**
     * 根据id更新商品属性信息
     * @param id
     * @param goodsAttribute
     * @return
     */
    int updateGoodsAttribute(Long id,GmsGoodsAttribute goodsAttribute);

    /**
     * 根据id删除商品属性
     * @param id
     * @return
     */
    int deleteGoodsAttribute(Long id);

    /**
     * 批量删除商品属性
     * @param ids
     * @return
     */
    int deleteGoodsAttribute(List<Long> ids);
}
