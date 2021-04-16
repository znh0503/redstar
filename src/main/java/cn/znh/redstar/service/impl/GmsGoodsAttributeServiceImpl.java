package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.GmsGoodsAttributeDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.GmsGoodsAttributeMapper;
import cn.znh.redstar.mbg.mapper.GmsGoodsFullReductionDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.GmsGoodsFullReductionMapper;
import cn.znh.redstar.mbg.model.GmsGoodsAttribute;
import cn.znh.redstar.service.GmsGoodsAttributeService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author : znh
 * @date : 21:11 2021/4/8
 * 商品属性service实现类
 */
@Service
public class GmsGoodsAttributeServiceImpl implements GmsGoodsAttributeService {
    @Resource
    GmsGoodsAttributeMapper gmsGoodsAttributeMapper;
    @Override
    public List<GmsGoodsAttribute> getGoodsAttribute(Long goodsAttributeCategoryId) {
        SelectStatementProvider selectStatement = SqlBuilder.select(GmsGoodsAttributeMapper.selectList)
                .from(GmsGoodsAttributeDynamicSqlSupport.gmsGoodsAttribute)
                .where(GmsGoodsAttributeDynamicSqlSupport.goodsAttributeCategoryId, isEqualTo(goodsAttributeCategoryId))
                .build().render(RenderingStrategy.MYBATIS3);
        List<GmsGoodsAttribute> goodsAttributeList = gmsGoodsAttributeMapper.selectMany(selectStatement);
        return goodsAttributeList;
    }
}
