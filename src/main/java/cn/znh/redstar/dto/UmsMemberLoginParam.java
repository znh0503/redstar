package cn.znh.redstar.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : znh
 * @date : 14:35 2021/3/28
 * 会员登录传输参数
 */
@Data
public class UmsMemberLoginParam {
    @ApiModelProperty(value = "用户名",required = true)
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty("验证码")
    private String authCode;
}
