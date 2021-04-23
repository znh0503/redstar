package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.*;
import cn.znh.redstar.mbg.model.GmsGoodsAttribute;
import cn.znh.redstar.mbg.model.GmsGoodsAttributeCategory;
import cn.znh.redstar.service.GmsGoodsAttributeService;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.equalTo;
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
    @Resource
    GmsGoodsAttributeCategoryMapper gmsGoodsAttributeCategoryMapper;

    @Override
    public List<GmsGoodsAttribute> getGoodsAttribute(Long goodsAttributeCategoryId) {
        SelectStatementProvider selectStatement = SqlBuilder.select(GmsGoodsAttributeMapper.selectList)
                .from(GmsGoodsAttributeDynamicSqlSupport.gmsGoodsAttribute)
                .where(GmsGoodsAttributeDynamicSqlSupport.goodsAttributeCategoryId, isEqualTo(goodsAttributeCategoryId))
                .build().render(RenderingStrategy.MYBATIS3);
        List<GmsGoodsAttribute> goodsAttributeList = gmsGoodsAttributeMapper.selectMany(selectStatement);
        return goodsAttributeList;
    }

    @Override
    public List<GmsGoodsAttribute> getGoodsAttribute(Long goodsAttributeCategoryId, Integer type) {
        SelectStatementProvider selectStatement = SqlBuilder.select(GmsGoodsAttributeMapper.selectList)
                .from(GmsGoodsAttributeDynamicSqlSupport.gmsGoodsAttribute)
                .where(GmsGoodsAttributeDynamicSqlSupport.goodsAttributeCategoryId, isEqualTo(goodsAttributeCategoryId))
                .and(GmsGoodsAttributeDynamicSqlSupport.type,isEqualTo(type))
                .build().render(RenderingStrategy.MYBATIS3);
        List<GmsGoodsAttribute> goodsAttributeList = gmsGoodsAttributeMapper.selectMany(selectStatement);
        return goodsAttributeList;
    }

    @Override
    public int createGoodsAttribute(GmsGoodsAttribute goodsAttribute) {
        int result = gmsGoodsAttributeMapper.insert(goodsAttribute);
        if (result!=0)
        {
            //更新商品属性分类的规格或者参数数量
            GmsGoodsAttributeCategory gmsGoodsAttributeCategory = gmsGoodsAttributeCategoryMapper.selectByPrimaryKey(goodsAttribute.getGoodsAttributeCategoryId()).orElse(null);
            UpdateDSL<UpdateModel> builder = SqlBuilder.update(GmsGoodsAttributeCategoryDynamicSqlSupport.gmsGoodsAttributeCategory);
            //规格
            if (goodsAttribute.getType()==0)
            {
                //获取属性分类的规格数量
                Integer attributeCount = gmsGoodsAttributeCategory.getAttributeCount();
                builder.set(GmsGoodsAttributeCategoryDynamicSqlSupport.attributeCount).equalTo(attributeCount+1);
            }
            //参数
            else {
                //获取属性分类的参数数量
                Integer paramCount = gmsGoodsAttributeCategory.getParamCount();
                builder.set(GmsGoodsAttributeCategoryDynamicSqlSupport.paramCount).equalTo(paramCount+1);
            }
            UpdateStatementProvider updateStatement = builder.where(GmsGoodsAttributeCategoryDynamicSqlSupport.id, isEqualTo(goodsAttribute.getGoodsAttributeCategoryId()))
                    .build().render(RenderingStrategy.MYBATIS3);
            gmsGoodsAttributeCategoryMapper.update(updateStatement);
        }

        return result;
    }

    @Override
    public int updateGoodsAttribute(Long id, GmsGoodsAttribute goodsAttribute) {
        //查询未更新前的属性信息
        GmsGoodsAttribute goodsAttributeOld = gmsGoodsAttributeMapper.selectByPrimaryKey(id).orElse(null);
        goodsAttribute.setId(id);
        int result = gmsGoodsAttributeMapper.updateByPrimaryKey(goodsAttribute);
        //更新成功，如果更新的属性的所属分类改变了，就要更新相关属性分类的参数数量或者规格数量
        if (result!=0&&!goodsAttributeOld.getGoodsAttributeCategoryId().
                equals(goodsAttribute.getGoodsAttributeCategoryId()))
        {
            GmsGoodsAttributeCategory gmsGoodsAttributeCategory = gmsGoodsAttributeCategoryMapper.selectByPrimaryKey(goodsAttribute.getGoodsAttributeCategoryId()).orElse(null);
            GmsGoodsAttributeCategory gmsGoodsAttributeCategoryOld = gmsGoodsAttributeCategoryMapper.selectByPrimaryKey(goodsAttributeOld.getGoodsAttributeCategoryId()).orElse(null);
            UpdateDSL<UpdateModel> builder = SqlBuilder.update(GmsGoodsAttributeCategoryDynamicSqlSupport.gmsGoodsAttributeCategory);
            UpdateDSL<UpdateModel> builderOld = SqlBuilder.update(GmsGoodsAttributeCategoryDynamicSqlSupport.gmsGoodsAttributeCategory);

            //规格
            if (goodsAttribute.getType()==0)
            {
                //新的父类规格数量加1
                builder.set(GmsGoodsAttributeCategoryDynamicSqlSupport.attributeCount).equalTo(gmsGoodsAttributeCategory.getAttributeCount()+1);
                //旧的父类规格数量减一
                builderOld.set(GmsGoodsAttributeCategoryDynamicSqlSupport.attributeCount).equalTo(gmsGoodsAttributeCategoryOld.getAttributeCount()-1);
            }
            //参数
            else {
                //新的父类参数数量加1
                builder.set(GmsGoodsAttributeCategoryDynamicSqlSupport.paramCount).equalTo(gmsGoodsAttributeCategory.getParamCount()+1);
                //旧的父类参数数量减一
                builderOld.set(GmsGoodsAttributeCategoryDynamicSqlSupport.paramCount).equalTo(gmsGoodsAttributeCategoryOld.getParamCount()-1);
            }
            UpdateStatementProvider updateStatement = builder.where(GmsGoodsAttributeCategoryDynamicSqlSupport.id, isEqualTo(goodsAttribute.getGoodsAttributeCategoryId()))
                    .build().render(RenderingStrategy.MYBATIS3);
            UpdateStatementProvider updateStatementOld = builderOld.where(GmsGoodsAttributeCategoryDynamicSqlSupport.id, isEqualTo(goodsAttributeOld.getGoodsAttributeCategoryId()))
                    .build().render(RenderingStrategy.MYBATIS3);
            gmsGoodsAttributeCategoryMapper.update(updateStatement);
            gmsGoodsAttributeCategoryMapper.update(updateStatementOld);
        }
        return result;
    }

    @Override
    public int deleteGoodsAttribute(Long id) {
        GmsGoodsAttribute goodsAttribute = gmsGoodsAttributeMapper.selectByPrimaryKey(id).orElse(null);
        int result = gmsGoodsAttributeMapper.deleteByPrimaryKey(id);
        if (result!=0)
        {
            //更新商品属性分类的规格或者参数数量
            GmsGoodsAttributeCategory gmsGoodsAttributeCategory = gmsGoodsAttributeCategoryMapper.selectByPrimaryKey(goodsAttribute.getGoodsAttributeCategoryId()).orElse(null);
            UpdateDSL<UpdateModel> builder = SqlBuilder.update(GmsGoodsAttributeCategoryDynamicSqlSupport.gmsGoodsAttributeCategory);
            //规格
            if (goodsAttribute.getType()==0)
            {
                //获取属性分类的规格数量
                Integer attributeCount = gmsGoodsAttributeCategory.getAttributeCount();
                builder.set(GmsGoodsAttributeCategoryDynamicSqlSupport.attributeCount).equalTo(attributeCount-1);
            }
            //参数
            else {
                //获取属性分类的参数数量
                Integer paramCount = gmsGoodsAttributeCategory.getParamCount();
                builder.set(GmsGoodsAttributeCategoryDynamicSqlSupport.paramCount).equalTo(paramCount-1);
            }
            UpdateStatementProvider updateStatement = builder.where(GmsGoodsAttributeCategoryDynamicSqlSupport.id, isEqualTo(goodsAttribute.getGoodsAttributeCategoryId()))
                    .build().render(RenderingStrategy.MYBATIS3);
            gmsGoodsAttributeCategoryMapper.update(updateStatement);
        }
        return result;
    }

    @Override
    public int deleteGoodsAttribute(List<Long> ids) {
        if (ids.isEmpty()){return 0;}
        GmsGoodsAttribute goodsAttribute = gmsGoodsAttributeMapper.selectByPrimaryKey(ids.get(0)).orElse(null);
        int count=0;
        for (Long id:ids)
        {
            int result = gmsGoodsAttributeMapper.deleteByPrimaryKey(id);
            count+=result;
        }
        if (count!=0)
        {
            //更新商品属性分类的规格或者参数数量
            GmsGoodsAttributeCategory gmsGoodsAttributeCategory = gmsGoodsAttributeCategoryMapper.selectByPrimaryKey(goodsAttribute.getGoodsAttributeCategoryId()).orElse(null);
            UpdateDSL<UpdateModel> builder = SqlBuilder.update(GmsGoodsAttributeCategoryDynamicSqlSupport.gmsGoodsAttributeCategory);
            //规格
            if (goodsAttribute.getType()==0)
            {
                //获取属性分类的规格数量
                Integer attributeCount = gmsGoodsAttributeCategory.getAttributeCount();
                builder.set(GmsGoodsAttributeCategoryDynamicSqlSupport.attributeCount).equalTo(attributeCount-count);
            }
            //参数
            else {
                //获取属性分类的参数数量
                Integer paramCount = gmsGoodsAttributeCategory.getParamCount();
                builder.set(GmsGoodsAttributeCategoryDynamicSqlSupport.paramCount).equalTo(paramCount-count);
            }
            UpdateStatementProvider updateStatement = builder.where(GmsGoodsAttributeCategoryDynamicSqlSupport.id, isEqualTo(goodsAttribute.getGoodsAttributeCategoryId()))
                    .build().render(RenderingStrategy.MYBATIS3);
            gmsGoodsAttributeCategoryMapper.update(updateStatement);
        }
        return count;
    }
}
