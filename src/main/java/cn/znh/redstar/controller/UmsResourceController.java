package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.component.DynamicSecurityMetadataSource;
import cn.znh.redstar.mbg.model.UmsResource;
import cn.znh.redstar.service.UmsResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 后台资源管理controller
 * @author : znh
 * @date : 18:59 2021/3/19
 */
@Api(tags = "UmsController",description = "后台资源管理")
@Controller
@RequestMapping("/resource")
@Slf4j
public class UmsResourceController {
    @Resource
    private UmsResourceService umsResourceService;
    @Resource
    private DynamicSecurityMetadataSource dynamicSecurityMetadataSource;

    @ApiOperation("添加后台资源")
    @PostMapping("")
    @ResponseBody
     public CommonResult create(@RequestBody UmsResource umsResource)
     {
         int result = umsResourceService.create(umsResource);
         dynamicSecurityMetadataSource.clearDataSource();
         if (result>0)
         {
             //添加资源成功
             return CommonResult.success("添加资源成功");
         }
         else {
             log.error("UmsResourceController#create创建资源失败了");
             return CommonResult.failed("添加资源失败");
         }
     }
}
