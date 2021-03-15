package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MmsFlashPromotionSessionDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MmsFlashPromotionSession mmsFlashPromotionSession = new MmsFlashPromotionSession();

    public static final SqlColumn<Long> id = mmsFlashPromotionSession.id;

    public static final SqlColumn<String> name = mmsFlashPromotionSession.name;

    public static final SqlColumn<Date> startTime = mmsFlashPromotionSession.startTime;

    public static final SqlColumn<Date> endTime = mmsFlashPromotionSession.endTime;

    public static final SqlColumn<Integer> status = mmsFlashPromotionSession.status;

    public static final SqlColumn<Date> createTime = mmsFlashPromotionSession.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MmsFlashPromotionSession extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIME);

        public final SqlColumn<Date> endTime = column("end_time", JDBCType.TIME);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public MmsFlashPromotionSession() {
            super("mms_flash_promotion_session");
        }
    }
}