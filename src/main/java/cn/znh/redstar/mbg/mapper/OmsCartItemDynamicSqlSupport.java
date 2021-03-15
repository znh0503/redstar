package cn.znh.redstar.mbg.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OmsCartItemDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final OmsCartItem omsCartItem = new OmsCartItem();

    public static final SqlColumn<Long> id = omsCartItem.id;

    public static final SqlColumn<Long> goodsId = omsCartItem.goodsId;

    public static final SqlColumn<Long> goodsSkuId = omsCartItem.goodsSkuId;

    public static final SqlColumn<Long> memberId = omsCartItem.memberId;

    public static final SqlColumn<Integer> quantity = omsCartItem.quantity;

    public static final SqlColumn<BigDecimal> price = omsCartItem.price;

    public static final SqlColumn<String> sp1 = omsCartItem.sp1;

    public static final SqlColumn<String> sp2 = omsCartItem.sp2;

    public static final SqlColumn<String> sp3 = omsCartItem.sp3;

    public static final SqlColumn<String> goodsPic = omsCartItem.goodsPic;

    public static final SqlColumn<String> goodsName = omsCartItem.goodsName;

    public static final SqlColumn<String> goodsBrand = omsCartItem.goodsBrand;

    public static final SqlColumn<String> goodsSn = omsCartItem.goodsSn;

    public static final SqlColumn<String> goodsSubTitle = omsCartItem.goodsSubTitle;

    public static final SqlColumn<String> goodsSkuCode = omsCartItem.goodsSkuCode;

    public static final SqlColumn<String> memberNickname = omsCartItem.memberNickname;

    public static final SqlColumn<Date> createDate = omsCartItem.createDate;

    public static final SqlColumn<Date> modifyDate = omsCartItem.modifyDate;

    public static final SqlColumn<Integer> deleteStatus = omsCartItem.deleteStatus;

    public static final SqlColumn<Long> goodsCategoryId = omsCartItem.goodsCategoryId;

    public static final SqlColumn<String> goodsAttr = omsCartItem.goodsAttr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class OmsCartItem extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsSkuId = column("goods_sku_id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> quantity = column("quantity", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public final SqlColumn<String> sp1 = column("sp1", JDBCType.VARCHAR);

        public final SqlColumn<String> sp2 = column("sp2", JDBCType.VARCHAR);

        public final SqlColumn<String> sp3 = column("sp3", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsPic = column("goods_pic", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsBrand = column("goods_brand", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsSn = column("goods_sn", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsSubTitle = column("goods_sub_title", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsSkuCode = column("goods_sku_code", JDBCType.VARCHAR);

        public final SqlColumn<String> memberNickname = column("member_nickname", JDBCType.VARCHAR);

        public final SqlColumn<Date> createDate = column("create_date", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyDate = column("modify_date", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> deleteStatus = column("delete_status", JDBCType.INTEGER);

        public final SqlColumn<Long> goodsCategoryId = column("goods_category_id", JDBCType.BIGINT);

        public final SqlColumn<String> goodsAttr = column("goods_attr", JDBCType.VARCHAR);

        public OmsCartItem() {
            super("oms_cart_item");
        }
    }
}