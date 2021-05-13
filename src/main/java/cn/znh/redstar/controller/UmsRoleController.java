package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.UmsRole;
import cn.znh.redstar.service.UmsRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 21:18 2021/5/13
 * 角色管理
 */
@Slf4j
@Api(tags = "UmsRoleController",description = "权限角色管理")
@RestController
@RequestMapping("/role")
public class UmsRoleController {

    @Resource
    UmsRoleService umsRoleService;

    @ApiOperation("获取全部角色")
    @GetMapping("")
    CommonResult get()
    {
        List<UmsRole> roleList = umsRoleService.get();
        return CommonResult.success(roleList);
    }

}
