package cn.znh.redstar.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : znh
 * @date : 13:24 2021/4/4
 * oss上传成功后的回调参数
 * 当OSS上传成功后，会根据该配置参数来回调对应接口。
 */
@Data
public class OssCallbackParam {
    @ApiModelProperty("请求的回调地址")
    private String callbackUrl;
    @ApiModelProperty("回调是传入request中的参数")
    private String callbackBody;
    @ApiModelProperty("回调时传入参数的格式，比如表单提交形式")
    private String callbackBodyType;
}
