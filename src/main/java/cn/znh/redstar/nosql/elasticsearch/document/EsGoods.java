package cn.znh.redstar.nosql.elasticsearch.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author : znh
 * @date : 0:15 2021/3/30
 * 搜索的商品信息
 */
@Data
@Document(indexName = "gms_goods",shards = 1,replicas = 0)
public class EsGoods implements Serializable {
    private static final long serialVersionUID = -1L;
    @Id
    private Long id;
    @Field(type = FieldType.Keyword)
    private String goodsSn;
    private Long brandId;
    @Field(type = FieldType.Keyword)
    private String brandName;
    private Long goodsCategoryId;
    @Field(type = FieldType.Keyword)
    private String goodsCategoryName;
    private String pic;
    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String name;
    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String subTitle;
    @Field(type = FieldType.Keyword)
    private String keywords;
    private BigDecimal price;
    private Integer sale;
    private Integer newStatus;
    private Integer recommendStatus;
    private Integer stock;
    private Integer promotionType;
    private Integer sort;
    @Field(type =FieldType.Nested)
    private List<EsGoodsAttributeValue> attrValueList;
}
