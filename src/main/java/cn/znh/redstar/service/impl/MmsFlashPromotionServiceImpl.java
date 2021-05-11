package cn.znh.redstar.service.impl;

import cn.znh.redstar.dao.MmsFlashPromotionDao;
import cn.znh.redstar.dto.MmsFlashPromotionGoodsAddDto;
import cn.znh.redstar.mbg.mapper.*;
import cn.znh.redstar.mbg.model.GmsGoods;
import cn.znh.redstar.mbg.model.MmsFlashPromotion;
import cn.znh.redstar.mbg.model.MmsFlashPromotionGoodsRelation;
import cn.znh.redstar.service.MmsFlashPromotionService;
import cn.znh.redstar.vo.MmsFlashPromotionGoodsVo;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.join.EqualTo;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.equalTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author : znh
 * @date : 18:56 2021/4/29
 * 秒杀活动service实现
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MmsFlashPromotionServiceImpl implements MmsFlashPromotionService {

    @Resource
    MmsFlashPromotionMapper mmsFlashPromotionMapper;
    @Resource
    MmsFlashPromotionGoodsRelationMapper mmsFlashPromotionGoodsRelationMapper;
    @Resource
    GmsGoodsMapper gmsGoodsMapper;
    @Resource
    MmsFlashPromotionDao mmsFlashPromotionDao;

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
        flashPromotion.setCreateTime(new Date());
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

    @Override
    public int createGoods(List<MmsFlashPromotionGoodsRelation> flashPromotionGoodsRelationList) {
        int count=0;
        for (MmsFlashPromotionGoodsRelation flashPromotionGoodsRelation:flashPromotionGoodsRelationList)
        {
            //先判断当前活动的当前时间段有没有此商品
            SelectStatementProvider selectStatement = SqlBuilder.select(MmsFlashPromotionGoodsRelationMapper.selectList)
                   .from(MmsFlashPromotionGoodsRelationDynamicSqlSupport.mmsFlashPromotionGoodsRelation)
                    .where(MmsFlashPromotionGoodsRelationDynamicSqlSupport.flashPromotionId, isEqualTo(flashPromotionGoodsRelation.getFlashPromotionId()))
                    .and(MmsFlashPromotionGoodsRelationDynamicSqlSupport.flashPromotionSessionId,isEqualTo(flashPromotionGoodsRelation.getFlashPromotionSessionId()))
                    .and(MmsFlashPromotionGoodsRelationDynamicSqlSupport.goodsId,isEqualTo(flashPromotionGoodsRelation.getGoodsId()))
                    .build().render(RenderingStrategy.MYBATIS3);
            List<MmsFlashPromotionGoodsRelation> result
                    = mmsFlashPromotionGoodsRelationMapper.selectMany(selectStatement);
            //如果没有则可以插入
            if (result.isEmpty())
            {
                int insert = mmsFlashPromotionGoodsRelationMapper.insert(flashPromotionGoodsRelation);
                count+=insert;
                //更新商品的优惠方式为秒杀活动
                UpdateStatementProvider updateStatement=SqlBuilder.update(GmsGoodsDynamicSqlSupport.gmsGoods)
                        .set(GmsGoodsDynamicSqlSupport.promotionType).equalTo(5)
                        .where(GmsGoodsDynamicSqlSupport.id,isEqualTo(flashPromotionGoodsRelation.getGoodsId()))
                        .build()
                        .render(RenderingStrategy.MYBATIS3);
                gmsGoodsMapper.update(updateStatement);
            }
        }
        return count;
    }

    @Override
    public List<MmsFlashPromotionGoodsVo> getFlashPromotionGoods(Long flashPromotionId, Long flashPromotionSessionId) {
        List<MmsFlashPromotionGoodsVo> result=new LinkedList<>();
        SelectStatementProvider selectStatement = SqlBuilder.select(MmsFlashPromotionGoodsRelationDynamicSqlSupport.id,MmsFlashPromotionGoodsRelationDynamicSqlSupport.goodsId,GmsGoodsDynamicSqlSupport.name,GmsGoodsDynamicSqlSupport.goodsSn,GmsGoodsDynamicSqlSupport.price,GmsGoodsDynamicSqlSupport.stock,MmsFlashPromotionGoodsRelationDynamicSqlSupport.flashPromotionPrice,MmsFlashPromotionGoodsRelationDynamicSqlSupport.flashPromotionCount,MmsFlashPromotionGoodsRelationDynamicSqlSupport.flashPromotionLimit,MmsFlashPromotionGoodsRelationDynamicSqlSupport.sort)
                .from(GmsGoodsDynamicSqlSupport.gmsGoods)
                .join(MmsFlashPromotionGoodsRelationDynamicSqlSupport.mmsFlashPromotionGoodsRelation)
                .on(GmsGoodsDynamicSqlSupport.id, equalTo(MmsFlashPromotionGoodsRelationDynamicSqlSupport.goodsId))
                .where(MmsFlashPromotionGoodsRelationDynamicSqlSupport.flashPromotionId,isEqualTo(flashPromotionId))
                .and(MmsFlashPromotionGoodsRelationDynamicSqlSupport.flashPromotionSessionId,isEqualTo(flashPromotionSessionId))
                .build().render(RenderingStrategy.MYBATIS3);
        List<MmsFlashPromotionGoodsVo> flashPromotionGoodsVoList =
                mmsFlashPromotionDao.getFlashPromotionGoods(
                        selectStatement);
        return flashPromotionGoodsVoList;
    }

    @Override
    public int updateFlashPromotionGoods(Long id, MmsFlashPromotionGoodsRelation flashPromotionGoodsRelation) {
        flashPromotionGoodsRelation.setId(id);
        int result = mmsFlashPromotionGoodsRelationMapper.updateByPrimaryKey(flashPromotionGoodsRelation);
        return result;
    }

    @Override
    public int deleteFlashPromotionGoods(Long id) {
        int result = mmsFlashPromotionGoodsRelationMapper.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int deleteFlashPromotionGoods(List<Long> ids) {
        int count=0;
        for (Long id:ids)
        {
            int result = mmsFlashPromotionGoodsRelationMapper.deleteByPrimaryKey(id);
            count+=result;
        }
        return count;
    }
}
