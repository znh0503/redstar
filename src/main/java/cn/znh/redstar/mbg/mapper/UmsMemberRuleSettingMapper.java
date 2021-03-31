package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.UmsMemberRuleSettingDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.UmsMemberRuleSetting;
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
public interface UmsMemberRuleSettingMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, continueSignDay, continueSignPoint, consumePerPoint, lowOrderAmount, maxPointPerOrder, type);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UmsMemberRuleSetting> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UmsMemberRuleSetting> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMemberRuleSettingResult")
    Optional<UmsMemberRuleSetting> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMemberRuleSettingResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="continue_sign_day", property="continueSignDay", jdbcType=JdbcType.INTEGER),
        @Result(column="continue_sign_point", property="continueSignPoint", jdbcType=JdbcType.INTEGER),
        @Result(column="consume_per_point", property="consumePerPoint", jdbcType=JdbcType.DECIMAL),
        @Result(column="low_order_amount", property="lowOrderAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="max_point_per_order", property="maxPointPerOrder", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER)
    })
    List<UmsMemberRuleSetting> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsMemberRuleSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsMemberRuleSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsMemberRuleSetting record) {
        return MyBatis3Utils.insert(this::insert, record, umsMemberRuleSetting, c ->
            c.map(id).toProperty("id")
            .map(continueSignDay).toProperty("continueSignDay")
            .map(continueSignPoint).toProperty("continueSignPoint")
            .map(consumePerPoint).toProperty("consumePerPoint")
            .map(lowOrderAmount).toProperty("lowOrderAmount")
            .map(maxPointPerOrder).toProperty("maxPointPerOrder")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsMemberRuleSetting> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsMemberRuleSetting, c ->
            c.map(id).toProperty("id")
            .map(continueSignDay).toProperty("continueSignDay")
            .map(continueSignPoint).toProperty("continueSignPoint")
            .map(consumePerPoint).toProperty("consumePerPoint")
            .map(lowOrderAmount).toProperty("lowOrderAmount")
            .map(maxPointPerOrder).toProperty("maxPointPerOrder")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsMemberRuleSetting record) {
        return MyBatis3Utils.insert(this::insert, record, umsMemberRuleSetting, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(continueSignDay).toPropertyWhenPresent("continueSignDay", record::getContinueSignDay)
            .map(continueSignPoint).toPropertyWhenPresent("continueSignPoint", record::getContinueSignPoint)
            .map(consumePerPoint).toPropertyWhenPresent("consumePerPoint", record::getConsumePerPoint)
            .map(lowOrderAmount).toPropertyWhenPresent("lowOrderAmount", record::getLowOrderAmount)
            .map(maxPointPerOrder).toPropertyWhenPresent("maxPointPerOrder", record::getMaxPointPerOrder)
            .map(type).toPropertyWhenPresent("type", record::getType)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberRuleSetting> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsMemberRuleSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberRuleSetting> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsMemberRuleSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberRuleSetting> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsMemberRuleSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberRuleSetting> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsMemberRuleSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsMemberRuleSetting record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(continueSignDay).equalTo(record::getContinueSignDay)
                .set(continueSignPoint).equalTo(record::getContinueSignPoint)
                .set(consumePerPoint).equalTo(record::getConsumePerPoint)
                .set(lowOrderAmount).equalTo(record::getLowOrderAmount)
                .set(maxPointPerOrder).equalTo(record::getMaxPointPerOrder)
                .set(type).equalTo(record::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsMemberRuleSetting record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(continueSignDay).equalToWhenPresent(record::getContinueSignDay)
                .set(continueSignPoint).equalToWhenPresent(record::getContinueSignPoint)
                .set(consumePerPoint).equalToWhenPresent(record::getConsumePerPoint)
                .set(lowOrderAmount).equalToWhenPresent(record::getLowOrderAmount)
                .set(maxPointPerOrder).equalToWhenPresent(record::getMaxPointPerOrder)
                .set(type).equalToWhenPresent(record::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsMemberRuleSetting record) {
        return update(c ->
            c.set(continueSignDay).equalTo(record::getContinueSignDay)
            .set(continueSignPoint).equalTo(record::getContinueSignPoint)
            .set(consumePerPoint).equalTo(record::getConsumePerPoint)
            .set(lowOrderAmount).equalTo(record::getLowOrderAmount)
            .set(maxPointPerOrder).equalTo(record::getMaxPointPerOrder)
            .set(type).equalTo(record::getType)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsMemberRuleSetting record) {
        return update(c ->
            c.set(continueSignDay).equalToWhenPresent(record::getContinueSignDay)
            .set(continueSignPoint).equalToWhenPresent(record::getContinueSignPoint)
            .set(consumePerPoint).equalToWhenPresent(record::getConsumePerPoint)
            .set(lowOrderAmount).equalToWhenPresent(record::getLowOrderAmount)
            .set(maxPointPerOrder).equalToWhenPresent(record::getMaxPointPerOrder)
            .set(type).equalToWhenPresent(record::getType)
            .where(id, isEqualTo(record::getId))
        );
    }
}