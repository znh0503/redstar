package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.UmsMemberStatisticsInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.UmsMemberStatisticsInfo;
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
public interface UmsMemberStatisticsInfoMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberId, consumeAmount, orderCount, couponCount, commentCount, returnOrderCount, loginCount, attendCount, fansCount, collectGoodsCount, collectSubjectCount, collectTopicCount, collectCommentCount, inviteFriendCount, recentOrderTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UmsMemberStatisticsInfo> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UmsMemberStatisticsInfo> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMemberStatisticsInfoResult")
    Optional<UmsMemberStatisticsInfo> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMemberStatisticsInfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="consume_amount", property="consumeAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_count", property="orderCount", jdbcType=JdbcType.INTEGER),
        @Result(column="coupon_count", property="couponCount", jdbcType=JdbcType.INTEGER),
        @Result(column="comment_count", property="commentCount", jdbcType=JdbcType.INTEGER),
        @Result(column="return_order_count", property="returnOrderCount", jdbcType=JdbcType.INTEGER),
        @Result(column="login_count", property="loginCount", jdbcType=JdbcType.INTEGER),
        @Result(column="attend_count", property="attendCount", jdbcType=JdbcType.INTEGER),
        @Result(column="fans_count", property="fansCount", jdbcType=JdbcType.INTEGER),
        @Result(column="collect_goods_count", property="collectGoodsCount", jdbcType=JdbcType.INTEGER),
        @Result(column="collect_subject_count", property="collectSubjectCount", jdbcType=JdbcType.INTEGER),
        @Result(column="collect_topic_count", property="collectTopicCount", jdbcType=JdbcType.INTEGER),
        @Result(column="collect_comment_count", property="collectCommentCount", jdbcType=JdbcType.INTEGER),
        @Result(column="invite_friend_count", property="inviteFriendCount", jdbcType=JdbcType.INTEGER),
        @Result(column="recent_order_time", property="recentOrderTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UmsMemberStatisticsInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsMemberStatisticsInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsMemberStatisticsInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsMemberStatisticsInfo record) {
        return MyBatis3Utils.insert(this::insert, record, umsMemberStatisticsInfo, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(consumeAmount).toProperty("consumeAmount")
            .map(orderCount).toProperty("orderCount")
            .map(couponCount).toProperty("couponCount")
            .map(commentCount).toProperty("commentCount")
            .map(returnOrderCount).toProperty("returnOrderCount")
            .map(loginCount).toProperty("loginCount")
            .map(attendCount).toProperty("attendCount")
            .map(fansCount).toProperty("fansCount")
            .map(collectGoodsCount).toProperty("collectGoodsCount")
            .map(collectSubjectCount).toProperty("collectSubjectCount")
            .map(collectTopicCount).toProperty("collectTopicCount")
            .map(collectCommentCount).toProperty("collectCommentCount")
            .map(inviteFriendCount).toProperty("inviteFriendCount")
            .map(recentOrderTime).toProperty("recentOrderTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsMemberStatisticsInfo> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsMemberStatisticsInfo, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(consumeAmount).toProperty("consumeAmount")
            .map(orderCount).toProperty("orderCount")
            .map(couponCount).toProperty("couponCount")
            .map(commentCount).toProperty("commentCount")
            .map(returnOrderCount).toProperty("returnOrderCount")
            .map(loginCount).toProperty("loginCount")
            .map(attendCount).toProperty("attendCount")
            .map(fansCount).toProperty("fansCount")
            .map(collectGoodsCount).toProperty("collectGoodsCount")
            .map(collectSubjectCount).toProperty("collectSubjectCount")
            .map(collectTopicCount).toProperty("collectTopicCount")
            .map(collectCommentCount).toProperty("collectCommentCount")
            .map(inviteFriendCount).toProperty("inviteFriendCount")
            .map(recentOrderTime).toProperty("recentOrderTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsMemberStatisticsInfo record) {
        return MyBatis3Utils.insert(this::insert, record, umsMemberStatisticsInfo, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(memberId).toPropertyWhenPresent("memberId", record::getMemberId)
            .map(consumeAmount).toPropertyWhenPresent("consumeAmount", record::getConsumeAmount)
            .map(orderCount).toPropertyWhenPresent("orderCount", record::getOrderCount)
            .map(couponCount).toPropertyWhenPresent("couponCount", record::getCouponCount)
            .map(commentCount).toPropertyWhenPresent("commentCount", record::getCommentCount)
            .map(returnOrderCount).toPropertyWhenPresent("returnOrderCount", record::getReturnOrderCount)
            .map(loginCount).toPropertyWhenPresent("loginCount", record::getLoginCount)
            .map(attendCount).toPropertyWhenPresent("attendCount", record::getAttendCount)
            .map(fansCount).toPropertyWhenPresent("fansCount", record::getFansCount)
            .map(collectGoodsCount).toPropertyWhenPresent("collectGoodsCount", record::getCollectGoodsCount)
            .map(collectSubjectCount).toPropertyWhenPresent("collectSubjectCount", record::getCollectSubjectCount)
            .map(collectTopicCount).toPropertyWhenPresent("collectTopicCount", record::getCollectTopicCount)
            .map(collectCommentCount).toPropertyWhenPresent("collectCommentCount", record::getCollectCommentCount)
            .map(inviteFriendCount).toPropertyWhenPresent("inviteFriendCount", record::getInviteFriendCount)
            .map(recentOrderTime).toPropertyWhenPresent("recentOrderTime", record::getRecentOrderTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberStatisticsInfo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsMemberStatisticsInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberStatisticsInfo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsMemberStatisticsInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberStatisticsInfo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsMemberStatisticsInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberStatisticsInfo> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsMemberStatisticsInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsMemberStatisticsInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(memberId).equalTo(record::getMemberId)
                .set(consumeAmount).equalTo(record::getConsumeAmount)
                .set(orderCount).equalTo(record::getOrderCount)
                .set(couponCount).equalTo(record::getCouponCount)
                .set(commentCount).equalTo(record::getCommentCount)
                .set(returnOrderCount).equalTo(record::getReturnOrderCount)
                .set(loginCount).equalTo(record::getLoginCount)
                .set(attendCount).equalTo(record::getAttendCount)
                .set(fansCount).equalTo(record::getFansCount)
                .set(collectGoodsCount).equalTo(record::getCollectGoodsCount)
                .set(collectSubjectCount).equalTo(record::getCollectSubjectCount)
                .set(collectTopicCount).equalTo(record::getCollectTopicCount)
                .set(collectCommentCount).equalTo(record::getCollectCommentCount)
                .set(inviteFriendCount).equalTo(record::getInviteFriendCount)
                .set(recentOrderTime).equalTo(record::getRecentOrderTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsMemberStatisticsInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(memberId).equalToWhenPresent(record::getMemberId)
                .set(consumeAmount).equalToWhenPresent(record::getConsumeAmount)
                .set(orderCount).equalToWhenPresent(record::getOrderCount)
                .set(couponCount).equalToWhenPresent(record::getCouponCount)
                .set(commentCount).equalToWhenPresent(record::getCommentCount)
                .set(returnOrderCount).equalToWhenPresent(record::getReturnOrderCount)
                .set(loginCount).equalToWhenPresent(record::getLoginCount)
                .set(attendCount).equalToWhenPresent(record::getAttendCount)
                .set(fansCount).equalToWhenPresent(record::getFansCount)
                .set(collectGoodsCount).equalToWhenPresent(record::getCollectGoodsCount)
                .set(collectSubjectCount).equalToWhenPresent(record::getCollectSubjectCount)
                .set(collectTopicCount).equalToWhenPresent(record::getCollectTopicCount)
                .set(collectCommentCount).equalToWhenPresent(record::getCollectCommentCount)
                .set(inviteFriendCount).equalToWhenPresent(record::getInviteFriendCount)
                .set(recentOrderTime).equalToWhenPresent(record::getRecentOrderTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsMemberStatisticsInfo record) {
        return update(c ->
            c.set(memberId).equalTo(record::getMemberId)
            .set(consumeAmount).equalTo(record::getConsumeAmount)
            .set(orderCount).equalTo(record::getOrderCount)
            .set(couponCount).equalTo(record::getCouponCount)
            .set(commentCount).equalTo(record::getCommentCount)
            .set(returnOrderCount).equalTo(record::getReturnOrderCount)
            .set(loginCount).equalTo(record::getLoginCount)
            .set(attendCount).equalTo(record::getAttendCount)
            .set(fansCount).equalTo(record::getFansCount)
            .set(collectGoodsCount).equalTo(record::getCollectGoodsCount)
            .set(collectSubjectCount).equalTo(record::getCollectSubjectCount)
            .set(collectTopicCount).equalTo(record::getCollectTopicCount)
            .set(collectCommentCount).equalTo(record::getCollectCommentCount)
            .set(inviteFriendCount).equalTo(record::getInviteFriendCount)
            .set(recentOrderTime).equalTo(record::getRecentOrderTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record) {
        return update(c ->
            c.set(memberId).equalToWhenPresent(record::getMemberId)
            .set(consumeAmount).equalToWhenPresent(record::getConsumeAmount)
            .set(orderCount).equalToWhenPresent(record::getOrderCount)
            .set(couponCount).equalToWhenPresent(record::getCouponCount)
            .set(commentCount).equalToWhenPresent(record::getCommentCount)
            .set(returnOrderCount).equalToWhenPresent(record::getReturnOrderCount)
            .set(loginCount).equalToWhenPresent(record::getLoginCount)
            .set(attendCount).equalToWhenPresent(record::getAttendCount)
            .set(fansCount).equalToWhenPresent(record::getFansCount)
            .set(collectGoodsCount).equalToWhenPresent(record::getCollectGoodsCount)
            .set(collectSubjectCount).equalToWhenPresent(record::getCollectSubjectCount)
            .set(collectTopicCount).equalToWhenPresent(record::getCollectTopicCount)
            .set(collectCommentCount).equalToWhenPresent(record::getCollectCommentCount)
            .set(inviteFriendCount).equalToWhenPresent(record::getInviteFriendCount)
            .set(recentOrderTime).equalToWhenPresent(record::getRecentOrderTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}