package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.GmsMemberPrice;
import cn.znh.redstar.service.GmsMemberPriceService;
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
 * @date : 13:40 2021/4/8
 * 商品会员价格管理controller
 */
@Api(tags = "GmsMemberPriceController",description ="商品会员价格管理" )
@RestController
@RequestMapping("/memberPrice")
public class GmsMemberPriceController {
    @Resource
    GmsMemberPriceService gmsMemberPriceService;

    @ApiOperation("根据商品id获取对应的会员价格")
    @GetMapping("{goodsId}")
    public CommonResult getMemberPriceByGoodsId(@PathVariable("goodsId") Long goodsId)
    {
        List<GmsMemberPrice> memberPriceList = gmsMemberPriceService.getMemberPriceByGoodsId(goodsId);
        return CommonResult.success(memberPriceList);
    }
}
