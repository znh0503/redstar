package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.OmsOrderReturnReason;

import java.util.List;

/**
 * @author : znh
 * @date : 23:39 2021/5/9
 * 退货原因管理
 */
public interface OmsOrderReturnReasonService {

    /**
     * 获取全部退货原因
     * @return
     */
    List<OmsOrderReturnReason> get();

    /**
     * 根据启用状态获取退货原因
     * @param status
     * @return
     */
    List<OmsOrderReturnReason> get(Integer status);

    /**
     * 创建一个退货原因
     * @param orderReturnReason
     * @return
     */
    int create(OmsOrderReturnReason orderReturnReason);

    /**
     * 根据id更新一条退货设置
     * @param id
     * @param orderReturnReason
     * @return
     */
    int update(Long id,OmsOrderReturnReason orderReturnReason);

    /**
     * 根据id删除退货原因
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 批量删除退货原因
     * @param ids
     * @return
     */
    int delete(List<Long> ids);

}
