package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.MmsHomeRecommendGoodsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.MmsHomeRecommendGoods;
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
public interface MmsHomeRecommendGoodsMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, goodsId, goodsName, recommendStatus, sort);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MmsHomeRecommendGoods> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MmsHomeRecommendGoods> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MmsHomeRecommendGoodsResult")
    Optional<MmsHomeRecommendGoods> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MmsHomeRecommendGoodsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend_status", property="recommendStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<MmsHomeRecommendGoods> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mmsHomeRecommendGoods, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mmsHomeRecommendGoods, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(MmsHomeRecommendGoods record) {
        return MyBatis3Utils.insert(this::insert, record, mmsHomeRecommendGoods, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(goodsName).toProperty("goodsName")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<MmsHomeRecommendGoods> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mmsHomeRecommendGoods, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(goodsName).toProperty("goodsName")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(MmsHomeRecommendGoods record) {
        return MyBatis3Utils.insert(this::insert, record, mmsHomeRecommendGoods, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(goodsId).toPropertyWhenPresent("goodsId", record::getGoodsId)
            .map(goodsName).toPropertyWhenPresent("goodsName", record::getGoodsName)
            .map(recommendStatus).toPropertyWhenPresent("recommendStatus", record::getRecommendStatus)
            .map(sort).toPropertyWhenPresent("sort", record::getSort)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsHomeRecommendGoods> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mmsHomeRecommendGoods, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsHomeRecommendGoods> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mmsHomeRecommendGoods, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsHomeRecommendGoods> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mmsHomeRecommendGoods, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsHomeRecommendGoods> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mmsHomeRecommendGoods, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(MmsHomeRecommendGoods record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(goodsId).equalTo(record::getGoodsId)
                .set(goodsName).equalTo(record::getGoodsName)
                .set(recommendStatus).equalTo(record::getRecommendStatus)
                .set(sort).equalTo(record::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MmsHomeRecommendGoods record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(goodsId).equalToWhenPresent(record::getGoodsId)
                .set(goodsName).equalToWhenPresent(record::getGoodsName)
                .set(recommendStatus).equalToWhenPresent(record::getRecommendStatus)
                .set(sort).equalToWhenPresent(record::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(MmsHomeRecommendGoods record) {
        return update(c ->
            c.set(goodsId).equalTo(record::getGoodsId)
            .set(goodsName).equalTo(record::getGoodsName)
            .set(recommendStatus).equalTo(record::getRecommendStatus)
            .set(sort).equalTo(record::getSort)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(MmsHomeRecommendGoods record) {
        return update(c ->
            c.set(goodsId).equalToWhenPresent(record::getGoodsId)
            .set(goodsName).equalToWhenPresent(record::getGoodsName)
            .set(recommendStatus).equalToWhenPresent(record::getRecommendStatus)
            .set(sort).equalToWhenPresent(record::getSort)
            .where(id, isEqualTo(record::getId))
        );
    }
}