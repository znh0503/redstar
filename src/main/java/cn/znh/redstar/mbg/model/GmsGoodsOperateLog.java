package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class GmsGoodsOperateLog implements Serializable {
    private Long id;

    @ApiModelProperty(value = "商品id")
    private Long goodsId;

    @ApiModelProperty(value = "改变前价格")
    private BigDecimal priceOld;

    @ApiModelProperty(value = "改变后价格")
    private BigDecimal priceNew;

    @ApiModelProperty(value = "改变前优惠价")
    private BigDecimal salePriceOld;

    @ApiModelProperty(value = "改变后优惠价")
    private BigDecimal salePriceNew;

    @ApiModelProperty(value = "改变前积分")
    private Integer giftPointOld;

    @ApiModelProperty(value = "改变后积分")
    private Integer giftPointNew;

    @ApiModelProperty(value = "改变前积分使用限制")
    private Integer usePointLimitOld;

    @ApiModelProperty(value = "改变后积分使用限制")
    private Integer usePointLimitNew;

    @ApiModelProperty(value = "操作人")
    private String operateMan;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

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
    public Long getGoodsId() {
        return goodsId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPriceOld() {
        return priceOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPriceOld(BigDecimal priceOld) {
        this.priceOld = priceOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPriceNew() {
        return priceNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPriceNew(BigDecimal priceNew) {
        this.priceNew = priceNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getSalePriceOld() {
        return salePriceOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSalePriceOld(BigDecimal salePriceOld) {
        this.salePriceOld = salePriceOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getSalePriceNew() {
        return salePriceNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSalePriceNew(BigDecimal salePriceNew) {
        this.salePriceNew = salePriceNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGiftPointOld() {
        return giftPointOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGiftPointOld(Integer giftPointOld) {
        this.giftPointOld = giftPointOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGiftPointNew() {
        return giftPointNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGiftPointNew(Integer giftPointNew) {
        this.giftPointNew = giftPointNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getUsePointLimitOld() {
        return usePointLimitOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUsePointLimitOld(Integer usePointLimitOld) {
        this.usePointLimitOld = usePointLimitOld;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getUsePointLimitNew() {
        return usePointLimitNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUsePointLimitNew(Integer usePointLimitNew) {
        this.usePointLimitNew = usePointLimitNew;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOperateMan() {
        return operateMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", priceOld=").append(priceOld);
        sb.append(", priceNew=").append(priceNew);
        sb.append(", salePriceOld=").append(salePriceOld);
        sb.append(", salePriceNew=").append(salePriceNew);
        sb.append(", giftPointOld=").append(giftPointOld);
        sb.append(", giftPointNew=").append(giftPointNew);
        sb.append(", usePointLimitOld=").append(usePointLimitOld);
        sb.append(", usePointLimitNew=").append(usePointLimitNew);
        sb.append(", operateMan=").append(operateMan);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}