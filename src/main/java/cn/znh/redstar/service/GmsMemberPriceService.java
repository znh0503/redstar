package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.GmsMemberPrice;

import java.util.List;

/**
 * @author : znh
 * @date : 13:36 2021/4/8
 * 商品会员价管理service
 */
public interface GmsMemberPriceService {
     /**
      * 根据商品id获取商品会员价
      * @param goodsId
      * @return
      */
     List<GmsMemberPrice> getMemberPriceByGoodsId(Long goodsId);
}
