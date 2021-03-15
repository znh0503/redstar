package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.MmsCouponGoodsCategoryRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.MmsCouponGoodsCategoryRelation;
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
public interface MmsCouponGoodsCategoryRelationMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, couponId, goodsCategoryId, goodsCategoryName, parentCategoryName);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MmsCouponGoodsCategoryRelation> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MmsCouponGoodsCategoryRelation> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MmsCouponGoodsCategoryRelationResult")
    Optional<MmsCouponGoodsCategoryRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MmsCouponGoodsCategoryRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="coupon_id", property="couponId", jdbcType=JdbcType.BIGINT),
        @Result(column="goods_category_id", property="goodsCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="goods_category_name", property="goodsCategoryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_category_name", property="parentCategoryName", jdbcType=JdbcType.VARCHAR)
    })
    List<MmsCouponGoodsCategoryRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mmsCouponGoodsCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mmsCouponGoodsCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(MmsCouponGoodsCategoryRelation record) {
        return MyBatis3Utils.insert(this::insert, record, mmsCouponGoodsCategoryRelation, c ->
            c.map(id).toProperty("id")
            .map(couponId).toProperty("couponId")
            .map(goodsCategoryId).toProperty("goodsCategoryId")
            .map(goodsCategoryName).toProperty("goodsCategoryName")
            .map(parentCategoryName).toProperty("parentCategoryName")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<MmsCouponGoodsCategoryRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mmsCouponGoodsCategoryRelation, c ->
            c.map(id).toProperty("id")
            .map(couponId).toProperty("couponId")
            .map(goodsCategoryId).toProperty("goodsCategoryId")
            .map(goodsCategoryName).toProperty("goodsCategoryName")
            .map(parentCategoryName).toProperty("parentCategoryName")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(MmsCouponGoodsCategoryRelation record) {
        return MyBatis3Utils.insert(this::insert, record, mmsCouponGoodsCategoryRelation, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(couponId).toPropertyWhenPresent("couponId", record::getCouponId)
            .map(goodsCategoryId).toPropertyWhenPresent("goodsCategoryId", record::getGoodsCategoryId)
            .map(goodsCategoryName).toPropertyWhenPresent("goodsCategoryName", record::getGoodsCategoryName)
            .map(parentCategoryName).toPropertyWhenPresent("parentCategoryName", record::getParentCategoryName)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsCouponGoodsCategoryRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mmsCouponGoodsCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsCouponGoodsCategoryRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mmsCouponGoodsCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsCouponGoodsCategoryRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mmsCouponGoodsCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsCouponGoodsCategoryRelation> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mmsCouponGoodsCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(MmsCouponGoodsCategoryRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(couponId).equalTo(record::getCouponId)
                .set(goodsCategoryId).equalTo(record::getGoodsCategoryId)
                .set(goodsCategoryName).equalTo(record::getGoodsCategoryName)
                .set(parentCategoryName).equalTo(record::getParentCategoryName);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MmsCouponGoodsCategoryRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(couponId).equalToWhenPresent(record::getCouponId)
                .set(goodsCategoryId).equalToWhenPresent(record::getGoodsCategoryId)
                .set(goodsCategoryName).equalToWhenPresent(record::getGoodsCategoryName)
                .set(parentCategoryName).equalToWhenPresent(record::getParentCategoryName);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(MmsCouponGoodsCategoryRelation record) {
        return update(c ->
            c.set(couponId).equalTo(record::getCouponId)
            .set(goodsCategoryId).equalTo(record::getGoodsCategoryId)
            .set(goodsCategoryName).equalTo(record::getGoodsCategoryName)
            .set(parentCategoryName).equalTo(record::getParentCategoryName)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(MmsCouponGoodsCategoryRelation record) {
        return update(c ->
            c.set(couponId).equalToWhenPresent(record::getCouponId)
            .set(goodsCategoryId).equalToWhenPresent(record::getGoodsCategoryId)
            .set(goodsCategoryName).equalToWhenPresent(record::getGoodsCategoryName)
            .set(parentCategoryName).equalToWhenPresent(record::getParentCategoryName)
            .where(id, isEqualTo(record::getId))
        );
    }
}