package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.GmsGoodsLadder;

import java.util.List;

/**
 * @author : znh
 * @date : 17:20 2021/4/8
 * 商品阶梯价格service
 */
public interface GmsGoodsLadderService {

    /**
     * 根据商品id查询阶梯价格信息
     * @param goodsId
     * @return
     */
    List<GmsGoodsLadder> getGoodsLadderByGoodsId(Long goodsId);
}
