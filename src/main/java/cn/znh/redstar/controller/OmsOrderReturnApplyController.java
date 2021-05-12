package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.OmsOrderReturnApply;
import cn.znh.redstar.mbg.model.OmsOrderReturnReason;
import cn.znh.redstar.service.OmsOrderReturnApplyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 16:03 2021/5/12
 * 订单退货申请管理
 */
@Slf4j
@Api(tags = "OmsOrderReturnApplyController",description = "订单退货申请管理")
@RestController
@RequestMapping("/orderReturnApply")
public class OmsOrderReturnApplyController {
    @Resource
    OmsOrderReturnApplyService omsOrderReturnApplyService;

    @ApiOperation("获取全部退货申请")
    @GetMapping("")
    public CommonResult get()
    {
        List<OmsOrderReturnApply> orderReturnApplyList = omsOrderReturnApplyService.get();
        return CommonResult.success(orderReturnApplyList);
    }

    @ApiOperation("根据申请状态获取退货申请")
    @GetMapping("/{status}")
    public CommonResult get(@PathVariable("status") Integer status)
    {
        List<OmsOrderReturnApply> orderReturnApplyList = omsOrderReturnApplyService.get(status);
        return CommonResult.success(orderReturnApplyList);
    }

    @ApiOperation("创建一个退货申请")
    @PostMapping("")
    public CommonResult create(@RequestBody OmsOrderReturnApply orderReturnApply)
    {
        CommonResult commonResult;
        int result = omsOrderReturnApplyService.create(orderReturnApply);
        if (result!=0) {
            commonResult = CommonResult.success(result);
        }
        else {
            commonResult=CommonResult.failed("创建退货申请失败");
            log.debug("创建退货申请失败");
        }
        return commonResult;
    }

    @ApiOperation("根据id更新退货申请")
    @PutMapping("/{id}")
    public CommonResult update(@PathVariable("id") Long id,@RequestBody OmsOrderReturnApply orderReturnApply)
    {
        CommonResult commonResult;
        int result = omsOrderReturnApplyService.update(id, orderReturnApply);
        if (result==1)
        {
            //更新成功
            commonResult=CommonResult.success(orderReturnApply);
        }
        else {
            //更新失败
            commonResult=CommonResult.failed("更新退货申请失败");
            log.debug("更新退货申请失败,id={},data={}",id,orderReturnApply);
        }
        return commonResult;
    }

    @ApiOperation("根据id删除退货原因")
    @DeleteMapping("/{id}")
    public CommonResult delete(@PathVariable("id")Long id)
    {
        CommonResult commonResult;
        int result = omsOrderReturnApplyService.delete(id);
        if (result==1)
        {
            //删除成功
            commonResult=CommonResult.success(id);
        }
        else
        {
            //删除失败
            commonResult=CommonResult.failed("删除退货申请失败,id="+id);
            log.debug("删除退货申请失败,id={}",id);
        }
        return commonResult;
    }
}
