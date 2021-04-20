package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.GmsGoodsAttributeCategoryMapper;
import cn.znh.redstar.mbg.model.GmsGoodsAttributeCategory;
import cn.znh.redstar.service.GmsGoodsAttributeCategoryService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 20:09 2021/4/8
 * 商品属性分类service实现类
 */
@Service
public class GmsGoodsAttributeCategoryServiceImpl implements GmsGoodsAttributeCategoryService {
    @Resource
    GmsGoodsAttributeCategoryMapper gmsGoodsAttributeCategoryMapper;
    @Override
    public List<GmsGoodsAttributeCategory> getGoodsAttributeCategory() {
        List<GmsGoodsAttributeCategory> goodsAttributeCategoryList = gmsGoodsAttributeCategoryMapper.select(SelectDSLCompleter.allRows());
        return goodsAttributeCategoryList;
    }

    @Override
    public int createAttributeCategory(GmsGoodsAttributeCategory attributeCategory) {
        //插入一条属性分类信息
        attributeCategory.setAttributeCount(0);
        attributeCategory.setParamCount(0);
        int result = gmsGoodsAttributeCategoryMapper.insert(attributeCategory);
        return result;
    }

    @Override
    public int updateAttributeCategory(Long id, GmsGoodsAttributeCategory attributeCategory) {
        //更新属性分类信息
        attributeCategory.setId(id);
        int result = gmsGoodsAttributeCategoryMapper.updateByPrimaryKey(attributeCategory);
        return result;
    }

    @Override
    public int deleteAttributeCategory(Long id) {
        //删除一条属性分类信息
        int result = gmsGoodsAttributeCategoryMapper.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int deleteAttributeCategoryByIds(List<Long> ids) {
        //批量删除属性分类信息
        int result=0;
        for (Long id:ids)
        {
            int count = gmsGoodsAttributeCategoryMapper.deleteByPrimaryKey(id);
            result+=count;
        }
        return result;
    }
}
