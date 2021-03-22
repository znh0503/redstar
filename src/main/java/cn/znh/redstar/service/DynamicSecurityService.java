package cn.znh.redstar.service;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * 动态权限Service
 * @author : znh
 * @date : 22:16 2021/3/18
 */
public interface DynamicSecurityService {
    /**
     * 加载资源Ant通配符和资源对应map
     * @return
     */
    Map<String, ConfigAttribute>loadDataSource();
}
