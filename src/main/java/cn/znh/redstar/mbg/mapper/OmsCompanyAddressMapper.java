package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.OmsCompanyAddressDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.OmsCompanyAddress;
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
public interface OmsCompanyAddressMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, addressName, sendStatus, receiveStatus, name, phone, province, city, region, detailAddress);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OmsCompanyAddress> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OmsCompanyAddress> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsCompanyAddressResult")
    Optional<OmsCompanyAddress> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsCompanyAddressResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="address_name", property="addressName", jdbcType=JdbcType.VARCHAR),
        @Result(column="send_status", property="sendStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="receive_status", property="receiveStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="region", property="region", jdbcType=JdbcType.VARCHAR),
        @Result(column="detail_address", property="detailAddress", jdbcType=JdbcType.VARCHAR)
    })
    List<OmsCompanyAddress> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsCompanyAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsCompanyAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsCompanyAddress record) {
        return MyBatis3Utils.insert(this::insert, record, omsCompanyAddress, c ->
            c.map(id).toProperty("id")
            .map(addressName).toProperty("addressName")
            .map(sendStatus).toProperty("sendStatus")
            .map(receiveStatus).toProperty("receiveStatus")
            .map(name).toProperty("name")
            .map(phone).toProperty("phone")
            .map(province).toProperty("province")
            .map(city).toProperty("city")
            .map(region).toProperty("region")
            .map(detailAddress).toProperty("detailAddress")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsCompanyAddress> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsCompanyAddress, c ->
            c.map(id).toProperty("id")
            .map(addressName).toProperty("addressName")
            .map(sendStatus).toProperty("sendStatus")
            .map(receiveStatus).toProperty("receiveStatus")
            .map(name).toProperty("name")
            .map(phone).toProperty("phone")
            .map(province).toProperty("province")
            .map(city).toProperty("city")
            .map(region).toProperty("region")
            .map(detailAddress).toProperty("detailAddress")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsCompanyAddress record) {
        return MyBatis3Utils.insert(this::insert, record, omsCompanyAddress, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(addressName).toPropertyWhenPresent("addressName", record::getAddressName)
            .map(sendStatus).toPropertyWhenPresent("sendStatus", record::getSendStatus)
            .map(receiveStatus).toPropertyWhenPresent("receiveStatus", record::getReceiveStatus)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
            .map(province).toPropertyWhenPresent("province", record::getProvince)
            .map(city).toPropertyWhenPresent("city", record::getCity)
            .map(region).toPropertyWhenPresent("region", record::getRegion)
            .map(detailAddress).toPropertyWhenPresent("detailAddress", record::getDetailAddress)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsCompanyAddress> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsCompanyAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsCompanyAddress> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsCompanyAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsCompanyAddress> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsCompanyAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsCompanyAddress> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsCompanyAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsCompanyAddress record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(addressName).equalTo(record::getAddressName)
                .set(sendStatus).equalTo(record::getSendStatus)
                .set(receiveStatus).equalTo(record::getReceiveStatus)
                .set(name).equalTo(record::getName)
                .set(phone).equalTo(record::getPhone)
                .set(province).equalTo(record::getProvince)
                .set(city).equalTo(record::getCity)
                .set(region).equalTo(record::getRegion)
                .set(detailAddress).equalTo(record::getDetailAddress);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsCompanyAddress record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(addressName).equalToWhenPresent(record::getAddressName)
                .set(sendStatus).equalToWhenPresent(record::getSendStatus)
                .set(receiveStatus).equalToWhenPresent(record::getReceiveStatus)
                .set(name).equalToWhenPresent(record::getName)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(province).equalToWhenPresent(record::getProvince)
                .set(city).equalToWhenPresent(record::getCity)
                .set(region).equalToWhenPresent(record::getRegion)
                .set(detailAddress).equalToWhenPresent(record::getDetailAddress);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsCompanyAddress record) {
        return update(c ->
            c.set(addressName).equalTo(record::getAddressName)
            .set(sendStatus).equalTo(record::getSendStatus)
            .set(receiveStatus).equalTo(record::getReceiveStatus)
            .set(name).equalTo(record::getName)
            .set(phone).equalTo(record::getPhone)
            .set(province).equalTo(record::getProvince)
            .set(city).equalTo(record::getCity)
            .set(region).equalTo(record::getRegion)
            .set(detailAddress).equalTo(record::getDetailAddress)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsCompanyAddress record) {
        return update(c ->
            c.set(addressName).equalToWhenPresent(record::getAddressName)
            .set(sendStatus).equalToWhenPresent(record::getSendStatus)
            .set(receiveStatus).equalToWhenPresent(record::getReceiveStatus)
            .set(name).equalToWhenPresent(record::getName)
            .set(phone).equalToWhenPresent(record::getPhone)
            .set(province).equalToWhenPresent(record::getProvince)
            .set(city).equalToWhenPresent(record::getCity)
            .set(region).equalToWhenPresent(record::getRegion)
            .set(detailAddress).equalToWhenPresent(record::getDetailAddress)
            .where(id, isEqualTo(record::getId))
        );
    }
}