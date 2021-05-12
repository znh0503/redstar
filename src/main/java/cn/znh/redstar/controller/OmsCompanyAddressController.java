package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.OmsCompanyAddress;
import cn.znh.redstar.mbg.model.OmsOrderReturnApply;
import cn.znh.redstar.service.OmsCompanyAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 18:05 2021/5/12
 * 公司收货地址管理
 */
@Slf4j
@Api(tags = "OmsCompanyAddressController",description = "订单公司收货地址管理")
@RestController
@RequestMapping("/companyAddress")
public class OmsCompanyAddressController {

    @Resource
    OmsCompanyAddressService omsCompanyAddressService;

    @ApiOperation("获取全部公司收货地址")
    @GetMapping("")
    public CommonResult get()
    {
        List<OmsCompanyAddress> companyAddressList = omsCompanyAddressService.get();
        return CommonResult.success(companyAddressList);
    }
}
