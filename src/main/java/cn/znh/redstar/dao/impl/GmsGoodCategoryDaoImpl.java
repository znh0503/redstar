package cn.znh.redstar.dao.impl;

import cn.znh.redstar.dao.GmsGoodCategoryDao;
import cn.znh.redstar.mbg.mapper.GmsGoodsCategoryDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.GmsGoodsCategoryMapper;
import cn.znh.redstar.mbg.mapper.UmsMemberDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.UmsMemberMapper;
import cn.znh.redstar.mbg.model.GmsGoodsCategory;
import org.apache.ibatis.annotations.Select;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.join.EqualTo;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import java.util.List;
import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * @author : znh
 * @date : 16:31 2021/4/5
 * 商品分类自定义dao层
 */
@Repository
public class GmsGoodCategoryDaoImpl implements GmsGoodCategoryDao {
    @Resource
    GmsGoodsCategoryMapper gmsGoodsCategoryMapper;
    @Override
    public List<GmsGoodsCategory> getGoodsCategoryByLevel(int level) {
        //根据level查询分类信息
        SelectStatementProvider selectStatement = SqlBuilder.select(GmsGoodsCategoryMapper.selectList)
                .from(GmsGoodsCategoryDynamicSqlSupport.gmsGoodsCategory)
                .where(GmsGoodsCategoryDynamicSqlSupport.level, isEqualToWhenPresent(level))
                .orderBy(GmsGoodsCategoryDynamicSqlSupport.id)
                .build().render(RenderingStrategy.MYBATIS3);
        List<GmsGoodsCategory> goodsCategoryList = gmsGoodsCategoryMapper.selectMany(selectStatement);
        return goodsCategoryList;
    }

    @Override
    public List<GmsGoodsCategory> getGoodsCategoryByParentId(Long parentId) {
        //根据parentId查询分类信息
        SelectStatementProvider selectStatement = SqlBuilder.select(GmsGoodsCategoryMapper.selectList)
                .from(GmsGoodsCategoryDynamicSqlSupport.gmsGoodsCategory)
                .where(GmsGoodsCategoryDynamicSqlSupport.parentId, isEqualToWhenPresent(parentId))
                .orderBy(GmsGoodsCategoryDynamicSqlSupport.id)
                .build().render(RenderingStrategy.MYBATIS3);
        List<GmsGoodsCategory> goodsCategoryList = gmsGoodsCategoryMapper.selectMany(selectStatement);
        return goodsCategoryList;
    }

    @Override
    public GmsGoodsCategory getGoodsCategoryById(Long id) {
        GmsGoodsCategoryDynamicSqlSupport.GmsGoodsCategory gmsGoodsCategory2
                =new GmsGoodsCategoryDynamicSqlSupport.GmsGoodsCategory();
        SelectStatementProvider selectStatement = SqlBuilder.select(GmsGoodsCategoryMapper.selectList)
                .from(GmsGoodsCategoryDynamicSqlSupport.gmsGoodsCategory,"ggc1")
                .join(gmsGoodsCategory2,"ggc2")
                .on(GmsGoodsCategoryDynamicSqlSupport.gmsGoodsCategory.id, equalTo(gmsGoodsCategory2.parentId))
                .where(gmsGoodsCategory2.id,isEqualTo(id))
                .build().render(RenderingStrategy.MYBATIS3);
        Optional<GmsGoodsCategory> gmsGoodsCategory = gmsGoodsCategoryMapper.selectOne(selectStatement);
        return gmsGoodsCategory.orElse(null);
    }
}
