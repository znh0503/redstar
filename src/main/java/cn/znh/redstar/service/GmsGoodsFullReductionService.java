package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.GmsGoodsFullReduction;

import java.util.List;

/**
 * @author : znh
 * @date : 17:39 2021/4/8
 * 商品满减service
 */
public interface GmsGoodsFullReductionService {
    /**
     * 根据商品id获取相关满减信息
     * @param goodsId
     * @return
     */
    List<GmsGoodsFullReduction> getGoodsFullReductionByGoodsId(Long goodsId);
}
