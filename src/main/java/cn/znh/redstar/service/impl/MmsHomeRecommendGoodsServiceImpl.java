package cn.znh.redstar.service.impl;


import cn.znh.redstar.mbg.mapper.MmsHomeRecommendGoodsDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.MmsHomeRecommendGoodsMapper;
import cn.znh.redstar.mbg.model.GmsGoods;
import cn.znh.redstar.mbg.model.MmsHomeRecommendGoods;
import cn.znh.redstar.service.MmsHomeRecommendGoodsService;
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
 * @date : 1:07 2021/4/29
 */
@Service
public class MmsHomeRecommendGoodsServiceImpl implements MmsHomeRecommendGoodsService {

    @Resource
    MmsHomeRecommendGoodsMapper homeRecommendGoodsMapper;

    @Override
    public List<MmsHomeRecommendGoods> getHomeRecommendGoods() {
        List<MmsHomeRecommendGoods> result = homeRecommendGoodsMapper.select(SelectDSLCompleter.allRows());
        return result;
    }

    @Override
    public List<MmsHomeRecommendGoods> getHomeRecommendGoods(int recommendStatus) {
        SelectStatementProvider selectStatement = SqlBuilder.select(MmsHomeRecommendGoodsMapper.selectList)
                .from(MmsHomeRecommendGoodsDynamicSqlSupport.mmsHomeRecommendGoods)
                .where(MmsHomeRecommendGoodsDynamicSqlSupport.recommendStatus, isEqualTo(recommendStatus))
                .build().render(RenderingStrategy.MYBATIS3);
        List<MmsHomeRecommendGoods> homeRecommendGoodsList = homeRecommendGoodsMapper.selectMany(selectStatement);
        return homeRecommendGoodsList;
    }

    @Override
    public List<MmsHomeRecommendGoods> createHomeRecommendGoods(List<GmsGoods> goodsList) {
        List<MmsHomeRecommendGoods> result=new ArrayList<>();
        for (GmsGoods goods:goodsList)
        {
            MmsHomeRecommendGoods homeRecommendGoods=new MmsHomeRecommendGoods();
            homeRecommendGoods.setGoodsId(goods.getId());
            homeRecommendGoods.setGoodsName(goods.getName());
            homeRecommendGoods.setSort(goods.getSort());
            //推荐状态默认为推荐
            homeRecommendGoods.setRecommendStatus(1);
            //查询有没有同名的
            SelectStatementProvider selectStatement = SqlBuilder.select(MmsHomeRecommendGoodsMapper.selectList)
                    .from(MmsHomeRecommendGoodsDynamicSqlSupport.mmsHomeRecommendGoods)
                    .where(MmsHomeRecommendGoodsDynamicSqlSupport.goodsName, isEqualTo(goods.getName()))
                    .build().render(RenderingStrategy.MYBATIS3);
            List<MmsHomeRecommendGoods> homeRecommendGoodsList = homeRecommendGoodsMapper.selectMany(selectStatement);
            //如果没有同名才插入
            if (homeRecommendGoodsList.isEmpty())
            {
                homeRecommendGoodsMapper.insert(homeRecommendGoods);
                result.add(homeRecommendGoods);
            }
        }
        return result;
    }

    @Override
    public int updateHomeRecommendGoods(Long id, MmsHomeRecommendGoods homeRecommendGoods) {
        homeRecommendGoods.setId(id);
        int result = homeRecommendGoodsMapper.updateByPrimaryKey(homeRecommendGoods);
        return result;
    }

    @Override
    public int deleteHomeRecommendGoods(Long id) {
        int result = homeRecommendGoodsMapper.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int deleteHomeRecommendGoods(List<Long> ids) {
        int count=0;
        for (Long id:ids)
        {
            int result = homeRecommendGoodsMapper.deleteByPrimaryKey(id);
            count+=result;
        }
        return count;
    }
}
