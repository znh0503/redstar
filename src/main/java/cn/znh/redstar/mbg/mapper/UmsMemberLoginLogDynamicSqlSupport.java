package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsMemberLoginLogDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMemberLoginLog umsMemberLoginLog = new UmsMemberLoginLog();

    public static final SqlColumn<Long> id = umsMemberLoginLog.id;

    public static final SqlColumn<Long> memberId = umsMemberLoginLog.memberId;

    public static final SqlColumn<Date> createTime = umsMemberLoginLog.createTime;

    public static final SqlColumn<String> ip = umsMemberLoginLog.ip;

    public static final SqlColumn<String> city = umsMemberLoginLog.city;

    public static final SqlColumn<Integer> loginType = umsMemberLoginLog.loginType;

    public static final SqlColumn<String> province = umsMemberLoginLog.province;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMemberLoginLog extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> ip = column("ip", JDBCType.VARCHAR);

        public final SqlColumn<String> city = column("city", JDBCType.VARCHAR);

        public final SqlColumn<Integer> loginType = column("login_type", JDBCType.INTEGER);

        public final SqlColumn<String> province = column("province", JDBCType.VARCHAR);

        public UmsMemberLoginLog() {
            super("ums_member_login_log");
        }
    }
}