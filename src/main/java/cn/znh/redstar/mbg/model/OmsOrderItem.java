package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class OmsOrderItem implements Serializable {
    private Long id;

    @ApiModelProperty(value = "订单id")
    private Long orderId;

    @ApiModelProperty(value = "订单编号")
    private String orderSn;

    @ApiModelProperty(value = "商品id")
    private Long goodsId;

    @ApiModelProperty(value = "商品图片")
    private String goodsPic;

    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    @ApiModelProperty(value = "商品品牌")
    private String goodsBrand;

    @ApiModelProperty(value = "商品条码")
    private String goodsSn;

    @ApiModelProperty(value = "销售价格")
    private BigDecimal goodsPrice;

    @ApiModelProperty(value = "购买数量")
    private Integer goodsQuantity;

    @ApiModelProperty(value = "商品sku编号")
    private Long goodsSkuId;

    @ApiModelProperty(value = "商品sku条码")
    private String goodsSkuCode;

    @ApiModelProperty(value = "商品分类id")
    private Long goodsCategoryId;

    @ApiModelProperty(value = "商品的销售属性1")
    private String sp1;

    @ApiModelProperty(value = "商品的销售属性2")
    private String sp2;

    @ApiModelProperty(value = "商品的销售属性3")
    private String sp3;

    @ApiModelProperty(value = "商品促销名称")
    private String promotionName;

    @ApiModelProperty(value = "商品促销分解金额")
    private BigDecimal promotionAmount;

    @ApiModelProperty(value = "优惠券优惠分解金额")
    private BigDecimal couponAmount;

    @ApiModelProperty(value = "积分优惠分解金额")
    private BigDecimal integrationAmount;

    @ApiModelProperty(value = "该商品经过优惠后的分解金额")
    private BigDecimal realAmount;

    @ApiModelProperty(value = "商品赠送积分")
    private Integer giftIntegration;

    @ApiModelProperty(value = "商品赠送成长值")
    private Integer giftGrowth;

    @ApiModelProperty(value = "商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量','value':'4G'}]")
    private String goodsAttr;

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
    public Long getOrderId() {
        return orderId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOrderSn() {
        return orderSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
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
    public String getGoodsPic() {
        return goodsPic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic;
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
    public String getGoodsBrand() {
        return goodsBrand;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsBrand(String goodsBrand) {
        this.goodsBrand = goodsBrand;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getGoodsSn() {
        return goodsSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGoodsQuantity() {
        return goodsQuantity;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsQuantity(Integer goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getGoodsSkuId() {
        return goodsSkuId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsSkuId(Long goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getGoodsSkuCode() {
        return goodsSkuCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsSkuCode(String goodsSkuCode) {
        this.goodsSkuCode = goodsSkuCode;
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
    public String getSp1() {
        return sp1;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSp2() {
        return sp2;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSp3() {
        return sp3;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPromotionName() {
        return promotionName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getGoodsAttr() {
        return goodsAttr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsPic=").append(goodsPic);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsBrand=").append(goodsBrand);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsQuantity=").append(goodsQuantity);
        sb.append(", goodsSkuId=").append(goodsSkuId);
        sb.append(", goodsSkuCode=").append(goodsSkuCode);
        sb.append(", goodsCategoryId=").append(goodsCategoryId);
        sb.append(", sp1=").append(sp1);
        sb.append(", sp2=").append(sp2);
        sb.append(", sp3=").append(sp3);
        sb.append(", promotionName=").append(promotionName);
        sb.append(", promotionAmount=").append(promotionAmount);
        sb.append(", couponAmount=").append(couponAmount);
        sb.append(", integrationAmount=").append(integrationAmount);
        sb.append(", realAmount=").append(realAmount);
        sb.append(", giftIntegration=").append(giftIntegration);
        sb.append(", giftGrowth=").append(giftGrowth);
        sb.append(", goodsAttr=").append(goodsAttr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}