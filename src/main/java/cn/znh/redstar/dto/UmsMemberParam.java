package cn.znh.redstar.dto;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

/**
 * @author : znh
 * @date : 14:01 2021/3/28
 * 会员注册传输参数
 */
@Data
public class UmsMemberParam {
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("密码")
    private String password;
}
