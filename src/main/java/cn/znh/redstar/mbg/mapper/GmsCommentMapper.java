package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.GmsCommentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.GmsComment;
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
public interface GmsCommentMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, goodsId, memberNickName, goodsName, star, memberIp, createTime, showStatus, goodsAttribute, collectCouont, readCount, pics, memberIcon, replayCount, content);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GmsComment> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<GmsComment> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GmsCommentResult")
    Optional<GmsComment> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GmsCommentResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_nick_name", property="memberNickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="star", property="star", jdbcType=JdbcType.INTEGER),
        @Result(column="member_ip", property="memberIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="show_status", property="showStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_attribute", property="goodsAttribute", jdbcType=JdbcType.VARCHAR),
        @Result(column="collect_couont", property="collectCouont", jdbcType=JdbcType.INTEGER),
        @Result(column="read_count", property="readCount", jdbcType=JdbcType.INTEGER),
        @Result(column="pics", property="pics", jdbcType=JdbcType.VARCHAR),
        @Result(column="member_icon", property="memberIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="replay_count", property="replayCount", jdbcType=JdbcType.INTEGER),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<GmsComment> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, gmsComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, gmsComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(GmsComment record) {
        return MyBatis3Utils.insert(this::insert, record, gmsComment, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(memberNickName).toProperty("memberNickName")
            .map(goodsName).toProperty("goodsName")
            .map(star).toProperty("star")
            .map(memberIp).toProperty("memberIp")
            .map(createTime).toProperty("createTime")
            .map(showStatus).toProperty("showStatus")
            .map(goodsAttribute).toProperty("goodsAttribute")
            .map(collectCouont).toProperty("collectCouont")
            .map(readCount).toProperty("readCount")
            .map(pics).toProperty("pics")
            .map(memberIcon).toProperty("memberIcon")
            .map(replayCount).toProperty("replayCount")
            .map(content).toProperty("content")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<GmsComment> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, gmsComment, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(memberNickName).toProperty("memberNickName")
            .map(goodsName).toProperty("goodsName")
            .map(star).toProperty("star")
            .map(memberIp).toProperty("memberIp")
            .map(createTime).toProperty("createTime")
            .map(showStatus).toProperty("showStatus")
            .map(goodsAttribute).toProperty("goodsAttribute")
            .map(collectCouont).toProperty("collectCouont")
            .map(readCount).toProperty("readCount")
            .map(pics).toProperty("pics")
            .map(memberIcon).toProperty("memberIcon")
            .map(replayCount).toProperty("replayCount")
            .map(content).toProperty("content")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(GmsComment record) {
        return MyBatis3Utils.insert(this::insert, record, gmsComment, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(goodsId).toPropertyWhenPresent("goodsId", record::getGoodsId)
            .map(memberNickName).toPropertyWhenPresent("memberNickName", record::getMemberNickName)
            .map(goodsName).toPropertyWhenPresent("goodsName", record::getGoodsName)
            .map(star).toPropertyWhenPresent("star", record::getStar)
            .map(memberIp).toPropertyWhenPresent("memberIp", record::getMemberIp)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(showStatus).toPropertyWhenPresent("showStatus", record::getShowStatus)
            .map(goodsAttribute).toPropertyWhenPresent("goodsAttribute", record::getGoodsAttribute)
            .map(collectCouont).toPropertyWhenPresent("collectCouont", record::getCollectCouont)
            .map(readCount).toPropertyWhenPresent("readCount", record::getReadCount)
            .map(pics).toPropertyWhenPresent("pics", record::getPics)
            .map(memberIcon).toPropertyWhenPresent("memberIcon", record::getMemberIcon)
            .map(replayCount).toPropertyWhenPresent("replayCount", record::getReplayCount)
            .map(content).toPropertyWhenPresent("content", record::getContent)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsComment> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, gmsComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsComment> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, gmsComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsComment> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, gmsComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsComment> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, gmsComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(GmsComment record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(goodsId).equalTo(record::getGoodsId)
                .set(memberNickName).equalTo(record::getMemberNickName)
                .set(goodsName).equalTo(record::getGoodsName)
                .set(star).equalTo(record::getStar)
                .set(memberIp).equalTo(record::getMemberIp)
                .set(createTime).equalTo(record::getCreateTime)
                .set(showStatus).equalTo(record::getShowStatus)
                .set(goodsAttribute).equalTo(record::getGoodsAttribute)
                .set(collectCouont).equalTo(record::getCollectCouont)
                .set(readCount).equalTo(record::getReadCount)
                .set(pics).equalTo(record::getPics)
                .set(memberIcon).equalTo(record::getMemberIcon)
                .set(replayCount).equalTo(record::getReplayCount)
                .set(content).equalTo(record::getContent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GmsComment record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(goodsId).equalToWhenPresent(record::getGoodsId)
                .set(memberNickName).equalToWhenPresent(record::getMemberNickName)
                .set(goodsName).equalToWhenPresent(record::getGoodsName)
                .set(star).equalToWhenPresent(record::getStar)
                .set(memberIp).equalToWhenPresent(record::getMemberIp)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(showStatus).equalToWhenPresent(record::getShowStatus)
                .set(goodsAttribute).equalToWhenPresent(record::getGoodsAttribute)
                .set(collectCouont).equalToWhenPresent(record::getCollectCouont)
                .set(readCount).equalToWhenPresent(record::getReadCount)
                .set(pics).equalToWhenPresent(record::getPics)
                .set(memberIcon).equalToWhenPresent(record::getMemberIcon)
                .set(replayCount).equalToWhenPresent(record::getReplayCount)
                .set(content).equalToWhenPresent(record::getContent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(GmsComment record) {
        return update(c ->
            c.set(goodsId).equalTo(record::getGoodsId)
            .set(memberNickName).equalTo(record::getMemberNickName)
            .set(goodsName).equalTo(record::getGoodsName)
            .set(star).equalTo(record::getStar)
            .set(memberIp).equalTo(record::getMemberIp)
            .set(createTime).equalTo(record::getCreateTime)
            .set(showStatus).equalTo(record::getShowStatus)
            .set(goodsAttribute).equalTo(record::getGoodsAttribute)
            .set(collectCouont).equalTo(record::getCollectCouont)
            .set(readCount).equalTo(record::getReadCount)
            .set(pics).equalTo(record::getPics)
            .set(memberIcon).equalTo(record::getMemberIcon)
            .set(replayCount).equalTo(record::getReplayCount)
            .set(content).equalTo(record::getContent)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(GmsComment record) {
        return update(c ->
            c.set(goodsId).equalToWhenPresent(record::getGoodsId)
            .set(memberNickName).equalToWhenPresent(record::getMemberNickName)
            .set(goodsName).equalToWhenPresent(record::getGoodsName)
            .set(star).equalToWhenPresent(record::getStar)
            .set(memberIp).equalToWhenPresent(record::getMemberIp)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(showStatus).equalToWhenPresent(record::getShowStatus)
            .set(goodsAttribute).equalToWhenPresent(record::getGoodsAttribute)
            .set(collectCouont).equalToWhenPresent(record::getCollectCouont)
            .set(readCount).equalToWhenPresent(record::getReadCount)
            .set(pics).equalToWhenPresent(record::getPics)
            .set(memberIcon).equalToWhenPresent(record::getMemberIcon)
            .set(replayCount).equalToWhenPresent(record::getReplayCount)
            .set(content).equalToWhenPresent(record::getContent)
            .where(id, isEqualTo(record::getId))
        );
    }
}