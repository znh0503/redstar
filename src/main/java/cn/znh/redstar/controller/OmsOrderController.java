package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.OmsOrder;
import cn.znh.redstar.mbg.model.OmsOrderItem;
import cn.znh.redstar.mbg.model.OmsOrderOperateHistory;
import cn.znh.redstar.mbg.model.OmsOrderReturnReason;
import cn.znh.redstar.service.OmsOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 17:04 2021/5/10
 */
@Slf4j
@Api(tags = "OmsOrderController",description = "订单管理")
@RestController
@RequestMapping("order")
public class OmsOrderController {
    @Resource
    OmsOrderService omsOrderService;

    @ApiOperation("获取全部订单")
    @GetMapping("")
    public CommonResult get()
    {
        List<OmsOrder> orderList = omsOrderService.get();
        return CommonResult.success(orderList);
    }

    @ApiOperation("根据订单状态获取订单")
    @GetMapping("/{status}")
    public CommonResult get(@PathVariable("status") Integer status)
    {
        List<OmsOrder> orderList = omsOrderService.get(status);
        return CommonResult.success(orderList);
    }

    @ApiOperation("创建一条订单")
    @PostMapping("")
    public CommonResult create(@RequestBody OmsOrder order)
    {
        CommonResult commonResult;
        int result = omsOrderService.create(order);
        if (result!=0) {
            commonResult = CommonResult.success(result);
        }
        else {
            commonResult=CommonResult.failed("创建订单失败");
            log.debug("创建订单失败");
        }
        return commonResult;
    }

    @ApiOperation("根据id更新订单")
    @PutMapping("/{id}")
    public CommonResult update(@PathVariable("id") Long id,@RequestBody OmsOrder order)
    {
        CommonResult commonResult;
        int result = omsOrderService.update(id, order);
        if (result==1)
        {
            //更新成功
            commonResult=CommonResult.success(order);
        }
        else {
            //更新失败
            commonResult=CommonResult.failed("更新订单失败");
            log.debug("更新订单失败,id={},data={}",id,order);
        }
        return commonResult;
    }

    @ApiOperation("根据id删除订单")
    @DeleteMapping("/{id}")
    public CommonResult delete(@PathVariable("id")Long id)
    {
        CommonResult commonResult;
        int result = omsOrderService.delete(id);
        if (result==1)
        {
            //删除成功
            commonResult=CommonResult.success(id);
        }
        else
        {
            //删除失败
            commonResult=CommonResult.failed("删除订单失败,id="+id);
            log.debug("删除订单失败,id={}",id);
        }
        return commonResult;
    }

    @ApiOperation("根据订单id获取订单里的商品信息")
    @GetMapping("/item/{orderId}")
    public CommonResult getItem(@PathVariable("orderId")Long orderId)
    {
        List<OmsOrderItem> orderItemList = omsOrderService.getItem(orderId);
        return CommonResult.success(orderItemList);
    }

    @ApiOperation("根据订单id获取订单操作记录")
    @GetMapping("/OperateHistory/{orderId}")
    public CommonResult getOperateHistory(@PathVariable("orderId")Long orderId)
    {
        List<OmsOrderOperateHistory> orderOperateHistoryList = omsOrderService.getOperateHistory(orderId);
        return CommonResult.success(orderOperateHistoryList);
    }

}
