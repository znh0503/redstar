package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.OmsOrderSettingMapper;
import cn.znh.redstar.mbg.model.OmsOrderSetting;
import cn.znh.redstar.service.OmsOrderSettingService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 18:26 2021/5/9
 * 订单设置service实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {
    @Resource
    OmsOrderSettingMapper omsOrderSettingMapper;

    @Override
    public List<OmsOrderSetting> get() {
        List<OmsOrderSetting> result = omsOrderSettingMapper.select(SelectDSLCompleter.allRows());
        return result;
    }

    @Override
    public int update(Long id,OmsOrderSetting orderSetting) {
        orderSetting.setId(id);
        int result = omsOrderSettingMapper.updateByPrimaryKey(orderSetting);
        return result;
    }
}
