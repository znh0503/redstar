package cn.znh.redstar.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : znh
 * @date : 13:19 2021/4/4
 * 获取oss上传上传文件授权返回结果
 * 前端直接上传文件时所需参数，从后端返回过来。
 */
@Data
public class OssPolicyResult {
    @ApiModelProperty("访问身份验证中用到用户标识")
    private String accessKeyId;
    @ApiModelProperty("用户表单上传的策略,经过base64编码过的字符串")
    private String policy;
    @ApiModelProperty("对policy签名后的字符串")
    private String signature;
    @ApiModelProperty("上传文件夹路径前缀")
    private String dir;
    @ApiModelProperty("oss对外服务的访问域名")
    private String host;
    @ApiModelProperty("上传成功后的回调设置")
    private String callback;
}
