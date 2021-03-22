package cn.znh.redstar.dto;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author : znh
 * @date : 12:01 2021/3/20
 * 用户修改密码的传输参数
 */
@Getter
@Setter
public class UpdateAdminPasswordParam implements Serializable {
    @ApiModelProperty(value = "用户名",required = true)
    private String userName;
    @ApiModelProperty(value = "旧密码",required = true)
    private String oldPassword;
    @ApiModelProperty(value = "新密码",required = true)
    private String newPassword;
}
