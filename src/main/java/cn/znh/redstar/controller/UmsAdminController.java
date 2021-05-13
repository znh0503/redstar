package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.dto.UmsAdminLoginParam;
import cn.znh.redstar.dto.UmsAdminParam;
import cn.znh.redstar.mbg.model.UmsAdmin;
import cn.znh.redstar.mbg.model.UmsAdminRoleRelation;
import cn.znh.redstar.mbg.model.UmsRole;
import cn.znh.redstar.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : znh
 * @date : 14:18 2021/3/20
 * 后台用户管理controller
 */
@Slf4j
@RestController
@Api(tags = "UmsAdminController",description = "权限后台用户管理")
@RequestMapping("/admin")
public class UmsAdminController {
    @Resource
    private UmsAdminService umsAdminService;
    @Value("${jwt.tokenHeader")
    private String tokenHeader;
    @Value("${jwt.claimsHead}")
    private String claimsHead;


    @ApiOperation("用户注册")
    @PostMapping("/register")
    public CommonResult<UmsAdmin> register(@Validated @RequestBody UmsAdminParam umsAdminParam)
    {
        UmsAdmin registerUmsAdmin = umsAdminService.register(umsAdminParam);
        if (registerUmsAdmin==null)
        {
            log.info("UmsAdminController#regist注册失败");
            return CommonResult.failed("注册失败");
        }
        return CommonResult.success(registerUmsAdmin,"注册成功");
    }

    @ApiOperation("登录")
    @PostMapping("/login")
    public CommonResult login(@Validated @RequestBody UmsAdminLoginParam umsAdminLoginParam)
    {
        String token = umsAdminService.login(umsAdminLoginParam.getUsername(), umsAdminLoginParam.getPassword());
        if(token==null)
        {
            return CommonResult.validateFailed("用户名和密码错误或者账号被禁用");
        }
        Map<String,String> tokenMap=new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("claimsHead",claimsHead);
        return CommonResult.success(tokenMap,"登陆成功");
    }

    @ApiOperation("获取指定用户的角色")
    @GetMapping("/role/{adminId}")
    public CommonResult<List<UmsRole>> getRoleList(@PathVariable("adminId") Long adminId) {
        List<UmsRole> roleList = umsAdminService.getAdminRoleList(adminId);
        return CommonResult.success(roleList);
    }

    @ApiOperation("获取全部后台用户")
    @GetMapping("")
    public CommonResult get()
    {
        List<UmsAdmin> adminList = umsAdminService.get();
        return CommonResult.success(adminList);
    }

    @ApiOperation("获取全部角色信息和用户拥有角色")
    @GetMapping("/roleAndAdminRole/{adminId}")
    public CommonResult getRoleAndAdminRole(@PathVariable("adminId") Long adminId)
    {
        Map roleAndAdminRole = umsAdminService.getRoleAndAdminRole(adminId);
        return CommonResult.success(roleAndAdminRole);
    }

    @ApiOperation("根据id更新后台用户")
    @PutMapping("/{id}")
    public CommonResult update(@PathVariable("id") Long id,@RequestBody UmsAdmin admin)
    {
        int result = umsAdminService.updateAdmin(id, admin);
        if (result!=0)
        {
            return CommonResult.success("更新后台用户信息成功");
        }
        else {
            return CommonResult.failed("更新后台用户信息失败");
        }
    }

    @ApiOperation("根据id更新后台用户")
    @DeleteMapping("/{id}")
    public CommonResult delete(@PathVariable("id") Long id)
    {
        int result = umsAdminService.deleteAdmin(id);
        if (result!=0)
        {
            return CommonResult.success("删除后台用户信息成功");
        }
        else {
            return CommonResult.failed("删除后台用户信息失败");
        }
    }


    @ApiOperation("创建一个后台用户")
    @PostMapping("")
    public CommonResult create(@RequestBody UmsAdmin admin)
    {
        int result = umsAdminService.create(admin);
        if (result!=0)
        {
            return CommonResult.success("添加后台用户信息成功");
        }
        else {
            return CommonResult.validateFailed("用户名重复");
        }
    }

    @ApiOperation("分配角色")
    @PostMapping("adminRoleRelation")
    public CommonResult createAdminRoleRelation(@RequestBody Map map)
    {
        int result = umsAdminService.createAdminRoleRelation(map);
        return CommonResult.success(result);
    }
}
