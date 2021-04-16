package cn.znh.redstar.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : znh
 * @date : 13:26 2021/4/4
 * oss上传文件的回调结果
 * 回调接口中返回的数据对象，封装了上传文件的信息。
 */
@Data
public class OssCallbackResult {
    @ApiModelProperty("文件名称")
    private String filename;
    @ApiModelProperty("文件大小")
    private String size;
    @ApiModelProperty("文件的mimeType")
    private String mimeType;
    @ApiModelProperty("图片文件的宽度")
    private String width;
    @ApiModelProperty("图片文件的高度")
    private String height;
}
