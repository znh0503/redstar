package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class UmsMemberStatisticsInfo implements Serializable {
    private Long id;

    private Long memberId;

    @ApiModelProperty(value = "累计消费金额")
    private BigDecimal consumeAmount;

    @ApiModelProperty(value = "订单数量")
    private Integer orderCount;

    @ApiModelProperty(value = "优惠券数量")
    private Integer couponCount;

    @ApiModelProperty(value = "评价数")
    private Integer commentCount;

    @ApiModelProperty(value = "退货数量")
    private Integer returnOrderCount;

    @ApiModelProperty(value = "登录次数")
    private Integer loginCount;

    @ApiModelProperty(value = "关注数量")
    private Integer attendCount;

    @ApiModelProperty(value = "粉丝数量")
    private Integer fansCount;

    private Integer collectGoodsCount;

    private Integer collectSubjectCount;

    private Integer collectTopicCount;

    private Integer collectCommentCount;

    private Integer inviteFriendCount;

    @ApiModelProperty(value = "最后一次下订单时间")
    private Date recentOrderTime;

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
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getOrderCount() {
        return orderCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCouponCount() {
        return couponCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCommentCount() {
        return commentCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getLoginCount() {
        return loginCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getAttendCount() {
        return attendCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getFansCount() {
        return fansCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCollectGoodsCount() {
        return collectGoodsCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCollectGoodsCount(Integer collectGoodsCount) {
        this.collectGoodsCount = collectGoodsCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCollectSubjectCount() {
        return collectSubjectCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCollectSubjectCount(Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCollectTopicCount() {
        return collectTopicCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCollectTopicCount(Integer collectTopicCount) {
        this.collectTopicCount = collectTopicCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCollectCommentCount() {
        return collectCommentCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCollectCommentCount(Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getRecentOrderTime() {
        return recentOrderTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRecentOrderTime(Date recentOrderTime) {
        this.recentOrderTime = recentOrderTime;
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
        sb.append(", consumeAmount=").append(consumeAmount);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", couponCount=").append(couponCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", returnOrderCount=").append(returnOrderCount);
        sb.append(", loginCount=").append(loginCount);
        sb.append(", attendCount=").append(attendCount);
        sb.append(", fansCount=").append(fansCount);
        sb.append(", collectGoodsCount=").append(collectGoodsCount);
        sb.append(", collectSubjectCount=").append(collectSubjectCount);
        sb.append(", collectTopicCount=").append(collectTopicCount);
        sb.append(", collectCommentCount=").append(collectCommentCount);
        sb.append(", inviteFriendCount=").append(inviteFriendCount);
        sb.append(", recentOrderTime=").append(recentOrderTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}