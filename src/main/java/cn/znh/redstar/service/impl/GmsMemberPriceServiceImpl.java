package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.GmsMemberPriceDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.GmsMemberPriceMapper;
import cn.znh.redstar.mbg.mapper.UmsMemberDynamicSqlSupport;
import cn.znh.redstar.mbg.mapper.UmsMemberMapper;
import cn.znh.redstar.mbg.model.GmsMemberPrice;
import cn.znh.redstar.service.GmsMemberPriceService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualToWhenPresent;

/**
 * @author : znh
 * @date : 13:40 2021/4/8
 * 商品会员价格管理service的实现类
 */
@Service
public class GmsMemberPriceServiceImpl implements GmsMemberPriceService {
    @Resource
    GmsMemberPriceMapper gmsMemberPriceMapper;

    @Override
    public List<GmsMemberPrice> getMemberPriceByGoodsId(Long goodsId) {
        SelectStatementProvider selectStatement = SqlBuilder.select(GmsMemberPriceMapper.selectList)
                .from(GmsMemberPriceDynamicSqlSupport.gmsMemberPrice)
                .where(GmsMemberPriceDynamicSqlSupport.goodsId, isEqualTo(goodsId))
                .orderBy(GmsMemberPriceDynamicSqlSupport.memberLevelId)
                .build().render(RenderingStrategy.MYBATIS3);
        List<GmsMemberPrice> memberPriceList = gmsMemberPriceMapper.selectMany(selectStatement);
        return memberPriceList;
    }
}
