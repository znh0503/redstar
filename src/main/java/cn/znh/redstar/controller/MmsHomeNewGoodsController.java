package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsBrand;
import cn.znh.redstar.mbg.model.GmsGoods;
import cn.znh.redstar.mbg.model.MmsHomeNewGoods;
import cn.znh.redstar.service.MmsHomeNewGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 16:26 2021/4/28
 * 新品推荐controller
 */
@Slf4j
@Api(tags = "MmsHomeNewGoodsController",description = "营销首页新品推荐商品")
@RestController
@RequestMapping("/homeNewGoods")
public class MmsHomeNewGoodsController {
    @Resource
    MmsHomeNewGoodsService mmsHomeNewGoodsService;

    @ApiOperation("获取所有新品推荐商品")
    @GetMapping("")
    public CommonResult getHomeNewGoods()
    {
        return CommonResult.success(mmsHomeNewGoodsService.getHomeNewGoods());
    }

    @ApiOperation("根据推荐状态获取所有新品推荐商品")
    @GetMapping("/{recommendStatus}")
    public CommonResult getHomeNewGoods(@PathVariable("recommendStatus") int recommendStatus)
    {
        List<MmsHomeNewGoods> homeNewGoodsList = mmsHomeNewGoodsService.getHomeNewGoods(recommendStatus);
        return CommonResult.success(homeNewGoodsList);
    }


    @ApiOperation("创建一个新品推荐商品")
    @PostMapping("")
    public CommonResult createHomeNewGoods(@RequestBody List<GmsGoods> goodsList)
    {
        CommonResult commonResult;
        List<MmsHomeNewGoods> result = mmsHomeNewGoodsService.createHomeNewGoods(goodsList);
        commonResult=CommonResult.success(result);
        return commonResult;
    }

    @ApiOperation("根据id更新新品推荐商品信息")
    @PutMapping("/{id}")
    public CommonResult updateHomeNewGoodsById(@PathVariable("id") Long id,@RequestBody MmsHomeNewGoods homeNewGoods)
    {
        CommonResult commonResult;
        int result = mmsHomeNewGoodsService.updateHomeNewGoods(id, homeNewGoods);
        if (result==1)
        {
            //更新成功
            commonResult=CommonResult.success(homeNewGoods);
        }
        else {
            //更新失败
            commonResult=CommonResult.failed("更新新品推荐商品失败");
            log.debug("更新新品推荐信息失败,id={},data={}",id,homeNewGoods);
        }
        return commonResult;
    }

    @ApiOperation("根据id删除新品推荐信息")
    @DeleteMapping("/{id}")
    public CommonResult<GmsBrand> deleteHomeNewGoods(@PathVariable("id")Long id)
    {
        CommonResult commonResult;
        int result = mmsHomeNewGoodsService.deleteHomeNewGoods(id);
        if (result!=0)
        {
            //删除成功
            commonResult=CommonResult.success("删除成功，共删除"+result+"条");
        }
        else
        {
            //删除失败
            commonResult=CommonResult.failed("删除新品推荐商品失败,id="+id);
            log.debug("删除新品推荐商品失败,id={}",id);
        }
        return commonResult;
    }

    @ApiOperation("删除多条新品推荐商品")
    @DeleteMapping("")
    public CommonResult deleteHomeNewGoods(@RequestBody List<Long> ids)
    {
        CommonResult commonResult;
        int result = mmsHomeNewGoodsService.deleteHomeNewGoods(ids);
        //删除成功
        commonResult=CommonResult.success("执行完成，共删除"+result+"条");
        return commonResult;
    }
}
