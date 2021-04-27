package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.GmsBrand;
import cn.znh.redstar.mbg.model.MmsHomeBrand;

import java.util.List;

/**
 * @author : znh
 * @date : 17:20 2021/4/24
 * 首页品牌推荐Service层
 */
public interface MmsHomeBrandService {
    /**
     * 查询所有品牌推荐
     * @return
     */
    List<MmsHomeBrand> listAllHomeBrand();

    /**
     * 根据id删除品牌推荐
     * @param id
     * @return
     */
    int deleteHomeBrand(Long id);

    /**
     * 批量删除品牌推荐
     * @param id
     * @return
     */
    int deleteHomeBrand(List<Long> id);

    /**
     * 批量添加品牌推荐信息
     * @param brandList
     * @return
     */
    List createHomeBrand(List<GmsBrand> brandList);

    /**
     * 根据id更新品牌推荐信息
     * @param id
     * @param homeBrand
     * @return
     */
    int updateHomeBrand(Long id, MmsHomeBrand homeBrand);

}
