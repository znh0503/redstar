package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.MmsCouponGoodsRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.MmsCouponGoodsRelation;
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
public interface MmsCouponGoodsRelationMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, couponId, goodsId, goodsName, goodsSn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MmsCouponGoodsRelation> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MmsCouponGoodsRelation> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MmsCouponGoodsRelationResult")
    Optional<MmsCouponGoodsRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MmsCouponGoodsRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="coupon_id", property="couponId", jdbcType=JdbcType.BIGINT),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_sn", property="goodsSn", jdbcType=JdbcType.VARCHAR)
    })
    List<MmsCouponGoodsRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mmsCouponGoodsRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mmsCouponGoodsRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(MmsCouponGoodsRelation record) {
        return MyBatis3Utils.insert(this::insert, record, mmsCouponGoodsRelation, c ->
            c.map(id).toProperty("id")
            .map(couponId).toProperty("couponId")
            .map(goodsId).toProperty("goodsId")
            .map(goodsName).toProperty("goodsName")
            .map(goodsSn).toProperty("goodsSn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<MmsCouponGoodsRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mmsCouponGoodsRelation, c ->
            c.map(id).toProperty("id")
            .map(couponId).toProperty("couponId")
            .map(goodsId).toProperty("goodsId")
            .map(goodsName).toProperty("goodsName")
            .map(goodsSn).toProperty("goodsSn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(MmsCouponGoodsRelation record) {
        return MyBatis3Utils.insert(this::insert, record, mmsCouponGoodsRelation, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(couponId).toPropertyWhenPresent("couponId", record::getCouponId)
            .map(goodsId).toPropertyWhenPresent("goodsId", record::getGoodsId)
            .map(goodsName).toPropertyWhenPresent("goodsName", record::getGoodsName)
            .map(goodsSn).toPropertyWhenPresent("goodsSn", record::getGoodsSn)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsCouponGoodsRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mmsCouponGoodsRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsCouponGoodsRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mmsCouponGoodsRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsCouponGoodsRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mmsCouponGoodsRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsCouponGoodsRelation> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mmsCouponGoodsRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(MmsCouponGoodsRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(couponId).equalTo(record::getCouponId)
                .set(goodsId).equalTo(record::getGoodsId)
                .set(goodsName).equalTo(record::getGoodsName)
                .set(goodsSn).equalTo(record::getGoodsSn);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MmsCouponGoodsRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(couponId).equalToWhenPresent(record::getCouponId)
                .set(goodsId).equalToWhenPresent(record::getGoodsId)
                .set(goodsName).equalToWhenPresent(record::getGoodsName)
                .set(goodsSn).equalToWhenPresent(record::getGoodsSn);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(MmsCouponGoodsRelation record) {
        return update(c ->
            c.set(couponId).equalTo(record::getCouponId)
            .set(goodsId).equalTo(record::getGoodsId)
            .set(goodsName).equalTo(record::getGoodsName)
            .set(goodsSn).equalTo(record::getGoodsSn)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(MmsCouponGoodsRelation record) {
        return update(c ->
            c.set(couponId).equalToWhenPresent(record::getCouponId)
            .set(goodsId).equalToWhenPresent(record::getGoodsId)
            .set(goodsName).equalToWhenPresent(record::getGoodsName)
            .set(goodsSn).equalToWhenPresent(record::getGoodsSn)
            .where(id, isEqualTo(record::getId))
        );
    }
}