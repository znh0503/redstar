package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.GmsGoods;
import cn.znh.redstar.mbg.model.MmsHomeNewGoods;
import cn.znh.redstar.mbg.model.MmsHomeRecommendGoods;

import java.util.List;

/**
 * @author : znh
 * @date : 0:51 2021/4/29
 * 人气推荐商品Service
 */
public interface MmsHomeRecommendGoodsService {
    /**
     * 获取全部首页人气推荐商品
     * @return
     */
    List<MmsHomeRecommendGoods> getHomeRecommendGoods();

    /**
     * 根据推荐状态获取人气推荐商品
     * @param recommendStatus
     * @return
     */
    List<MmsHomeRecommendGoods> getHomeRecommendGoods(int recommendStatus);

    /**
     * 批量创建首页人气推荐商品
     * @param goodsList
     * @return
     */
    List<MmsHomeRecommendGoods> createHomeRecommendGoods(List<GmsGoods> goodsList);

    /**
     * 根据id更新一条首页推荐商品
     * @param id id
     * @param homeRecommendGoods 一条人气推荐商品
     * @return
     */
    int updateHomeRecommendGoods(Long id, MmsHomeRecommendGoods homeRecommendGoods);

    /**
     * 根据id删除一条首页人气推荐商品
     * @param id
     * @return
     */
    int deleteHomeRecommendGoods(Long id);

    /**
     * 批量删除首页人气推荐商品
     * @param ids
     * @return
     */
    int deleteHomeRecommendGoods(List<Long> ids);
}
