package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.service.GmsGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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


}
