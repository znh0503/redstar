package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.OmsOrderSetting;

import java.util.List;

/**
 * @author : znh
 * @date : 18:23 2021/5/9
 * 订单设置service
 */
public interface OmsOrderSettingService {

    /**
     * 获取订单设置
     * @return
     */
    List <OmsOrderSetting> get();
    /**
     * 更新订单设置
     * param id
     * @param orderSetting
     * @return
     */
    int update(Long id,OmsOrderSetting orderSetting);
}
