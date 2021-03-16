package cn.znh.redstar.service;

/**
 * 操作Redis的service
 * @author : znh
 * @date : 21:42 2021/3/16
 */
public interface RedisService {
    /**
     * 存数据
     * @param key   键
     * @param value 值
     */
    void set(String key,String value);

    /**
     * 按key取值
     * @param key  键
     * @return
     */
    String get(String key);

    /**
     * 设置超时时间
     * @param key   键
     * @param expire 超时时间
     * @return
     */
    boolean expire(String key,Long expire);

    /**
     * 按键删除数据
     * @param key 键
     */
    void delete(String key);

    /**
     * 自增
     * @param key   键
     * @param step  自增步长
     * @return
     */
    Long increment(String key,long step);
}
