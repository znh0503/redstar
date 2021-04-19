package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsBrand;
import cn.znh.redstar.mbg.model.GmsGoodsCategory;
import cn.znh.redstar.service.GmsGoodCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 16:14 2021/4/5
 * 商品分类管理controller
 */
@Slf4j
@Api(tags = "GmsGoodsCategoryController",description ="商品分类管理" )
@RestController
@RequestMapping("goodsCategory")
public class GmsGoodsCategoryController {

    @Resource
    GmsGoodCategoryService gmsGoodCategoryService;

    @ApiOperation("获取所有分类菜单")
    @GetMapping("")
    public CommonResult getGoodsCategory()
    {
        List<GmsGoodsCategory> goodsCategoryList = gmsGoodCategoryService.getGoodsCategory();
        return CommonResult.success(goodsCategoryList);
    }

    @ApiOperation("获取一级分类菜单")
    @GetMapping("/one")
    public CommonResult getGoodsCategoryOne()
    {
        List<GmsGoodsCategory> goodsCategoryList = gmsGoodCategoryService.getGoodsCategoryByLevel(1);
        return CommonResult.success(goodsCategoryList);
    }

    @ApiOperation("获取二级分类菜单")
    @GetMapping("/two/{parentId}")
    public CommonResult getGoodsCategoryTwo(@PathVariable("parentId") Long parentId)
    {
        List<GmsGoodsCategory> goodsCategoryList = gmsGoodCategoryService.getGoodsCategoryByParentId(parentId);
        return CommonResult.success(goodsCategoryList);
    }

    @ApiOperation("获取上级分类信息")
    @GetMapping("/preLevel/{id}")
    public CommonResult getGoodsCategoryPreLevel(@PathVariable("id") Long id)
    {
        GmsGoodsCategory goodsCategory = gmsGoodCategoryService.getGoodsCategoryById(id);
        return CommonResult.success(goodsCategory);
    }

    @ApiOperation("创建一个分类")
    @PostMapping("")
    @ResponseBody
    public CommonResult createCategory(@RequestBody GmsGoodsCategory category)
    {
        CommonResult<GmsGoodsCategory> commonResult;
        int result = gmsGoodCategoryService.createCategory(category);
        if (result==1)
        {
            //创建成功
            commonResult=CommonResult.success(category);
            log.debug("创建品牌成功:{}",category);
        }
        else {
            //创建失败
            commonResult=CommonResult.failed("创建品牌失败");
            log.debug("创建品牌失败:{}",category);
        }
        return commonResult;
    }

    @ApiOperation("根据id更新分类信息")
    @PutMapping("/{id}")
    @ResponseBody
    public CommonResult updateCategoryById(@PathVariable("id") Long id,@RequestBody GmsGoodsCategory category)
    {
        CommonResult commonResult;
        int result = gmsGoodCategoryService.updateCategory(id, category);
        if (result==1)
        {
            //更新成功
            commonResult=CommonResult.success(category);
            log.debug("更新品牌信息成功,id={},data={}",id,category);
        }
        else {
            //更新失败
            commonResult=CommonResult.failed("更新品牌信息失败");
            log.debug("更新品牌信息失败,id={},data={}",id,category);
        }
        return commonResult;
    }

    @ApiOperation("根据id删除分类信息")
    @DeleteMapping("/{id}")
    @ResponseBody
    public CommonResult deleteCategory(@PathVariable("id")Long id)
    {
        CommonResult commonResult;
        int result = gmsGoodCategoryService.deleteCategory(id);
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
}
