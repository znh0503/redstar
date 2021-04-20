package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsBrand;
import cn.znh.redstar.mbg.model.GmsGoodsAttributeCategory;
import cn.znh.redstar.service.GmsGoodsAttributeCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 20:11 2021/4/8
 * 商品属性分类管理controller
 */
@Slf4j
@Api(tags = "GmsGoodsAttributeCategoryController",description = "商品属性分类管理")
@RestController
@RequestMapping("/goodsAttributeCategory")
public class GmsGoodsAttributeCategoryController {
    @Resource
    GmsGoodsAttributeCategoryService gmsGoodsAttributeCategoryService;

    @ApiOperation("获取所有商品属性分类")
    @GetMapping("")
    public CommonResult getGoodsAttributeCategory()
    {
        List<GmsGoodsAttributeCategory> goodsAttributeCategoryList = gmsGoodsAttributeCategoryService.getGoodsAttributeCategory();
        return CommonResult.success(goodsAttributeCategoryList);
    }

    @ApiOperation("创建一个属性分类")
    @PostMapping("")
    @ResponseBody
    public CommonResult createAttributeCategory(@RequestBody GmsGoodsAttributeCategory attributeCategory)
    {
        CommonResult<GmsGoodsAttributeCategory> commonResult;
        int result = gmsGoodsAttributeCategoryService.createAttributeCategory(attributeCategory);
        if (result==1)
        {
            //创建成功
            commonResult=CommonResult.success(attributeCategory);
            log.debug("创建属性分类成功:{}",attributeCategory);
        }
        else {
            //创建失败
            commonResult=CommonResult.failed("创建属性分类失败");
            log.debug("创建品牌失败:{}",attributeCategory);
        }
        return commonResult;
    }

    @ApiOperation("根据id更新属性分类信息")
    @PutMapping("/{id}")
    @ResponseBody
    public CommonResult updateAttributeCategoryById(@PathVariable("id") Long id,@RequestBody GmsGoodsAttributeCategory attributeCategory)
    {
        CommonResult commonResult;
        int result = gmsGoodsAttributeCategoryService.updateAttributeCategory(id, attributeCategory);
        if (result==1)
        {
            //更新成功
            commonResult=CommonResult.success(attributeCategory);
            log.debug("更新属性分类成功,id={},data={}",id,attributeCategory);
        }
        else {
            //更新失败
            commonResult=CommonResult.failed("更新品牌信息失败");
            log.debug("更新属性分类失败,id={},data={}",id,attributeCategory);
        }
        return commonResult;
    }

    @ApiOperation("根据id删除品牌信息")
    @DeleteMapping("/{id}")
    @ResponseBody
    public CommonResult deleteAttributeCategory(@PathVariable("id")Long id)
    {
        CommonResult commonResult;
        int result = gmsGoodsAttributeCategoryService.deleteAttributeCategory(id);
        if (result==1)
        {
            //删除成功
            commonResult=CommonResult.success(id);
            log.debug("删除品牌信息成功,id={}",id);
        }
        else
        {
            //删除失败
            commonResult=CommonResult.failed("删除品牌信息失败,id="+id);
            log.debug("删除品牌信息失败,id={}",id);
        }
        return commonResult;
    }

    @ApiOperation("删除多条属性分类信息")
    @DeleteMapping("")
    @ResponseBody
    public CommonResult deleteBrandList(@RequestBody List<Long> ids)
    {
        CommonResult commonResult;
        int result =gmsGoodsAttributeCategoryService.deleteAttributeCategoryByIds(ids);

        //删除成功
        commonResult=CommonResult.success("执行完成，共删除"+result+"条");
        return commonResult;
    }
}
