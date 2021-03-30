package cn.znh.redstar.service;

import cn.znh.redstar.nosql.elasticsearch.document.EsGoods;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author : znh
 * @date : 10:44 2021/3/30
 * 商品搜索管理service
 */
public interface EsGoodsService {
    /**
     * 从数据库导入所有商品到es
     * @return
     */
    int importAll();

    /**
     * 根据id删除商品
     * @param id
     * @return
     */
    boolean delete(Long id);

    /**
     * 批量删除商品
     * @param ids
     * @return
     */
    boolean delete(List<Long> ids);

    /**
     * 根据id创建商品
     * @param id
     * @return
     */
    EsGoods create(Long id);

    /**
     * 根据关键字搜索
     * @param keyword   关键字
     * @param pageNum
     * @param pageSize
     * @return
     */
    Page<EsGoods> search(String keyword, Integer pageNum, Integer pageSize);
}
