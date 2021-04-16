package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsGoodsLadder;
import cn.znh.redstar.service.GmsGoodsLadderService;
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
 * @date : 17:25 2021/4/8
 * 商品阶梯价格管理controller
 */
@Api(tags = "GmsGoodsLadderController",description ="商品阶梯价格管理" )
@RestController
@RequestMapping("/goodsLadder")
public class GmsGoodsLadderController {
    @Resource
    GmsGoodsLadderService gmsGoodsLadderService;

    @ApiOperation("根据商品id获取相关阶梯优惠")
    @GetMapping("/{goodsId}")
    public CommonResult getGoodsLadderByGoodsId(@PathVariable("goodsId") Long goodsId)
    {
        List<GmsGoodsLadder> goodsLadderList = gmsGoodsLadderService.getGoodsLadderByGoodsId(goodsId);
        return CommonResult.success(goodsLadderList);
    }
}
