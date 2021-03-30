package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.common.api.ResultCode;
import cn.znh.redstar.component.mail.MailServer;
import cn.znh.redstar.dto.UmsMemberLoginParam;
import cn.znh.redstar.dto.UmsMemberParam;
import cn.znh.redstar.mbg.model.UmsMember;
import cn.znh.redstar.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author : znh
 * @date : 22:00 2021/3/16
 * 会员注册登录管理controller
 */
@Api(tags = "UmsMemberController",description ="会员注册登录管理" )
@RestController
@RequestMapping("/member")
public class UmsMemberController {
    @Resource
    private UmsMemberService umsMemberService;

    @ApiOperation("获取验证码")
    @GetMapping("/authCode")
    public CommonResult getAuthCode(@RequestParam String email)
    {
        CommonResult commonResult = umsMemberService.generateAuthCode(email);
        return commonResult;
    }

    @ApiOperation("校验验证码")
    @GetMapping("/verifyAuthCode")
    public CommonResult verifyAuthCode(@RequestParam String email,@RequestParam String AuthCode)
    {
        CommonResult commonResult = umsMemberService.verifyAuthCode(email, AuthCode);
        return commonResult;
    }

    @ApiOperation("会员注册")
    @PostMapping("/register")
    public CommonResult register(@RequestBody UmsMemberParam umsMemberParam)
    {
      String email = umsMemberParam.getUsername();
            UmsMember registerResult = umsMemberService.register(umsMemberParam);
            if (registerResult!=null)
            {
                //注册成功
                return CommonResult.success(registerResult);
            }
            else {
                //注册失败
                return CommonResult.failed("账号已经存在");
            }
    }

    @ApiOperation("会员登录")
    @PostMapping("/login")
    public CommonResult login(@RequestBody UmsMemberLoginParam umsMemberLoginParam)
    {
        String username = umsMemberLoginParam.getUsername();
        String password = umsMemberLoginParam.getPassword();
        String authCode = umsMemberLoginParam.getAuthCode();
        if (authCode!=null)
        {
            //用的验证码登录
            CommonResult commonResult = umsMemberService.loginByAuthCode(username, authCode);
            return commonResult;
        }
        else if (password!=null)
        {
            //用的密码登录
            CommonResult commonResult = umsMemberService.loginByPassword(username, password);
            return commonResult;
        }
        else {
            return CommonResult.failed("参数传输错误");
        }
    }
}
