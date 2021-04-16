package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsGoodsAttributeCategory;
import cn.znh.redstar.service.GmsGoodsAttributeCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 20:11 2021/4/8
 * 商品属性分类管理controller
 */
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
}
