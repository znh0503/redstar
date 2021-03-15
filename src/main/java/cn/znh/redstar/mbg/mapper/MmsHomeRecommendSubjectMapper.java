package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.MmsHomeRecommendSubjectDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.MmsHomeRecommendSubject;
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
public interface MmsHomeRecommendSubjectMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, subjectId, subjectName, recommendStatus, sort);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MmsHomeRecommendSubject> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MmsHomeRecommendSubject> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MmsHomeRecommendSubjectResult")
    Optional<MmsHomeRecommendSubject> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MmsHomeRecommendSubjectResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.BIGINT),
        @Result(column="subject_name", property="subjectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend_status", property="recommendStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<MmsHomeRecommendSubject> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mmsHomeRecommendSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mmsHomeRecommendSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(MmsHomeRecommendSubject record) {
        return MyBatis3Utils.insert(this::insert, record, mmsHomeRecommendSubject, c ->
            c.map(id).toProperty("id")
            .map(subjectId).toProperty("subjectId")
            .map(subjectName).toProperty("subjectName")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<MmsHomeRecommendSubject> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mmsHomeRecommendSubject, c ->
            c.map(id).toProperty("id")
            .map(subjectId).toProperty("subjectId")
            .map(subjectName).toProperty("subjectName")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(MmsHomeRecommendSubject record) {
        return MyBatis3Utils.insert(this::insert, record, mmsHomeRecommendSubject, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(subjectId).toPropertyWhenPresent("subjectId", record::getSubjectId)
            .map(subjectName).toPropertyWhenPresent("subjectName", record::getSubjectName)
            .map(recommendStatus).toPropertyWhenPresent("recommendStatus", record::getRecommendStatus)
            .map(sort).toPropertyWhenPresent("sort", record::getSort)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsHomeRecommendSubject> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mmsHomeRecommendSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsHomeRecommendSubject> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mmsHomeRecommendSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsHomeRecommendSubject> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mmsHomeRecommendSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsHomeRecommendSubject> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mmsHomeRecommendSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(MmsHomeRecommendSubject record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(subjectId).equalTo(record::getSubjectId)
                .set(subjectName).equalTo(record::getSubjectName)
                .set(recommendStatus).equalTo(record::getRecommendStatus)
                .set(sort).equalTo(record::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MmsHomeRecommendSubject record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(subjectId).equalToWhenPresent(record::getSubjectId)
                .set(subjectName).equalToWhenPresent(record::getSubjectName)
                .set(recommendStatus).equalToWhenPresent(record::getRecommendStatus)
                .set(sort).equalToWhenPresent(record::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(MmsHomeRecommendSubject record) {
        return update(c ->
            c.set(subjectId).equalTo(record::getSubjectId)
            .set(subjectName).equalTo(record::getSubjectName)
            .set(recommendStatus).equalTo(record::getRecommendStatus)
            .set(sort).equalTo(record::getSort)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(MmsHomeRecommendSubject record) {
        return update(c ->
            c.set(subjectId).equalToWhenPresent(record::getSubjectId)
            .set(subjectName).equalToWhenPresent(record::getSubjectName)
            .set(recommendStatus).equalToWhenPresent(record::getRecommendStatus)
            .set(sort).equalToWhenPresent(record::getSort)
            .where(id, isEqualTo(record::getId))
        );
    }
}