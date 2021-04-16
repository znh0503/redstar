package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.dto.OssCallbackResult;
import cn.znh.redstar.dto.OssPolicyResult;
import cn.znh.redstar.service.OssService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author : znh
 * @date : 14:25 2021/4/4
 * oss的controller
 */
@RestController
@Api(tags = "OssController",description = "oss的controller")
@RequestMapping("/aliyunOss")
public class OssController {
    @Resource
    private OssService ossService;

    @ApiOperation("oss上传签名生成")
    @GetMapping("/policy")
    public CommonResult policy()
    {
        OssPolicyResult policy = ossService.policy();
        return CommonResult.success(policy);
    }

    @ApiOperation("oss上传成功回调")
    @PostMapping("/callback")
    public CommonResult callback(HttpServletRequest request)
    {
        OssCallbackResult callback = ossService.callback(request);
        return CommonResult.success(callback);
    }
}
