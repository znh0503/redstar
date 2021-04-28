package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsBrand;
import cn.znh.redstar.mbg.model.GmsGoods;
import cn.znh.redstar.mbg.model.MmsHomeRecommendGoods;
import cn.znh.redstar.service.MmsHomeRecommendGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 1:20 2021/4/29
 * 人气推荐商品Controller
 */
@Slf4j
@Api(tags = "MmsHomeRecommendGoodsController",description = "营销人气推荐商品管理")
@RestController
@RequestMapping("/homeRecommendGoods")
public class MmsHomeRecommendGoodsController {
    @Resource
    MmsHomeRecommendGoodsService mmsHomeRecommendGoodsService;

    @ApiOperation("获取所有人气推荐商品")
    @GetMapping("")
    public CommonResult getHomeRecommendGoods()
    {
        return CommonResult.success(mmsHomeRecommendGoodsService.getHomeRecommendGoods());
    }

    @ApiOperation("根据推荐状态获取人气推荐商品")
    @GetMapping("/{recommendStatus}")
    public CommonResult getHomeRecommendGoods(@PathVariable("recommendStatus") int recommendStatus)
    {
        List<MmsHomeRecommendGoods> homeRecommendGoodsList = mmsHomeRecommendGoodsService.getHomeRecommendGoods(recommendStatus);
        return CommonResult.success(homeRecommendGoodsList);
    }


    @ApiOperation("创建一个人气推荐")
    @PostMapping("")
    public CommonResult createHomeRecommendGoods(@RequestBody List<GmsGoods> goodsList)
    {
        CommonResult commonResult;
        List<MmsHomeRecommendGoods> homeRecommendGoodsList = mmsHomeRecommendGoodsService.createHomeRecommendGoods(goodsList);
        commonResult=CommonResult.success(homeRecommendGoodsList);
        return commonResult;
    }

    @ApiOperation("根据id更新首页推荐商品信息")
    @PutMapping("/{id}")
    public CommonResult updateHomeRecommendGoodsById(@PathVariable("id") Long id,@RequestBody MmsHomeRecommendGoods homeRecommendGoods)
    {
        CommonResult commonResult;
        int result = mmsHomeRecommendGoodsService.updateHomeRecommendGoods(id, homeRecommendGoods);
        if (result==1)
        {
            //更新成功
            commonResult=CommonResult.success(homeRecommendGoods);
        }
        else {
            //更新失败
            commonResult=CommonResult.failed("更新人气推荐信息失败");
            log.debug("更新人气推荐信息失败,id={},data={}",id,homeRecommendGoods);
        }
        return commonResult;
    }

    @ApiOperation("根据id删除人气推荐商品信息")
    @DeleteMapping("/{id}")
    public CommonResult<GmsBrand> deleteHomeRecommendGoods(@PathVariable("id")Long id)
    {
        CommonResult commonResult;
        int result = mmsHomeRecommendGoodsService.deleteHomeRecommendGoods(id);
        if (result!=0)
        {
            //删除成功
            commonResult=CommonResult.success("删除成功，共删除"+result+"条");
        }
        else
        {
            //删除失败
            commonResult=CommonResult.failed("删除人气推荐商品失败,id="+id);
            log.debug("删除人气推荐商品失败,id={}",id);
        }
        return commonResult;
    }

    @ApiOperation("删除多条人气推荐商品")
    @DeleteMapping("")
    public CommonResult deleteHomeNewGoods(@RequestBody List<Long> ids)
    {
        CommonResult commonResult;
        int result = mmsHomeRecommendGoodsService.deleteHomeRecommendGoods(ids);
        //删除成功
        commonResult=CommonResult.success("执行完成，共删除"+result+"条");
        return commonResult;
    }
}
