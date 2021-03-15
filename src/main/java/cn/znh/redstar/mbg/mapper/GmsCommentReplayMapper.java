package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.GmsCommentReplayDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.GmsCommentReplay;
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
public interface GmsCommentReplayMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, commentId, memberNickName, memberIcon, content, createTime, type);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GmsCommentReplay> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<GmsCommentReplay> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GmsCommentReplayResult")
    Optional<GmsCommentReplay> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GmsCommentReplayResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="comment_id", property="commentId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_nick_name", property="memberNickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="member_icon", property="memberIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER)
    })
    List<GmsCommentReplay> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, gmsCommentReplay, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, gmsCommentReplay, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(GmsCommentReplay record) {
        return MyBatis3Utils.insert(this::insert, record, gmsCommentReplay, c ->
            c.map(id).toProperty("id")
            .map(commentId).toProperty("commentId")
            .map(memberNickName).toProperty("memberNickName")
            .map(memberIcon).toProperty("memberIcon")
            .map(content).toProperty("content")
            .map(createTime).toProperty("createTime")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<GmsCommentReplay> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, gmsCommentReplay, c ->
            c.map(id).toProperty("id")
            .map(commentId).toProperty("commentId")
            .map(memberNickName).toProperty("memberNickName")
            .map(memberIcon).toProperty("memberIcon")
            .map(content).toProperty("content")
            .map(createTime).toProperty("createTime")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(GmsCommentReplay record) {
        return MyBatis3Utils.insert(this::insert, record, gmsCommentReplay, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(commentId).toPropertyWhenPresent("commentId", record::getCommentId)
            .map(memberNickName).toPropertyWhenPresent("memberNickName", record::getMemberNickName)
            .map(memberIcon).toPropertyWhenPresent("memberIcon", record::getMemberIcon)
            .map(content).toPropertyWhenPresent("content", record::getContent)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(type).toPropertyWhenPresent("type", record::getType)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsCommentReplay> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, gmsCommentReplay, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsCommentReplay> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, gmsCommentReplay, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsCommentReplay> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, gmsCommentReplay, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsCommentReplay> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, gmsCommentReplay, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(GmsCommentReplay record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(commentId).equalTo(record::getCommentId)
                .set(memberNickName).equalTo(record::getMemberNickName)
                .set(memberIcon).equalTo(record::getMemberIcon)
                .set(content).equalTo(record::getContent)
                .set(createTime).equalTo(record::getCreateTime)
                .set(type).equalTo(record::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GmsCommentReplay record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(commentId).equalToWhenPresent(record::getCommentId)
                .set(memberNickName).equalToWhenPresent(record::getMemberNickName)
                .set(memberIcon).equalToWhenPresent(record::getMemberIcon)
                .set(content).equalToWhenPresent(record::getContent)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(type).equalToWhenPresent(record::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(GmsCommentReplay record) {
        return update(c ->
            c.set(commentId).equalTo(record::getCommentId)
            .set(memberNickName).equalTo(record::getMemberNickName)
            .set(memberIcon).equalTo(record::getMemberIcon)
            .set(content).equalTo(record::getContent)
            .set(createTime).equalTo(record::getCreateTime)
            .set(type).equalTo(record::getType)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(GmsCommentReplay record) {
        return update(c ->
            c.set(commentId).equalToWhenPresent(record::getCommentId)
            .set(memberNickName).equalToWhenPresent(record::getMemberNickName)
            .set(memberIcon).equalToWhenPresent(record::getMemberIcon)
            .set(content).equalToWhenPresent(record::getContent)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(type).equalToWhenPresent(record::getType)
            .where(id, isEqualTo(record::getId))
        );
    }
}