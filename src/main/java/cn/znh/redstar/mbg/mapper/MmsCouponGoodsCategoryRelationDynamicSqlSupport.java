package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MmsCouponGoodsCategoryRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MmsCouponGoodsCategoryRelation mmsCouponGoodsCategoryRelation = new MmsCouponGoodsCategoryRelation();

    public static final SqlColumn<Long> id = mmsCouponGoodsCategoryRelation.id;

    public static final SqlColumn<Long> couponId = mmsCouponGoodsCategoryRelation.couponId;

    public static final SqlColumn<Long> goodsCategoryId = mmsCouponGoodsCategoryRelation.goodsCategoryId;

    public static final SqlColumn<String> goodsCategoryName = mmsCouponGoodsCategoryRelation.goodsCategoryName;

    public static final SqlColumn<String> parentCategoryName = mmsCouponGoodsCategoryRelation.parentCategoryName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MmsCouponGoodsCategoryRelation extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> couponId = column("coupon_id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsCategoryId = column("goods_category_id", JDBCType.BIGINT);

        public final SqlColumn<String> goodsCategoryName = column("goods_category_name", JDBCType.VARCHAR);

        public final SqlColumn<String> parentCategoryName = column("parent_category_name", JDBCType.VARCHAR);

        public MmsCouponGoodsCategoryRelation() {
            super("mms_coupon_goods_category_relation");
        }
    }
}