package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.UmsResourceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.UmsResource;
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
public interface UmsResourceMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, categoryId, createTime, name, url, description);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UmsResource> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UmsResource> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsResourceResult")
    Optional<UmsResource> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsResourceResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR)
    })
    List<UmsResource> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsResource, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsResource, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsResource record) {
        return MyBatis3Utils.insert(this::insert, record, umsResource, c ->
            c.map(id).toProperty("id")
            .map(categoryId).toProperty("categoryId")
            .map(createTime).toProperty("createTime")
            .map(name).toProperty("name")
            .map(url).toProperty("url")
            .map(description).toProperty("description")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsResource> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsResource, c ->
            c.map(id).toProperty("id")
            .map(categoryId).toProperty("categoryId")
            .map(createTime).toProperty("createTime")
            .map(name).toProperty("name")
            .map(url).toProperty("url")
            .map(description).toProperty("description")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsResource record) {
        return MyBatis3Utils.insert(this::insert, record, umsResource, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(categoryId).toPropertyWhenPresent("categoryId", record::getCategoryId)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsResource> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsResource, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsResource> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsResource, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsResource> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsResource, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsResource> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsResource, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsResource record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(categoryId).equalTo(record::getCategoryId)
                .set(createTime).equalTo(record::getCreateTime)
                .set(name).equalTo(record::getName)
                .set(url).equalTo(record::getUrl)
                .set(description).equalTo(record::getDescription);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsResource record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(categoryId).equalToWhenPresent(record::getCategoryId)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(name).equalToWhenPresent(record::getName)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(description).equalToWhenPresent(record::getDescription);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsResource record) {
        return update(c ->
            c.set(categoryId).equalTo(record::getCategoryId)
            .set(createTime).equalTo(record::getCreateTime)
            .set(name).equalTo(record::getName)
            .set(url).equalTo(record::getUrl)
            .set(description).equalTo(record::getDescription)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsResource record) {
        return update(c ->
            c.set(categoryId).equalToWhenPresent(record::getCategoryId)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(name).equalToWhenPresent(record::getName)
            .set(url).equalToWhenPresent(record::getUrl)
            .set(description).equalToWhenPresent(record::getDescription)
            .where(id, isEqualTo(record::getId))
        );
    }
}