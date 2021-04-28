package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.MmsHomeBrandDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.MmsHomeBrandMapper;
import cn.znh.redstar.mbg.mapper.MmsHomeNewGoodsDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.MmsHomeNewGoodsMapper;
import cn.znh.redstar.mbg.model.GmsGoods;
import cn.znh.redstar.mbg.model.MmsHomeBrand;
import cn.znh.redstar.mbg.model.MmsHomeNewGoods;
import cn.znh.redstar.service.MmsHomeNewGoodsService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author : znh
 * @date : 16:14 2021/4/28
 */
@Service
public class MmsHomeNewGoodsServiceImpl implements MmsHomeNewGoodsService {
    @Resource
    MmsHomeNewGoodsMapper mmsHomeNewGoodsMapper;

    @Override
    public List<MmsHomeNewGoods> getHomeNewGoods() {
        List<MmsHomeNewGoods> result = mmsHomeNewGoodsMapper.select(SelectDSLCompleter.allRows());
        return result;
    }

    @Override
    public List<MmsHomeNewGoods> getHomeNewGoods(int recommendStatus) {
        SelectStatementProvider selectStatement = SqlBuilder.select(MmsHomeNewGoodsMapper.selectList)
                .from(MmsHomeNewGoodsDynamicSqlSupport.mmsHomeNewGoods)
                .where(MmsHomeNewGoodsDynamicSqlSupport.recommendStatus, isEqualTo(recommendStatus))
                .build().render(RenderingStrategy.MYBATIS3);
        List<MmsHomeNewGoods> homeNewGoodsList = mmsHomeNewGoodsMapper.selectMany(selectStatement);
        return homeNewGoodsList;
    }

    @Override
    public List<MmsHomeNewGoods> createHomeNewGoods(List<GmsGoods> goodsList) {
        List<MmsHomeNewGoods> result=new ArrayList<>();
        for (GmsGoods goods:goodsList)
        {
            MmsHomeNewGoods homeNewGoods=new MmsHomeNewGoods();
            homeNewGoods.setGoodsId(goods.getId());
            homeNewGoods.setGoodsName(goods.getName());
            homeNewGoods.setSort(goods.getSort());
            //推荐状态默认为推荐
            homeNewGoods.setRecommendStatus(1);
            //查询有没有同名的
            SelectStatementProvider selectStatement = SqlBuilder.select(MmsHomeNewGoodsMapper.selectList)
                    .from(MmsHomeNewGoodsDynamicSqlSupport.mmsHomeNewGoods)
                    .where(MmsHomeNewGoodsDynamicSqlSupport.goodsName, isEqualTo(goods.getName()))
                    .build().render(RenderingStrategy.MYBATIS3);
            List<MmsHomeNewGoods> homeNewGoodsList = mmsHomeNewGoodsMapper.selectMany(selectStatement);
            //如果没有同名才插入
            if (homeNewGoodsList.isEmpty())
            {
                mmsHomeNewGoodsMapper.insert(homeNewGoods);
                result.add(homeNewGoods);
            }
        }
        return result;
    }

    @Override
    public int updateHomeNewGoods(Long id, MmsHomeNewGoods homeNewGoods) {
        homeNewGoods.setId(id);
        int result = mmsHomeNewGoodsMapper.updateByPrimaryKey(homeNewGoods);
        return result;
    }

    @Override
    public int deleteHomeNewGoods(Long id) {
        int result = mmsHomeNewGoodsMapper.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int deleteHomeNewGoods(List<Long> ids) {
        int count=0;
        for (Long id:ids)
        {
            int result = mmsHomeNewGoodsMapper.deleteByPrimaryKey(id);
            count+=result;
        }
        return count;
    }
}
