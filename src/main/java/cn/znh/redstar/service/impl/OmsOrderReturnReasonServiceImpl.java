package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.MmsHomeBrandDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.MmsHomeBrandMapper;
import cn.znh.redstar.mbg.mapper.OmsOrderReturnReasonDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.OmsOrderReturnReasonMapper;
import cn.znh.redstar.mbg.model.MmsHomeBrand;
import cn.znh.redstar.mbg.model.OmsOrderReturnReason;
import cn.znh.redstar.service.OmsOrderReturnReasonService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author : znh
 * @date : 0:10 2021/5/10
 * 订单退货原因service实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OmsOrderReturnReasonServiceImpl implements OmsOrderReturnReasonService {
    @Resource
    OmsOrderReturnReasonMapper omsOrderReturnReasonMapper;

    @Override
    public List<OmsOrderReturnReason> get() {
        List<OmsOrderReturnReason> orderReturnReasonList = omsOrderReturnReasonMapper.select(SelectDSLCompleter.allRows());
        return orderReturnReasonList;
    }

    @Override
    public List<OmsOrderReturnReason> get(Integer status) {
        SelectStatementProvider selectStatement = SqlBuilder.select(OmsOrderReturnReasonMapper.selectList)
                .from(OmsOrderReturnReasonDynamicSqlSupport.omsOrderReturnReason)
                .where(OmsOrderReturnReasonDynamicSqlSupport.status, isEqualTo(status))
                .build().render(RenderingStrategy.MYBATIS3);
        List<OmsOrderReturnReason> orderReturnReasonList = omsOrderReturnReasonMapper.selectMany(selectStatement);
        return orderReturnReasonList;
    }

    @Override
    public int create(OmsOrderReturnReason orderReturnReason) {
        orderReturnReason.setCreateTime(new Date());
        int result = omsOrderReturnReasonMapper.insert(orderReturnReason);
        return result;
    }

    @Override
    public int update(Long id, OmsOrderReturnReason orderReturnReason) {
        orderReturnReason.setId(id);
        int result = omsOrderReturnReasonMapper.updateByPrimaryKey(orderReturnReason);
        return result;
    }

    @Override
    public int delete(Long id) {
        int result = omsOrderReturnReasonMapper.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int delete(List<Long> ids) {
        int count=0;
        for (Long id:ids)
        {
            int result = omsOrderReturnReasonMapper.deleteByPrimaryKey(id);
            count+=result;
        }
        return count;
    }
}
