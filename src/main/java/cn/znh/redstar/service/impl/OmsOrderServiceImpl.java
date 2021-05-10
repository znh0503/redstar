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
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.or;

/**
 * @author : znh
 * @date : 16:58 2021/5/10
 */
@Service
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
    public List<OmsOrder> get(Integer status) {
        SelectStatementProvider selectStatement = SqlBuilder.select(OmsOrderMapper.selectList)
                .from(OmsOrderDynamicSqlSupport.omsOrder)
                .where(OmsOrderDynamicSqlSupport.status, isEqualTo(status))
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
        }catch (Exception e)
        {
            result=1;
            throw e;
        }
        return result;
    }
}
