package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.GmsGoodsAttributeValueDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.GmsGoodsAttributeValue;
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
public interface GmsGoodsAttributeValueMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, goodsId, goodsAttributeId, value);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GmsGoodsAttributeValue> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<GmsGoodsAttributeValue> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GmsGoodsAttributeValueResult")
    Optional<GmsGoodsAttributeValue> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GmsGoodsAttributeValueResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="goods_attribute_id", property="goodsAttributeId", jdbcType=JdbcType.BIGINT),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<GmsGoodsAttributeValue> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, gmsGoodsAttributeValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, gmsGoodsAttributeValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(GmsGoodsAttributeValue record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsAttributeValue, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(goodsAttributeId).toProperty("goodsAttributeId")
            .map(value).toProperty("value")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<GmsGoodsAttributeValue> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, gmsGoodsAttributeValue, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(goodsAttributeId).toProperty("goodsAttributeId")
            .map(value).toProperty("value")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(GmsGoodsAttributeValue record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsAttributeValue, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(goodsId).toPropertyWhenPresent("goodsId", record::getGoodsId)
            .map(goodsAttributeId).toPropertyWhenPresent("goodsAttributeId", record::getGoodsAttributeId)
            .map(value).toPropertyWhenPresent("value", record::getValue)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsAttributeValue> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, gmsGoodsAttributeValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsAttributeValue> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, gmsGoodsAttributeValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsAttributeValue> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, gmsGoodsAttributeValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsAttributeValue> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, gmsGoodsAttributeValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(GmsGoodsAttributeValue record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(goodsId).equalTo(record::getGoodsId)
                .set(goodsAttributeId).equalTo(record::getGoodsAttributeId)
                .set(value).equalTo(record::getValue);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GmsGoodsAttributeValue record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(goodsId).equalToWhenPresent(record::getGoodsId)
                .set(goodsAttributeId).equalToWhenPresent(record::getGoodsAttributeId)
                .set(value).equalToWhenPresent(record::getValue);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(GmsGoodsAttributeValue record) {
        return update(c ->
            c.set(goodsId).equalTo(record::getGoodsId)
            .set(goodsAttributeId).equalTo(record::getGoodsAttributeId)
            .set(value).equalTo(record::getValue)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(GmsGoodsAttributeValue record) {
        return update(c ->
            c.set(goodsId).equalToWhenPresent(record::getGoodsId)
            .set(goodsAttributeId).equalToWhenPresent(record::getGoodsAttributeId)
            .set(value).equalToWhenPresent(record::getValue)
            .where(id, isEqualTo(record::getId))
        );
    }
}