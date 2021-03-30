package cn.znh.redstar.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.znh.redstar.mbg.mapper.GmsGoodsMapper;
import cn.znh.redstar.mbg.model.GmsGoods;
import cn.znh.redstar.nosql.elasticsearch.document.EsGoods;
import cn.znh.redstar.nosql.elasticsearch.repository.EsGoodsRepository;
import cn.znh.redstar.service.EsGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author : znh
 * @date : 10:53 2021/3/30
 */
@Slf4j
@Service
public class EsGoodsServiceImpl implements EsGoodsService {
    @Resource
    private EsGoodsRepository esGoodsRepository;
    @Resource
    private GmsGoodsMapper gmsGoodsMapper;
    @Override
    public int importAll() {
        //查出数据库商品
        List<GmsGoods> goodsList = gmsGoodsMapper.select(SelectDSLCompleter.allRows());
        List<EsGoods> esGoodsList=new LinkedList<>();
        //将数据库商品复制到es商品集合
        for (GmsGoods gmsGoods:goodsList)
        {
            EsGoods esGoods=new EsGoods();
            BeanUtil.copyProperties(gmsGoods,esGoods);
            esGoodsList.add(esGoods);
        }
        Iterable<EsGoods> iterable = esGoodsRepository.saveAll(esGoodsList);
        Iterator<EsGoods> iterator = iterable.iterator();
        int result=0;
        while (iterator.hasNext())
        {
            //计算多少条商品
            result++;
            iterator.next();
        }
        return result;
    }

    @Override
    public boolean delete(Long id) {
        try {
            esGoodsRepository.deleteById(id);
            return true;
        }
        catch (Exception e)
        {
            log.error("EsGoodsServiceImpl#delete异常");
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(List<Long> ids) {
        if (!ids.isEmpty())
        {
            List<EsGoods> esGoodsList=new LinkedList<>();
            for (Long id:ids)
            {
                EsGoods esGoods=new EsGoods();
                esGoods.setId(id);
                esGoodsList.add(esGoods);
            }
            //删除
            try {
                esGoodsRepository.deleteAll(esGoodsList);
                return true;
            }
            catch (Exception e)
            {
                log.error("EsGoodsServiceImpl#delete异常");
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    @Override
    public EsGoods create(Long id) {
        //根据id从数据库查出商品信息
        Optional<GmsGoods> gmsGoods = gmsGoodsMapper.selectByPrimaryKey(id);
        GmsGoods goods = gmsGoods.orElse(null);
        if (goods!=null) {
            //保存到es
            EsGoods esGoods = new EsGoods();
            BeanUtil.copyProperties(goods, esGoods);
            EsGoods save = esGoodsRepository.save(esGoods);
            return save;
        }
        return null;
    }

    @Override
    public Page<EsGoods> search(String keyword, Integer pageNum, Integer pageSize) {
        //jpa有自己的分页，不能使用PageHelper,页码是从0开始的
        Pageable pageable= PageRequest.of(pageNum,pageSize);
        return esGoodsRepository.findByNameOrSubTitleOrKeywords(keyword,keyword,keyword,pageable);
    }
}
