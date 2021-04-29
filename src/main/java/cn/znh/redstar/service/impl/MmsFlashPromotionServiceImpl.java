package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.MmsFlashPromotionDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.MmsFlashPromotionMapper;
import cn.znh.redstar.mbg.mapper.MmsHomeAdvertiseDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.MmsHomeAdvertiseMapper;
import cn.znh.redstar.mbg.model.MmsFlashPromotion;
import cn.znh.redstar.service.MmsFlashPromotionService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author : znh
 * @date : 18:56 2021/4/29
 * 秒杀活动service实现
 */
@Service
public class MmsFlashPromotionServiceImpl implements MmsFlashPromotionService {

    @Resource
    MmsFlashPromotionMapper mmsFlashPromotionMapper;

    @Override
    public List<MmsFlashPromotion> get() {
        List<MmsFlashPromotion> result = mmsFlashPromotionMapper.select(SelectDSLCompleter.allRows());
        return result;
    }

    @Override
    public List<MmsFlashPromotion> get(int status) {
        //根据上线状态查询秒杀活动
        SelectStatementProvider selectStatement = SqlBuilder.select(MmsFlashPromotionMapper.selectList)
                .from(MmsFlashPromotionDynamicSqlSupport.mmsFlashPromotion)
                .where(MmsFlashPromotionDynamicSqlSupport.status,isEqualTo(status))
                .build().render(RenderingStrategy.MYBATIS3);
        List<MmsFlashPromotion> flashPromotionList = mmsFlashPromotionMapper.selectMany(selectStatement);
        return flashPromotionList;
    }

    @Override
    public int create(MmsFlashPromotion flashPromotion) {
        int result = mmsFlashPromotionMapper.insert(flashPromotion);
        return result;
    }

    @Override
    public int update(Long id, MmsFlashPromotion flashPromotion) {
        flashPromotion.setId(id);
        int result = mmsFlashPromotionMapper.updateByPrimaryKey(flashPromotion);
        return result;
    }

    @Override
    public int delete(Long id) {
        int result = mmsFlashPromotionMapper.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int delete(List<Long> ids) {
        int count=0;
        for (Long id:ids)
        {
            int result = mmsFlashPromotionMapper.deleteByPrimaryKey(id);
            count+=result;
        }
        return count;
    }
}
