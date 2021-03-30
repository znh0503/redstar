package cn.znh.redstar.nosql.elasticsearch.repository;

import cn.znh.redstar.nosql.elasticsearch.document.EsGoods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author : znh
 * @date : 10:28 2021/3/30
 * 商品搜索ES repository
 */
public interface EsGoodsRepository extends ElasticsearchRepository<EsGoods,Long> {
    /**
     *  按商品名称或商品标题或商品关键字搜索商品
     * @param name      商品名称
     * @param subTitle  商品标题
     * @param keywords  商品关键字
     * @param page      分页信息
     * @return
     */
    Page<EsGoods> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);
}
