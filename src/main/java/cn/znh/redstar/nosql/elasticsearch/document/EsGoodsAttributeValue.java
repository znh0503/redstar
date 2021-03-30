package cn.znh.redstar.nosql.elasticsearch.document;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @author : znh
 * @date : 10:35 2021/3/30
 * 搜索中的商品属性信息
 */
@Data
public class EsGoodsAttributeValue implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long goodsAttributeId;
    /**
     * 属性值
     */
    @Field(type = FieldType.Keyword)
    private String value;

    /**
     * 属性参数：0->规格；1->参数
     */
    private Integer type;
    /**
     * 属性名称
     */
    @Field(type=FieldType.Keyword)
    private String name;
}
