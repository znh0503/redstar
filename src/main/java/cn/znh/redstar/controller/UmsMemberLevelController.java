package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.UmsMemberLevel;
import cn.znh.redstar.service.UmsMemberLevelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 14:08 2021/4/8
 * 会员等级管理controller
 */
@Api(tags = "UmsMemberLevelController",description = "会员等级管理")
@RestController
@RequestMapping("/memberLevel")
public class UmsMemberLevelController {

    @Resource
    UmsMemberLevelService umsMemberLevelService;

    @ApiOperation("获取全部会员等级信息")
    @GetMapping("")
    public CommonResult getMemberLevel()
    {
        List<UmsMemberLevel> memberLevelList = umsMemberLevelService.getMemberLevel();
        return CommonResult.success(memberLevelList);
    }

    @ApiOperation("根据id获取会员等级信息")
    @GetMapping("/{id}")
    public CommonResult getMemberLevel(@PathVariable("id") Long id)
    {
        UmsMemberLevel memberLevel= umsMemberLevelService.getMemberLevel(id);
        return CommonResult.success(memberLevel);
    }

}
