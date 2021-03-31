package cn.znh.redstar.mbg.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsMemberStatisticsInfoDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMemberStatisticsInfo umsMemberStatisticsInfo = new UmsMemberStatisticsInfo();

    public static final SqlColumn<Long> id = umsMemberStatisticsInfo.id;

    public static final SqlColumn<Long> memberId = umsMemberStatisticsInfo.memberId;

    public static final SqlColumn<BigDecimal> consumeAmount = umsMemberStatisticsInfo.consumeAmount;

    public static final SqlColumn<Integer> orderCount = umsMemberStatisticsInfo.orderCount;

    public static final SqlColumn<Integer> couponCount = umsMemberStatisticsInfo.couponCount;

    public static final SqlColumn<Integer> commentCount = umsMemberStatisticsInfo.commentCount;

    public static final SqlColumn<Integer> returnOrderCount = umsMemberStatisticsInfo.returnOrderCount;

    public static final SqlColumn<Integer> loginCount = umsMemberStatisticsInfo.loginCount;

    public static final SqlColumn<Integer> attendCount = umsMemberStatisticsInfo.attendCount;

    public static final SqlColumn<Integer> fansCount = umsMemberStatisticsInfo.fansCount;

    public static final SqlColumn<Integer> collectGoodsCount = umsMemberStatisticsInfo.collectGoodsCount;

    public static final SqlColumn<Integer> collectSubjectCount = umsMemberStatisticsInfo.collectSubjectCount;

    public static final SqlColumn<Integer> collectTopicCount = umsMemberStatisticsInfo.collectTopicCount;

    public static final SqlColumn<Integer> collectCommentCount = umsMemberStatisticsInfo.collectCommentCount;

    public static final SqlColumn<Integer> inviteFriendCount = umsMemberStatisticsInfo.inviteFriendCount;

    public static final SqlColumn<Date> recentOrderTime = umsMemberStatisticsInfo.recentOrderTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMemberStatisticsInfo extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> consumeAmount = column("consume_amount", JDBCType.DECIMAL);

        public final SqlColumn<Integer> orderCount = column("order_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> couponCount = column("coupon_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> commentCount = column("comment_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> returnOrderCount = column("return_order_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> loginCount = column("login_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> attendCount = column("attend_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> fansCount = column("fans_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> collectGoodsCount = column("collect_goods_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> collectSubjectCount = column("collect_subject_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> collectTopicCount = column("collect_topic_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> collectCommentCount = column("collect_comment_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> inviteFriendCount = column("invite_friend_count", JDBCType.INTEGER);

        public final SqlColumn<Date> recentOrderTime = column("recent_order_time", JDBCType.TIMESTAMP);

        public UmsMemberStatisticsInfo() {
            super("ums_member_statistics_info");
        }
    }
}