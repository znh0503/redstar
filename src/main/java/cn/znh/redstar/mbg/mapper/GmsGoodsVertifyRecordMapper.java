package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.GmsGoodsVertifyRecordDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.GmsGoodsVertifyRecord;
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
public interface GmsGoodsVertifyRecordMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, goodsId, createTime, vertifyMan, status, detail);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GmsGoodsVertifyRecord> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<GmsGoodsVertifyRecord> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GmsGoodsVertifyRecordResult")
    Optional<GmsGoodsVertifyRecord> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GmsGoodsVertifyRecordResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="vertify_man", property="vertifyMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="detail", property="detail", jdbcType=JdbcType.VARCHAR)
    })
    List<GmsGoodsVertifyRecord> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, gmsGoodsVertifyRecord, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, gmsGoodsVertifyRecord, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(GmsGoodsVertifyRecord record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsVertifyRecord, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(createTime).toProperty("createTime")
            .map(vertifyMan).toProperty("vertifyMan")
            .map(status).toProperty("status")
            .map(detail).toProperty("detail")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<GmsGoodsVertifyRecord> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, gmsGoodsVertifyRecord, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(createTime).toProperty("createTime")
            .map(vertifyMan).toProperty("vertifyMan")
            .map(status).toProperty("status")
            .map(detail).toProperty("detail")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(GmsGoodsVertifyRecord record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsVertifyRecord, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(goodsId).toPropertyWhenPresent("goodsId", record::getGoodsId)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(vertifyMan).toPropertyWhenPresent("vertifyMan", record::getVertifyMan)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(detail).toPropertyWhenPresent("detail", record::getDetail)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsVertifyRecord> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, gmsGoodsVertifyRecord, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsVertifyRecord> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, gmsGoodsVertifyRecord, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsVertifyRecord> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, gmsGoodsVertifyRecord, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsVertifyRecord> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, gmsGoodsVertifyRecord, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(GmsGoodsVertifyRecord record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(goodsId).equalTo(record::getGoodsId)
                .set(createTime).equalTo(record::getCreateTime)
                .set(vertifyMan).equalTo(record::getVertifyMan)
                .set(status).equalTo(record::getStatus)
                .set(detail).equalTo(record::getDetail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GmsGoodsVertifyRecord record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(goodsId).equalToWhenPresent(record::getGoodsId)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(vertifyMan).equalToWhenPresent(record::getVertifyMan)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(detail).equalToWhenPresent(record::getDetail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(GmsGoodsVertifyRecord record) {
        return update(c ->
            c.set(goodsId).equalTo(record::getGoodsId)
            .set(createTime).equalTo(record::getCreateTime)
            .set(vertifyMan).equalTo(record::getVertifyMan)
            .set(status).equalTo(record::getStatus)
            .set(detail).equalTo(record::getDetail)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(GmsGoodsVertifyRecord record) {
        return update(c ->
            c.set(goodsId).equalToWhenPresent(record::getGoodsId)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(vertifyMan).equalToWhenPresent(record::getVertifyMan)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(detail).equalToWhenPresent(record::getDetail)
            .where(id, isEqualTo(record::getId))
        );
    }
}