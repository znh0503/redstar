package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.MmsHomeAdvertiseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.MmsHomeAdvertise;
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
public interface MmsHomeAdvertiseMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, type, pic, startTime, endTime, status, clickCount, orderCount, url, note, sort);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MmsHomeAdvertise> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MmsHomeAdvertise> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MmsHomeAdvertiseResult")
    Optional<MmsHomeAdvertise> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MmsHomeAdvertiseResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="click_count", property="clickCount", jdbcType=JdbcType.INTEGER),
        @Result(column="order_count", property="orderCount", jdbcType=JdbcType.INTEGER),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<MmsHomeAdvertise> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mmsHomeAdvertise, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mmsHomeAdvertise, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(MmsHomeAdvertise record) {
        return MyBatis3Utils.insert(this::insert, record, mmsHomeAdvertise, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(type).toProperty("type")
            .map(pic).toProperty("pic")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(status).toProperty("status")
            .map(clickCount).toProperty("clickCount")
            .map(orderCount).toProperty("orderCount")
            .map(url).toProperty("url")
            .map(note).toProperty("note")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<MmsHomeAdvertise> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mmsHomeAdvertise, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(type).toProperty("type")
            .map(pic).toProperty("pic")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(status).toProperty("status")
            .map(clickCount).toProperty("clickCount")
            .map(orderCount).toProperty("orderCount")
            .map(url).toProperty("url")
            .map(note).toProperty("note")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(MmsHomeAdvertise record) {
        return MyBatis3Utils.insert(this::insert, record, mmsHomeAdvertise, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(pic).toPropertyWhenPresent("pic", record::getPic)
            .map(startTime).toPropertyWhenPresent("startTime", record::getStartTime)
            .map(endTime).toPropertyWhenPresent("endTime", record::getEndTime)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(clickCount).toPropertyWhenPresent("clickCount", record::getClickCount)
            .map(orderCount).toPropertyWhenPresent("orderCount", record::getOrderCount)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
            .map(note).toPropertyWhenPresent("note", record::getNote)
            .map(sort).toPropertyWhenPresent("sort", record::getSort)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsHomeAdvertise> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mmsHomeAdvertise, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsHomeAdvertise> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mmsHomeAdvertise, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsHomeAdvertise> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mmsHomeAdvertise, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsHomeAdvertise> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mmsHomeAdvertise, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(MmsHomeAdvertise record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(type).equalTo(record::getType)
                .set(pic).equalTo(record::getPic)
                .set(startTime).equalTo(record::getStartTime)
                .set(endTime).equalTo(record::getEndTime)
                .set(status).equalTo(record::getStatus)
                .set(clickCount).equalTo(record::getClickCount)
                .set(orderCount).equalTo(record::getOrderCount)
                .set(url).equalTo(record::getUrl)
                .set(note).equalTo(record::getNote)
                .set(sort).equalTo(record::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MmsHomeAdvertise record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(type).equalToWhenPresent(record::getType)
                .set(pic).equalToWhenPresent(record::getPic)
                .set(startTime).equalToWhenPresent(record::getStartTime)
                .set(endTime).equalToWhenPresent(record::getEndTime)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(clickCount).equalToWhenPresent(record::getClickCount)
                .set(orderCount).equalToWhenPresent(record::getOrderCount)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(note).equalToWhenPresent(record::getNote)
                .set(sort).equalToWhenPresent(record::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(MmsHomeAdvertise record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(type).equalTo(record::getType)
            .set(pic).equalTo(record::getPic)
            .set(startTime).equalTo(record::getStartTime)
            .set(endTime).equalTo(record::getEndTime)
            .set(status).equalTo(record::getStatus)
            .set(clickCount).equalTo(record::getClickCount)
            .set(orderCount).equalTo(record::getOrderCount)
            .set(url).equalTo(record::getUrl)
            .set(note).equalTo(record::getNote)
            .set(sort).equalTo(record::getSort)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(MmsHomeAdvertise record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(type).equalToWhenPresent(record::getType)
            .set(pic).equalToWhenPresent(record::getPic)
            .set(startTime).equalToWhenPresent(record::getStartTime)
            .set(endTime).equalToWhenPresent(record::getEndTime)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(clickCount).equalToWhenPresent(record::getClickCount)
            .set(orderCount).equalToWhenPresent(record::getOrderCount)
            .set(url).equalToWhenPresent(record::getUrl)
            .set(note).equalToWhenPresent(record::getNote)
            .set(sort).equalToWhenPresent(record::getSort)
            .where(id, isEqualTo(record::getId))
        );
    }
}