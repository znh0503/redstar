package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MmsFlashPromotionLogDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MmsFlashPromotionLog mmsFlashPromotionLog = new MmsFlashPromotionLog();

    public static final SqlColumn<Integer> id = mmsFlashPromotionLog.id;

    public static final SqlColumn<Integer> memberId = mmsFlashPromotionLog.memberId;

    public static final SqlColumn<Long> goodsId = mmsFlashPromotionLog.goodsId;

    public static final SqlColumn<String> memberPhone = mmsFlashPromotionLog.memberPhone;

    public static final SqlColumn<String> goodsName = mmsFlashPromotionLog.goodsName;

    public static final SqlColumn<Date> subscribeTime = mmsFlashPromotionLog.subscribeTime;

    public static final SqlColumn<Date> sendTime = mmsFlashPromotionLog.sendTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MmsFlashPromotionLog extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> memberId = column("member_id", JDBCType.INTEGER);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<String> memberPhone = column("member_phone", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> subscribeTime = column("subscribe_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> sendTime = column("send_time", JDBCType.TIMESTAMP);

        public MmsFlashPromotionLog() {
            super("mms_flash_promotion_log");
        }
    }
}