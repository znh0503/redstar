package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class OmsOrderReturnApply implements Serializable {
    private Long id;

    @ApiModelProperty(value = "订单id")
    private Long orderId;

    @ApiModelProperty(value = "收货地址表id")
    private Long companyAddressId;

    @ApiModelProperty(value = "退货商品id")
    private Long goodsId;

    @ApiModelProperty(value = "订单编号")
    private String orderSn;

    @ApiModelProperty(value = "申请时间")
    private Date createTime;

    @ApiModelProperty(value = "会员用户名")
    private String memberUsername;

    @ApiModelProperty(value = "退款金额")
    private BigDecimal returnAmount;

    @ApiModelProperty(value = "退货人姓名")
    private String returnName;

    @ApiModelProperty(value = "退货人电话")
    private String returnPhone;

    @ApiModelProperty(value = "申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝")
    private Integer status;

    @ApiModelProperty(value = "处理时间")
    private Date handleTime;

    @ApiModelProperty(value = "商品图片")
    private String goodsPic;

    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    @ApiModelProperty(value = "商品品牌")
    private String goodsBrand;

    @ApiModelProperty(value = "商品销售属性：颜色：红色；尺码：xl;")
    private String goodsAttr;

    @ApiModelProperty(value = "退货数量")
    private Integer goodsCount;

    @ApiModelProperty(value = "商品单价")
    private BigDecimal goodsPrice;

    @ApiModelProperty(value = "商品实际支付单价")
    private BigDecimal goodsRealPrice;

    @ApiModelProperty(value = "原因")
    private String reason;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "凭证图片，以逗号隔开")
    private String proofPics;

    @ApiModelProperty(value = "处理备注")
    private String handleNote;

    @ApiModelProperty(value = "处理人员")
    private String handleMan;

    @ApiModelProperty(value = "收货人")
    private String receiveMan;

    @ApiModelProperty(value = "收货时间")
    private Date receiveTime;

    @ApiModelProperty(value = "收货备注")
    private String receiveNote;

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
    public Long getCompanyAddressId() {
        return companyAddressId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCompanyAddressId(Long companyAddressId) {
        this.companyAddressId = companyAddressId;
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
    public String getOrderSn() {
        return orderSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemberUsername() {
        return memberUsername;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReturnName() {
        return returnName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReturnPhone() {
        return returnPhone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getStatus() {
        return status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getHandleTime() {
        return handleTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
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
    public String getGoodsAttr() {
        return goodsAttr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGoodsCount() {
        return goodsCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
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
    public BigDecimal getGoodsRealPrice() {
        return goodsRealPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsRealPrice(BigDecimal goodsRealPrice) {
        this.goodsRealPrice = goodsRealPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReason() {
        return reason;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDescription() {
        return description;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProofPics() {
        return proofPics;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProofPics(String proofPics) {
        this.proofPics = proofPics;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getHandleNote() {
        return handleNote;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getHandleMan() {
        return handleMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiveMan() {
        return receiveMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getReceiveTime() {
        return receiveTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiveNote() {
        return receiveNote;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote;
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
        sb.append(", companyAddressId=").append(companyAddressId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", createTime=").append(createTime);
        sb.append(", memberUsername=").append(memberUsername);
        sb.append(", returnAmount=").append(returnAmount);
        sb.append(", returnName=").append(returnName);
        sb.append(", returnPhone=").append(returnPhone);
        sb.append(", status=").append(status);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", goodsPic=").append(goodsPic);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsBrand=").append(goodsBrand);
        sb.append(", goodsAttr=").append(goodsAttr);
        sb.append(", goodsCount=").append(goodsCount);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsRealPrice=").append(goodsRealPrice);
        sb.append(", reason=").append(reason);
        sb.append(", description=").append(description);
        sb.append(", proofPics=").append(proofPics);
        sb.append(", handleNote=").append(handleNote);
        sb.append(", handleMan=").append(handleMan);
        sb.append(", receiveMan=").append(receiveMan);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", receiveNote=").append(receiveNote);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}