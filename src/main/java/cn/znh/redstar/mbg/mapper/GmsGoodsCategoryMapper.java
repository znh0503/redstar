package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.GmsGoodsCategoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.GmsGoodsCategory;
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
public interface GmsGoodsCategoryMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, parentId, name, level, goodsCount, goodsUnit, navStatus, showStatus, sort, icon, keywords, description);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GmsGoodsCategory> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<GmsGoodsCategory> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GmsGoodsCategoryResult")
    Optional<GmsGoodsCategory> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GmsGoodsCategoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_count", property="goodsCount", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_unit", property="goodsUnit", jdbcType=JdbcType.VARCHAR),
        @Result(column="nav_status", property="navStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="show_status", property="showStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="keywords", property="keywords", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<GmsGoodsCategory> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, gmsGoodsCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, gmsGoodsCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(GmsGoodsCategory record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsCategory, c ->
            c.map(id).toProperty("id")
            .map(parentId).toProperty("parentId")
            .map(name).toProperty("name")
            .map(level).toProperty("level")
            .map(goodsCount).toProperty("goodsCount")
            .map(goodsUnit).toProperty("goodsUnit")
            .map(navStatus).toProperty("navStatus")
            .map(showStatus).toProperty("showStatus")
            .map(sort).toProperty("sort")
            .map(icon).toProperty("icon")
            .map(keywords).toProperty("keywords")
            .map(description).toProperty("description")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<GmsGoodsCategory> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, gmsGoodsCategory, c ->
            c.map(id).toProperty("id")
            .map(parentId).toProperty("parentId")
            .map(name).toProperty("name")
            .map(level).toProperty("level")
            .map(goodsCount).toProperty("goodsCount")
            .map(goodsUnit).toProperty("goodsUnit")
            .map(navStatus).toProperty("navStatus")
            .map(showStatus).toProperty("showStatus")
            .map(sort).toProperty("sort")
            .map(icon).toProperty("icon")
            .map(keywords).toProperty("keywords")
            .map(description).toProperty("description")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(GmsGoodsCategory record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsCategory, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(level).toPropertyWhenPresent("level", record::getLevel)
            .map(goodsCount).toPropertyWhenPresent("goodsCount", record::getGoodsCount)
            .map(goodsUnit).toPropertyWhenPresent("goodsUnit", record::getGoodsUnit)
            .map(navStatus).toPropertyWhenPresent("navStatus", record::getNavStatus)
            .map(showStatus).toPropertyWhenPresent("showStatus", record::getShowStatus)
            .map(sort).toPropertyWhenPresent("sort", record::getSort)
            .map(icon).toPropertyWhenPresent("icon", record::getIcon)
            .map(keywords).toPropertyWhenPresent("keywords", record::getKeywords)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsCategory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, gmsGoodsCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsCategory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, gmsGoodsCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsCategory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, gmsGoodsCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsCategory> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, gmsGoodsCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(GmsGoodsCategory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(parentId).equalTo(record::getParentId)
                .set(name).equalTo(record::getName)
                .set(level).equalTo(record::getLevel)
                .set(goodsCount).equalTo(record::getGoodsCount)
                .set(goodsUnit).equalTo(record::getGoodsUnit)
                .set(navStatus).equalTo(record::getNavStatus)
                .set(showStatus).equalTo(record::getShowStatus)
                .set(sort).equalTo(record::getSort)
                .set(icon).equalTo(record::getIcon)
                .set(keywords).equalTo(record::getKeywords)
                .set(description).equalTo(record::getDescription);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GmsGoodsCategory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(name).equalToWhenPresent(record::getName)
                .set(level).equalToWhenPresent(record::getLevel)
                .set(goodsCount).equalToWhenPresent(record::getGoodsCount)
                .set(goodsUnit).equalToWhenPresent(record::getGoodsUnit)
                .set(navStatus).equalToWhenPresent(record::getNavStatus)
                .set(showStatus).equalToWhenPresent(record::getShowStatus)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(keywords).equalToWhenPresent(record::getKeywords)
                .set(description).equalToWhenPresent(record::getDescription);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(GmsGoodsCategory record) {
        return update(c ->
            c.set(parentId).equalTo(record::getParentId)
            .set(name).equalTo(record::getName)
            .set(level).equalTo(record::getLevel)
            .set(goodsCount).equalTo(record::getGoodsCount)
            .set(goodsUnit).equalTo(record::getGoodsUnit)
            .set(navStatus).equalTo(record::getNavStatus)
            .set(showStatus).equalTo(record::getShowStatus)
            .set(sort).equalTo(record::getSort)
            .set(icon).equalTo(record::getIcon)
            .set(keywords).equalTo(record::getKeywords)
            .set(description).equalTo(record::getDescription)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(GmsGoodsCategory record) {
        return update(c ->
            c.set(parentId).equalToWhenPresent(record::getParentId)
            .set(name).equalToWhenPresent(record::getName)
            .set(level).equalToWhenPresent(record::getLevel)
            .set(goodsCount).equalToWhenPresent(record::getGoodsCount)
            .set(goodsUnit).equalToWhenPresent(record::getGoodsUnit)
            .set(navStatus).equalToWhenPresent(record::getNavStatus)
            .set(showStatus).equalToWhenPresent(record::getShowStatus)
            .set(sort).equalToWhenPresent(record::getSort)
            .set(icon).equalToWhenPresent(record::getIcon)
            .set(keywords).equalToWhenPresent(record::getKeywords)
            .set(description).equalToWhenPresent(record::getDescription)
            .where(id, isEqualTo(record::getId))
        );
    }
}