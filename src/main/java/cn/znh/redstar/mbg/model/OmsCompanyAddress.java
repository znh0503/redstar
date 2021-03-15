package cn.znh.redstar.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.annotation.Generated;

public class OmsCompanyAddress implements Serializable {
    private Long id;

    @ApiModelProperty(value = "地址名称")
    private String addressName;

    @ApiModelProperty(value = "默认发货地址：0->否；1->是")
    private Integer sendStatus;

    @ApiModelProperty(value = "是否默认收货地址：0->否；1->是")
    private Integer receiveStatus;

    @ApiModelProperty(value = "收发货人姓名")
    private String name;

    @ApiModelProperty(value = "收货人电话")
    private String phone;

    @ApiModelProperty(value = "省/直辖市")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "区")
    private String region;

    @ApiModelProperty(value = "详细地址")
    private String detailAddress;

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
    public String getAddressName() {
        return addressName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSendStatus() {
        return sendStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getReceiveStatus() {
        return receiveStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
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
    public String getPhone() {
        return phone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProvince() {
        return province;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProvince(String province) {
        this.province = province;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCity() {
        return city;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCity(String city) {
        this.city = city;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRegion() {
        return region;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRegion(String region) {
        this.region = region;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDetailAddress() {
        return detailAddress;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", addressName=").append(addressName);
        sb.append(", sendStatus=").append(sendStatus);
        sb.append(", receiveStatus=").append(receiveStatus);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", region=").append(region);
        sb.append(", detailAddress=").append(detailAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}