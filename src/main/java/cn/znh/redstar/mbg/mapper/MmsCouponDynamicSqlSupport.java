package cn.znh.redstar.mbg.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MmsCouponDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MmsCoupon mmsCoupon = new MmsCoupon();

    public static final SqlColumn<Long> id = mmsCoupon.id;

    public static final SqlColumn<Integer> type = mmsCoupon.type;

    public static final SqlColumn<String> name = mmsCoupon.name;

    public static final SqlColumn<Integer> platform = mmsCoupon.platform;

    public static final SqlColumn<Integer> count = mmsCoupon.count;

    public static final SqlColumn<BigDecimal> amount = mmsCoupon.amount;

    public static final SqlColumn<Integer> perLimit = mmsCoupon.perLimit;

    public static final SqlColumn<BigDecimal> minPoint = mmsCoupon.minPoint;

    public static final SqlColumn<Date> startTime = mmsCoupon.startTime;

    public static final SqlColumn<Date> endTime = mmsCoupon.endTime;

    public static final SqlColumn<Integer> useType = mmsCoupon.useType;

    public static final SqlColumn<String> note = mmsCoupon.note;

    public static final SqlColumn<Integer> publishCount = mmsCoupon.publishCount;

    public static final SqlColumn<Integer> useCount = mmsCoupon.useCount;

    public static final SqlColumn<Integer> receiveCount = mmsCoupon.receiveCount;

    public static final SqlColumn<Date> enableTime = mmsCoupon.enableTime;

    public static final SqlColumn<String> code = mmsCoupon.code;

    public static final SqlColumn<Integer> memberLevel = mmsCoupon.memberLevel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MmsCoupon extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> platform = column("platform", JDBCType.INTEGER);

        public final SqlColumn<Integer> count = column("count", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> amount = column("amount", JDBCType.DECIMAL);

        public final SqlColumn<Integer> perLimit = column("per_limit", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> minPoint = column("min_point", JDBCType.DECIMAL);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endTime = column("end_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> useType = column("use_type", JDBCType.INTEGER);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> publishCount = column("publish_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> useCount = column("use_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> receiveCount = column("receive_count", JDBCType.INTEGER);

        public final SqlColumn<Date> enableTime = column("enable_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);

        public final SqlColumn<Integer> memberLevel = column("member_level", JDBCType.INTEGER);

        public MmsCoupon() {
            super("mms_coupon");
        }
    }
}