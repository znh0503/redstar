package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.annotation.Generated;

public class GmsGoodsCategoryAttributeRelation implements Serializable {
    private Long id;

    @ApiModelProperty(value = "商品分类id")
    private Long goodsCategoryId;

    @ApiModelProperty(value = "商品属性id")
    private Long goodsAttributeId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getGoodsCategoryId() {
        return goodsCategoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsCategoryId(Long goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getGoodsAttributeId() {
        return goodsAttributeId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsAttributeId(Long goodsAttributeId) {
        this.goodsAttributeId = goodsAttributeId;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsCategoryId=").append(goodsCategoryId);
        sb.append(", goodsAttributeId=").append(goodsAttributeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}