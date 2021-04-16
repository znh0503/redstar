package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsGoodsFullReduction;
import cn.znh.redstar.service.GmsGoodsFullReductionService;
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
 * @date : 17:45 2021/4/8
 * 商品满减管理controller
 */
@Api(tags = "GmsGoodsFullReductionController",description = "商品满减管理")
@RestController
@RequestMapping("/goodsFullReduction")
public class GmsGoodsFullReductionController {
    @Resource
    GmsGoodsFullReductionService gmsGoodsFullReductionService;

    @ApiOperation("根据商品id获取相关满减信息")
    @GetMapping("/{goodsId}")
    public CommonResult getGoodsFullReductionByGoodsId(@PathVariable("goodsId") Long goodsId)
    {
        List<GmsGoodsFullReduction> goodsFullReductionList = gmsGoodsFullReductionService.getGoodsFullReductionByGoodsId(goodsId);
        return CommonResult.success(goodsFullReductionList);
    }
}
