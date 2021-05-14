package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.component.DynamicSecurityMetadataSource;
import cn.znh.redstar.mbg.model.UmsResource;
import cn.znh.redstar.mbg.model.UmsResourceCategory;
import cn.znh.redstar.service.UmsResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 后台资源管理controller
 * @author : znh
 * @date : 18:59 2021/3/19
 */
@Api(tags = "UmsController",description = "权限后台资源管理")
@RestController
@RequestMapping("/resource")
@Slf4j
public class UmsResourceController {
    @Resource
    private UmsResourceService umsResourceService;
    @Resource
    private DynamicSecurityMetadataSource dynamicSecurityMetadataSource;

    @ApiOperation("获取全部后台资源")
    @GetMapping("")
    public  CommonResult get()
    {
        List<UmsResource> resourceList = umsResourceService.get();
        return CommonResult.success(resourceList);
    }

    @ApiOperation("添加后台资源")
    @PostMapping("")
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

    @ApiOperation("更新后台资源")
    @PutMapping("/{id}")
    public CommonResult update(@PathVariable("id")Long id,@RequestBody UmsResource umsResource)
    {
        int result = umsResourceService.update(id,umsResource);
        dynamicSecurityMetadataSource.clearDataSource();
        if (result>0)
        {
            //添加资源成功
            return CommonResult.success("更新资源成功");
        }
        else {
            return CommonResult.failed("更新资源失败");
        }
    }

    @ApiOperation("删除一条资源")
    @DeleteMapping("/{id}")
    public  CommonResult delete(@PathVariable("id")Long id)
    {
        int result = umsResourceService.delete(id);
        return CommonResult.success(result);
    }

    @ApiOperation("获取全部后台资源分类")
    @GetMapping("/category")
    public  CommonResult getCategory()
    {
        List<UmsResourceCategory> categoryList = umsResourceService.getCategory();
        return CommonResult.success(categoryList);
    }

    @ApiOperation("创建一条资源分类")
    @PostMapping("/category")
    public  CommonResult createCategory(@RequestBody UmsResourceCategory resourceCategory)
    {
        int result = umsResourceService.createCategory(resourceCategory);
        return CommonResult.success(result);
    }

    @ApiOperation("更新一条资源分类")
    @PutMapping("/category/{id}")
    public  CommonResult updateCategory(@PathVariable("id")Long id,@RequestBody UmsResourceCategory resourceCategory)
    {
        int result = umsResourceService.updateCategory(id,resourceCategory);
        return CommonResult.success(result);
    }

    @ApiOperation("删除一条资源分类")
    @DeleteMapping("/category/{id}")
    public  CommonResult deleteCategory(@PathVariable("id")Long id)
    {
        int result = umsResourceService.deleteCategory(id);
        return CommonResult.success(result);
    }


}
