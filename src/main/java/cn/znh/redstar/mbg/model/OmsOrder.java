package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class OmsOrder implements Serializable {
    @ApiModelProperty(value = "订单id")
    private Long id;

    @ApiModelProperty(value = "会员id")
    private Long memberId;

    @ApiModelProperty(value = "优惠券id")
    private Long couponId;

    @ApiModelProperty(value = "订单编号")
    private String orderSn;

    @ApiModelProperty(value = "提交时间")
    private Date createTime;

    @ApiModelProperty(value = "用户帐号")
    private String memberUsername;

    @ApiModelProperty(value = "订单总金额")
    private BigDecimal totalAmount;

    @ApiModelProperty(value = "应付金额（实际支付金额）")
    private BigDecimal payAmount;

    @ApiModelProperty(value = "运费金额")
    private BigDecimal freightAmount;

    @ApiModelProperty(value = "促销优化金额（促销价、满减、阶梯价）")
    private BigDecimal promotionAmount;

    @ApiModelProperty(value = "积分抵扣金额")
    private BigDecimal integrationAmount;

    @ApiModelProperty(value = "优惠券抵扣金额")
    private BigDecimal couponAmount;

    @ApiModelProperty(value = "管理员后台调整订单使用的折扣金额")
    private BigDecimal discountAmount;

    @ApiModelProperty(value = "支付方式：0->未支付；1->支付宝；2->微信")
    private Integer payType;

    @ApiModelProperty(value = "订单来源：0->PC订单；1->app订单")
    private Integer sourceType;

    @ApiModelProperty(value = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer status;

    @ApiModelProperty(value = "订单类型：0->正常订单；1->秒杀订单")
    private Integer orderType;

    @ApiModelProperty(value = "物流公司(配送方式)")
    private String deliveryCompany;

    @ApiModelProperty(value = "物流单号")
    private String deliverySn;

    @ApiModelProperty(value = "自动确认时间（天）")
    private Integer autoConfirmDay;

    @ApiModelProperty(value = "可以获得的积分")
    private Integer integration;

    @ApiModelProperty(value = "可以活动的成长值")
    private Integer growth;

    @ApiModelProperty(value = "活动信息")
    private String promotionInfo;

    @ApiModelProperty(value = "发票类型：0->不开发票；1->电子发票；2->纸质发票")
    private Integer billType;

    @ApiModelProperty(value = "发票抬头")
    private String billHeader;

    @ApiModelProperty(value = "发票内容")
    private String billContent;

    @ApiModelProperty(value = "收票人电话")
    private String billReceiverPhone;

    @ApiModelProperty(value = "收票人邮箱")
    private String billReceiverEmail;

    @ApiModelProperty(value = "收货人姓名")
    private String receiverName;

    @ApiModelProperty(value = "收货人电话")
    private String receiverPhone;

    @ApiModelProperty(value = "收货人邮编")
    private String receiverPostCode;

    @ApiModelProperty(value = "省份/直辖市")
    private String receiverProvince;

    @ApiModelProperty(value = "城市")
    private String receiverCity;

    @ApiModelProperty(value = "区")
    private String receiverRegion;

    @ApiModelProperty(value = "详细地址")
    private String receiverDetailAddress;

    @ApiModelProperty(value = "订单备注")
    private String note;

    @ApiModelProperty(value = "确认收货状态：0->未确认；1->已确认")
    private Integer confirmStatus;

    @ApiModelProperty(value = "删除状态：0->未删除；1->已删除")
    private Integer deleteStatus;

    @ApiModelProperty(value = "下单时使用的积分")
    private Integer useIntegration;

    @ApiModelProperty(value = "支付时间")
    private Date paymentTime;

    @ApiModelProperty(value = "发货时间")
    private Date deliveryTime;

    @ApiModelProperty(value = "确认收货时间")
    private Date receiveTime;

    @ApiModelProperty(value = "评价时间")
    private Date commentTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;


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
    public Long getMemberId() {
        return memberId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
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
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
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
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPayType() {
        return payType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSourceType() {
        return sourceType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
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
    public Integer getOrderType() {
        return orderType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeliverySn() {
        return deliverySn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getAutoConfirmDay() {
        return autoConfirmDay;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAutoConfirmDay(Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getIntegration() {
        return integration;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGrowth() {
        return growth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPromotionInfo() {
        return promotionInfo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getBillType() {
        return billType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBillHeader() {
        return billHeader;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBillContent() {
        return billContent;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBillContent(String billContent) {
        this.billContent = billContent;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBillReceiverPhone() {
        return billReceiverPhone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBillReceiverPhone(String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiverName() {
        return receiverName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiverPhone() {
        return receiverPhone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiverProvince() {
        return receiverProvince;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiverCity() {
        return receiverCity;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiverRegion() {
        return receiverRegion;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNote() {
        return note;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNote(String note) {
        this.note = note;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
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
    public Integer getUseIntegration() {
        return useIntegration;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getPaymentTime() {
        return paymentTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
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
    public Date getCommentTime() {
        return commentTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getModifyTime() {
        return modifyTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", couponId=").append(couponId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", createTime=").append(createTime);
        sb.append(", memberUsername=").append(memberUsername);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", freightAmount=").append(freightAmount);
        sb.append(", promotionAmount=").append(promotionAmount);
        sb.append(", integrationAmount=").append(integrationAmount);
        sb.append(", couponAmount=").append(couponAmount);
        sb.append(", discountAmount=").append(discountAmount);
        sb.append(", payType=").append(payType);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", status=").append(status);
        sb.append(", orderType=").append(orderType);
        sb.append(", deliveryCompany=").append(deliveryCompany);
        sb.append(", deliverySn=").append(deliverySn);
        sb.append(", autoConfirmDay=").append(autoConfirmDay);
        sb.append(", integration=").append(integration);
        sb.append(", growth=").append(growth);
        sb.append(", promotionInfo=").append(promotionInfo);
        sb.append(", billType=").append(billType);
        sb.append(", billHeader=").append(billHeader);
        sb.append(", billContent=").append(billContent);
        sb.append(", billReceiverPhone=").append(billReceiverPhone);
        sb.append(", billReceiverEmail=").append(billReceiverEmail);
        sb.append(", receiverName=").append(receiverName);
        sb.append(", receiverPhone=").append(receiverPhone);
        sb.append(", receiverPostCode=").append(receiverPostCode);
        sb.append(", receiverProvince=").append(receiverProvince);
        sb.append(", receiverCity=").append(receiverCity);
        sb.append(", receiverRegion=").append(receiverRegion);
        sb.append(", receiverDetailAddress=").append(receiverDetailAddress);
        sb.append(", note=").append(note);
        sb.append(", confirmStatus=").append(confirmStatus);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", useIntegration=").append(useIntegration);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", deliveryTime=").append(deliveryTime);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", commentTime=").append(commentTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}