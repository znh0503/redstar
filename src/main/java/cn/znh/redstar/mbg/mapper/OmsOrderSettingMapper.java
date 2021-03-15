package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.OmsOrderSettingDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.OmsOrderSetting;
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
public interface OmsOrderSettingMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, flashOrderOvertime, normalOrderOvertime, confirmOvertime, finishOvertime, commentOvertime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OmsOrderSetting> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OmsOrderSetting> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsOrderSettingResult")
    Optional<OmsOrderSetting> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsOrderSettingResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="flash_order_overtime", property="flashOrderOvertime", jdbcType=JdbcType.INTEGER),
        @Result(column="normal_order_overtime", property="normalOrderOvertime", jdbcType=JdbcType.INTEGER),
        @Result(column="confirm_overtime", property="confirmOvertime", jdbcType=JdbcType.INTEGER),
        @Result(column="finish_overtime", property="finishOvertime", jdbcType=JdbcType.INTEGER),
        @Result(column="comment_overtime", property="commentOvertime", jdbcType=JdbcType.INTEGER)
    })
    List<OmsOrderSetting> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsOrderSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsOrderSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsOrderSetting record) {
        return MyBatis3Utils.insert(this::insert, record, omsOrderSetting, c ->
            c.map(id).toProperty("id")
            .map(flashOrderOvertime).toProperty("flashOrderOvertime")
            .map(normalOrderOvertime).toProperty("normalOrderOvertime")
            .map(confirmOvertime).toProperty("confirmOvertime")
            .map(finishOvertime).toProperty("finishOvertime")
            .map(commentOvertime).toProperty("commentOvertime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsOrderSetting> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsOrderSetting, c ->
            c.map(id).toProperty("id")
            .map(flashOrderOvertime).toProperty("flashOrderOvertime")
            .map(normalOrderOvertime).toProperty("normalOrderOvertime")
            .map(confirmOvertime).toProperty("confirmOvertime")
            .map(finishOvertime).toProperty("finishOvertime")
            .map(commentOvertime).toProperty("commentOvertime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsOrderSetting record) {
        return MyBatis3Utils.insert(this::insert, record, omsOrderSetting, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(flashOrderOvertime).toPropertyWhenPresent("flashOrderOvertime", record::getFlashOrderOvertime)
            .map(normalOrderOvertime).toPropertyWhenPresent("normalOrderOvertime", record::getNormalOrderOvertime)
            .map(confirmOvertime).toPropertyWhenPresent("confirmOvertime", record::getConfirmOvertime)
            .map(finishOvertime).toPropertyWhenPresent("finishOvertime", record::getFinishOvertime)
            .map(commentOvertime).toPropertyWhenPresent("commentOvertime", record::getCommentOvertime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderSetting> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsOrderSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderSetting> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsOrderSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderSetting> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsOrderSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderSetting> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsOrderSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsOrderSetting record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(flashOrderOvertime).equalTo(record::getFlashOrderOvertime)
                .set(normalOrderOvertime).equalTo(record::getNormalOrderOvertime)
                .set(confirmOvertime).equalTo(record::getConfirmOvertime)
                .set(finishOvertime).equalTo(record::getFinishOvertime)
                .set(commentOvertime).equalTo(record::getCommentOvertime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsOrderSetting record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(flashOrderOvertime).equalToWhenPresent(record::getFlashOrderOvertime)
                .set(normalOrderOvertime).equalToWhenPresent(record::getNormalOrderOvertime)
                .set(confirmOvertime).equalToWhenPresent(record::getConfirmOvertime)
                .set(finishOvertime).equalToWhenPresent(record::getFinishOvertime)
                .set(commentOvertime).equalToWhenPresent(record::getCommentOvertime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsOrderSetting record) {
        return update(c ->
            c.set(flashOrderOvertime).equalTo(record::getFlashOrderOvertime)
            .set(normalOrderOvertime).equalTo(record::getNormalOrderOvertime)
            .set(confirmOvertime).equalTo(record::getConfirmOvertime)
            .set(finishOvertime).equalTo(record::getFinishOvertime)
            .set(commentOvertime).equalTo(record::getCommentOvertime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsOrderSetting record) {
        return update(c ->
            c.set(flashOrderOvertime).equalToWhenPresent(record::getFlashOrderOvertime)
            .set(normalOrderOvertime).equalToWhenPresent(record::getNormalOrderOvertime)
            .set(confirmOvertime).equalToWhenPresent(record::getConfirmOvertime)
            .set(finishOvertime).equalToWhenPresent(record::getFinishOvertime)
            .set(commentOvertime).equalToWhenPresent(record::getCommentOvertime)
            .where(id, isEqualTo(record::getId))
        );
    }
}