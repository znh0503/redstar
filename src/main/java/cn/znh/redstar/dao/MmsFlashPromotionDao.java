package cn.znh.redstar.dao;

import cn.znh.redstar.vo.MmsFlashPromotionGoodsVo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : znh
 * @date : 18:22 2021/5/6
 * 秒杀活动自定义dao
 */
@Repository
public interface MmsFlashPromotionDao {
    /**
     * 根据活动场次和时间段获取秒杀商品
     * @param selectStatement
     * @return
     */
    @SelectProvider(type = SqlProviderAdapter.class,method = "select")
    @Results(
            id = "flashPromotionGoodsResult",
            value = {
                    @Result(column = "id",property = "id",jdbcType = JdbcType.INTEGER,id = true),
                    @Result(column = "name",property = "name",jdbcType = JdbcType.VARCHAR),
                    @Result(column = "goods_sn",property = "goodsSn",jdbcType = JdbcType.VARCHAR),
                    @Result(column = "price",property = "price",jdbcType = JdbcType.DECIMAL),
                    @Result(column = "stock",property = "stock",jdbcType = JdbcType.INTEGER),
                    @Result(column = "flash_Promotion_Price",property = "flashPromotionPrice",jdbcType = JdbcType.DECIMAL),
                    @Result(column = "flash_Promotion_Count",property = "flashPromotionCount",jdbcType = JdbcType.INTEGER),
                    @Result(column = "flashPromotionLimit",property = "flashPromotionLimit",jdbcType = JdbcType.INTEGER),
                    @Result(column = "sort",property = "sort",jdbcType = JdbcType.INTEGER)
            }
    )
    List<MmsFlashPromotionGoodsVo> getFlashPromotionGoods(SelectStatementProvider selectStatement);
}
