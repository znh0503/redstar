package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.OmsOrderSetting;
import cn.znh.redstar.service.OmsOrderSettingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 18:31 2021/5/9
 * 订单设置controller
 */
@Slf4j
@Api(tags ="OmsOrderSettingController",description = "订单设置管理")
@RestController
@RequestMapping("/orderSetting")
public class OmsOrderSettingController {
    @Resource
    OmsOrderSettingService omsOrderSettingService;

    @ApiOperation("获取订单设置")
    @GetMapping("")
    CommonResult get()
    {
        List<OmsOrderSetting> result = omsOrderSettingService.get();
        return CommonResult.success(result);
    }

    @ApiOperation("更新订单设置")
    @PutMapping("/{id}")
    CommonResult update(@PathVariable("id") Long id,@RequestBody OmsOrderSetting orderSetting)
    {
        int result = omsOrderSettingService.update(id, orderSetting);
        if (result!=0)
        {
            return CommonResult.success(result);
        }
        else {
            return CommonResult.failed("更新订单设置失败");
        }
    }


}
