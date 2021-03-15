package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.annotation.Generated;

public class MmsCouponGoodsCategoryRelation implements Serializable {
    private Long id;

    @ApiModelProperty(value = "优惠券id")
    private Long couponId;

    @ApiModelProperty(value = "商品分类id")
    private Long goodsCategoryId;

    @ApiModelProperty(value = "商品分类名称")
    private String goodsCategoryName;

    @ApiModelProperty(value = "父分类名称")
    private String parentCategoryName;

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
    public Long getCouponId() {
        return couponId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
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
    public String getGoodsCategoryName() {
        return goodsCategoryName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsCategoryName(String goodsCategoryName) {
        this.goodsCategoryName = goodsCategoryName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getParentCategoryName() {
        return parentCategoryName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponId=").append(couponId);
        sb.append(", goodsCategoryId=").append(goodsCategoryId);
        sb.append(", goodsCategoryName=").append(goodsCategoryName);
        sb.append(", parentCategoryName=").append(parentCategoryName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}