package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.MmsFlashPromotionGoodsRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.MmsFlashPromotionGoodsRelation;
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
public interface MmsFlashPromotionGoodsRelationMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, flashPromotionId, flashPromotionSessionId, goodsId, flashPromotionPrice, flashPromotionCount, flashPromotionLimit, sort);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MmsFlashPromotionGoodsRelation> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MmsFlashPromotionGoodsRelation> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MmsFlashPromotionGoodsRelationResult")
    Optional<MmsFlashPromotionGoodsRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MmsFlashPromotionGoodsRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="flash_promotion_id", property="flashPromotionId", jdbcType=JdbcType.BIGINT),
        @Result(column="flash_promotion_session_id", property="flashPromotionSessionId", jdbcType=JdbcType.BIGINT),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="flash_promotion_price", property="flashPromotionPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="flash_promotion_count", property="flashPromotionCount", jdbcType=JdbcType.INTEGER),
        @Result(column="flash_promotion_limit", property="flashPromotionLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<MmsFlashPromotionGoodsRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mmsFlashPromotionGoodsRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mmsFlashPromotionGoodsRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(MmsFlashPromotionGoodsRelation record) {
        return MyBatis3Utils.insert(this::insert, record, mmsFlashPromotionGoodsRelation, c ->
            c.map(id).toProperty("id")
            .map(flashPromotionId).toProperty("flashPromotionId")
            .map(flashPromotionSessionId).toProperty("flashPromotionSessionId")
            .map(goodsId).toProperty("goodsId")
            .map(flashPromotionPrice).toProperty("flashPromotionPrice")
            .map(flashPromotionCount).toProperty("flashPromotionCount")
            .map(flashPromotionLimit).toProperty("flashPromotionLimit")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<MmsFlashPromotionGoodsRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mmsFlashPromotionGoodsRelation, c ->
            c.map(id).toProperty("id")
            .map(flashPromotionId).toProperty("flashPromotionId")
            .map(flashPromotionSessionId).toProperty("flashPromotionSessionId")
            .map(goodsId).toProperty("goodsId")
            .map(flashPromotionPrice).toProperty("flashPromotionPrice")
            .map(flashPromotionCount).toProperty("flashPromotionCount")
            .map(flashPromotionLimit).toProperty("flashPromotionLimit")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(MmsFlashPromotionGoodsRelation record) {
        return MyBatis3Utils.insert(this::insert, record, mmsFlashPromotionGoodsRelation, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(flashPromotionId).toPropertyWhenPresent("flashPromotionId", record::getFlashPromotionId)
            .map(flashPromotionSessionId).toPropertyWhenPresent("flashPromotionSessionId", record::getFlashPromotionSessionId)
            .map(goodsId).toPropertyWhenPresent("goodsId", record::getGoodsId)
            .map(flashPromotionPrice).toPropertyWhenPresent("flashPromotionPrice", record::getFlashPromotionPrice)
            .map(flashPromotionCount).toPropertyWhenPresent("flashPromotionCount", record::getFlashPromotionCount)
            .map(flashPromotionLimit).toPropertyWhenPresent("flashPromotionLimit", record::getFlashPromotionLimit)
            .map(sort).toPropertyWhenPresent("sort", record::getSort)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsFlashPromotionGoodsRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mmsFlashPromotionGoodsRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsFlashPromotionGoodsRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mmsFlashPromotionGoodsRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsFlashPromotionGoodsRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mmsFlashPromotionGoodsRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsFlashPromotionGoodsRelation> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mmsFlashPromotionGoodsRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(MmsFlashPromotionGoodsRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(flashPromotionId).equalTo(record::getFlashPromotionId)
                .set(flashPromotionSessionId).equalTo(record::getFlashPromotionSessionId)
                .set(goodsId).equalTo(record::getGoodsId)
                .set(flashPromotionPrice).equalTo(record::getFlashPromotionPrice)
                .set(flashPromotionCount).equalTo(record::getFlashPromotionCount)
                .set(flashPromotionLimit).equalTo(record::getFlashPromotionLimit)
                .set(sort).equalTo(record::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MmsFlashPromotionGoodsRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(flashPromotionId).equalToWhenPresent(record::getFlashPromotionId)
                .set(flashPromotionSessionId).equalToWhenPresent(record::getFlashPromotionSessionId)
                .set(goodsId).equalToWhenPresent(record::getGoodsId)
                .set(flashPromotionPrice).equalToWhenPresent(record::getFlashPromotionPrice)
                .set(flashPromotionCount).equalToWhenPresent(record::getFlashPromotionCount)
                .set(flashPromotionLimit).equalToWhenPresent(record::getFlashPromotionLimit)
                .set(sort).equalToWhenPresent(record::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(MmsFlashPromotionGoodsRelation record) {
        return update(c ->
            c.set(flashPromotionId).equalTo(record::getFlashPromotionId)
            .set(flashPromotionSessionId).equalTo(record::getFlashPromotionSessionId)
            .set(goodsId).equalTo(record::getGoodsId)
            .set(flashPromotionPrice).equalTo(record::getFlashPromotionPrice)
            .set(flashPromotionCount).equalTo(record::getFlashPromotionCount)
            .set(flashPromotionLimit).equalTo(record::getFlashPromotionLimit)
            .set(sort).equalTo(record::getSort)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(MmsFlashPromotionGoodsRelation record) {
        return update(c ->
            c.set(flashPromotionId).equalToWhenPresent(record::getFlashPromotionId)
            .set(flashPromotionSessionId).equalToWhenPresent(record::getFlashPromotionSessionId)
            .set(goodsId).equalToWhenPresent(record::getGoodsId)
            .set(flashPromotionPrice).equalToWhenPresent(record::getFlashPromotionPrice)
            .set(flashPromotionCount).equalToWhenPresent(record::getFlashPromotionCount)
            .set(flashPromotionLimit).equalToWhenPresent(record::getFlashPromotionLimit)
            .set(sort).equalToWhenPresent(record::getSort)
            .where(id, isEqualTo(record::getId))
        );
    }
}