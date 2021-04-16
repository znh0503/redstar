package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.GmsGoodsLadderDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.GmsGoodsLadderMapper;
import cn.znh.redstar.mbg.model.GmsGoodsLadder;
import cn.znh.redstar.mbg.model.GmsMemberPrice;
import cn.znh.redstar.service.GmsGoodsLadderService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author : znh
 * @date : 17:22 2021/4/8
 * 商品阶梯价格service实现类
 */
@Service
public class GmsGoodsLadderServiceImpl implements GmsGoodsLadderService {
    @Resource
    GmsGoodsLadderMapper gmsGoodsLadderMapper;
    @Override
    public List<GmsGoodsLadder> getGoodsLadderByGoodsId(Long goodsId) {
        SelectStatementProvider selectStatement = SqlBuilder.select(GmsGoodsLadderMapper.selectList)
                .from(GmsGoodsLadderDynamicSqlSupport.gmsGoodsLadder)
                .where(GmsGoodsLadderDynamicSqlSupport.goodsId, isEqualTo(goodsId))
                .orderBy(GmsGoodsLadderDynamicSqlSupport.count)
                .build().render(RenderingStrategy.MYBATIS3);
        List<GmsGoodsLadder> goodsLadderList = gmsGoodsLadderMapper.selectMany(selectStatement);
        return goodsLadderList;
    }
}
