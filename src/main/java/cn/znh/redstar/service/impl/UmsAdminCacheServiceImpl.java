package cn.znh.redstar.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.znh.redstar.dao.UmsAdminRoleRelationDao;
import cn.znh.redstar.mbg.mapper.UmsAdminRoleRelationDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.UmsAdminRoleRelationMapper;
import cn.znh.redstar.mbg.model.UmsAdmin;
import cn.znh.redstar.mbg.model.UmsAdminRoleRelation;
import cn.znh.redstar.mbg.model.UmsResource;
import cn.znh.redstar.service.RedisService;
import cn.znh.redstar.service.UmsAdminCacheService;
import cn.znh.redstar.service.UmsAdminService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author : znh
 * @date : 18:51 2021/3/20
 * 后台用户缓存操作service实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UmsAdminCacheServiceImpl implements UmsAdminCacheService {
    @Resource
    private UmsAdminService umsAdminService;
    @Resource
    private RedisService redisService;
    @Resource
    private UmsAdminRoleRelationMapper umsAdminRoleRelationMapper;
    @Resource
    private UmsAdminRoleRelationDao umsAdminRoleRelationDao;
    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.key.admin}")
    private String REDIS_KEY_ADMIN;
    @Value("${redis.key.resourceList}")
    private String REDIS_KEY_RESOURCE_LIST;


    @Override
    public void deleteAdminCache(Long adminId) {
        UmsAdmin umsAdmin=umsAdminService.getAdmin(adminId);
        if (umsAdmin!=null)
        {
            String key=REDIS_DATABASE+":"+REDIS_KEY_ADMIN+":"+umsAdmin.getUsername();
            redisService.delete(key);
        }
    }

    @Override
    public void deleteResourceList(Long adminId) {
        String key=REDIS_DATABASE+":"+REDIS_KEY_RESOURCE_LIST+":"+adminId;
        redisService.delete(key);
    }

    @Override
    public void delResourceListByRole(Long roleId)
    {
        SelectStatementProvider selectStatement = SqlBuilder.select(UmsAdminRoleRelationMapper.selectList)
                .from(UmsAdminRoleRelationDynamicSqlSupport.umsAdminRoleRelation)
                .where(UmsAdminRoleRelationDynamicSqlSupport.roleId, isEqualTo(roleId))
                .build()
                .render(RenderingStrategy.MYBATIS3);
        List<UmsAdminRoleRelation> umsAdminRoleRelations = umsAdminRoleRelationMapper.selectMany(selectStatement);
        if (CollUtil.isNotEmpty(umsAdminRoleRelations)) {
            String keyPrefix = REDIS_DATABASE + ":" + REDIS_KEY_RESOURCE_LIST + ":";
            List<String> keys = umsAdminRoleRelations.stream().map(relation -> keyPrefix + relation.getAdminId()).collect(Collectors.toList());
            //redisService.delete(keys); 未完成
        }
    }

    @Override
    public void deleteResourceListByRoleIds(List<Long> roleIds) {


    }


    @Override
    public void deleteResourceListByResource(Long resourceId) {

    }

    @Override
    public UmsAdmin getAdmin(String username) {
        return null;
    }

    @Override
    public void setAdmin(UmsAdmin admin) {

    }

    @Override
    public List<UmsResource> getResourceList(Long adminId) {
        return null;
    }

    @Override
    public void SetResourceList(Long adminId, List<UmsResource> resourceList) {

    }
}
