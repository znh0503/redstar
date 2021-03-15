package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class MmsCoupon implements Serializable {
    private Long id;

    @ApiModelProperty(value = "优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券")
    private Integer type;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "使用平台：0->全部；1->移动；2->PC")
    private Integer platform;

    @ApiModelProperty(value = "数量")
    private Integer count;

    @ApiModelProperty(value = "金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "每人限领张数")
    private Integer perLimit;

    @ApiModelProperty(value = "使用门槛；0表示无门槛")
    private BigDecimal minPoint;

    @ApiModelProperty(value = "开始使用时间")
    private Date startTime;

    @ApiModelProperty(value = "结束使用时间")
    private Date endTime;

    @ApiModelProperty(value = "使用类型：0->全场通用；1->指定分类；2->指定商品")
    private Integer useType;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "发行数量")
    private Integer publishCount;

    @ApiModelProperty(value = "已使用数量")
    private Integer useCount;

    @ApiModelProperty(value = "领取数量")
    private Integer receiveCount;

    @ApiModelProperty(value = "可以领取的日期")
    private Date enableTime;

    @ApiModelProperty(value = "优惠码")
    private String code;

    @ApiModelProperty(value = "可领取的会员类型：0->无限制")
    private Integer memberLevel;

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
    public Integer getType() {
        return type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setType(Integer type) {
        this.type = type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPlatform() {
        return platform;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCount() {
        return count;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCount(Integer count) {
        this.count = count;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getAmount() {
        return amount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPerLimit() {
        return perLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getMinPoint() {
        return minPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMinPoint(BigDecimal minPoint) {
        this.minPoint = minPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getStartTime() {
        return startTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getEndTime() {
        return endTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getUseType() {
        return useType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseType(Integer useType) {
        this.useType = useType;
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
    public Integer getPublishCount() {
        return publishCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getUseCount() {
        return useCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getReceiveCount() {
        return receiveCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getEnableTime() {
        return enableTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEnableTime(Date enableTime) {
        this.enableTime = enableTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCode() {
        return code;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCode(String code) {
        this.code = code;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getMemberLevel() {
        return memberLevel;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", platform=").append(platform);
        sb.append(", count=").append(count);
        sb.append(", amount=").append(amount);
        sb.append(", perLimit=").append(perLimit);
        sb.append(", minPoint=").append(minPoint);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", useType=").append(useType);
        sb.append(", note=").append(note);
        sb.append(", publishCount=").append(publishCount);
        sb.append(", useCount=").append(useCount);
        sb.append(", receiveCount=").append(receiveCount);
        sb.append(", enableTime=").append(enableTime);
        sb.append(", code=").append(code);
        sb.append(", memberLevel=").append(memberLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}