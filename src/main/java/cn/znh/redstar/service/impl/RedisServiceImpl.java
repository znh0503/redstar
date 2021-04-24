package cn.znh.redstar.service.impl;

import cn.znh.redstar.service.RedisService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * 操作redis的service实现类
 * @author : znh
 * @date : 21:48 2021/3/16
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RedisServiceImpl implements RedisService {

    /**
     * 注入StringRedisTemplate
     */
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key,value);
    }

    @Override
    public String get(String key) {
        String value = stringRedisTemplate.opsForValue().get(key);
        return value;
    }

    @Override
    public boolean expire(String key, Long expire) {
        //秒
        Boolean result = stringRedisTemplate.expire(key, expire, TimeUnit.SECONDS);
        return result;
    }

    @Override
    public void delete(String key) {
        stringRedisTemplate.delete(key);
    }

    @Override
    public Long increment(String key, long step) {
        Long increment = stringRedisTemplate.opsForValue().increment(key, step);
        return increment;
    }
}
