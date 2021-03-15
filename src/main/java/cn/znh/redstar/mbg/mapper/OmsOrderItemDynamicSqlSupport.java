package cn.znh.redstar.mbg.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OmsOrderItemDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final OmsOrderItem omsOrderItem = new OmsOrderItem();

    public static final SqlColumn<Long> id = omsOrderItem.id;

    public static final SqlColumn<Long> orderId = omsOrderItem.orderId;

    public static final SqlColumn<String> orderSn = omsOrderItem.orderSn;

    public static final SqlColumn<Long> goodsId = omsOrderItem.goodsId;

    public static final SqlColumn<String> goodsPic = omsOrderItem.goodsPic;

    public static final SqlColumn<String> goodsName = omsOrderItem.goodsName;

    public static final SqlColumn<String> goodsBrand = omsOrderItem.goodsBrand;

    public static final SqlColumn<String> goodsSn = omsOrderItem.goodsSn;

    public static final SqlColumn<BigDecimal> goodsPrice = omsOrderItem.goodsPrice;

    public static final SqlColumn<Integer> goodsQuantity = omsOrderItem.goodsQuantity;

    public static final SqlColumn<Long> goodsSkuId = omsOrderItem.goodsSkuId;

    public static final SqlColumn<String> goodsSkuCode = omsOrderItem.goodsSkuCode;

    public static final SqlColumn<Long> goodsCategoryId = omsOrderItem.goodsCategoryId;

    public static final SqlColumn<String> sp1 = omsOrderItem.sp1;

    public static final SqlColumn<String> sp2 = omsOrderItem.sp2;

    public static final SqlColumn<String> sp3 = omsOrderItem.sp3;

    public static final SqlColumn<String> promotionName = omsOrderItem.promotionName;

    public static final SqlColumn<BigDecimal> promotionAmount = omsOrderItem.promotionAmount;

    public static final SqlColumn<BigDecimal> couponAmount = omsOrderItem.couponAmount;

    public static final SqlColumn<BigDecimal> integrationAmount = omsOrderItem.integrationAmount;

    public static final SqlColumn<BigDecimal> realAmount = omsOrderItem.realAmount;

    public static final SqlColumn<Integer> giftIntegration = omsOrderItem.giftIntegration;

    public static final SqlColumn<Integer> giftGrowth = omsOrderItem.giftGrowth;

    public static final SqlColumn<String> goodsAttr = omsOrderItem.goodsAttr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class OmsOrderItem extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);

        public final SqlColumn<String> orderSn = column("order_sn", JDBCType.VARCHAR);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<String> goodsPic = column("goods_pic", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsBrand = column("goods_brand", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsSn = column("goods_sn", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> goodsPrice = column("goods_price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> goodsQuantity = column("goods_quantity", JDBCType.INTEGER);

        public final SqlColumn<Long> goodsSkuId = column("goods_sku_id", JDBCType.BIGINT);

        public final SqlColumn<String> goodsSkuCode = column("goods_sku_code", JDBCType.VARCHAR);

        public final SqlColumn<Long> goodsCategoryId = column("goods_category_id", JDBCType.BIGINT);

        public final SqlColumn<String> sp1 = column("sp1", JDBCType.VARCHAR);

        public final SqlColumn<String> sp2 = column("sp2", JDBCType.VARCHAR);

        public final SqlColumn<String> sp3 = column("sp3", JDBCType.VARCHAR);

        public final SqlColumn<String> promotionName = column("promotion_name", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> promotionAmount = column("promotion_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> couponAmount = column("coupon_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> integrationAmount = column("integration_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> realAmount = column("real_amount", JDBCType.DECIMAL);

        public final SqlColumn<Integer> giftIntegration = column("gift_integration", JDBCType.INTEGER);

        public final SqlColumn<Integer> giftGrowth = column("gift_growth", JDBCType.INTEGER);

        public final SqlColumn<String> goodsAttr = column("goods_attr", JDBCType.VARCHAR);

        public OmsOrderItem() {
            super("oms_order_item");
        }
    }
}