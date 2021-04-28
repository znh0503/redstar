package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsBrand;
import cn.znh.redstar.mbg.model.MmsHomeAdvertise;
import cn.znh.redstar.mbg.model.MmsHomeBrand;
import cn.znh.redstar.service.MmsHomeAdvertiseSevice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 0:19 2021/4/28
 * 首页轮播广告controller
 */
@Slf4j
@Api(tags = "MmsHomeAdvertiseController",description = "营销首页轮播广告")
@RestController
@RequestMapping("/homeAdvertise")
public class MmsHomeAdvertiseController {
    @Resource
    MmsHomeAdvertiseSevice mmsHomeAdvertiseSevice;

    @ApiOperation("获取轮播广告列表")
    @GetMapping("")
    public CommonResult getHomeAdvertise()
    {
        List<MmsHomeAdvertise> homeAdvertiseList = mmsHomeAdvertiseSevice.getHomeAdvertise();
        return CommonResult.success(homeAdvertiseList);
    }

    @ApiOperation("根据轮播位置和上线状态获取轮播广告列表")
    @GetMapping("/{type}/{status}")
    public CommonResult getHomeAdvertise(@PathVariable("type") int type, @PathVariable("status") int status)
    {
        List<MmsHomeAdvertise> homeAdvertiseList = mmsHomeAdvertiseSevice.getHomeAdvertise(type,status);
        return CommonResult.success(homeAdvertiseList);
    }

    @ApiOperation("创建一个轮播广告信息")
    @PostMapping("")
    @ResponseBody
    public CommonResult createHomeAdvertise(@RequestBody MmsHomeAdvertise homeAdvertise)
    {
        CommonResult commonResult;
        int result = mmsHomeAdvertiseSevice.createHomeAdvertise(homeAdvertise);
        if (result!=0) {
            commonResult = CommonResult.success(result);
        }
        else {
            commonResult=CommonResult.failed("创建轮播广告信息失败");
            log.debug("创建轮播广告信息失败");
        }
        return commonResult;
    }

    @ApiOperation("根据id更新轮播广告信息")
    @PutMapping("/{id}")
    @ResponseBody
    public CommonResult updateHomeAdvertiseById(@PathVariable("id") Long id,@RequestBody MmsHomeAdvertise homeAdvertise)
    {
        CommonResult commonResult;
        int result = mmsHomeAdvertiseSevice.updateHomeAdvertise(id, homeAdvertise);
        if (result==1)
        {
            //更新成功
            commonResult=CommonResult.success(homeAdvertise);
        }
        else {
            //更新失败
            commonResult=CommonResult.failed("更新品牌推荐信息失败");
            log.debug("更新品牌推荐信息失败,id={},data={}",id,homeAdvertise);
        }
        return commonResult;
    }

    @ApiOperation("根据id删除轮播广告信息")
    @DeleteMapping("/{id}")
    public CommonResult deleteHomeAdvertise(@PathVariable("id")Long id)
    {
        CommonResult commonResult;
        int result = mmsHomeAdvertiseSevice.deleteHomeAdvertise(id);
        if (result==1)
        {
            //删除成功
            commonResult=CommonResult.success(id);
        }
        else
        {
            //删除失败
            commonResult=CommonResult.failed("删除轮播广告信息失败,id="+id);
            log.debug("删除轮播广告信息失败,id={}",id);
        }
        return commonResult;
    }

    @ApiOperation("删除多条轮播广告")
    @DeleteMapping("")
    public CommonResult deleteHomeAdvertiseList(@RequestBody List<Long> ids)
    {
        CommonResult commonResult;
        int result = mmsHomeAdvertiseSevice.deleteHomeAdvertise(ids);
        //删除成功
        commonResult=CommonResult.success("执行完成，共删除"+result+"条");
        return commonResult;
    }
}
