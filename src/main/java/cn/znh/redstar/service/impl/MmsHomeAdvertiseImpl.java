package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.MmsHomeAdvertiseDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.MmsHomeAdvertiseMapper;
import cn.znh.redstar.mbg.mapper.MmsHomeBrandDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.MmsHomeBrandMapper;
import cn.znh.redstar.mbg.model.MmsHomeAdvertise;
import cn.znh.redstar.service.MmsHomeAdvertiseSevice;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author : znh
 * @date : 0:06 2021/4/28
 * 首页轮播广告service实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MmsHomeAdvertiseImpl implements MmsHomeAdvertiseSevice {
    @Resource
    MmsHomeAdvertiseMapper mmsHomeAdvertiseMapper;

    @Override
    public List<MmsHomeAdvertise> getHomeAdvertise() {
        List<MmsHomeAdvertise> result = mmsHomeAdvertiseMapper.select(SelectDSLCompleter.allRows());
        return result;
    }

    @Override
    public List<MmsHomeAdvertise> getHomeAdvertise(int type, int status) {
        //根据轮播位置和上线状态查询广告信息
        SelectStatementProvider selectStatement = SqlBuilder.select(MmsHomeAdvertiseMapper.selectList)
                .from(MmsHomeAdvertiseDynamicSqlSupport.mmsHomeAdvertise)
                .where(MmsHomeAdvertiseDynamicSqlSupport.type, isEqualTo(type))
                .and(MmsHomeAdvertiseDynamicSqlSupport.status,isEqualTo(status))
                .build().render(RenderingStrategy.MYBATIS3);
        List<MmsHomeAdvertise> homeAdvertiseList = mmsHomeAdvertiseMapper.selectMany(selectStatement);
        return homeAdvertiseList;
    }

    @Override
    public int createHomeAdvertise(MmsHomeAdvertise homeAdvertise) {
        int result = mmsHomeAdvertiseMapper.insert(homeAdvertise);
        return result;
    }

    @Override
    public int updateHomeAdvertise(Long id, MmsHomeAdvertise homeAdvertise) {
        homeAdvertise.setId(id);
        int result = mmsHomeAdvertiseMapper.updateByPrimaryKey(homeAdvertise);
        return result;
    }

    @Override
    public int deleteHomeAdvertise(Long id) {
        int result = mmsHomeAdvertiseMapper.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int deleteHomeAdvertise(List<Long> ids) {
        int count=0;
        for (Long id:ids)
        {
            int result = mmsHomeAdvertiseMapper.deleteByPrimaryKey(id);
            count+=result;
        }
        return count;
    }
}
