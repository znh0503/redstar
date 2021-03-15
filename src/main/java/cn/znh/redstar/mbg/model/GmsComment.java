package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class GmsComment implements Serializable {
    private Long id;

    @ApiModelProperty(value = "商品id")
    private Long goodsId;

    @ApiModelProperty(value = "会员昵称")
    private String memberNickName;

    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    @ApiModelProperty(value = "评价星数：0->5")
    private Integer star;

    @ApiModelProperty(value = "评价的ip")
    private String memberIp;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "是否显示")
    private Integer showStatus;

    @ApiModelProperty(value = "购买时的商品属性")
    private String goodsAttribute;

    @ApiModelProperty(value = "收藏数")
    private Integer collectCouont;

    @ApiModelProperty(value = "阅读数")
    private Integer readCount;

    @ApiModelProperty(value = "上传图片地址，以逗号隔开")
    private String pics;

    @ApiModelProperty(value = "评论用户头像")
    private String memberIcon;

    @ApiModelProperty(value = "回复数")
    private Integer replayCount;

    @ApiModelProperty(value = "内容")
    private String content;

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
    public String getMemberNickName() {
        return memberNickName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
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
    public Integer getStar() {
        return star;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStar(Integer star) {
        this.star = star;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemberIp() {
        return memberIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
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
    public Integer getShowStatus() {
        return showStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getGoodsAttribute() {
        return goodsAttribute;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsAttribute(String goodsAttribute) {
        this.goodsAttribute = goodsAttribute;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCollectCouont() {
        return collectCouont;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCollectCouont(Integer collectCouont) {
        this.collectCouont = collectCouont;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getReadCount() {
        return readCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPics() {
        return pics;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPics(String pics) {
        this.pics = pics;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemberIcon() {
        return memberIcon;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getReplayCount() {
        return replayCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getContent() {
        return content;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContent(String content) {
        this.content = content;
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
        sb.append(", memberNickName=").append(memberNickName);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", star=").append(star);
        sb.append(", memberIp=").append(memberIp);
        sb.append(", createTime=").append(createTime);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", goodsAttribute=").append(goodsAttribute);
        sb.append(", collectCouont=").append(collectCouont);
        sb.append(", readCount=").append(readCount);
        sb.append(", pics=").append(pics);
        sb.append(", memberIcon=").append(memberIcon);
        sb.append(", replayCount=").append(replayCount);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}