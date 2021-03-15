package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class OmsCartItem implements Serializable {
    private Long id;

    @ApiModelProperty(value = "商品的id")
    private Long goodsId;

    @ApiModelProperty(value = "商品sku的id")
    private Long goodsSkuId;

    @ApiModelProperty(value = "会员id")
    private Long memberId;

    @ApiModelProperty(value = "购买数量")
    private Integer quantity;

    @ApiModelProperty(value = "添加到购物车的价格")
    private BigDecimal price;

    @ApiModelProperty(value = "销售属性1")
    private String sp1;

    @ApiModelProperty(value = "销售属性2")
    private String sp2;

    @ApiModelProperty(value = "销售属性3")
    private String sp3;

    @ApiModelProperty(value = "商品主图")
    private String goodsPic;

    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    @ApiModelProperty(value = "商品品牌")
    private String goodsBrand;

    @ApiModelProperty(value = "商品的条码")
    private String goodsSn;

    @ApiModelProperty(value = "商品副标题（卖点）")
    private String goodsSubTitle;

    @ApiModelProperty(value = "商品sku条码")
    private String goodsSkuCode;

    @ApiModelProperty(value = "会员昵称")
    private String memberNickname;

    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    @ApiModelProperty(value = "修改时间")
    private Date modifyDate;

    @ApiModelProperty(value = "是否删除")
    private Integer deleteStatus;

    @ApiModelProperty(value = "商品的分类")
    private Long goodsCategoryId;

    @ApiModelProperty(value = "商品销售属性:[{'key':'颜色','value':'银色'},{'key':'容量','value':'4G'}]")
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
    public Long getGoodsId() {
        return goodsId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
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
    public Long getMemberId() {
        return memberId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getQuantity() {
        return quantity;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
    public String getGoodsSubTitle() {
        return goodsSubTitle;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsSubTitle(String goodsSubTitle) {
        this.goodsSubTitle = goodsSubTitle;
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
    public String getMemberNickname() {
        return memberNickname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateDate() {
        return createDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getModifyDate() {
        return modifyDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
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
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsSkuId=").append(goodsSkuId);
        sb.append(", memberId=").append(memberId);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", sp1=").append(sp1);
        sb.append(", sp2=").append(sp2);
        sb.append(", sp3=").append(sp3);
        sb.append(", goodsPic=").append(goodsPic);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsBrand=").append(goodsBrand);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", goodsSubTitle=").append(goodsSubTitle);
        sb.append(", goodsSkuCode=").append(goodsSkuCode);
        sb.append(", memberNickname=").append(memberNickname);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", goodsCategoryId=").append(goodsCategoryId);
        sb.append(", goodsAttr=").append(goodsAttr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}