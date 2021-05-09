package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.MmsFlashPromotionSession;
import cn.znh.redstar.mbg.model.OmsOrderReturnReason;
import cn.znh.redstar.service.OmsOrderReturnReasonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 0:19 2021/5/10
 */
@Slf4j
@Api(tags = "OmsOrderReturnReasonController",description = "订单退货原因管理")
@RestController
@RequestMapping("orderReturnReason")
public class OmsOrderReturnReasonController {
    @Resource
    OmsOrderReturnReasonService omsOrderReturnReasonService;

    @ApiOperation("获取全部退货原因")
    @GetMapping("")
    public CommonResult get()
    {
        List<OmsOrderReturnReason> orderReturnReasonList = omsOrderReturnReasonService.get();
        return CommonResult.success(orderReturnReasonList);
    }

    @ApiOperation("根据启用状态获取退货原因")
    @GetMapping("/{status}")
    public CommonResult get(@PathVariable("status") Integer status)
    {
        List<OmsOrderReturnReason> orderReturnReasonList = omsOrderReturnReasonService.get(status);
        return CommonResult.success(orderReturnReasonList);
    }

    @ApiOperation("创建一个退货原因")
    @PostMapping("")
    public CommonResult create(@RequestBody OmsOrderReturnReason orderReturnReason)
    {
        CommonResult commonResult;
        int result = omsOrderReturnReasonService.create(orderReturnReason);
        if (result!=0) {
            commonResult = CommonResult.success(result);
        }
        else {
            commonResult=CommonResult.failed("创建退货原因失败");
            log.debug("创建退货原因失败");
        }
        return commonResult;
    }

    @ApiOperation("根据id更新退货原因")
    @PutMapping("/{id}")
    public CommonResult update(@PathVariable("id") Long id,@RequestBody OmsOrderReturnReason orderReturnReason)
    {
        CommonResult commonResult;
        int result = omsOrderReturnReasonService.update(id, orderReturnReason);
        if (result==1)
        {
            //更新成功
            commonResult=CommonResult.success(orderReturnReason);
        }
        else {
            //更新失败
            commonResult=CommonResult.failed("更新退货原因失败");
            log.debug("更新退货原因失败,id={},data={}",id,orderReturnReason);
        }
        return commonResult;
    }

    @ApiOperation("根据id删除退货原因")
    @DeleteMapping("/{id}")
    public CommonResult delete(@PathVariable("id")Long id)
    {
        CommonResult commonResult;
        int result = omsOrderReturnReasonService.delete(id);
        if (result==1)
        {
            //删除成功
            commonResult=CommonResult.success(id);
        }
        else
        {
            //删除失败
            commonResult=CommonResult.failed("删除退货原因失败,id="+id);
            log.debug("删除退货原因失败,id={}",id);
        }
        return commonResult;
    }

    @ApiOperation("批量删除退货原因")
    @DeleteMapping("")
    public CommonResult delete(@RequestBody List<Long> ids)
    {
        CommonResult commonResult;
        int result = omsOrderReturnReasonService.delete(ids);
        //删除成功
        commonResult=CommonResult.success("执行完成，共删除"+result+"条");
        return commonResult;
    }
}
