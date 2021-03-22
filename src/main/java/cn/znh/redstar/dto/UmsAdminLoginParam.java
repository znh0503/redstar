package cn.znh.redstar.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author : znh
 * @date : 14:37 2021/3/20
 * 用户登录传输参数
 */
@Data
public class UmsAdminLoginParam implements Serializable {
    @ApiModelProperty(value = "用户名",required = true)
    private String username;

    @ApiModelProperty(value = "密码",required = true)
    private String password;
}
