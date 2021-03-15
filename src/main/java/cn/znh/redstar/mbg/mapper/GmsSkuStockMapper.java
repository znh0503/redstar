package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.GmsSkuStockDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.GmsSkuStock;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface GmsSkuStockMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, goodsId, skuCode, price, stock, lowStock, sp1, sp2, sp3, pic, sale, promotionPrice, lockStock);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GmsSkuStock> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<GmsSkuStock> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GmsSkuStockResult")
    Optional<GmsSkuStock> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GmsSkuStockResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="sku_code", property="skuCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="stock", property="stock", jdbcType=JdbcType.INTEGER),
        @Result(column="low_stock", property="lowStock", jdbcType=JdbcType.INTEGER),
        @Result(column="sp1", property="sp1", jdbcType=JdbcType.VARCHAR),
        @Result(column="sp2", property="sp2", jdbcType=JdbcType.VARCHAR),
        @Result(column="sp3", property="sp3", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="sale", property="sale", jdbcType=JdbcType.INTEGER),
        @Result(column="promotion_price", property="promotionPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="lock_stock", property="lockStock", jdbcType=JdbcType.INTEGER)
    })
    List<GmsSkuStock> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, gmsSkuStock, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, gmsSkuStock, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(GmsSkuStock record) {
        return MyBatis3Utils.insert(this::insert, record, gmsSkuStock, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(skuCode).toProperty("skuCode")
            .map(price).toProperty("price")
            .map(stock).toProperty("stock")
            .map(lowStock).toProperty("lowStock")
            .map(sp1).toProperty("sp1")
            .map(sp2).toProperty("sp2")
            .map(sp3).toProperty("sp3")
            .map(pic).toProperty("pic")
            .map(sale).toProperty("sale")
            .map(promotionPrice).toProperty("promotionPrice")
            .map(lockStock).toProperty("lockStock")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<GmsSkuStock> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, gmsSkuStock, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(skuCode).toProperty("skuCode")
            .map(price).toProperty("price")
            .map(stock).toProperty("stock")
            .map(lowStock).toProperty("lowStock")
            .map(sp1).toProperty("sp1")
            .map(sp2).toProperty("sp2")
            .map(sp3).toProperty("sp3")
            .map(pic).toProperty("pic")
            .map(sale).toProperty("sale")
            .map(promotionPrice).toProperty("promotionPrice")
            .map(lockStock).toProperty("lockStock")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(GmsSkuStock record) {
        return MyBatis3Utils.insert(this::insert, record, gmsSkuStock, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(goodsId).toPropertyWhenPresent("goodsId", record::getGoodsId)
            .map(skuCode).toPropertyWhenPresent("skuCode", record::getSkuCode)
            .map(price).toPropertyWhenPresent("price", record::getPrice)
            .map(stock).toPropertyWhenPresent("stock", record::getStock)
            .map(lowStock).toPropertyWhenPresent("lowStock", record::getLowStock)
            .map(sp1).toPropertyWhenPresent("sp1", record::getSp1)
            .map(sp2).toPropertyWhenPresent("sp2", record::getSp2)
            .map(sp3).toPropertyWhenPresent("sp3", record::getSp3)
            .map(pic).toPropertyWhenPresent("pic", record::getPic)
            .map(sale).toPropertyWhenPresent("sale", record::getSale)
            .map(promotionPrice).toPropertyWhenPresent("promotionPrice", record::getPromotionPrice)
            .map(lockStock).toPropertyWhenPresent("lockStock", record::getLockStock)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsSkuStock> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, gmsSkuStock, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsSkuStock> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, gmsSkuStock, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsSkuStock> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, gmsSkuStock, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsSkuStock> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, gmsSkuStock, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(GmsSkuStock record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(goodsId).equalTo(record::getGoodsId)
                .set(skuCode).equalTo(record::getSkuCode)
                .set(price).equalTo(record::getPrice)
                .set(stock).equalTo(record::getStock)
                .set(lowStock).equalTo(record::getLowStock)
                .set(sp1).equalTo(record::getSp1)
                .set(sp2).equalTo(record::getSp2)
                .set(sp3).equalTo(record::getSp3)
                .set(pic).equalTo(record::getPic)
                .set(sale).equalTo(record::getSale)
                .set(promotionPrice).equalTo(record::getPromotionPrice)
                .set(lockStock).equalTo(record::getLockStock);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GmsSkuStock record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(goodsId).equalToWhenPresent(record::getGoodsId)
                .set(skuCode).equalToWhenPresent(record::getSkuCode)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(stock).equalToWhenPresent(record::getStock)
                .set(lowStock).equalToWhenPresent(record::getLowStock)
                .set(sp1).equalToWhenPresent(record::getSp1)
                .set(sp2).equalToWhenPresent(record::getSp2)
                .set(sp3).equalToWhenPresent(record::getSp3)
                .set(pic).equalToWhenPresent(record::getPic)
                .set(sale).equalToWhenPresent(record::getSale)
                .set(promotionPrice).equalToWhenPresent(record::getPromotionPrice)
                .set(lockStock).equalToWhenPresent(record::getLockStock);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(GmsSkuStock record) {
        return update(c ->
            c.set(goodsId).equalTo(record::getGoodsId)
            .set(skuCode).equalTo(record::getSkuCode)
            .set(price).equalTo(record::getPrice)
            .set(stock).equalTo(record::getStock)
            .set(lowStock).equalTo(record::getLowStock)
            .set(sp1).equalTo(record::getSp1)
            .set(sp2).equalTo(record::getSp2)
            .set(sp3).equalTo(record::getSp3)
            .set(pic).equalTo(record::getPic)
            .set(sale).equalTo(record::getSale)
            .set(promotionPrice).equalTo(record::getPromotionPrice)
            .set(lockStock).equalTo(record::getLockStock)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(GmsSkuStock record) {
        return update(c ->
            c.set(goodsId).equalToWhenPresent(record::getGoodsId)
            .set(skuCode).equalToWhenPresent(record::getSkuCode)
            .set(price).equalToWhenPresent(record::getPrice)
            .set(stock).equalToWhenPresent(record::getStock)
            .set(lowStock).equalToWhenPresent(record::getLowStock)
            .set(sp1).equalToWhenPresent(record::getSp1)
            .set(sp2).equalToWhenPresent(record::getSp2)
            .set(sp3).equalToWhenPresent(record::getSp3)
            .set(pic).equalToWhenPresent(record::getPic)
            .set(sale).equalToWhenPresent(record::getSale)
            .set(promotionPrice).equalToWhenPresent(record::getPromotionPrice)
            .set(lockStock).equalToWhenPresent(record::getLockStock)
            .where(id, isEqualTo(record::getId))
        );
    }
}