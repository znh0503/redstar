package cn.znh.redstar.service.impl;


import cn.znh.redstar.mbg.mapper.MmsFlashPromotionSessionDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.MmsFlashPromotionSessionMapper;
import cn.znh.redstar.mbg.model.MmsFlashPromotionSession;
import cn.znh.redstar.service.MmsFlashPromotionSessionService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author : znh
 * @date : 2:41 2021/4/30
 * 秒杀时间段service实现
 */
@Service
public class MmsFlashPromotionSessionServiceImpl implements MmsFlashPromotionSessionService {
    @Resource
    MmsFlashPromotionSessionMapper mmsFlashPromotionSessionMapper;

    @Override
    public List<MmsFlashPromotionSession> get() {
        List<MmsFlashPromotionSession> result = mmsFlashPromotionSessionMapper.select(SelectDSLCompleter.allRows());
        return result;
    }

    @Override
    public List<MmsFlashPromotionSession> get(int status) {
        //根据启用状态查询秒杀时间段
        SelectStatementProvider selectStatement = SqlBuilder.select(MmsFlashPromotionSessionMapper.selectList)
                .from(MmsFlashPromotionSessionDynamicSqlSupport.mmsFlashPromotionSession)
                .where(MmsFlashPromotionSessionDynamicSqlSupport.status,isEqualTo(status))
                .build().render(RenderingStrategy.MYBATIS3);
        List<MmsFlashPromotionSession> flashPromotionSessionList = mmsFlashPromotionSessionMapper.selectMany(selectStatement);
        return flashPromotionSessionList;
    }

    @Override
    public int create(MmsFlashPromotionSession flashPromotionSession) {
        flashPromotionSession.setCreateTime(new Date());
        int result = mmsFlashPromotionSessionMapper.insert(flashPromotionSession);
        return result;
    }

    @Override
    public int update(Long id, MmsFlashPromotionSession flashPromotionSession) {
        flashPromotionSession.setId(id);
        int result = mmsFlashPromotionSessionMapper.updateByPrimaryKey(flashPromotionSession);
        return result;
    }

    @Override
    public int delete(Long id) {
        int result = mmsFlashPromotionSessionMapper.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int delete(List<Long> ids) {
        int count=0;
        for (Long id:ids)
        {
            int result = mmsFlashPromotionSessionMapper.deleteByPrimaryKey(id);
            count+=result;
        }
        return count;
    }
}
