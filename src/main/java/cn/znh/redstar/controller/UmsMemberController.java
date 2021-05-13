package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.common.api.ResultCode;
import cn.znh.redstar.component.mail.MailServer;
import cn.znh.redstar.dto.UmsMemberLoginParam;
import cn.znh.redstar.dto.UmsMemberParam;
import cn.znh.redstar.mbg.model.UmsMember;
import cn.znh.redstar.mbg.model.UmsMemberReceiveAddress;
import cn.znh.redstar.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.lang.reflect.Member;
import java.util.List;

/**
 * @author : znh
 * @date : 22:00 2021/3/16
 * 会员管理controller
 */
@Api(tags = "UmsMemberController",description ="权限会员管理" )
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

    @ApiOperation("获取全部会员信息")
    @GetMapping
    public  CommonResult get()
    {
        List<UmsMember> memberList = umsMemberService.get();
        return CommonResult.success(memberList);
    }

    @ApiOperation("获取会员的收货地址")
    @GetMapping("/receiveAddress/{memberId}")
    CommonResult receiveAddressGet(@PathVariable("memberId") Long memberId)
    {
        List<UmsMemberReceiveAddress> memberReceiveAddressList = umsMemberService.receiveAddressGet(memberId);
        return CommonResult.success(memberReceiveAddressList);
    }

    @ApiOperation("创建一条会员的收货地址")
    @PostMapping("/receiveAddress")
    CommonResult receiveAddressCreate(@RequestBody UmsMemberReceiveAddress memberReceiveAddress)
    {
        int result = umsMemberService.receiveAddressCreate(memberReceiveAddress);
        if (result!=0)
        {
            return CommonResult.success("创建收货地址成功");
        }
        else {
            return CommonResult.failed("创建收货地址失败");
        }
    }

    @ApiOperation("更新一条会员收货地址")
    @PutMapping("/receiveAddress")
    CommonResult receiveAddressUpdate(@RequestBody UmsMemberReceiveAddress memberReceiveAddress)
    {
        int result = umsMemberService.receiveAddressUpdate(memberReceiveAddress);
        if (result!=0)
        {
            return CommonResult.success("更新收货地址成功");
        }
        else {
            return CommonResult.failed("更新收货地址失败");
        }
    }

    @ApiOperation("删除一条会员收货地址")
    @DeleteMapping("/receiveAddress/{id}")
    CommonResult receiveAddressDelete(@PathVariable("id") Long id)
    {
        int result = umsMemberService.receiveAddressDelete(id);
        if (result!=0)
        {
            return CommonResult.success(result);
        }
        else {
            return CommonResult.failed("删除收货地址失败");
        }
    }


}
