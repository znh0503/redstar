package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MmsHomeAdvertiseDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MmsHomeAdvertise mmsHomeAdvertise = new MmsHomeAdvertise();

    public static final SqlColumn<Long> id = mmsHomeAdvertise.id;

    public static final SqlColumn<String> name = mmsHomeAdvertise.name;

    public static final SqlColumn<Integer> type = mmsHomeAdvertise.type;

    public static final SqlColumn<String> pic = mmsHomeAdvertise.pic;

    public static final SqlColumn<Date> startTime = mmsHomeAdvertise.startTime;

    public static final SqlColumn<Date> endTime = mmsHomeAdvertise.endTime;

    public static final SqlColumn<Integer> status = mmsHomeAdvertise.status;

    public static final SqlColumn<Integer> clickCount = mmsHomeAdvertise.clickCount;

    public static final SqlColumn<Integer> orderCount = mmsHomeAdvertise.orderCount;

    public static final SqlColumn<String> url = mmsHomeAdvertise.url;

    public static final SqlColumn<String> note = mmsHomeAdvertise.note;

    public static final SqlColumn<Integer> sort = mmsHomeAdvertise.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MmsHomeAdvertise extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<String> pic = column("pic", JDBCType.VARCHAR);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endTime = column("end_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Integer> clickCount = column("click_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> orderCount = column("order_count", JDBCType.INTEGER);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public MmsHomeAdvertise() {
            super("mms_home_advertise");
        }
    }
}