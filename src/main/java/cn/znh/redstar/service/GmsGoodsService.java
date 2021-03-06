package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.GmsGoods;

import java.util.List;

/**
 * @author : znh
 * @date : 0:02 2021/4/1
 * 商品管理service
 */
public interface GmsGoodsService {
    /**
     * 查询全部商品
     * @return
     */
    List<GmsGoods> listAllGoods();

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    GmsGoods getGoodsById(Long id);

    /**
     * 获取一级分类下的所有商品
     * @param goodsCategoryId
     * @return
     */
    List<GmsGoods> getGoods(Long goodsCategoryId);

    /**
     * 根据分类id获取商品
     * @param goodsCategoryId
     * @return
     */
    List<GmsGoods> getGoodsByGoodsCategoryId(Long goodsCategoryId);

    /**
     * 根据id更新商品信息
     * @param id
     * @param goods
     * @return
     */
    int updateGoods(Long id,GmsGoods goods);

    /**
     * 创建商品
     * @param goods
     * @return
     */
    int create(GmsGoods goods);

    /**
     * 根据
     * @param id
     * @return
     */
    int deleteGoods(Long id);
}
