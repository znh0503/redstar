package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class MmsFlashPromotionLog implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "会员id")
    private Integer memberId;

    @ApiModelProperty(value = "商品id")
    private Long goodsId;

    @ApiModelProperty(value = "会员电话")
    private String memberPhone;

    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    @ApiModelProperty(value = "会员订阅时间")
    private Date subscribeTime;

    @ApiModelProperty(value = "发送时间")
    private Date sendTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getMemberId() {
        return memberId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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
    public String getMemberPhone() {
        return memberPhone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
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
    public Date getSubscribeTime() {
        return subscribeTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getSendTime() {
        return sendTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
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
        sb.append(", goodsId=").append(goodsId);
        sb.append(", memberPhone=").append(memberPhone);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", subscribeTime=").append(subscribeTime);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}