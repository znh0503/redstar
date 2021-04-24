package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.MmsHomeBrandMapper;
import cn.znh.redstar.mbg.model.MmsHomeBrand;
import cn.znh.redstar.service.MmsHomeBrandService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 17:33 2021/4/24
 * 首页品牌推荐Service层实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MmsHomeBrandServiceImpl implements MmsHomeBrandService {

    @Resource
    MmsHomeBrandMapper mmsHomeBrandMapper;

    @Override
    public List<MmsHomeBrand> listAllHomeBrand() {
        List<MmsHomeBrand> homeBrandList = mmsHomeBrandMapper.select(SelectDSLCompleter.allRows());
        return homeBrandList;
    }

    @Override
    public int deleteHomeBrand(Long id) {
        int result = mmsHomeBrandMapper.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int deleteHomeBrand(List<Long> ids) {
        int count=0;
        for (Long id:ids)
        {
            int result = mmsHomeBrandMapper.deleteByPrimaryKey(id);
            count+=result;
        }
        return count;
    }
}
