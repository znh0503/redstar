package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.MmsHomeBrandDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.MmsHomeBrand;
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
public interface MmsHomeBrandMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, brandId, brandName, recommendStatus, sort);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MmsHomeBrand> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MmsHomeBrand> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MmsHomeBrandResult")
    Optional<MmsHomeBrand> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MmsHomeBrandResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.BIGINT),
        @Result(column="brand_name", property="brandName", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend_status", property="recommendStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<MmsHomeBrand> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mmsHomeBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mmsHomeBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(MmsHomeBrand record) {
        return MyBatis3Utils.insert(this::insert, record, mmsHomeBrand, c ->
            c.map(id).toProperty("id")
            .map(brandId).toProperty("brandId")
            .map(brandName).toProperty("brandName")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<MmsHomeBrand> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mmsHomeBrand, c ->
            c.map(id).toProperty("id")
            .map(brandId).toProperty("brandId")
            .map(brandName).toProperty("brandName")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(MmsHomeBrand record) {
        return MyBatis3Utils.insert(this::insert, record, mmsHomeBrand, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(brandId).toPropertyWhenPresent("brandId", record::getBrandId)
            .map(brandName).toPropertyWhenPresent("brandName", record::getBrandName)
            .map(recommendStatus).toPropertyWhenPresent("recommendStatus", record::getRecommendStatus)
            .map(sort).toPropertyWhenPresent("sort", record::getSort)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsHomeBrand> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mmsHomeBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsHomeBrand> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mmsHomeBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsHomeBrand> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mmsHomeBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsHomeBrand> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mmsHomeBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(MmsHomeBrand record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(brandId).equalTo(record::getBrandId)
                .set(brandName).equalTo(record::getBrandName)
                .set(recommendStatus).equalTo(record::getRecommendStatus)
                .set(sort).equalTo(record::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MmsHomeBrand record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(brandId).equalToWhenPresent(record::getBrandId)
                .set(brandName).equalToWhenPresent(record::getBrandName)
                .set(recommendStatus).equalToWhenPresent(record::getRecommendStatus)
                .set(sort).equalToWhenPresent(record::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(MmsHomeBrand record) {
        return update(c ->
            c.set(brandId).equalTo(record::getBrandId)
            .set(brandName).equalTo(record::getBrandName)
            .set(recommendStatus).equalTo(record::getRecommendStatus)
            .set(sort).equalTo(record::getSort)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(MmsHomeBrand record) {
        return update(c ->
            c.set(brandId).equalToWhenPresent(record::getBrandId)
            .set(brandName).equalToWhenPresent(record::getBrandName)
            .set(recommendStatus).equalToWhenPresent(record::getRecommendStatus)
            .set(sort).equalToWhenPresent(record::getSort)
            .where(id, isEqualTo(record::getId))
        );
    }
}