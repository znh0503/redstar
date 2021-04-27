package cn.znh.redstar.service;

import cn.znh.redstar.mbg.model.MmsHomeAdvertise;

import java.util.List;

/**
 * @author : znh
 * @date : 23:59 2021/4/27
 * 首页轮播广告service
 */
public interface MmsHomeAdvertiseSevice {
    /**
     * 获取全部首页轮播广告信息
     * @return
     */
    List<MmsHomeAdvertise> getHomeAdvertise();

    /**
     * 获取全部首页轮播广告信息
     * @param type 轮播位置：0->PC首页轮播；1->app首页轮播
     * @param status 上下线状态：0->下线；1->上线
     * @return
     */
    List<MmsHomeAdvertise> getHomeAdvertise(int type, int status);

    /**
     * 创建一条首页轮播广告
     * @param homeAdvertise 一条首页广告信息
     * @return
     */
    int createHomeAdvertise(MmsHomeAdvertise homeAdvertise);

    /**
     * 根据id更新一条首页轮播广告信息
     * @param id id
     * @param homeAdvertise 一条首页广告信息
     * @return
     */
    int updateHomeAdvertise(Long id, MmsHomeAdvertise homeAdvertise);

    /**
     * 根据id删除一条首页轮播广告信息
     * @param id
     * @return
     */
    int deleteHomeAdvertise(Long id);

    /**
     * 批量删除首页轮播广告信息
     * @param ids
     * @return
     */
    int deleteHomeAdvertise(List<Long> ids);
}
