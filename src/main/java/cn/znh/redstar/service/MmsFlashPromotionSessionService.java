package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.MmsFlashPromotion;
import cn.znh.redstar.mbg.model.MmsFlashPromotionSession;

import java.util.List;

/**
 * @author : znh
 * @date : 2:38 2021/4/30
 * 秒杀时间段service
 */
public interface MmsFlashPromotionSessionService {
    /**
     * 获取全部秒杀时间段
     * @return
     */
    List<MmsFlashPromotionSession> get();

    /**
     * 根据启用状态获取秒杀活动
     * @param status 启用状态：0->未启用；1->启用
     * @return
     */
    List<MmsFlashPromotionSession> get(int status);

    /**
     * 创建一条秒杀时间段
     * @param flashPromotionSession 一条秒杀时间段
     * @return
     */
    int create(MmsFlashPromotionSession flashPromotionSession);

    /**
     * 根据id更新一条秒杀活动
     * @param id id
     * @param flashPromotionSession 一条时间段
     * @return
     */
    int update(Long id, MmsFlashPromotionSession flashPromotionSession);

    /**
     * 根据id删除一条秒杀时间段
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 批量删除秒杀时间段
     * @param ids
     * @return
     */
    int delete(List<Long> ids);
}
