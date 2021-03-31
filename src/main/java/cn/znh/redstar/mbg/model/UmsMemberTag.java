package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class UmsMemberTag implements Serializable {
    private Long id;

    private String name;

    @ApiModelProperty(value = "自动打标签完成订单数量")
    private Integer finishOrderCount;

    @ApiModelProperty(value = "自动打标签完成订单金额")
    private BigDecimal finishOrderAmount;

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
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getFinishOrderCount() {
        return finishOrderCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFinishOrderCount(Integer finishOrderCount) {
        this.finishOrderCount = finishOrderCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getFinishOrderAmount() {
        return finishOrderAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFinishOrderAmount(BigDecimal finishOrderAmount) {
        this.finishOrderAmount = finishOrderAmount;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", finishOrderCount=").append(finishOrderCount);
        sb.append(", finishOrderAmount=").append(finishOrderAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}