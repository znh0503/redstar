package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class GmsMemberPrice implements Serializable {
    private Long id;

    @ApiModelProperty(value = "商品id")
    private Long goodsId;

    @ApiModelProperty(value = "会员等级id")
    private Long memberLevelId;

    @ApiModelProperty(value = "会员价格")
    private BigDecimal memberPrice;

    @ApiModelProperty(value = "会员等级名称")
    private String memberLevelName;

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
    public Long getMemberLevelId() {
        return memberLevelId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemberLevelName() {
        return memberLevelName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
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
        sb.append(", memberLevelId=").append(memberLevelId);
        sb.append(", memberPrice=").append(memberPrice);
        sb.append(", memberLevelName=").append(memberLevelName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}