package cn.znh.redstar.service.impl;

import cn.znh.redstar.dao.GmsGoodCategoryDao;
import cn.znh.redstar.mbg.mapper.GmsGoodsCategoryMapper;
import cn.znh.redstar.mbg.model.GmsGoodsCategory;
import cn.znh.redstar.service.GmsGoodCategoryService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 16:20 2021/4/5
 * 商品分类信息管理service
 */
@Service
public class GmsGoodCategoryServiceImpl implements GmsGoodCategoryService {
    @Resource
    GmsGoodsCategoryMapper gmsGoodsCategoryMapper;

    @Resource(name = "gmsGoodCategoryDaoImpl")
    GmsGoodCategoryDao gmsGoodCategoryDao;

    @Override
    public List<GmsGoodsCategory> getGoodsCategory() {
        List<GmsGoodsCategory> result = gmsGoodsCategoryMapper.select(SelectDSLCompleter.allRows());
        return result;
    }

    @Override
    public List<GmsGoodsCategory> getGoodsCategoryByLevel(int level) {
        List<GmsGoodsCategory> goodsCategoryList = gmsGoodCategoryDao.getGoodsCategoryByLevel(level);
        return goodsCategoryList;
    }

    @Override
    public List<GmsGoodsCategory> getGoodsCategoryByParentId(Long parentId) {
        List<GmsGoodsCategory> goodsCategoryList = gmsGoodCategoryDao.getGoodsCategoryByParentId(parentId);
        return goodsCategoryList;
    }

    @Override
    public GmsGoodsCategory getGoodsCategoryById(Long id) {
        GmsGoodsCategory goodsCategory = gmsGoodCategoryDao.getGoodsCategoryById(id);
        return goodsCategory;
    }
}
