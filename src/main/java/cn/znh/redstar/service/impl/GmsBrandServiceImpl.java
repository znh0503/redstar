package cn.znh.redstar.service.impl;

import cn.znh.redstar.mbg.mapper.GmsBrandMapper;
import cn.znh.redstar.mbg.model.GmsBrand;
import cn.znh.redstar.service.GmsBrandService;
import com.github.pagehelper.PageHelper;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author : znh
 * @date : 22:43 2021/3/14
 * 品牌管理service的实现类
 */
@Service
public class GmsBrandServiceImpl implements GmsBrandService {

    @Resource
    GmsBrandMapper gmsBrandMapper;



    @Override
    public List<GmsBrand> listAllBrand() {
        //查询所有
        return gmsBrandMapper.select(SelectDSLCompleter.allRows());
    }

    @Override
    public int createBrand(GmsBrand brand) {
        //插入一条品牌信息
        return gmsBrandMapper.insert(brand);
    }

    @Override
    public int updateBrand(Long id, GmsBrand brand) {
        brand.setId(id);
        //根据id更新品牌信息
        return gmsBrandMapper.updateByPrimaryKey(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        //根据id删除品牌
        return gmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<GmsBrand> listBrand(int pageNum, int pageSize) {
        //分页查询
        PageHelper.startPage(pageNum,pageSize);
        return gmsBrandMapper.select(SelectDSLCompleter.allRows());
    }

    @Override
    public GmsBrand getBrand(Long id) {
        Optional<GmsBrand> gmsBrand = gmsBrandMapper.selectByPrimaryKey(id);
        return gmsBrand.orElse(null);
    }
}
