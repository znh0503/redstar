package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.annotation.Generated;

public class GmsBrand implements Serializable {
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "首字母")
    private String firstLetter;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;

    @ApiModelProperty(value = "是否显示:0->不显示,1->显示")
    private Integer showStatus;

    @ApiModelProperty(value = "商品数量")
    private Integer goodsCount;

    @ApiModelProperty(value = "商品评论数量")
    private Integer goodsCommentCount;

    @ApiModelProperty(value = "品牌logo")
    private String logo;

    @ApiModelProperty(value = "专区大图")
    private String bigPic;

    @ApiModelProperty(value = "品牌故事")
    private String brandStory;

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
    public String getFirstLetter() {
        return firstLetter;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSort() {
        return sort;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
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
    public Integer getGoodsCount() {
        return goodsCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGoodsCommentCount() {
        return goodsCommentCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGoodsCommentCount(Integer goodsCommentCount) {
        this.goodsCommentCount = goodsCommentCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getLogo() {
        return logo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBigPic() {
        return bigPic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBrandStory() {
        return brandStory;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
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
        sb.append(", firstLetter=").append(firstLetter);
        sb.append(", sort=").append(sort);
        sb.append(", factoryStatus=").append(factoryStatus);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", goodsCount=").append(goodsCount);
        sb.append(", goodsCommentCount=").append(goodsCommentCount);
        sb.append(", logo=").append(logo);
        sb.append(", bigPic=").append(bigPic);
        sb.append(", brandStory=").append(brandStory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}