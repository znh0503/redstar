package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MmsCouponGoodsRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MmsCouponGoodsRelation mmsCouponGoodsRelation = new MmsCouponGoodsRelation();

    public static final SqlColumn<Long> id = mmsCouponGoodsRelation.id;

    public static final SqlColumn<Long> couponId = mmsCouponGoodsRelation.couponId;

    public static final SqlColumn<Long> goodsId = mmsCouponGoodsRelation.goodsId;

    public static final SqlColumn<String> goodsName = mmsCouponGoodsRelation.goodsName;

    public static final SqlColumn<String> goodsSn = mmsCouponGoodsRelation.goodsSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MmsCouponGoodsRelation extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> couponId = column("coupon_id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsSn = column("goods_sn", JDBCType.VARCHAR);

        public MmsCouponGoodsRelation() {
            super("mms_coupon_goods_relation");
        }
    }
}