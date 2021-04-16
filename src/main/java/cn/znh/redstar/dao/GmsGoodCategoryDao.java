package cn.znh.redstar.dao;

import cn.znh.redstar.mbg.model.GmsGoodsCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author : znh
 * @date : 16:28 2021/4/5
 * 商品分类自定义dao层
 */
public interface GmsGoodCategoryDao {
    /**
     * 根据分类级别查询分类详情
     * @param level
     * @return
     */
    List<GmsGoodsCategory> getGoodsCategoryByLevel(int level);

    /**
     * 根据上级分类id查询出下一级的分类
     * @param parentId
     * @return
     */
    List<GmsGoodsCategory> getGoodsCategoryByParentId(Long parentId);

    /**
     * 根据id查询上一级分类信息
     * @param id
     * @return
     */
    @Select("SELECT * FROM gms_goods_category ggc1 INNER JOIN gms_goods_category ggc2 ON ggc1.id=ggc2.parent_id WHERE ggc2.id=19")
    public GmsGoodsCategory getGoodsCategoryById(Long id);
}
