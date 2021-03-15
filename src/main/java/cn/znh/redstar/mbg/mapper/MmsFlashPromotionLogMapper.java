package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.MmsFlashPromotionLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.MmsFlashPromotionLog;
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
public interface MmsFlashPromotionLogMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberId, goodsId, memberPhone, goodsName, subscribeTime, sendTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MmsFlashPromotionLog> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MmsFlashPromotionLog> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MmsFlashPromotionLogResult")
    Optional<MmsFlashPromotionLog> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MmsFlashPromotionLogResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_phone", property="memberPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="subscribe_time", property="subscribeTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="send_time", property="sendTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MmsFlashPromotionLog> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mmsFlashPromotionLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mmsFlashPromotionLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(MmsFlashPromotionLog record) {
        return MyBatis3Utils.insert(this::insert, record, mmsFlashPromotionLog, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(goodsId).toProperty("goodsId")
            .map(memberPhone).toProperty("memberPhone")
            .map(goodsName).toProperty("goodsName")
            .map(subscribeTime).toProperty("subscribeTime")
            .map(sendTime).toProperty("sendTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<MmsFlashPromotionLog> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mmsFlashPromotionLog, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(goodsId).toProperty("goodsId")
            .map(memberPhone).toProperty("memberPhone")
            .map(goodsName).toProperty("goodsName")
            .map(subscribeTime).toProperty("subscribeTime")
            .map(sendTime).toProperty("sendTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(MmsFlashPromotionLog record) {
        return MyBatis3Utils.insert(this::insert, record, mmsFlashPromotionLog, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(memberId).toPropertyWhenPresent("memberId", record::getMemberId)
            .map(goodsId).toPropertyWhenPresent("goodsId", record::getGoodsId)
            .map(memberPhone).toPropertyWhenPresent("memberPhone", record::getMemberPhone)
            .map(goodsName).toPropertyWhenPresent("goodsName", record::getGoodsName)
            .map(subscribeTime).toPropertyWhenPresent("subscribeTime", record::getSubscribeTime)
            .map(sendTime).toPropertyWhenPresent("sendTime", record::getSendTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsFlashPromotionLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mmsFlashPromotionLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsFlashPromotionLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mmsFlashPromotionLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MmsFlashPromotionLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mmsFlashPromotionLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MmsFlashPromotionLog> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mmsFlashPromotionLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(MmsFlashPromotionLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(memberId).equalTo(record::getMemberId)
                .set(goodsId).equalTo(record::getGoodsId)
                .set(memberPhone).equalTo(record::getMemberPhone)
                .set(goodsName).equalTo(record::getGoodsName)
                .set(subscribeTime).equalTo(record::getSubscribeTime)
                .set(sendTime).equalTo(record::getSendTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MmsFlashPromotionLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(memberId).equalToWhenPresent(record::getMemberId)
                .set(goodsId).equalToWhenPresent(record::getGoodsId)
                .set(memberPhone).equalToWhenPresent(record::getMemberPhone)
                .set(goodsName).equalToWhenPresent(record::getGoodsName)
                .set(subscribeTime).equalToWhenPresent(record::getSubscribeTime)
                .set(sendTime).equalToWhenPresent(record::getSendTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(MmsFlashPromotionLog record) {
        return update(c ->
            c.set(memberId).equalTo(record::getMemberId)
            .set(goodsId).equalTo(record::getGoodsId)
            .set(memberPhone).equalTo(record::getMemberPhone)
            .set(goodsName).equalTo(record::getGoodsName)
            .set(subscribeTime).equalTo(record::getSubscribeTime)
            .set(sendTime).equalTo(record::getSendTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(MmsFlashPromotionLog record) {
        return update(c ->
            c.set(memberId).equalToWhenPresent(record::getMemberId)
            .set(goodsId).equalToWhenPresent(record::getGoodsId)
            .set(memberPhone).equalToWhenPresent(record::getMemberPhone)
            .set(goodsName).equalToWhenPresent(record::getGoodsName)
            .set(subscribeTime).equalToWhenPresent(record::getSubscribeTime)
            .set(sendTime).equalToWhenPresent(record::getSendTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}