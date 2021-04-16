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
}
