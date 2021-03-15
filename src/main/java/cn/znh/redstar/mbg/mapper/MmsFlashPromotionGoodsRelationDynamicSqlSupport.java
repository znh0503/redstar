package cn.znh.redstar.mbg.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MmsFlashPromotionGoodsRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MmsFlashPromotionGoodsRelation mmsFlashPromotionGoodsRelation = new MmsFlashPromotionGoodsRelation();

    public static final SqlColumn<Long> id = mmsFlashPromotionGoodsRelation.id;

    public static final SqlColumn<Long> flashPromotionId = mmsFlashPromotionGoodsRelation.flashPromotionId;

    public static final SqlColumn<Long> flashPromotionSessionId = mmsFlashPromotionGoodsRelation.flashPromotionSessionId;

    public static final SqlColumn<Long> goodsId = mmsFlashPromotionGoodsRelation.goodsId;

    public static final SqlColumn<BigDecimal> flashPromotionPrice = mmsFlashPromotionGoodsRelation.flashPromotionPrice;

    public static final SqlColumn<Integer> flashPromotionCount = mmsFlashPromotionGoodsRelation.flashPromotionCount;

    public static final SqlColumn<Integer> flashPromotionLimit = mmsFlashPromotionGoodsRelation.flashPromotionLimit;

    public static final SqlColumn<Integer> sort = mmsFlashPromotionGoodsRelation.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MmsFlashPromotionGoodsRelation extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> flashPromotionId = column("flash_promotion_id", JDBCType.BIGINT);

        public final SqlColumn<Long> flashPromotionSessionId = column("flash_promotion_session_id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> flashPromotionPrice = column("flash_promotion_price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> flashPromotionCount = column("flash_promotion_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> flashPromotionLimit = column("flash_promotion_limit", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public MmsFlashPromotionGoodsRelation() {
            super("mms_flash_promotion_goods_relation");
        }
    }
}