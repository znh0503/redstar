package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.MmsCouponDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.MmsCoupon;
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
public interface MmsCouponMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, type, name, platform, count, amount, perLimit, minPoint, startTime, endTime, useType, note, publishCount, useCount, receiveCount, enableTime, code, memberLevel);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MmsCoupon> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MmsCoupon> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MmsCouponResult")
    Optional<MmsCoupon> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MmsCouponResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.INTEGER),
        @Result(column="count", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="per_limit", property="perLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="min_point", property="minPoint", jdbcType=JdbcType.DECIMAL),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="use_type", property="useType", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="publish_count", property="publishCount", jdbcType=JdbcType.INTEGER),
        @Result(column="use_count", property="useCount", jdbcType=JdbcType.INTEGER),
        @Result(column="receive_count", property="receiveCount", jdbcType=JdbcType.INTEGER),
        @Result(column="enable_time", property="enableTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="member_level", property="memberLevel", jdbcType=JdbcType.INTEGER)
    })
    List<MmsCoupon> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mmsCoupon, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mmsCoupon, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(MmsCoupon record) {
        return MyBatis3Utils.insert(this::insert, record, mmsCoupon, c ->
            c.map(id).toProperty("id")
            .map(type).toProperty("type")
            .map(name).toProperty("name")
            .map(platform).toProperty("platform")
            .map(count).toProperty("count")
            .map(amount).toProperty("amount")
            .map(perLimit).toProperty("perLimit")
            .map(minPoint).toProperty("minPoint")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(useType).toProperty("useType")
            .map(note).toProperty("note")
            .map(publishCount).toProperty("publishCount")
            .map(useCount).toProperty("useCount")
            .map(receiveCount).toProperty("receiveCount")
            .map(enableTime).toProperty("enableTime")
            .map(code).toProperty("code")
            .map(memberLevel).toProperty("memberLevel")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<MmsCoupon> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mmsCoupon, c ->
            c.map(id).toProperty("id")
            .map(type).toProperty("type")
            .map(name).toProperty("name")
            .map(platform).toProperty("platform")
            .map(count).toProperty("count")
            .map(amount).toProperty("amount")
            .map(perLimit).toProperty("perLimit")
            .map(minPoint).toProperty("minPoint")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(useType).toProperty("useType")
            .map(note).toProperty("note")
            .map(publishCount).toProperty("publishCount")
            .map(useCount).toProperty("useCount")
            .map(receiveCount).toProperty("receiveCount")
            .map(enableTime).toProperty("enableTime")
            .map(code).toProperty("code")
            .map(memberLevel).toProperty("memberLevel")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(MmsCoupon record) {
        return MyBatis3Utils.insert(this::insert, record, mmsCoupon, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(platform).toPropertyWhenPresent("platform", record::getPlatform)
            .map(count).toPropertyWhenPresent("count", record::getCount)
            .map(amount).toPropertyWhenPresent("amount", record::getAmount)
            .map(perLimit).toPropertyWhenPresent("perLimit", record::getPerLimit)
            .map(minPoint).toPropertyWhenPresent("minPoint", record::getMinPoint)
            .map(startTime).toPropertyWhenPresent("startTime", record::getStartTime)
            .map(endTime).toPropertyWhenPresent("endTime", record::getEndTime)
            .map(useType).toPropertyWhenPresent("useType", record::getUseType)
            .map(note).toPropertyWhenPresent("note", record::getNote)
            .map(publishCount).toPropertyWhenPresent("publishCount", record::getPublishCount)
            .map(useCount).toPropertyWhenPresent("useCount", record::getUseCount)
            .map(receiveCount).toPropertyWhenPresent("receiveCount", record::getReceiveCount)
            .map(enableTime).toPropertyWhenPresent("enableTime", record::getEnableTime)
            .map(code).toPropertyWhenPresent("code", record::getCode)
            .map(memberLevel).toPropertyWhenPresent("memberLevel", record::getMemberLevel)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsCoupon> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mmsCoupon, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsCoupon> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mmsCoupon, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsCoupon> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mmsCoupon, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsCoupon> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mmsCoupon, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(MmsCoupon record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(type).equalTo(record::getType)
                .set(name).equalTo(record::getName)
                .set(platform).equalTo(record::getPlatform)
                .set(count).equalTo(record::getCount)
                .set(amount).equalTo(record::getAmount)
                .set(perLimit).equalTo(record::getPerLimit)
                .set(minPoint).equalTo(record::getMinPoint)
                .set(startTime).equalTo(record::getStartTime)
                .set(endTime).equalTo(record::getEndTime)
                .set(useType).equalTo(record::getUseType)
                .set(note).equalTo(record::getNote)
                .set(publishCount).equalTo(record::getPublishCount)
                .set(useCount).equalTo(record::getUseCount)
                .set(receiveCount).equalTo(record::getReceiveCount)
                .set(enableTime).equalTo(record::getEnableTime)
                .set(code).equalTo(record::getCode)
                .set(memberLevel).equalTo(record::getMemberLevel);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MmsCoupon record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(type).equalToWhenPresent(record::getType)
                .set(name).equalToWhenPresent(record::getName)
                .set(platform).equalToWhenPresent(record::getPlatform)
                .set(count).equalToWhenPresent(record::getCount)
                .set(amount).equalToWhenPresent(record::getAmount)
                .set(perLimit).equalToWhenPresent(record::getPerLimit)
                .set(minPoint).equalToWhenPresent(record::getMinPoint)
                .set(startTime).equalToWhenPresent(record::getStartTime)
                .set(endTime).equalToWhenPresent(record::getEndTime)
                .set(useType).equalToWhenPresent(record::getUseType)
                .set(note).equalToWhenPresent(record::getNote)
                .set(publishCount).equalToWhenPresent(record::getPublishCount)
                .set(useCount).equalToWhenPresent(record::getUseCount)
                .set(receiveCount).equalToWhenPresent(record::getReceiveCount)
                .set(enableTime).equalToWhenPresent(record::getEnableTime)
                .set(code).equalToWhenPresent(record::getCode)
                .set(memberLevel).equalToWhenPresent(record::getMemberLevel);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(MmsCoupon record) {
        return update(c ->
            c.set(type).equalTo(record::getType)
            .set(name).equalTo(record::getName)
            .set(platform).equalTo(record::getPlatform)
            .set(count).equalTo(record::getCount)
            .set(amount).equalTo(record::getAmount)
            .set(perLimit).equalTo(record::getPerLimit)
            .set(minPoint).equalTo(record::getMinPoint)
            .set(startTime).equalTo(record::getStartTime)
            .set(endTime).equalTo(record::getEndTime)
            .set(useType).equalTo(record::getUseType)
            .set(note).equalTo(record::getNote)
            .set(publishCount).equalTo(record::getPublishCount)
            .set(useCount).equalTo(record::getUseCount)
            .set(receiveCount).equalTo(record::getReceiveCount)
            .set(enableTime).equalTo(record::getEnableTime)
            .set(code).equalTo(record::getCode)
            .set(memberLevel).equalTo(record::getMemberLevel)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(MmsCoupon record) {
        return update(c ->
            c.set(type).equalToWhenPresent(record::getType)
            .set(name).equalToWhenPresent(record::getName)
            .set(platform).equalToWhenPresent(record::getPlatform)
            .set(count).equalToWhenPresent(record::getCount)
            .set(amount).equalToWhenPresent(record::getAmount)
            .set(perLimit).equalToWhenPresent(record::getPerLimit)
            .set(minPoint).equalToWhenPresent(record::getMinPoint)
            .set(startTime).equalToWhenPresent(record::getStartTime)
            .set(endTime).equalToWhenPresent(record::getEndTime)
            .set(useType).equalToWhenPresent(record::getUseType)
            .set(note).equalToWhenPresent(record::getNote)
            .set(publishCount).equalToWhenPresent(record::getPublishCount)
            .set(useCount).equalToWhenPresent(record::getUseCount)
            .set(receiveCount).equalToWhenPresent(record::getReceiveCount)
            .set(enableTime).equalToWhenPresent(record::getEnableTime)
            .set(code).equalToWhenPresent(record::getCode)
            .set(memberLevel).equalToWhenPresent(record::getMemberLevel)
            .where(id, isEqualTo(record::getId))
        );
    }
}