package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.UmsMemberLevel;

import java.util.List;

/**
 * @author : znh
 * @date : 14:11 2021/4/8
 * 会员等级管理Service
 */
public interface UmsMemberLevelService {

    /**
     * 获取所有会员等级信息
     * @return
     */
    List<UmsMemberLevel> getMemberLevel();

    /**
     * 根据id获取会员等级信息
     * @param id
     * @return
     */
    UmsMemberLevel getMemberLevel(Long id);
}
