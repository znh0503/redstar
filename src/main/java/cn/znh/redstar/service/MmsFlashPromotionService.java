package cn.znh.redstar.service;

import cn.znh.redstar.dto.MmsFlashPromotionGoodsAddDto;
import cn.znh.redstar.mbg.model.GmsGoods;
import cn.znh.redstar.mbg.model.MmsFlashPromotion;
import cn.znh.redstar.mbg.model.MmsFlashPromotionGoodsRelation;
import cn.znh.redstar.mbg.model.MmsHomeAdvertise;
import cn.znh.redstar.vo.MmsFlashPromotionGoodsVo;

import java.util.List;

/**
 * @author : znh
 * @date : 18:52 2021/4/29
 * 秒杀活动service
 */
public interface MmsFlashPromotionService {
    /**
     * 获取全部秒杀活动
     * @return
     */
    List<MmsFlashPromotion> get();

    /**
     * 根据上下线状态获取秒杀活动
     * @param status 上下线状态：0->下线；1->上线
     * @return
     */
    List<MmsFlashPromotion> get(int status);

    /**
     * 创建一条秒杀活动
     * @param flashPromotion 一条秒杀活动
     * @return
     */
    int create(MmsFlashPromotion flashPromotion);

    /**
     * 根据id更新一条秒杀活动
     * @param id id
     * @param flashPromotion 一条秒杀活动
     * @return
     */
    int update(Long id, MmsFlashPromotion flashPromotion);

    /**
     * 根据id删除一条秒杀活动
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 批量删除秒杀活动
     * @param ids
     * @return
     */
    int delete(List<Long> ids);

    /**
     * 批量添加秒杀活动商品
     * @param flashPromotionGoodsRelationList
     * @return
     */
    int createGoods(List<MmsFlashPromotionGoodsRelation> flashPromotionGoodsRelationList);

    /**
     * 根据活动场次和时间段获取秒杀商品
     * @param flashPromotionId 活动场次id
     * @param flashPromotionSessionId 秒杀时间段id
     * @return
     */
    List<MmsFlashPromotionGoodsVo> getFlashPromotionGoods(Long flashPromotionId,Long flashPromotionSessionId);

    /**
     * 根据id更新一条秒杀活动商品
     * @param id
     * @param flashPromotionGoodsRelation
     * @return
     */
    int updateFlashPromotionGoods(Long id, MmsFlashPromotionGoodsRelation flashPromotionGoodsRelation);

    /**
     * 根据id删除一条秒杀活动商品
     * @param id
     * @return
     */
    int deleteFlashPromotionGoods(Long id);

    /**
     * 批量删除秒杀活动商品
     * @param ids
     * @return
     */
    int deleteFlashPromotionGoods(List<Long> ids);
}
