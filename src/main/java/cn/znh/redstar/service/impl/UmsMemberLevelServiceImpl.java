package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.UmsMemberLevelMapper;
import cn.znh.redstar.mbg.model.UmsMemberLevel;
import cn.znh.redstar.service.UmsMemberLevelService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 14:12 2021/4/8
 * 会员等级管理Service实现类
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Resource
    UmsMemberLevelMapper umsMemberLevelMapper;
    @Override
    public List<UmsMemberLevel> getMemberLevel() {
        List<UmsMemberLevel> memberLevelList = umsMemberLevelMapper.select(SelectDSLCompleter.allRows());
        return memberLevelList;
    }
}
