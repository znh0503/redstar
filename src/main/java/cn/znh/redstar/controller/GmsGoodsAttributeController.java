package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsGoodsAttribute;
import cn.znh.redstar.mbg.model.GmsGoodsAttributeCategory;
import cn.znh.redstar.service.GmsGoodsAttributeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 21:18 2021/4/8
 * 商品属性管理controller
 */
@Slf4j
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

    @ApiOperation("据商品属性分类id获取分类下的规格或者参数信息")
    @GetMapping("/{goodsAttributeCategoryId}/{type}")
    public CommonResult getGoodsAttribute(@PathVariable("goodsAttributeCategoryId") Long goodsAttributeCategoryId,@PathVariable("type") Integer type)
    {
        List<GmsGoodsAttribute> goodsAttributeList = gmsGoodsAttributeService.getGoodsAttribute(goodsAttributeCategoryId,type);
        return CommonResult.success(goodsAttributeList);
    }

    @ApiOperation("创建一个商品属性")
    @PostMapping("")
    @ResponseBody
    public CommonResult createGoodsAttribute(@RequestBody GmsGoodsAttribute goodsAttribute)
    {
        CommonResult commonResult;
        int result = gmsGoodsAttributeService.createGoodsAttribute(goodsAttribute);
        if (result==1)
        {
            //创建成功
            commonResult=CommonResult.success(goodsAttribute);
        }
        else {
            //创建失败
            commonResult=CommonResult.failed("创建商品属性失败");
            log.debug("创建商品属性失败:{}",goodsAttribute);
        }
        return commonResult;
    }

    @ApiOperation("根据id更新商品属性信息")
    @PutMapping("/{id}")
    @ResponseBody
    public CommonResult updateGoodsAttributeById(@PathVariable("id") Long id,@RequestBody GmsGoodsAttribute goodsAttribute)
    {
        CommonResult commonResult;
        int result = gmsGoodsAttributeService.updateGoodsAttribute(id, goodsAttribute);
        if (result==1)
        {
            //更新成功
            commonResult=CommonResult.success(goodsAttribute);
        }
        else {
            //更新失败
            commonResult=CommonResult.failed("更新商品属性失败");
            log.debug("更新商品属性失败,id={},data={}",id,goodsAttribute);
        }
        return commonResult;
    }

    @ApiOperation("根据id删除商品属性")
    @DeleteMapping("/{id}")
    @ResponseBody
    public CommonResult deleteAttributeCategory(@PathVariable("id")Long id)
    {
        CommonResult commonResult;
        int result = gmsGoodsAttributeService.deleteGoodsAttribute(id);
        if (result==1)
        {
            //删除成功
            commonResult=CommonResult.success(id);
        }
        else
        {
            //删除失败
            commonResult=CommonResult.failed("删除商品属性失败,id="+id);
            log.debug("删除商品属性失败,id={}",id);
        }
        return commonResult;
    }

    @ApiOperation("批量删除商品属性")
    @DeleteMapping("")
    @ResponseBody
    public CommonResult deleteBrandList(@RequestBody List<Long> ids)
    {
        CommonResult commonResult;
        int result =gmsGoodsAttributeService.deleteGoodsAttribute(ids);
        //删除成功
        commonResult=CommonResult.success("执行完成，共删除"+result+"条");
        return commonResult;
    }
}

