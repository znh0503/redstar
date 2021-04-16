package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsGoodsAttribute;
import cn.znh.redstar.service.GmsGoodsAttributeService;
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
 * @date : 21:18 2021/4/8
 * 商品属性管理controller
 */
@Api(tags = "GmsGoodsAttributeController",description = "商品属性管理")
@RestController
@RequestMapping("/goodsAttribute")
public class GmsGoodsAttributeController {
    @Resource
    GmsGoodsAttributeService gmsGoodsAttributeService;

    @ApiOperation("据商品属性分类id获取分类下的属性信息")
    @GetMapping("/{goodsAttributeCategoryId}")
    public CommonResult getGoodsAttribute(@PathVariable("goodsAttributeCategoryId") Long goodsAttributeCategoryId)
    {
        List<GmsGoodsAttribute> goodsAttributeList = gmsGoodsAttributeService.getGoodsAttribute(goodsAttributeCategoryId);
        return CommonResult.success(goodsAttributeList);
    }
}
