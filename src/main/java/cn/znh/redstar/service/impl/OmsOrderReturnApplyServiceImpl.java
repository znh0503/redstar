package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.OmsOrderReturnApplyDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.OmsOrderReturnApplyMapper;
import cn.znh.redstar.mbg.mapper.OmsOrderReturnReasonDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.OmsOrderReturnReasonMapper;
import cn.znh.redstar.mbg.model.OmsOrderReturnApply;
import cn.znh.redstar.service.OmsOrderReturnApplyService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author : znh
 * @date : 15:57 2021/5/12
 * 订单退货申请service实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService {
    @Resource
    OmsOrderReturnApplyMapper omsOrderReturnApplyMapper;

    @Override
    public List<OmsOrderReturnApply> get() {
        List<OmsOrderReturnApply> orderReturnApplyList = omsOrderReturnApplyMapper.select(SelectDSLCompleter.allRows());
        return orderReturnApplyList;
    }

    @Override
    public List<OmsOrderReturnApply> get(Integer status) {
        SelectStatementProvider selectStatement = SqlBuilder.select(OmsOrderReturnApplyMapper.selectList)
                .from(OmsOrderReturnApplyDynamicSqlSupport.omsOrderReturnApply)
                .where(OmsOrderReturnApplyDynamicSqlSupport.status, isEqualTo(status))
                .build().render(RenderingStrategy.MYBATIS3);
        List<OmsOrderReturnApply> orderReturnApplyList = omsOrderReturnApplyMapper.selectMany(selectStatement);
        return orderReturnApplyList;
    }

    @Override
    public int create(OmsOrderReturnApply orderReturnApply) {
        int insert = omsOrderReturnApplyMapper.insert(orderReturnApply);
        return insert;
    }

    @Override
    public int update(Long id, OmsOrderReturnApply orderReturnApply) {
        orderReturnApply.setId(id);
        int update = omsOrderReturnApplyMapper.updateByPrimaryKey(orderReturnApply);
        return update;
    }

    @Override
    public int delete(Long id) {
        int delete = omsOrderReturnApplyMapper.deleteByPrimaryKey(id);
        return delete;
    }
}
