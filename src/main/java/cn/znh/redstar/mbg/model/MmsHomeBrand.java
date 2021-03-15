package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.annotation.Generated;

public class MmsHomeBrand implements Serializable {
    private Long id;

    @ApiModelProperty(value = "商品品牌id")
    private Long brandId;

    @ApiModelProperty(value = "商品品牌名称")
    private String brandName;

    @ApiModelProperty(value = "推荐状态：0->不推荐;1->推荐")
    private Integer recommendStatus;

    @ApiModelProperty(value = "排序")
    private Integer sort;

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
    public Long getBrandId() {
        return brandId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBrandName() {
        return brandName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSort() {
        return sort;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brandId=").append(brandId);
        sb.append(", brandName=").append(brandName);
        sb.append(", recommendStatus=").append(recommendStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}