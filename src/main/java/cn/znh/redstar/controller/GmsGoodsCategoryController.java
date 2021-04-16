package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsGoodsCategory;
import cn.znh.redstar.service.GmsGoodCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 16:14 2021/4/5
 * 商品分类管理controller
 */
@Api(tags = "GmsGoodsCategoryController",description ="商品分类管理" )
@RestController
@RequestMapping("goodsCategory")
public class GmsGoodsCategoryController {

    @Resource
    GmsGoodCategoryService gmsGoodCategoryService;

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
}
