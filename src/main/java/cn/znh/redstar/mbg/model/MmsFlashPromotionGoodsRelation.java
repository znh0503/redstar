package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class MmsFlashPromotionGoodsRelation implements Serializable {
    private Long id;

    @ApiModelProperty(value = "限时购id")
    private Long flashPromotionId;

    @ApiModelProperty(value = "秒杀时间段编号")
    private Long flashPromotionSessionId;

    @ApiModelProperty(value = "商品id")
    private Long goodsId;

    @ApiModelProperty(value = "限时购价格")
    private BigDecimal flashPromotionPrice;

    @ApiModelProperty(value = "限时购数量")
    private Integer flashPromotionCount;

    @ApiModelProperty(value = "每人限购数量")
    private Integer flashPromotionLimit;

    @ApiModelProperty(value = "排序")
    private Integer sort;

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
    public Long getFlashPromotionId() {
        return flashPromotionId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFlashPromotionId(Long flashPromotionId) {
        this.flashPromotionId = flashPromotionId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getFlashPromotionSessionId() {
        return flashPromotionSessionId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFlashPromotionSessionId(Long flashPromotionSessionId) {
        this.flashPromotionSessionId = flashPromotionSessionId;
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
    public BigDecimal getFlashPromotionPrice() {
        return flashPromotionPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFlashPromotionPrice(BigDecimal flashPromotionPrice) {
        this.flashPromotionPrice = flashPromotionPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getFlashPromotionCount() {
        return flashPromotionCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFlashPromotionCount(Integer flashPromotionCount) {
        this.flashPromotionCount = flashPromotionCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getFlashPromotionLimit() {
        return flashPromotionLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFlashPromotionLimit(Integer flashPromotionLimit) {
        this.flashPromotionLimit = flashPromotionLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSort() {
        return sort;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flashPromotionId=").append(flashPromotionId);
        sb.append(", flashPromotionSessionId=").append(flashPromotionSessionId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", flashPromotionPrice=").append(flashPromotionPrice);
        sb.append(", flashPromotionCount=").append(flashPromotionCount);
        sb.append(", flashPromotionLimit=").append(flashPromotionLimit);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}