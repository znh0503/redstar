package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.UmsAdminRoleRelationDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.UmsAdminRoleRelationMapper;
import cn.znh.redstar.mbg.mapper.UmsRoleMapper;
import cn.znh.redstar.mbg.model.UmsAdminRoleRelation;
import cn.znh.redstar.mbg.model.UmsRole;
import cn.znh.redstar.service.UmsRoleService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : znh
 * @date : 21:16 2021/5/13
 * 用户角色service实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UmsRoleServiceImpl implements UmsRoleService {
    @Resource
    UmsRoleMapper umsRoleMapper;
    @Resource
    UmsAdminRoleRelationMapper umsAdminRoleRelationMapper;
    @Override
    public List<UmsRole> get() {
        List<UmsRole> roleList = umsRoleMapper.select(SelectDSLCompleter.allRows());
        return roleList;
    }


}
