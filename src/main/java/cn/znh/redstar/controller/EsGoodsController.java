package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.nosql.elasticsearch.document.EsGoods;
import cn.znh.redstar.service.EsGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 11:42 2021/3/30
 * 搜索管理商品controller
 */
@Api(tags = "EsGoodsController",description = "商品搜索管理")
@RestController
@RequestMapping("/esGoods")
public class EsGoodsController {
    @Resource
    private EsGoodsService esGoodsService;

    @ApiOperation("导入所有商品到es")
    @PostMapping("/all")
    public CommonResult importAllGoodsToEs()
    {
        int count = esGoodsService.importAll();
        return CommonResult.success(count);
    }

    @ApiOperation("根据id删除商品")
    @DeleteMapping("/{id}")
    public CommonResult delete(@PathVariable("id") Long id)
    {
        boolean result = esGoodsService.delete(id);
        if (result)
        {
            //删除成功
            return CommonResult.success(null);
        }
        else {
            //删除失败
            return CommonResult.failed("删除失败");
        }
    }

    @ApiOperation("根据id批量删除商品" )
    @DeleteMapping("")
    public CommonResult delete(@RequestParam("ids") List<Long> ids)
    {
        boolean result = esGoodsService.delete(ids);
        if (result)
        {
            //删除成功
            return CommonResult.success(null);
        }
        else {
            //删除失败
            return CommonResult.failed("删除失败");
        }
    }

    @ApiOperation("根据id创建商品")
    @PostMapping("/{id}")
    public CommonResult create(@PathVariable("id")Long id)
    {
        EsGoods esGoods = esGoodsService.create(id);
        if (esGoods!=null)
        {
            //创建成功
            return CommonResult.success(esGoods);
        }
        else {
            //创建失败
            return CommonResult.failed();
        }
    }

    @ApiOperation("简单搜索")
    @GetMapping("")
    public CommonResult search(@RequestParam(required = false) String keyword,
                               @RequestParam(required = false,defaultValue = "0") Integer pageNum,
                               @RequestParam(required = false,defaultValue = "5") Integer pageSize)
    {
        Page<EsGoods> esGoodsPage = esGoodsService.search(keyword, pageNum, pageSize);
        return CommonResult.success(esGoodsPage);
    }
}
