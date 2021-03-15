package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.GmsGoodsAttributeCategoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.GmsGoodsAttributeCategory;
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
public interface GmsGoodsAttributeCategoryMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, attributeCount, paramCount);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GmsGoodsAttributeCategory> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<GmsGoodsAttributeCategory> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GmsGoodsAttributeCategoryResult")
    Optional<GmsGoodsAttributeCategory> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GmsGoodsAttributeCategoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="attribute_count", property="attributeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="param_count", property="paramCount", jdbcType=JdbcType.INTEGER)
    })
    List<GmsGoodsAttributeCategory> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, gmsGoodsAttributeCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, gmsGoodsAttributeCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(GmsGoodsAttributeCategory record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsAttributeCategory, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(attributeCount).toProperty("attributeCount")
            .map(paramCount).toProperty("paramCount")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<GmsGoodsAttributeCategory> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, gmsGoodsAttributeCategory, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(attributeCount).toProperty("attributeCount")
            .map(paramCount).toProperty("paramCount")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(GmsGoodsAttributeCategory record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsAttributeCategory, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(attributeCount).toPropertyWhenPresent("attributeCount", record::getAttributeCount)
            .map(paramCount).toPropertyWhenPresent("paramCount", record::getParamCount)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsAttributeCategory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, gmsGoodsAttributeCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsAttributeCategory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, gmsGoodsAttributeCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsAttributeCategory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, gmsGoodsAttributeCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsAttributeCategory> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, gmsGoodsAttributeCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(GmsGoodsAttributeCategory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(attributeCount).equalTo(record::getAttributeCount)
                .set(paramCount).equalTo(record::getParamCount);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GmsGoodsAttributeCategory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(attributeCount).equalToWhenPresent(record::getAttributeCount)
                .set(paramCount).equalToWhenPresent(record::getParamCount);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(GmsGoodsAttributeCategory record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(attributeCount).equalTo(record::getAttributeCount)
            .set(paramCount).equalTo(record::getParamCount)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(GmsGoodsAttributeCategory record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(attributeCount).equalToWhenPresent(record::getAttributeCount)
            .set(paramCount).equalToWhenPresent(record::getParamCount)
            .where(id, isEqualTo(record::getId))
        );
    }
}