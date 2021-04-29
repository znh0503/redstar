package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.MmsFlashPromotion;
import cn.znh.redstar.mbg.model.MmsHomeAdvertise;

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
}
