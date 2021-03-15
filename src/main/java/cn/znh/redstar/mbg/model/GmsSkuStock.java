package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class GmsSkuStock implements Serializable {
    private Long id;

    @ApiModelProperty(value = "商品id")
    private Long goodsId;

    @ApiModelProperty(value = "sku编码")
    private String skuCode;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "库存")
    private Integer stock;

    @ApiModelProperty(value = "预警库存")
    private Integer lowStock;

    @ApiModelProperty(value = "规格属性1")
    private String sp1;

    @ApiModelProperty(value = "规格属性2")
    private String sp2;

    @ApiModelProperty(value = "规格属性3")
    private String sp3;

    @ApiModelProperty(value = "展示图片")
    private String pic;

    @ApiModelProperty(value = "销量")
    private Integer sale;

    @ApiModelProperty(value = "单品促销价格")
    private BigDecimal promotionPrice;

    @ApiModelProperty(value = "锁定库存")
    private Integer lockStock;

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
    public String getSkuCode() {
        return skuCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPrice() {
        return price;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getStock() {
        return stock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getLowStock() {
        return lowStock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
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
    public String getPic() {
        return pic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPic(String pic) {
        this.pic = pic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSale() {
        return sale;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getLockStock() {
        return lockStock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
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
        sb.append(", skuCode=").append(skuCode);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", sp1=").append(sp1);
        sb.append(", sp2=").append(sp2);
        sb.append(", sp3=").append(sp3);
        sb.append(", pic=").append(pic);
        sb.append(", sale=").append(sale);
        sb.append(", promotionPrice=").append(promotionPrice);
        sb.append(", lockStock=").append(lockStock);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}