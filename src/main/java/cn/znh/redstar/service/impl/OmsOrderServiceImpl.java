package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.*;
import cn.znh.redstar.mbg.model.OmsOrder;
import cn.znh.redstar.mbg.model.OmsOrderItem;
import cn.znh.redstar.mbg.model.OmsOrderOperateHistory;
import cn.znh.redstar.service.OmsOrderService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * @author : znh
 * @date : 16:58 2021/5/10
 * 订单管理service实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OmsOrderServiceImpl implements OmsOrderService {

    @Resource
    OmsOrderMapper omsOrderMapper;
    @Resource
    OmsOrderItemMapper omsOrderItemMapper;
    @Resource
    OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper;

    @Override
    public List<OmsOrder> get() {
        List<OmsOrder> orderList = omsOrderMapper.select(SelectDSLCompleter.allRows());
        return orderList;
    }

    @Override
    public List<OmsOrder> get(Long memberId, Integer status) {
        SelectStatementProvider selectStatement = SqlBuilder.select(OmsOrderMapper.selectList)
                .from(OmsOrderDynamicSqlSupport.omsOrder)
                .where(OmsOrderDynamicSqlSupport.status, isEqualTo(status))
                .and(OmsOrderDynamicSqlSupport.memberId,isEqualTo(memberId))
                .build().render(RenderingStrategy.MYBATIS3);
        List<OmsOrder> orderList = omsOrderMapper.selectMany(selectStatement);
        return orderList;

    }

    @Override
    public List<OmsOrder> get(Long memberId) {
        SelectStatementProvider selectStatement = SqlBuilder.select(OmsOrderMapper.selectList)
                .from(OmsOrderDynamicSqlSupport.omsOrder)
                .where(OmsOrderDynamicSqlSupport.memberId,isEqualTo(memberId))
                .build().render(RenderingStrategy.MYBATIS3);
        List<OmsOrder> orderList = omsOrderMapper.selectMany(selectStatement);
        return orderList;
    }


    @Override
    public List<OmsOrderItem> getItem(Long orderId) {
        SelectStatementProvider selectStatement = SqlBuilder.select(OmsOrderItemMapper.selectList)
                .from(OmsOrderItemDynamicSqlSupport.omsOrderItem)
                .where(OmsOrderItemDynamicSqlSupport.orderId, isEqualTo(orderId))
                .build().render(RenderingStrategy.MYBATIS3);
        List<OmsOrderItem> orderItemList = omsOrderItemMapper.selectMany(selectStatement);
        return orderItemList;
    }

    @Override
    public List<OmsOrderOperateHistory> getOperateHistory(Long orderId) {
        SelectStatementProvider selectStatement = SqlBuilder.select(OmsOrderOperateHistoryMapper.selectList)
                .from(OmsOrderOperateHistoryDynamicSqlSupport.omsOrderOperateHistory)
                .where(OmsOrderOperateHistoryDynamicSqlSupport.orderId, isEqualTo(orderId))
                .build().render(RenderingStrategy.MYBATIS3);
        List<OmsOrderOperateHistory> omsOrderOperateHistoryList = omsOrderOperateHistoryMapper.selectMany(selectStatement);
        return omsOrderOperateHistoryList;
    }

    @Override
    public int create(OmsOrder order) {
        int result = omsOrderMapper.insert(order);
        return result;
    }

    @Override
    public int update(Long id, OmsOrder order) {
        order.setId(id);
        int result = omsOrderMapper.updateByPrimaryKey(order);
        return result;
    }

    @Override
    public int delete(Long id) {
        int result = 0;
        //删除订单
        try {
            omsOrderMapper.deleteByPrimaryKey(id);
            //删除订单相关商品信息
            DeleteStatementProvider deleteStatementItem = SqlBuilder.deleteFrom(OmsOrderItemDynamicSqlSupport.omsOrderItem)
                    .where(OmsOrderItemDynamicSqlSupport.orderId, isEqualTo(id))
                    .build().render(RenderingStrategy.MYBATIS3);
            omsOrderItemMapper.delete(deleteStatementItem);
            //删除订单相关操作记录
            DeleteStatementProvider deleteStatementOperateHistory = SqlBuilder.deleteFrom(OmsOrderOperateHistoryDynamicSqlSupport.omsOrderOperateHistory)
                    .where(OmsOrderOperateHistoryDynamicSqlSupport.orderId, isEqualTo(id))
                    .build().render(RenderingStrategy.MYBATIS3);
            omsOrderOperateHistoryMapper.delete(deleteStatementOperateHistory);
            result=1;
        }catch (Exception e)
        {
            result=1;
            throw e;
        }
        return result;
    }

    @Override
    public int note(Map<String, String> orderNote) {
        Long orderId =Long.parseLong( orderNote.get("orderId"));
        Integer status =Integer.parseInt( orderNote.get("status"));
        String note = orderNote.get("note");
        //更新订单
        UpdateStatementProvider updateStatement=SqlBuilder.update(OmsOrderDynamicSqlSupport.omsOrder)
                .set(OmsOrderDynamicSqlSupport.note).equalTo(note)
                .where(OmsOrderDynamicSqlSupport.id,isEqualTo(orderId))
                .build().render(RenderingStrategy.MYBATIS3);
        int update = omsOrderMapper.update(updateStatement);
        //订单操作记录
        OmsOrderOperateHistory orderOperateHistory=new OmsOrderOperateHistory();
        orderOperateHistory.setOrderId(orderId);
        orderOperateHistory.setOrderStatus(status);
        orderOperateHistory.setCreateTime(new Date());
        orderOperateHistory.setOperateMan("后台管理员");
        orderOperateHistory.setNote(note);
        int insert = omsOrderOperateHistoryMapper.insert(orderOperateHistory);
        return insert*update;
    }

    @Override
    public int close(Map orderClose) {
        Long orderId =Long.parseLong( String.valueOf(orderClose.get("orderId")));
        String note = String.valueOf(orderClose.get("note"));
        //更新订单
        UpdateStatementProvider updateStatement=SqlBuilder.update(OmsOrderDynamicSqlSupport.omsOrder)
                .set(OmsOrderDynamicSqlSupport.note).equalTo(note)
                .set(OmsOrderDynamicSqlSupport.status).equalTo(4)//已关闭
                .where(OmsOrderDynamicSqlSupport.id,isEqualTo(orderId))
                .build().render(RenderingStrategy.MYBATIS3);
        int update = omsOrderMapper.update(updateStatement);
        //订单操作记录
        OmsOrderOperateHistory orderOperateHistory=new OmsOrderOperateHistory();
        orderOperateHistory.setOrderId(orderId);
        orderOperateHistory.setOrderStatus(4);
        orderOperateHistory.setCreateTime(new Date());
        orderOperateHistory.setOperateMan("后台管理员");
        orderOperateHistory.setNote(note);
        int insert = omsOrderOperateHistoryMapper.insert(orderOperateHistory);
        return update*insert;
    }

    @Override
    public int send(Map orderSend) {
        Long orderId = Long.parseLong(String.valueOf(orderSend.get("orderId")));
        String deliveryCompany =(String) orderSend.get("deliveryCompany");
        String deliverySn = (String) orderSend.get("deliverySn");
        //更新订单
        UpdateStatementProvider updateStatement=SqlBuilder.update(OmsOrderDynamicSqlSupport.omsOrder)
                .set(OmsOrderDynamicSqlSupport.deliveryCompany).equalTo(deliveryCompany)
                .set(OmsOrderDynamicSqlSupport.deliverySn).equalTo(deliverySn)
                .set(OmsOrderDynamicSqlSupport.status).equalTo(2)//已发货
                .where(OmsOrderDynamicSqlSupport.id,isEqualTo(orderId))
                .build().render(RenderingStrategy.MYBATIS3);
        int update = omsOrderMapper.update(updateStatement);
        OmsOrderOperateHistory orderOperateHistory=new OmsOrderOperateHistory();
        orderOperateHistory.setOrderId(orderId);
        orderOperateHistory.setOrderStatus(2);
        orderOperateHistory.setCreateTime(new Date());
        orderOperateHistory.setOperateMan("后台管理员");
        orderOperateHistory.setNote("完成发货");
        int insert = omsOrderOperateHistoryMapper.insert(orderOperateHistory);
        return insert*update;
    }

    @Override
    public int updateReceiver(Map orderReceiver) {
        Long orderId = Long.parseLong(String.valueOf(orderReceiver.get("orderId")));
        int status = Integer.parseInt(String.valueOf(orderReceiver.get("status")));
        String receiverName = String.valueOf(orderReceiver.get("receiverName"));
        String receiverPhone = String.valueOf(orderReceiver.get("receiverPhone"));
        String receiverPostCode = String.valueOf(orderReceiver.get("receiverPostCode"));
        String receiverProvince = String.valueOf(orderReceiver.get("receiverProvince"));
        String receiverCity = String.valueOf(orderReceiver.get("receiverCity"));
        String receiverRegion = String.valueOf(orderReceiver.get("receiverRegion"));
        String receiverDetailAddress = String.valueOf(orderReceiver.get("receiverDetailAddress"));
        //更新订单
        UpdateStatementProvider updateStatement=SqlBuilder.update(OmsOrderDynamicSqlSupport.omsOrder)
                .set(OmsOrderDynamicSqlSupport.receiverName).equalTo(receiverName)
                .set(OmsOrderDynamicSqlSupport.receiverPhone).equalTo(receiverPhone)
                .set(OmsOrderDynamicSqlSupport.receiverPostCode).equalTo(receiverPostCode)
                .set(OmsOrderDynamicSqlSupport.receiverProvince).equalTo(receiverProvince)
                .set(OmsOrderDynamicSqlSupport.receiverCity).equalTo(receiverCity)
                .set(OmsOrderDynamicSqlSupport.receiverRegion).equalTo(receiverRegion)
                .set(OmsOrderDynamicSqlSupport.receiverDetailAddress).equalTo(receiverDetailAddress)
                .where(OmsOrderDynamicSqlSupport.id,isEqualTo(orderId))
                .build().render(RenderingStrategy.MYBATIS3);
        int update = omsOrderMapper.update(updateStatement);
        //订单操作记录
        OmsOrderOperateHistory orderOperateHistory=new OmsOrderOperateHistory();
        orderOperateHistory.setOrderId(orderId);
        orderOperateHistory.setOrderStatus(status);
        orderOperateHistory.setCreateTime(new Date());
        orderOperateHistory.setOperateMan("后台管理员");
        orderOperateHistory.setNote("修改收货信息");
        int insert = omsOrderOperateHistoryMapper.insert(orderOperateHistory);
        return update*insert;
    }
}
