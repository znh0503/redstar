package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.annotation.Generated;

public class UmsMemberTask implements Serializable {
    private Long id;

    private String name;

    @ApiModelProperty(value = "赠送成长值")
    private Integer growth;

    @ApiModelProperty(value = "赠送积分")
    private Integer intergration;

    @ApiModelProperty(value = "任务类型：0->新手任务；1->日常任务")
    private Integer type;

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
    public Integer getGrowth() {
        return growth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getIntergration() {
        return intergration;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIntergration(Integer intergration) {
        this.intergration = intergration;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getType() {
        return type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setType(Integer type) {
        this.type = type;
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
        sb.append(", growth=").append(growth);
        sb.append(", intergration=").append(intergration);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}