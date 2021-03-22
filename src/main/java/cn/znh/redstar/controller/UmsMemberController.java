package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.component.mail.MailServer;
import cn.znh.redstar.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author : znh
 * @date : 22:00 2021/3/16
 * 会员注册登录管理controller(单点登录)
 */
@Api(tags = "UmsMemberController",description ="会员注册登录管理" )
@Controller
@RequestMapping("/sso")
public class UmsMemberController {
    @Resource
    private UmsMemberService umsMemberService;

    @ApiOperation("获取验证码")
    @GetMapping("/AuthCode")
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String email)
    {
        CommonResult commonResult = umsMemberService.generateAuthCode(email);
        return commonResult;
    }

    @ApiOperation("校验验证码")
    @GetMapping("/verifyAuthCode")
    @ResponseBody
    public CommonResult verifyAuthCode(@RequestParam String telephone,@RequestParam String AuthCode)
    {
        CommonResult commonResult = umsMemberService.verifyAuthCode(telephone, AuthCode);
        return commonResult;
    }
}
