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
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.mybatis.dynamic.sql.SqlBuilder.equalTo;
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

    @Override
    public int reject(Map returnApplyReject) {
        Long id = Long.parseLong(String.valueOf(returnApplyReject.get("id")));
        Long companyAddressId =Long.parseLong( String.valueOf(returnApplyReject.get("companyAddressId")));
        String handleNote = String.valueOf(returnApplyReject.get("handleNote"));
        UpdateStatementProvider updateStatement=SqlBuilder.update(OmsOrderReturnApplyDynamicSqlSupport.omsOrderReturnApply)
                .set(OmsOrderReturnApplyDynamicSqlSupport.companyAddressId).equalTo(companyAddressId)
                .set(OmsOrderReturnApplyDynamicSqlSupport.handleNote).equalTo(handleNote)
                .set(OmsOrderReturnApplyDynamicSqlSupport.handleTime).equalTo(new Date())
                .set(OmsOrderReturnApplyDynamicSqlSupport.handleMan).equalTo("后台管理员")
                //已拒绝
                .set(OmsOrderReturnApplyDynamicSqlSupport.status).equalTo(3)
        .where(OmsOrderReturnApplyDynamicSqlSupport.id,isEqualTo(id))
                .build().render(RenderingStrategy.MYBATIS3);
        int update = omsOrderReturnApplyMapper.update(updateStatement);
        return update;
    }

    @Override
    public int confirm(Map returnApplyConfirm) {
        Long id = Long.parseLong(String.valueOf(returnApplyConfirm.get("id")));
        Long companyAddressId =Long.parseLong( String.valueOf(returnApplyConfirm.get("companyAddressId")));
        String handleNote = String.valueOf(returnApplyConfirm.get("handleNote"));
        UpdateStatementProvider updateStatement=SqlBuilder.update(OmsOrderReturnApplyDynamicSqlSupport.omsOrderReturnApply)
                .set(OmsOrderReturnApplyDynamicSqlSupport.companyAddressId).equalTo(companyAddressId)
                .set(OmsOrderReturnApplyDynamicSqlSupport.handleNote).equalTo(handleNote)
                .set(OmsOrderReturnApplyDynamicSqlSupport.handleTime).equalTo(new Date())
                .set(OmsOrderReturnApplyDynamicSqlSupport.handleMan).equalTo("后台管理员")
                //退货中
                .set(OmsOrderReturnApplyDynamicSqlSupport.status).equalTo(1)
                .where(OmsOrderReturnApplyDynamicSqlSupport.id,isEqualTo(id))
                .build().render(RenderingStrategy.MYBATIS3);
        int update = omsOrderReturnApplyMapper.update(updateStatement);
        return update;
    }

    @Override
    public int receive(Map returnApplyReceive) {
        Long id = Long.parseLong(String.valueOf(returnApplyReceive.get("id")));
        String receiveNote = String.valueOf(returnApplyReceive.get("receiveNote"));
        UpdateStatementProvider updateStatement=SqlBuilder.update(OmsOrderReturnApplyDynamicSqlSupport.omsOrderReturnApply)
                .set(OmsOrderReturnApplyDynamicSqlSupport.receiveNote).equalTo(receiveNote)
                .set(OmsOrderReturnApplyDynamicSqlSupport.receiveTime).equalTo(new Date())
                .set(OmsOrderReturnApplyDynamicSqlSupport.receiveMan).equalTo("后台管理员")
                //已完成
                .set(OmsOrderReturnApplyDynamicSqlSupport.status).equalTo(2)
                .where(OmsOrderReturnApplyDynamicSqlSupport.id,isEqualTo(id))
                .build().render(RenderingStrategy.MYBATIS3);
        int update = omsOrderReturnApplyMapper.update(updateStatement);
        return update;
    }
}
