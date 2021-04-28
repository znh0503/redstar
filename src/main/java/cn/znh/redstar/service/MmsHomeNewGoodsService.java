package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.GmsGoods;
import cn.znh.redstar.mbg.model.MmsHomeNewGoods;

import java.util.List;

/**
 * @author : znh
 * @date : 16:06 2021/4/28
 * 新品推荐商品service
 */
public interface MmsHomeNewGoodsService {
    /**
     * 获取全部首页新品推荐商品
     * @return
     */
    List<MmsHomeNewGoods> getHomeNewGoods();

    /**
     * 根据推荐状态获取首页新品推荐商品
     * @param recommendStatus
     * @return
     */
    List<MmsHomeNewGoods> getHomeNewGoods(int recommendStatus);


    /**
     * 批量创建首页新品推荐商品
     * @param goodsList
     * @return
     */
    List<MmsHomeNewGoods> createHomeNewGoods(List<GmsGoods> goodsList);

    /**
     * 根据id更新一条首页新品推荐商品
     * @param id id
     * @param homeNewGoods 一条首页推荐商品
     * @return
     */
    int updateHomeNewGoods(Long id, MmsHomeNewGoods homeNewGoods);

    /**
     * 根据id删除一条首页新品推荐商品
     * @param id
     * @return
     */
    int deleteHomeNewGoods(Long id);

    /**
     * 批量删除首页新品推荐商品
     * @param ids
     * @return
     */
    int deleteHomeNewGoods(List<Long> ids);
}
