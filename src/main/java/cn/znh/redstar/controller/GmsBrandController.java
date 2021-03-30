package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonPage;
import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsBrand;
import cn.znh.redstar.service.GmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 23:22 2021/3/14
 * 商品品牌controller
 */
@Slf4j
@Api(tags = "GmsBrandController",description = "商品品牌管理")
@Controller
@RequestMapping("/brand")
public class GmsBrandController {
    @Resource
    GmsBrandService gmsBrandService;

    @ApiOperation("获取所有品牌")
    @GetMapping("")
    @ResponseBody
    public CommonResult<List<GmsBrand>> getBrandList()
    {
        return CommonResult.success(gmsBrandService.listAllBrand());
    }

    @ApiOperation("根据id获取品牌信息")
    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<GmsBrand> getBrandById(@PathVariable("id")Long id)
    {
        return CommonResult.success(gmsBrandService.getBrand(id));
    }

    @ApiOperation("分页查询品牌信息")
    @GetMapping("/pageList")
    @ResponseBody
    public CommonResult<CommonPage<GmsBrand>> getBrandList(@RequestParam(value = "pageNum",defaultValue = "1")
                                               @ApiParam("页码") Integer pageNum,
                                                 @RequestParam(value = "pageSize",defaultValue = "3")
                                               @ApiParam("每页数量") Integer pageSize)
    {
        List<GmsBrand> gmsBrands = gmsBrandService.listBrand(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(gmsBrands));
    }

    @ApiOperation("创建一个品牌")
    @PostMapping("")
    @ResponseBody
    public CommonResult<GmsBrand> createBrand(GmsBrand gmsBrand)
    {
        CommonResult<GmsBrand> commonResult;
        int result = gmsBrandService.createBrand(gmsBrand);
        if (result==1)
        {
            //创建成功
            commonResult=CommonResult.success(gmsBrand);
            log.debug("创建品牌成功:{}",gmsBrand);
        }
        else {
            //创建失败
            commonResult=CommonResult.failed("创建品牌失败");
            log.debug("创建品牌失败:{}",gmsBrand);
        }
        return commonResult;
    }

    @ApiOperation("根据id更新品牌信息")
    @PutMapping("/{id}")
    @ResponseBody
    public CommonResult<GmsBrand> updateBrandById(@PathVariable("id") Long id,@RequestBody GmsBrand gmsBrand)
    {
        CommonResult commonResult;
        int result = gmsBrandService.updateBrand(id, gmsBrand);
        if (result==1)
        {
            //更新成功
            commonResult=CommonResult.success(gmsBrand);
            log.debug("更新品牌信息成功,id={},data={}",id,gmsBrand);
        }
        else {
            //更新失败
            commonResult=CommonResult.failed("更新品牌信息失败");
            log.debug("更新品牌信息失败,id={},data={}",id,gmsBrand);
        }
        return commonResult;
    }

    @ApiOperation("根据id删除品牌信息")
    @DeleteMapping("/{id}")
    @ResponseBody
    public CommonResult<GmsBrand> deleteBrand(@PathVariable("id")Long id)
    {
        CommonResult commonResult;
        int result = gmsBrandService.deleteBrand(id);
        if (result==1)
        {
            //删除成功
            commonResult=CommonResult.success(id);
            log.debug("删除品牌信息成功,id={}",id);
        }
        else
        {
            //删除失败
            commonResult=CommonResult.failed("删除品牌信息失败,id="+id);
            log.debug("删除品牌信息失败,id={}",id);
        }
        return commonResult;
    }

   @GetMapping("/test")
    public String test()
    {
        return "index";
    }
}
