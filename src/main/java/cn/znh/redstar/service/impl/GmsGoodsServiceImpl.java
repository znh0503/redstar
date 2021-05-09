package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.GmsGoodsCategoryDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.GmsGoodsDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.GmsGoodsMapper;
import cn.znh.redstar.mbg.model.GmsGoods;
import cn.znh.redstar.mbg.model.GmsGoodsCategory;
import cn.znh.redstar.service.GmsGoodsService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.where.condition.IsIn;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author : znh
 * @date : 23:01 2021/4/1
 * 商品管理service实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GmsGoodsServiceImpl implements GmsGoodsService {
    @Resource
    GmsGoodsMapper gmsGoodsMapper;

    @Override
    public List<GmsGoods> listAllGoods() {
        List<GmsGoods> goodsList = gmsGoodsMapper.select(SelectDSLCompleter.allRows());
        return goodsList;
    }

    @Override
    public GmsGoods getGoodsById(Long id) {
        Optional<GmsGoods> goods = gmsGoodsMapper.selectByPrimaryKey(id);
        return goods.orElse(null);
    }

    @Override
    public List<GmsGoods> getGoods(Long goodsCategoryId) {
        SelectStatementProvider selectStatement= SqlBuilder.select(GmsGoodsMapper.selectList)
                .from(GmsGoodsDynamicSqlSupport.gmsGoods)
                .where(GmsGoodsDynamicSqlSupport.goodsCategoryId, SqlBuilder.isIn(
                        SqlBuilder.select(GmsGoodsCategoryDynamicSqlSupport.id)
                .from(GmsGoodsCategoryDynamicSqlSupport.gmsGoodsCategory)
                .where(GmsGoodsCategoryDynamicSqlSupport.parentId,SqlBuilder.isEqualTo(goodsCategoryId))))
                .build().render(RenderingStrategy.MYBATIS3);
        List<GmsGoods> goodsList = gmsGoodsMapper.selectMany(selectStatement);
        return goodsList;
    }

    @Override
    public int updateGoods(Long id,GmsGoods goods) {
        goods.setId(id);
        int result = gmsGoodsMapper.updateByPrimaryKey(goods);
        return result;
    }

    @Override
    public int create(GmsGoods goods) {
        int result = gmsGoodsMapper.insert(goods);
        return result;
    }

    @Override
    public int deleteGoods(Long id) {
        int result = gmsGoodsMapper.deleteByPrimaryKey(id);
        return result;
    }
}
