package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.annotation.Generated;

public class MmsCouponGoodsRelation implements Serializable {
    private Long id;

    @ApiModelProperty(value = "优惠券id")
    private Long couponId;

    @ApiModelProperty(value = "商品id")
    private Long goodsId;

    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    @ApiModelProperty(value = "商品条码")
    private String goodsSn;

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
    public Long getGoodsId() {
        return goodsId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getGoodsName() {
        return goodsName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getGoodsSn() {
        return goodsSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
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
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}