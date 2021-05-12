package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.OmsCompanyAddressMapper;
import cn.znh.redstar.mbg.model.OmsCompanyAddress;
import cn.znh.redstar.service.OmsCompanyAddressService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 18:03 2021/5/12
 * 公司收货地址service实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Resource
    OmsCompanyAddressMapper omsCompanyAddressMapper;

    @Override
    public List<OmsCompanyAddress> get() {
        List<OmsCompanyAddress> companyAddressList = omsCompanyAddressMapper.select(SelectDSLCompleter.allRows());
        return companyAddressList;
    }
}
