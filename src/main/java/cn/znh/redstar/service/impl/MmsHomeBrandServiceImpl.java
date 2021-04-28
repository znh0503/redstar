package cn.znh.redstar.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.znh.redstar.mbg.mapper.*;
import cn.znh.redstar.mbg.model.GmsBrand;
import cn.znh.redstar.mbg.model.GmsGoodsAttribute;
import cn.znh.redstar.mbg.model.MmsHomeBrand;
import cn.znh.redstar.service.MmsHomeBrandService;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

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

    @Override
    public List createHomeBrand(List<GmsBrand> brandList) {
        List<MmsHomeBrand> result=new ArrayList<>();
        for (GmsBrand brand:brandList)
        {
            MmsHomeBrand homeBrand=new MmsHomeBrand();
            homeBrand.setBrandId(brand.getId());
            homeBrand.setBrandName(brand.getName());
            homeBrand.setSort(brand.getSort());
            //推荐
            homeBrand.setRecommendStatus(1);
            //查询有没有同名的品牌推荐
            SelectStatementProvider selectStatement = SqlBuilder.select(MmsHomeBrandMapper.selectList)
                    .from(MmsHomeBrandDynamicSqlSupport.mmsHomeBrand)
                    .where(MmsHomeBrandDynamicSqlSupport.brandName, isEqualTo(homeBrand.getBrandName()))
                    .build().render(RenderingStrategy.MYBATIS3);
            List<MmsHomeBrand> mmsHomeBrands = mmsHomeBrandMapper.selectMany(selectStatement);
            //如果没有同名才插入
            if (mmsHomeBrands.isEmpty()) {
                mmsHomeBrandMapper.insert(homeBrand);
                result.add(homeBrand);
            }
        }
        return result;
    }

    @Override
    public int updateHomeBrand(Long id, MmsHomeBrand homeBrand) {
        homeBrand.setId(id);
        int result = mmsHomeBrandMapper.updateByPrimaryKey(homeBrand);
        return result;
    }
}
