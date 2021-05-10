package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.OmsOrderDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.OmsOrderMapper;
import cn.znh.redstar.mbg.mapper.OmsOrderReturnReasonDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.OmsOrderReturnReasonMapper;
import cn.znh.redstar.mbg.model.OmsOrder;
import cn.znh.redstar.service.OmsOrderService;
import org.mybatis.dynamic.sql.SqlBuilder;
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
        int result = omsOrderMapper.deleteByPrimaryKey(id);
        return result;
    }
}
