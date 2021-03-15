package cn.znh.redstar.service;


import cn.znh.redstar.mbg.model.GmsBrand;

import java.util.List;

/**
 * @author : znh
 * @date : 21:38 2021/3/14
 * 品牌管理service
 */
public interface GmsBrandService {
    /**
     * 查询所有品牌
     * @return
     */
    List<GmsBrand> listAllBrand();

    /**
     * 创建一个品牌
     * @param brand
     * @return
     */
    int createBrand(GmsBrand brand);

    /**
     * 根据id更新品牌信息
     * @param id
     * @param brand
     * @return
     */
    int updateBrand(Long id, GmsBrand brand);

    /**
     * 根据id删除品牌
     * @param id
     * @return
     */
    int deleteBrand(Long id);

    /**
     * 分页查询品牌列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<GmsBrand> listBrand(int pageNum, int pageSize);

    /**
     * 根据id查询品牌信息
     * @param id
     * @return
     */
    GmsBrand getBrand(Long id);
}
