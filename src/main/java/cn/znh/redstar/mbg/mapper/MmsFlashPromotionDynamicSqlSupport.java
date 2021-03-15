package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MmsFlashPromotionDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MmsFlashPromotion mmsFlashPromotion = new MmsFlashPromotion();

    public static final SqlColumn<Long> id = mmsFlashPromotion.id;

    public static final SqlColumn<String> title = mmsFlashPromotion.title;

    public static final SqlColumn<Date> startDate = mmsFlashPromotion.startDate;

    public static final SqlColumn<Date> endDate = mmsFlashPromotion.endDate;

    public static final SqlColumn<Integer> status = mmsFlashPromotion.status;

    public static final SqlColumn<Date> createTime = mmsFlashPromotion.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MmsFlashPromotion extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public final SqlColumn<Date> startDate = column("start_date", JDBCType.DATE);

        public final SqlColumn<Date> endDate = column("end_date", JDBCType.DATE);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public MmsFlashPromotion() {
            super("mms_flash_promotion");
        }
    }
}