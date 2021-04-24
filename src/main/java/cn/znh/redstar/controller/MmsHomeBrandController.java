package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsBrand;
import cn.znh.redstar.mbg.model.MmsHomeBrand;
import cn.znh.redstar.service.MmsHomeBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 17:38 2021/4/24
 * 首页品牌推荐controller
 */
@Slf4j
@Api(tags = "MmsHomeBrandController",description = "营销首页品牌推荐controller")
@RestController
@RequestMapping("/homeBrand")
public class MmsHomeBrandController {

    @Resource
    MmsHomeBrandService mmsHomeBrandService;

    @ApiOperation("获取品牌推荐列表")
    @GetMapping("")
    public CommonResult getHomeBrandList()
    {
        List<MmsHomeBrand> homeBrandList = mmsHomeBrandService.listAllHomeBrand();
        return CommonResult.success(homeBrandList);
    }

    @ApiOperation("根据id删除品牌推荐信息")
    @DeleteMapping("/{id}")
    public CommonResult deleteBrand(@PathVariable("id")Long id)
    {
        CommonResult commonResult;
        int result = mmsHomeBrandService.deleteHomeBrand(id);
        if (result==1)
        {
            //删除成功
            commonResult=CommonResult.success(id);
        }
        else
        {
            //删除失败
            commonResult=CommonResult.failed("删除品牌推荐信息失败,id="+id);
            log.debug("删除品牌推荐信息失败,id={}",id);
        }
        return commonResult;
    }

    @ApiOperation("删除多条品牌信息")
    @DeleteMapping("")
    public CommonResult<GmsBrand> deleteBrandList(@RequestBody List<Long> ids)
    {
        CommonResult commonResult;
        int result = mmsHomeBrandService.deleteHomeBrand(ids);
        //删除成功
        commonResult=CommonResult.success("执行完成，共删除"+result+"条");
        return commonResult;
    }
}
