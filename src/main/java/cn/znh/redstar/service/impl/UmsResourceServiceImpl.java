package cn.znh.redstar.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.znh.redstar.dao.UmsRoleDao;
import cn.znh.redstar.mbg.mapper.*;
import cn.znh.redstar.mbg.model.UmsAdmin;
import cn.znh.redstar.mbg.model.UmsResource;
import cn.znh.redstar.mbg.model.UmsRole;
import cn.znh.redstar.mbg.model.UmsRoleMenuRelation;
import cn.znh.redstar.service.UmsAdminCacheService;
import cn.znh.redstar.service.UmsResourceService;
import com.github.pagehelper.PageHelper;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.where.condition.IsEqualTo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualToWhenPresent;

/**
 * @author : znh
 * @date : 19:27 2021/3/19
 * 后台资源管理Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UmsResourceServiceImpl implements UmsResourceService {

    @Resource
    UmsResourceMapper umsResourceMapper;
    @Resource
    private UmsAdminCacheService umsAdminCacheService;


    @Override
    public int create(UmsResource umsResource) {
        umsResource.setCreateTime(new Date());
        return umsResourceMapper.insert(umsResource);
    }

    @Override
    public int update(Long id,UmsResource umsResource) {
        umsResource.setId(id);
        int result = umsResourceMapper.updateByPrimaryKeySelective(umsResource);
        //umsAdminCacheService.deleteResourceListByResource(id);
        return result;
    }

    @Override
    public UmsResource get(Long id) {
        Optional<UmsResource> umsResource = umsResourceMapper.selectByPrimaryKey(id);
        return umsResource.orElse(null);
    }

    @Override
    public List<UmsResource> get() {
        return umsResourceMapper.select(SelectDSLCompleter.allRows());
    }

    @Override
    public List<UmsResource> get(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        SelectStatementProvider selectStatement = SqlBuilder.select(UmsResourceMapper.selectList)
                .from(UmsResourceDynamicSqlSupport.umsResource)
                .where(UmsResourceDynamicSqlSupport.categoryId, isEqualTo(categoryId).when(Objects::nonNull))
                .and(UmsResourceDynamicSqlSupport.name, isEqualTo(nameKeyword).when(Objects::nonNull))
                .and(UmsResourceDynamicSqlSupport.url, isEqualTo(urlKeyword).when(Objects::nonNull))
                .build().render(RenderingStrategy.MYBATIS3);
        return umsResourceMapper.selectMany(selectStatement);
    }

    @Override
    public int delete(Long id) {
        int result = umsResourceMapper.deleteByPrimaryKey(id);
        //umsAdminCacheService.deleteResourceListByResource(id);
        return result;
    }
}
