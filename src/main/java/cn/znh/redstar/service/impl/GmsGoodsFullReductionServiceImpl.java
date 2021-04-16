package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.GmsGoodsFullReductionDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.GmsGoodsFullReductionMapper;
import cn.znh.redstar.mbg.mapper.GmsGoodsLadderDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.GmsGoodsLadderMapper;
import cn.znh.redstar.mbg.model.GmsGoodsFullReduction;
import cn.znh.redstar.service.GmsGoodsFullReductionService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author : znh
 * @date : 17:42 2021/4/8
 * 商品满减service实现类
 */
@Service
public class GmsGoodsFullReductionServiceImpl implements GmsGoodsFullReductionService {

    @Resource
    GmsGoodsFullReductionMapper gmsGoodsFullReductionMapper;

    @Override
    public List<GmsGoodsFullReduction> getGoodsFullReductionByGoodsId(Long goodsId) {
        SelectStatementProvider selectStatement = SqlBuilder.select(GmsGoodsFullReductionMapper.selectList)
                .from(GmsGoodsFullReductionDynamicSqlSupport.gmsGoodsFullReduction)
                .where(GmsGoodsFullReductionDynamicSqlSupport.goodsId, isEqualTo(goodsId))
                .orderBy(GmsGoodsFullReductionDynamicSqlSupport.fullPrice)
                .build().render(RenderingStrategy.MYBATIS3);
        List<GmsGoodsFullReduction> goodsFullReductionList = gmsGoodsFullReductionMapper.selectMany(selectStatement);
        return goodsFullReductionList;
    }
}
