package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.MmsCouponHistoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.MmsCouponHistory;
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
public interface MmsCouponHistoryMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, couponId, memberId, orderId, couponCode, memberNickname, getType, createTime, useStatus, useTime, orderSn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MmsCouponHistory> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MmsCouponHistory> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MmsCouponHistoryResult")
    Optional<MmsCouponHistory> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MmsCouponHistoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="coupon_id", property="couponId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="coupon_code", property="couponCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="member_nickname", property="memberNickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="get_type", property="getType", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="use_status", property="useStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="use_time", property="useTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR)
    })
    List<MmsCouponHistory> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mmsCouponHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mmsCouponHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(MmsCouponHistory record) {
        return MyBatis3Utils.insert(this::insert, record, mmsCouponHistory, c ->
            c.map(id).toProperty("id")
            .map(couponId).toProperty("couponId")
            .map(memberId).toProperty("memberId")
            .map(orderId).toProperty("orderId")
            .map(couponCode).toProperty("couponCode")
            .map(memberNickname).toProperty("memberNickname")
            .map(getType).toProperty("getType")
            .map(createTime).toProperty("createTime")
            .map(useStatus).toProperty("useStatus")
            .map(useTime).toProperty("useTime")
            .map(orderSn).toProperty("orderSn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<MmsCouponHistory> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mmsCouponHistory, c ->
            c.map(id).toProperty("id")
            .map(couponId).toProperty("couponId")
            .map(memberId).toProperty("memberId")
            .map(orderId).toProperty("orderId")
            .map(couponCode).toProperty("couponCode")
            .map(memberNickname).toProperty("memberNickname")
            .map(getType).toProperty("getType")
            .map(createTime).toProperty("createTime")
            .map(useStatus).toProperty("useStatus")
            .map(useTime).toProperty("useTime")
            .map(orderSn).toProperty("orderSn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(MmsCouponHistory record) {
        return MyBatis3Utils.insert(this::insert, record, mmsCouponHistory, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(couponId).toPropertyWhenPresent("couponId", record::getCouponId)
            .map(memberId).toPropertyWhenPresent("memberId", record::getMemberId)
            .map(orderId).toPropertyWhenPresent("orderId", record::getOrderId)
            .map(couponCode).toPropertyWhenPresent("couponCode", record::getCouponCode)
            .map(memberNickname).toPropertyWhenPresent("memberNickname", record::getMemberNickname)
            .map(getType).toPropertyWhenPresent("getType", record::getGetType)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(useStatus).toPropertyWhenPresent("useStatus", record::getUseStatus)
            .map(useTime).toPropertyWhenPresent("useTime", record::getUseTime)
            .map(orderSn).toPropertyWhenPresent("orderSn", record::getOrderSn)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsCouponHistory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mmsCouponHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsCouponHistory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mmsCouponHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsCouponHistory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mmsCouponHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsCouponHistory> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mmsCouponHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(MmsCouponHistory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(couponId).equalTo(record::getCouponId)
                .set(memberId).equalTo(record::getMemberId)
                .set(orderId).equalTo(record::getOrderId)
                .set(couponCode).equalTo(record::getCouponCode)
                .set(memberNickname).equalTo(record::getMemberNickname)
                .set(getType).equalTo(record::getGetType)
                .set(createTime).equalTo(record::getCreateTime)
                .set(useStatus).equalTo(record::getUseStatus)
                .set(useTime).equalTo(record::getUseTime)
                .set(orderSn).equalTo(record::getOrderSn);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MmsCouponHistory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(couponId).equalToWhenPresent(record::getCouponId)
                .set(memberId).equalToWhenPresent(record::getMemberId)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(couponCode).equalToWhenPresent(record::getCouponCode)
                .set(memberNickname).equalToWhenPresent(record::getMemberNickname)
                .set(getType).equalToWhenPresent(record::getGetType)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(useStatus).equalToWhenPresent(record::getUseStatus)
                .set(useTime).equalToWhenPresent(record::getUseTime)
                .set(orderSn).equalToWhenPresent(record::getOrderSn);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(MmsCouponHistory record) {
        return update(c ->
            c.set(couponId).equalTo(record::getCouponId)
            .set(memberId).equalTo(record::getMemberId)
            .set(orderId).equalTo(record::getOrderId)
            .set(couponCode).equalTo(record::getCouponCode)
            .set(memberNickname).equalTo(record::getMemberNickname)
            .set(getType).equalTo(record::getGetType)
            .set(createTime).equalTo(record::getCreateTime)
            .set(useStatus).equalTo(record::getUseStatus)
            .set(useTime).equalTo(record::getUseTime)
            .set(orderSn).equalTo(record::getOrderSn)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(MmsCouponHistory record) {
        return update(c ->
            c.set(couponId).equalToWhenPresent(record::getCouponId)
            .set(memberId).equalToWhenPresent(record::getMemberId)
            .set(orderId).equalToWhenPresent(record::getOrderId)
            .set(couponCode).equalToWhenPresent(record::getCouponCode)
            .set(memberNickname).equalToWhenPresent(record::getMemberNickname)
            .set(getType).equalToWhenPresent(record::getGetType)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(useStatus).equalToWhenPresent(record::getUseStatus)
            .set(useTime).equalToWhenPresent(record::getUseTime)
            .set(orderSn).equalToWhenPresent(record::getOrderSn)
            .where(id, isEqualTo(record::getId))
        );
    }
}