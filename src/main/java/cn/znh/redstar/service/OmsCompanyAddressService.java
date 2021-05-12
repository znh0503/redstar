package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.OmsCompanyAddress;

import java.util.List;

/**
 * @author : znh
 * @date : 18:02 2021/5/12
 * 公司收货地址service
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部公司收货地址
     * @return
     */
    List<OmsCompanyAddress> get();
}
