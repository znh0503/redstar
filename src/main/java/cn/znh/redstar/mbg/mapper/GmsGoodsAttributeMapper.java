package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.GmsGoodsAttributeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.GmsGoodsAttribute;
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
public interface GmsGoodsAttributeMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, goodsAttributeCategoryId, name, selectType, inputType, inputList, sort, filterType, searchType, relatedStatus, handAddStatus, type);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GmsGoodsAttribute> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<GmsGoodsAttribute> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GmsGoodsAttributeResult")
    Optional<GmsGoodsAttribute> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GmsGoodsAttributeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="goods_attribute_category_id", property="goodsAttributeCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="select_type", property="selectType", jdbcType=JdbcType.INTEGER),
        @Result(column="input_type", property="inputType", jdbcType=JdbcType.INTEGER),
        @Result(column="input_list", property="inputList", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="filter_type", property="filterType", jdbcType=JdbcType.INTEGER),
        @Result(column="search_type", property="searchType", jdbcType=JdbcType.INTEGER),
        @Result(column="related_status", property="relatedStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="hand_add_status", property="handAddStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER)
    })
    List<GmsGoodsAttribute> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, gmsGoodsAttribute, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, gmsGoodsAttribute, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(GmsGoodsAttribute record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsAttribute, c ->
            c.map(id).toProperty("id")
            .map(goodsAttributeCategoryId).toProperty("goodsAttributeCategoryId")
            .map(name).toProperty("name")
            .map(selectType).toProperty("selectType")
            .map(inputType).toProperty("inputType")
            .map(inputList).toProperty("inputList")
            .map(sort).toProperty("sort")
            .map(filterType).toProperty("filterType")
            .map(searchType).toProperty("searchType")
            .map(relatedStatus).toProperty("relatedStatus")
            .map(handAddStatus).toProperty("handAddStatus")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<GmsGoodsAttribute> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, gmsGoodsAttribute, c ->
            c.map(id).toProperty("id")
            .map(goodsAttributeCategoryId).toProperty("goodsAttributeCategoryId")
            .map(name).toProperty("name")
            .map(selectType).toProperty("selectType")
            .map(inputType).toProperty("inputType")
            .map(inputList).toProperty("inputList")
            .map(sort).toProperty("sort")
            .map(filterType).toProperty("filterType")
            .map(searchType).toProperty("searchType")
            .map(relatedStatus).toProperty("relatedStatus")
            .map(handAddStatus).toProperty("handAddStatus")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(GmsGoodsAttribute record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsAttribute, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(goodsAttributeCategoryId).toPropertyWhenPresent("goodsAttributeCategoryId", record::getGoodsAttributeCategoryId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(selectType).toPropertyWhenPresent("selectType", record::getSelectType)
            .map(inputType).toPropertyWhenPresent("inputType", record::getInputType)
            .map(inputList).toPropertyWhenPresent("inputList", record::getInputList)
            .map(sort).toPropertyWhenPresent("sort", record::getSort)
            .map(filterType).toPropertyWhenPresent("filterType", record::getFilterType)
            .map(searchType).toPropertyWhenPresent("searchType", record::getSearchType)
            .map(relatedStatus).toPropertyWhenPresent("relatedStatus", record::getRelatedStatus)
            .map(handAddStatus).toPropertyWhenPresent("handAddStatus", record::getHandAddStatus)
            .map(type).toPropertyWhenPresent("type", record::getType)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsAttribute> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, gmsGoodsAttribute, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsAttribute> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, gmsGoodsAttribute, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsAttribute> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, gmsGoodsAttribute, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsAttribute> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, gmsGoodsAttribute, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(GmsGoodsAttribute record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(goodsAttributeCategoryId).equalTo(record::getGoodsAttributeCategoryId)
                .set(name).equalTo(record::getName)
                .set(selectType).equalTo(record::getSelectType)
                .set(inputType).equalTo(record::getInputType)
                .set(inputList).equalTo(record::getInputList)
                .set(sort).equalTo(record::getSort)
                .set(filterType).equalTo(record::getFilterType)
                .set(searchType).equalTo(record::getSearchType)
                .set(relatedStatus).equalTo(record::getRelatedStatus)
                .set(handAddStatus).equalTo(record::getHandAddStatus)
                .set(type).equalTo(record::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GmsGoodsAttribute record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(goodsAttributeCategoryId).equalToWhenPresent(record::getGoodsAttributeCategoryId)
                .set(name).equalToWhenPresent(record::getName)
                .set(selectType).equalToWhenPresent(record::getSelectType)
                .set(inputType).equalToWhenPresent(record::getInputType)
                .set(inputList).equalToWhenPresent(record::getInputList)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(filterType).equalToWhenPresent(record::getFilterType)
                .set(searchType).equalToWhenPresent(record::getSearchType)
                .set(relatedStatus).equalToWhenPresent(record::getRelatedStatus)
                .set(handAddStatus).equalToWhenPresent(record::getHandAddStatus)
                .set(type).equalToWhenPresent(record::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(GmsGoodsAttribute record) {
        return update(c ->
            c.set(goodsAttributeCategoryId).equalTo(record::getGoodsAttributeCategoryId)
            .set(name).equalTo(record::getName)
            .set(selectType).equalTo(record::getSelectType)
            .set(inputType).equalTo(record::getInputType)
            .set(inputList).equalTo(record::getInputList)
            .set(sort).equalTo(record::getSort)
            .set(filterType).equalTo(record::getFilterType)
            .set(searchType).equalTo(record::getSearchType)
            .set(relatedStatus).equalTo(record::getRelatedStatus)
            .set(handAddStatus).equalTo(record::getHandAddStatus)
            .set(type).equalTo(record::getType)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(GmsGoodsAttribute record) {
        return update(c ->
            c.set(goodsAttributeCategoryId).equalToWhenPresent(record::getGoodsAttributeCategoryId)
            .set(name).equalToWhenPresent(record::getName)
            .set(selectType).equalToWhenPresent(record::getSelectType)
            .set(inputType).equalToWhenPresent(record::getInputType)
            .set(inputList).equalToWhenPresent(record::getInputList)
            .set(sort).equalToWhenPresent(record::getSort)
            .set(filterType).equalToWhenPresent(record::getFilterType)
            .set(searchType).equalToWhenPresent(record::getSearchType)
            .set(relatedStatus).equalToWhenPresent(record::getRelatedStatus)
            .set(handAddStatus).equalToWhenPresent(record::getHandAddStatus)
            .set(type).equalToWhenPresent(record::getType)
            .where(id, isEqualTo(record::getId))
        );
    }
}