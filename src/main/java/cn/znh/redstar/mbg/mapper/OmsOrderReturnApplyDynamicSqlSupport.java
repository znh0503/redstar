package cn.znh.redstar.mbg.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OmsOrderReturnApplyDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final OmsOrderReturnApply omsOrderReturnApply = new OmsOrderReturnApply();

    public static final SqlColumn<Long> id = omsOrderReturnApply.id;

    public static final SqlColumn<Long> orderId = omsOrderReturnApply.orderId;

    public static final SqlColumn<Long> companyAddressId = omsOrderReturnApply.companyAddressId;

    public static final SqlColumn<Long> goodsId = omsOrderReturnApply.goodsId;

    public static final SqlColumn<String> orderSn = omsOrderReturnApply.orderSn;

    public static final SqlColumn<Date> createTime = omsOrderReturnApply.createTime;

    public static final SqlColumn<String> memberUsername = omsOrderReturnApply.memberUsername;

    public static final SqlColumn<BigDecimal> returnAmount = omsOrderReturnApply.returnAmount;

    public static final SqlColumn<String> returnName = omsOrderReturnApply.returnName;

    public static final SqlColumn<String> returnPhone = omsOrderReturnApply.returnPhone;

    public static final SqlColumn<Integer> status = omsOrderReturnApply.status;

    public static final SqlColumn<Date> handleTime = omsOrderReturnApply.handleTime;

    public static final SqlColumn<String> goodsPic = omsOrderReturnApply.goodsPic;

    public static final SqlColumn<String> goodsName = omsOrderReturnApply.goodsName;

    public static final SqlColumn<String> goodsBrand = omsOrderReturnApply.goodsBrand;

    public static final SqlColumn<String> goodsAttr = omsOrderReturnApply.goodsAttr;

    public static final SqlColumn<Integer> goodsCount = omsOrderReturnApply.goodsCount;

    public static final SqlColumn<BigDecimal> goodsPrice = omsOrderReturnApply.goodsPrice;

    public static final SqlColumn<BigDecimal> goodsRealPrice = omsOrderReturnApply.goodsRealPrice;

    public static final SqlColumn<String> reason = omsOrderReturnApply.reason;

    public static final SqlColumn<String> description = omsOrderReturnApply.description;

    public static final SqlColumn<String> proofPics = omsOrderReturnApply.proofPics;

    public static final SqlColumn<String> handleNote = omsOrderReturnApply.handleNote;

    public static final SqlColumn<String> handleMan = omsOrderReturnApply.handleMan;

    public static final SqlColumn<String> receiveMan = omsOrderReturnApply.receiveMan;

    public static final SqlColumn<Date> receiveTime = omsOrderReturnApply.receiveTime;

    public static final SqlColumn<String> receiveNote = omsOrderReturnApply.receiveNote;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class OmsOrderReturnApply extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);

        public final SqlColumn<Long> companyAddressId = column("company_address_id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<String> orderSn = column("order_sn", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> memberUsername = column("member_username", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> returnAmount = column("return_amount", JDBCType.DECIMAL);

        public final SqlColumn<String> returnName = column("return_name", JDBCType.VARCHAR);

        public final SqlColumn<String> returnPhone = column("return_phone", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Date> handleTime = column("handle_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> goodsPic = column("goods_pic", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsBrand = column("goods_brand", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsAttr = column("goods_attr", JDBCType.VARCHAR);

        public final SqlColumn<Integer> goodsCount = column("goods_count", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> goodsPrice = column("goods_price", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> goodsRealPrice = column("goods_real_price", JDBCType.DECIMAL);

        public final SqlColumn<String> reason = column("reason", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> proofPics = column("proof_pics", JDBCType.VARCHAR);

        public final SqlColumn<String> handleNote = column("handle_note", JDBCType.VARCHAR);

        public final SqlColumn<String> handleMan = column("handle_man", JDBCType.VARCHAR);

        public final SqlColumn<String> receiveMan = column("receive_man", JDBCType.VARCHAR);

        public final SqlColumn<Date> receiveTime = column("receive_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> receiveNote = column("receive_note", JDBCType.VARCHAR);

        public OmsOrderReturnApply() {
            super("oms_order_return_apply");
        }
    }
}