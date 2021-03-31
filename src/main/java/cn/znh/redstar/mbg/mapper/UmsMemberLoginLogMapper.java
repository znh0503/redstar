package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.UmsMemberLoginLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.UmsMemberLoginLog;
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
public interface UmsMemberLoginLogMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberId, createTime, ip, city, loginType, province);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UmsMemberLoginLog> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UmsMemberLoginLog> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMemberLoginLogResult")
    Optional<UmsMemberLoginLog> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMemberLoginLogResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_type", property="loginType", jdbcType=JdbcType.INTEGER),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR)
    })
    List<UmsMemberLoginLog> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsMemberLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsMemberLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsMemberLoginLog record) {
        return MyBatis3Utils.insert(this::insert, record, umsMemberLoginLog, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(createTime).toProperty("createTime")
            .map(ip).toProperty("ip")
            .map(city).toProperty("city")
            .map(loginType).toProperty("loginType")
            .map(province).toProperty("province")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsMemberLoginLog> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsMemberLoginLog, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(createTime).toProperty("createTime")
            .map(ip).toProperty("ip")
            .map(city).toProperty("city")
            .map(loginType).toProperty("loginType")
            .map(province).toProperty("province")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsMemberLoginLog record) {
        return MyBatis3Utils.insert(this::insert, record, umsMemberLoginLog, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(memberId).toPropertyWhenPresent("memberId", record::getMemberId)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(ip).toPropertyWhenPresent("ip", record::getIp)
            .map(city).toPropertyWhenPresent("city", record::getCity)
            .map(loginType).toPropertyWhenPresent("loginType", record::getLoginType)
            .map(province).toPropertyWhenPresent("province", record::getProvince)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberLoginLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsMemberLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberLoginLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsMemberLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberLoginLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsMemberLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberLoginLog> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsMemberLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsMemberLoginLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(memberId).equalTo(record::getMemberId)
                .set(createTime).equalTo(record::getCreateTime)
                .set(ip).equalTo(record::getIp)
                .set(city).equalTo(record::getCity)
                .set(loginType).equalTo(record::getLoginType)
                .set(province).equalTo(record::getProvince);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsMemberLoginLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(memberId).equalToWhenPresent(record::getMemberId)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(ip).equalToWhenPresent(record::getIp)
                .set(city).equalToWhenPresent(record::getCity)
                .set(loginType).equalToWhenPresent(record::getLoginType)
                .set(province).equalToWhenPresent(record::getProvince);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsMemberLoginLog record) {
        return update(c ->
            c.set(memberId).equalTo(record::getMemberId)
            .set(createTime).equalTo(record::getCreateTime)
            .set(ip).equalTo(record::getIp)
            .set(city).equalTo(record::getCity)
            .set(loginType).equalTo(record::getLoginType)
            .set(province).equalTo(record::getProvince)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsMemberLoginLog record) {
        return update(c ->
            c.set(memberId).equalToWhenPresent(record::getMemberId)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(ip).equalToWhenPresent(record::getIp)
            .set(city).equalToWhenPresent(record::getCity)
            .set(loginType).equalToWhenPresent(record::getLoginType)
            .set(province).equalToWhenPresent(record::getProvince)
            .where(id, isEqualTo(record::getId))
        );
    }
}