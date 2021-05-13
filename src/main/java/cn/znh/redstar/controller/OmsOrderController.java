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
import java.util.Map;

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

    @ApiOperation("根据会员id和订单状态获取订单")
    @GetMapping("/{memberId}/{status}")
    public CommonResult get(@PathVariable("memberId") Long memberId,@PathVariable("status") Integer status)
    {
        List<OmsOrder> orderList = omsOrderService.get(memberId,status);
        return CommonResult.success(orderList);
    }

    @ApiOperation("根据会员id获取全部订单")
    @GetMapping("/{memberId}")
    public CommonResult get(@PathVariable("memberId") Long memberId)
    {
        List<OmsOrder> orderList = omsOrderService.get(memberId);
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

    @ApiOperation("订单备注")
    @PutMapping("/note")
    public CommonResult note(@RequestBody Map<String,String> orderNote)
    {
        int result = omsOrderService.note(orderNote);
        if (result!=0)
        {
            return CommonResult.success("订单备注成功");
        }
        else {
            return CommonResult.failed("订单备注失败");
        }
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

    @ApiOperation("订单发货")
    @PutMapping("/send")
    public CommonResult send(@RequestBody Map orderSend)
    {
        int result = omsOrderService.send(orderSend);
        if (result!=0)
        {
            return CommonResult.success("订单发货成功");
        }
        else {
            return CommonResult.failed("订单发货失败");
        }
    }

    @ApiOperation("修改收货信息")
    @PutMapping("/updateReceiver")
    public CommonResult updateReceiver(@RequestBody Map orderReceiver)
    {
        int result = omsOrderService.updateReceiver(orderReceiver);
        if (result!=0)
        {
            return CommonResult.success("修改收货信息成功");
        }
        else {
            return CommonResult.failed("修改收货信息失败");
        }
    }

    @ApiOperation("关闭订单")
    @PutMapping("/close")
    public CommonResult close(@RequestBody Map<String,String> orderClose)
    {
        int result = omsOrderService.close(orderClose);
        if (result!=0)
        {
            return CommonResult.success("订单关闭成功");
        }
        else {
            return CommonResult.failed("订单关闭失败");
        }
    }

}
