package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.GmsMemberPriceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.GmsMemberPrice;
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
public interface GmsMemberPriceMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, goodsId, memberLevelId, memberPrice, memberLevelName);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GmsMemberPrice> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<GmsMemberPrice> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GmsMemberPriceResult")
    Optional<GmsMemberPrice> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GmsMemberPriceResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_level_id", property="memberLevelId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_price", property="memberPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="member_level_name", property="memberLevelName", jdbcType=JdbcType.VARCHAR)
    })
    List<GmsMemberPrice> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, gmsMemberPrice, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, gmsMemberPrice, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(GmsMemberPrice record) {
        return MyBatis3Utils.insert(this::insert, record, gmsMemberPrice, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(memberLevelId).toProperty("memberLevelId")
            .map(memberPrice).toProperty("memberPrice")
            .map(memberLevelName).toProperty("memberLevelName")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<GmsMemberPrice> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, gmsMemberPrice, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(memberLevelId).toProperty("memberLevelId")
            .map(memberPrice).toProperty("memberPrice")
            .map(memberLevelName).toProperty("memberLevelName")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(GmsMemberPrice record) {
        return MyBatis3Utils.insert(this::insert, record, gmsMemberPrice, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(goodsId).toPropertyWhenPresent("goodsId", record::getGoodsId)
            .map(memberLevelId).toPropertyWhenPresent("memberLevelId", record::getMemberLevelId)
            .map(memberPrice).toPropertyWhenPresent("memberPrice", record::getMemberPrice)
            .map(memberLevelName).toPropertyWhenPresent("memberLevelName", record::getMemberLevelName)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsMemberPrice> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, gmsMemberPrice, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsMemberPrice> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, gmsMemberPrice, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsMemberPrice> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, gmsMemberPrice, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsMemberPrice> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, gmsMemberPrice, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(GmsMemberPrice record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(goodsId).equalTo(record::getGoodsId)
                .set(memberLevelId).equalTo(record::getMemberLevelId)
                .set(memberPrice).equalTo(record::getMemberPrice)
                .set(memberLevelName).equalTo(record::getMemberLevelName);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GmsMemberPrice record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(goodsId).equalToWhenPresent(record::getGoodsId)
                .set(memberLevelId).equalToWhenPresent(record::getMemberLevelId)
                .set(memberPrice).equalToWhenPresent(record::getMemberPrice)
                .set(memberLevelName).equalToWhenPresent(record::getMemberLevelName);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(GmsMemberPrice record) {
        return update(c ->
            c.set(goodsId).equalTo(record::getGoodsId)
            .set(memberLevelId).equalTo(record::getMemberLevelId)
            .set(memberPrice).equalTo(record::getMemberPrice)
            .set(memberLevelName).equalTo(record::getMemberLevelName)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(GmsMemberPrice record) {
        return update(c ->
            c.set(goodsId).equalToWhenPresent(record::getGoodsId)
            .set(memberLevelId).equalToWhenPresent(record::getMemberLevelId)
            .set(memberPrice).equalToWhenPresent(record::getMemberPrice)
            .set(memberLevelName).equalToWhenPresent(record::getMemberLevelName)
            .where(id, isEqualTo(record::getId))
        );
    }
}