package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.GmsGoodsOperateLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.GmsGoodsOperateLog;
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
public interface GmsGoodsOperateLogMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, goodsId, priceOld, priceNew, salePriceOld, salePriceNew, giftPointOld, giftPointNew, usePointLimitOld, usePointLimitNew, operateMan, createTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GmsGoodsOperateLog> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<GmsGoodsOperateLog> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GmsGoodsOperateLogResult")
    Optional<GmsGoodsOperateLog> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GmsGoodsOperateLogResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="price_old", property="priceOld", jdbcType=JdbcType.DECIMAL),
        @Result(column="price_new", property="priceNew", jdbcType=JdbcType.DECIMAL),
        @Result(column="sale_price_old", property="salePriceOld", jdbcType=JdbcType.DECIMAL),
        @Result(column="sale_price_new", property="salePriceNew", jdbcType=JdbcType.DECIMAL),
        @Result(column="gift_point_old", property="giftPointOld", jdbcType=JdbcType.INTEGER),
        @Result(column="gift_point_new", property="giftPointNew", jdbcType=JdbcType.INTEGER),
        @Result(column="use_point_limit_old", property="usePointLimitOld", jdbcType=JdbcType.INTEGER),
        @Result(column="use_point_limit_new", property="usePointLimitNew", jdbcType=JdbcType.INTEGER),
        @Result(column="operate_man", property="operateMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GmsGoodsOperateLog> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, gmsGoodsOperateLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, gmsGoodsOperateLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(GmsGoodsOperateLog record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsOperateLog, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(priceOld).toProperty("priceOld")
            .map(priceNew).toProperty("priceNew")
            .map(salePriceOld).toProperty("salePriceOld")
            .map(salePriceNew).toProperty("salePriceNew")
            .map(giftPointOld).toProperty("giftPointOld")
            .map(giftPointNew).toProperty("giftPointNew")
            .map(usePointLimitOld).toProperty("usePointLimitOld")
            .map(usePointLimitNew).toProperty("usePointLimitNew")
            .map(operateMan).toProperty("operateMan")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<GmsGoodsOperateLog> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, gmsGoodsOperateLog, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(priceOld).toProperty("priceOld")
            .map(priceNew).toProperty("priceNew")
            .map(salePriceOld).toProperty("salePriceOld")
            .map(salePriceNew).toProperty("salePriceNew")
            .map(giftPointOld).toProperty("giftPointOld")
            .map(giftPointNew).toProperty("giftPointNew")
            .map(usePointLimitOld).toProperty("usePointLimitOld")
            .map(usePointLimitNew).toProperty("usePointLimitNew")
            .map(operateMan).toProperty("operateMan")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(GmsGoodsOperateLog record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsOperateLog, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(goodsId).toPropertyWhenPresent("goodsId", record::getGoodsId)
            .map(priceOld).toPropertyWhenPresent("priceOld", record::getPriceOld)
            .map(priceNew).toPropertyWhenPresent("priceNew", record::getPriceNew)
            .map(salePriceOld).toPropertyWhenPresent("salePriceOld", record::getSalePriceOld)
            .map(salePriceNew).toPropertyWhenPresent("salePriceNew", record::getSalePriceNew)
            .map(giftPointOld).toPropertyWhenPresent("giftPointOld", record::getGiftPointOld)
            .map(giftPointNew).toPropertyWhenPresent("giftPointNew", record::getGiftPointNew)
            .map(usePointLimitOld).toPropertyWhenPresent("usePointLimitOld", record::getUsePointLimitOld)
            .map(usePointLimitNew).toPropertyWhenPresent("usePointLimitNew", record::getUsePointLimitNew)
            .map(operateMan).toPropertyWhenPresent("operateMan", record::getOperateMan)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsOperateLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, gmsGoodsOperateLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsOperateLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, gmsGoodsOperateLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsOperateLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, gmsGoodsOperateLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsOperateLog> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, gmsGoodsOperateLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(GmsGoodsOperateLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(goodsId).equalTo(record::getGoodsId)
                .set(priceOld).equalTo(record::getPriceOld)
                .set(priceNew).equalTo(record::getPriceNew)
                .set(salePriceOld).equalTo(record::getSalePriceOld)
                .set(salePriceNew).equalTo(record::getSalePriceNew)
                .set(giftPointOld).equalTo(record::getGiftPointOld)
                .set(giftPointNew).equalTo(record::getGiftPointNew)
                .set(usePointLimitOld).equalTo(record::getUsePointLimitOld)
                .set(usePointLimitNew).equalTo(record::getUsePointLimitNew)
                .set(operateMan).equalTo(record::getOperateMan)
                .set(createTime).equalTo(record::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GmsGoodsOperateLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(goodsId).equalToWhenPresent(record::getGoodsId)
                .set(priceOld).equalToWhenPresent(record::getPriceOld)
                .set(priceNew).equalToWhenPresent(record::getPriceNew)
                .set(salePriceOld).equalToWhenPresent(record::getSalePriceOld)
                .set(salePriceNew).equalToWhenPresent(record::getSalePriceNew)
                .set(giftPointOld).equalToWhenPresent(record::getGiftPointOld)
                .set(giftPointNew).equalToWhenPresent(record::getGiftPointNew)
                .set(usePointLimitOld).equalToWhenPresent(record::getUsePointLimitOld)
                .set(usePointLimitNew).equalToWhenPresent(record::getUsePointLimitNew)
                .set(operateMan).equalToWhenPresent(record::getOperateMan)
                .set(createTime).equalToWhenPresent(record::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(GmsGoodsOperateLog record) {
        return update(c ->
            c.set(goodsId).equalTo(record::getGoodsId)
            .set(priceOld).equalTo(record::getPriceOld)
            .set(priceNew).equalTo(record::getPriceNew)
            .set(salePriceOld).equalTo(record::getSalePriceOld)
            .set(salePriceNew).equalTo(record::getSalePriceNew)
            .set(giftPointOld).equalTo(record::getGiftPointOld)
            .set(giftPointNew).equalTo(record::getGiftPointNew)
            .set(usePointLimitOld).equalTo(record::getUsePointLimitOld)
            .set(usePointLimitNew).equalTo(record::getUsePointLimitNew)
            .set(operateMan).equalTo(record::getOperateMan)
            .set(createTime).equalTo(record::getCreateTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(GmsGoodsOperateLog record) {
        return update(c ->
            c.set(goodsId).equalToWhenPresent(record::getGoodsId)
            .set(priceOld).equalToWhenPresent(record::getPriceOld)
            .set(priceNew).equalToWhenPresent(record::getPriceNew)
            .set(salePriceOld).equalToWhenPresent(record::getSalePriceOld)
            .set(salePriceNew).equalToWhenPresent(record::getSalePriceNew)
            .set(giftPointOld).equalToWhenPresent(record::getGiftPointOld)
            .set(giftPointNew).equalToWhenPresent(record::getGiftPointNew)
            .set(usePointLimitOld).equalToWhenPresent(record::getUsePointLimitOld)
            .set(usePointLimitNew).equalToWhenPresent(record::getUsePointLimitNew)
            .set(operateMan).equalToWhenPresent(record::getOperateMan)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}