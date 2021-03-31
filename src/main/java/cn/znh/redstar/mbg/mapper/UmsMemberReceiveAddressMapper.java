package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.UmsMemberReceiveAddressDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.UmsMemberReceiveAddress;
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
public interface UmsMemberReceiveAddressMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberId, name, phoneNumber, defaultStatus, postCode, province, city, region, detailAddress);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UmsMemberReceiveAddress> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UmsMemberReceiveAddress> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMemberReceiveAddressResult")
    Optional<UmsMemberReceiveAddress> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMemberReceiveAddressResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_number", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="default_status", property="defaultStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="post_code", property="postCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="region", property="region", jdbcType=JdbcType.VARCHAR),
        @Result(column="detail_address", property="detailAddress", jdbcType=JdbcType.VARCHAR)
    })
    List<UmsMemberReceiveAddress> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsMemberReceiveAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsMemberReceiveAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsMemberReceiveAddress record) {
        return MyBatis3Utils.insert(this::insert, record, umsMemberReceiveAddress, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(name).toProperty("name")
            .map(phoneNumber).toProperty("phoneNumber")
            .map(defaultStatus).toProperty("defaultStatus")
            .map(postCode).toProperty("postCode")
            .map(province).toProperty("province")
            .map(city).toProperty("city")
            .map(region).toProperty("region")
            .map(detailAddress).toProperty("detailAddress")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsMemberReceiveAddress> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsMemberReceiveAddress, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(name).toProperty("name")
            .map(phoneNumber).toProperty("phoneNumber")
            .map(defaultStatus).toProperty("defaultStatus")
            .map(postCode).toProperty("postCode")
            .map(province).toProperty("province")
            .map(city).toProperty("city")
            .map(region).toProperty("region")
            .map(detailAddress).toProperty("detailAddress")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsMemberReceiveAddress record) {
        return MyBatis3Utils.insert(this::insert, record, umsMemberReceiveAddress, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(memberId).toPropertyWhenPresent("memberId", record::getMemberId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(phoneNumber).toPropertyWhenPresent("phoneNumber", record::getPhoneNumber)
            .map(defaultStatus).toPropertyWhenPresent("defaultStatus", record::getDefaultStatus)
            .map(postCode).toPropertyWhenPresent("postCode", record::getPostCode)
            .map(province).toPropertyWhenPresent("province", record::getProvince)
            .map(city).toPropertyWhenPresent("city", record::getCity)
            .map(region).toPropertyWhenPresent("region", record::getRegion)
            .map(detailAddress).toPropertyWhenPresent("detailAddress", record::getDetailAddress)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberReceiveAddress> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsMemberReceiveAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberReceiveAddress> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsMemberReceiveAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberReceiveAddress> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsMemberReceiveAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberReceiveAddress> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsMemberReceiveAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsMemberReceiveAddress record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(memberId).equalTo(record::getMemberId)
                .set(name).equalTo(record::getName)
                .set(phoneNumber).equalTo(record::getPhoneNumber)
                .set(defaultStatus).equalTo(record::getDefaultStatus)
                .set(postCode).equalTo(record::getPostCode)
                .set(province).equalTo(record::getProvince)
                .set(city).equalTo(record::getCity)
                .set(region).equalTo(record::getRegion)
                .set(detailAddress).equalTo(record::getDetailAddress);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsMemberReceiveAddress record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(memberId).equalToWhenPresent(record::getMemberId)
                .set(name).equalToWhenPresent(record::getName)
                .set(phoneNumber).equalToWhenPresent(record::getPhoneNumber)
                .set(defaultStatus).equalToWhenPresent(record::getDefaultStatus)
                .set(postCode).equalToWhenPresent(record::getPostCode)
                .set(province).equalToWhenPresent(record::getProvince)
                .set(city).equalToWhenPresent(record::getCity)
                .set(region).equalToWhenPresent(record::getRegion)
                .set(detailAddress).equalToWhenPresent(record::getDetailAddress);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsMemberReceiveAddress record) {
        return update(c ->
            c.set(memberId).equalTo(record::getMemberId)
            .set(name).equalTo(record::getName)
            .set(phoneNumber).equalTo(record::getPhoneNumber)
            .set(defaultStatus).equalTo(record::getDefaultStatus)
            .set(postCode).equalTo(record::getPostCode)
            .set(province).equalTo(record::getProvince)
            .set(city).equalTo(record::getCity)
            .set(region).equalTo(record::getRegion)
            .set(detailAddress).equalTo(record::getDetailAddress)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsMemberReceiveAddress record) {
        return update(c ->
            c.set(memberId).equalToWhenPresent(record::getMemberId)
            .set(name).equalToWhenPresent(record::getName)
            .set(phoneNumber).equalToWhenPresent(record::getPhoneNumber)
            .set(defaultStatus).equalToWhenPresent(record::getDefaultStatus)
            .set(postCode).equalToWhenPresent(record::getPostCode)
            .set(province).equalToWhenPresent(record::getProvince)
            .set(city).equalToWhenPresent(record::getCity)
            .set(region).equalToWhenPresent(record::getRegion)
            .set(detailAddress).equalToWhenPresent(record::getDetailAddress)
            .where(id, isEqualTo(record::getId))
        );
    }
}