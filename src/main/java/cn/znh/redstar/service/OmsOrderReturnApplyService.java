package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.OmsOrderReturnApply;
import cn.znh.redstar.mbg.model.OmsOrderReturnReason;

import java.util.List;
import java.util.Map;

/**
 * @author : znh
 * @date : 15:54 2021/5/12
 * 订单退货申请service
 */
public interface OmsOrderReturnApplyService {
    /**
     * 获取全部退货申请
     * @return
     */
    List<OmsOrderReturnApply> get();

    /**
     * 根据申请状态获取退货申请
     * @param status
     * @return
     */
    List<OmsOrderReturnApply> get(Integer status);

    /**
     * 创建一个退货申请
     * @param orderReturnApply
     * @return
     */
    int create(OmsOrderReturnApply orderReturnApply);

    /**
     * 根据id更新一条退货申请
     * @param id
     * @param orderReturnApply
     * @return
     */
    int update(Long id,OmsOrderReturnApply orderReturnApply);

    /**
     * 根据id删除退货申请
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 拒绝退货
     * @param returnApplyReject
     * @return
     */
    int reject(Map returnApplyReject);

    /**
     * 确认退货
     * @param returnApplyConfirm
     * @return
     */
    int confirm(Map returnApplyConfirm);

    /**
     * 确认收货
     * @param returnApplyReceive
     * @return
     */
    int receive(Map returnApplyReceive);

}
