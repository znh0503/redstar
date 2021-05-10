package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.OmsOrder;


import java.util.List;

/**
 * @author : znh
 * @date : 16:55 2021/5/10
 * 订单管理service
 */
public interface OmsOrderService {
    /**
     * 获取全部订单
     * @return
     */
    List<OmsOrder> get();

    /**
     * 根据订单状态获取订单
     * @param status
     * @return
     */
    List<OmsOrder> get(Integer status);

    /**
     * 创建一个订单
     * @param order
     * @return
     */
    int create(OmsOrder order);

    /**
     * 根据id更新一条订单
     * @param id
     * @param order
     * @return
     */
    int update(Long id,OmsOrder order);

    /**
     * 根据id删除订单
     * @param id
     * @return
     */
    int delete(Long id);

}
