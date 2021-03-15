package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.GmsGoodsCategoryAttributeRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.GmsGoodsCategoryAttributeRelation;
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
public interface GmsGoodsCategoryAttributeRelationMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, goodsCategoryId, goodsAttributeId);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GmsGoodsCategoryAttributeRelation> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<GmsGoodsCategoryAttributeRelation> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GmsGoodsCategoryAttributeRelationResult")
    Optional<GmsGoodsCategoryAttributeRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GmsGoodsCategoryAttributeRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="goods_category_id", property="goodsCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="goods_attribute_id", property="goodsAttributeId", jdbcType=JdbcType.BIGINT)
    })
    List<GmsGoodsCategoryAttributeRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, gmsGoodsCategoryAttributeRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, gmsGoodsCategoryAttributeRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(GmsGoodsCategoryAttributeRelation record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsCategoryAttributeRelation, c ->
            c.map(id).toProperty("id")
            .map(goodsCategoryId).toProperty("goodsCategoryId")
            .map(goodsAttributeId).toProperty("goodsAttributeId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<GmsGoodsCategoryAttributeRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, gmsGoodsCategoryAttributeRelation, c ->
            c.map(id).toProperty("id")
            .map(goodsCategoryId).toProperty("goodsCategoryId")
            .map(goodsAttributeId).toProperty("goodsAttributeId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(GmsGoodsCategoryAttributeRelation record) {
        return MyBatis3Utils.insert(this::insert, record, gmsGoodsCategoryAttributeRelation, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(goodsCategoryId).toPropertyWhenPresent("goodsCategoryId", record::getGoodsCategoryId)
            .map(goodsAttributeId).toPropertyWhenPresent("goodsAttributeId", record::getGoodsAttributeId)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsCategoryAttributeRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, gmsGoodsCategoryAttributeRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsCategoryAttributeRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, gmsGoodsCategoryAttributeRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsGoodsCategoryAttributeRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, gmsGoodsCategoryAttributeRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsGoodsCategoryAttributeRelation> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, gmsGoodsCategoryAttributeRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(GmsGoodsCategoryAttributeRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(goodsCategoryId).equalTo(record::getGoodsCategoryId)
                .set(goodsAttributeId).equalTo(record::getGoodsAttributeId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GmsGoodsCategoryAttributeRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(goodsCategoryId).equalToWhenPresent(record::getGoodsCategoryId)
                .set(goodsAttributeId).equalToWhenPresent(record::getGoodsAttributeId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(GmsGoodsCategoryAttributeRelation record) {
        return update(c ->
            c.set(goodsCategoryId).equalTo(record::getGoodsCategoryId)
            .set(goodsAttributeId).equalTo(record::getGoodsAttributeId)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(GmsGoodsCategoryAttributeRelation record) {
        return update(c ->
            c.set(goodsCategoryId).equalToWhenPresent(record::getGoodsCategoryId)
            .set(goodsAttributeId).equalToWhenPresent(record::getGoodsAttributeId)
            .where(id, isEqualTo(record::getId))
        );
    }
}