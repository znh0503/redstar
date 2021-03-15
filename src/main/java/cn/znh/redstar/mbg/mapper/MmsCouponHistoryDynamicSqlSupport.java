package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MmsCouponHistoryDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MmsCouponHistory mmsCouponHistory = new MmsCouponHistory();

    public static final SqlColumn<Long> id = mmsCouponHistory.id;

    public static final SqlColumn<Long> couponId = mmsCouponHistory.couponId;

    public static final SqlColumn<Long> memberId = mmsCouponHistory.memberId;

    public static final SqlColumn<Long> orderId = mmsCouponHistory.orderId;

    public static final SqlColumn<String> couponCode = mmsCouponHistory.couponCode;

    public static final SqlColumn<String> memberNickname = mmsCouponHistory.memberNickname;

    public static final SqlColumn<Integer> getType = mmsCouponHistory.getType;

    public static final SqlColumn<Date> createTime = mmsCouponHistory.createTime;

    public static final SqlColumn<Integer> useStatus = mmsCouponHistory.useStatus;

    public static final SqlColumn<Date> useTime = mmsCouponHistory.useTime;

    public static final SqlColumn<String> orderSn = mmsCouponHistory.orderSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MmsCouponHistory extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> couponId = column("coupon_id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);

        public final SqlColumn<String> couponCode = column("coupon_code", JDBCType.VARCHAR);

        public final SqlColumn<String> memberNickname = column("member_nickname", JDBCType.VARCHAR);

        public final SqlColumn<Integer> getType = column("get_type", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> useStatus = column("use_status", JDBCType.INTEGER);

        public final SqlColumn<Date> useTime = column("use_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> orderSn = column("order_sn", JDBCType.VARCHAR);

        public MmsCouponHistory() {
            super("mms_coupon_history");
        }
    }
}