package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsGoods;
import cn.znh.redstar.service.GmsGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 23:46 2021/3/31
 * 商品管理controller
 */
@Slf4j
@Api(tags = "GmsGoodsController",description = "商品管理")
@RestController
@RequestMapping("/goods")
public class GmsGoodsController {

    @Resource
    GmsGoodsService gmsGoodsService;

    @ApiOperation("获取所有商品")
    @GetMapping("")
    public CommonResult getGoodsList()
    {
       return CommonResult.success(gmsGoodsService.listAllGoods());
    }

    @ApiOperation("获取一级分类下的所有商品")
    @GetMapping("/{goodsCategoryId}")
    public CommonResult get(@PathVariable("goodsCategoryId") Long goodsCategoryId)
    {
        List<GmsGoods> goodsList = gmsGoodsService.getGoods(goodsCategoryId);
        return CommonResult.success(goodsList);
    }

    @ApiOperation("根据id获取商品信息")
    @GetMapping("/detail/{id}")
    public CommonResult getById(@PathVariable("id") Long id)
    {
        GmsGoods goods = gmsGoodsService.getGoodsById(id);
        return CommonResult.success(goods);
    }
}
