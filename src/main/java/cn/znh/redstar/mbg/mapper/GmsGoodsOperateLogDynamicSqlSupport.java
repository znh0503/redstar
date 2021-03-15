package cn.znh.redstar.mbg.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsGoodsOperateLogDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsGoodsOperateLog gmsGoodsOperateLog = new GmsGoodsOperateLog();

    public static final SqlColumn<Long> id = gmsGoodsOperateLog.id;

    public static final SqlColumn<Long> goodsId = gmsGoodsOperateLog.goodsId;

    public static final SqlColumn<BigDecimal> priceOld = gmsGoodsOperateLog.priceOld;

    public static final SqlColumn<BigDecimal> priceNew = gmsGoodsOperateLog.priceNew;

    public static final SqlColumn<BigDecimal> salePriceOld = gmsGoodsOperateLog.salePriceOld;

    public static final SqlColumn<BigDecimal> salePriceNew = gmsGoodsOperateLog.salePriceNew;

    public static final SqlColumn<Integer> giftPointOld = gmsGoodsOperateLog.giftPointOld;

    public static final SqlColumn<Integer> giftPointNew = gmsGoodsOperateLog.giftPointNew;

    public static final SqlColumn<Integer> usePointLimitOld = gmsGoodsOperateLog.usePointLimitOld;

    public static final SqlColumn<Integer> usePointLimitNew = gmsGoodsOperateLog.usePointLimitNew;

    public static final SqlColumn<String> operateMan = gmsGoodsOperateLog.operateMan;

    public static final SqlColumn<Date> createTime = gmsGoodsOperateLog.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsGoodsOperateLog extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> priceOld = column("price_old", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> priceNew = column("price_new", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> salePriceOld = column("sale_price_old", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> salePriceNew = column("sale_price_new", JDBCType.DECIMAL);

        public final SqlColumn<Integer> giftPointOld = column("gift_point_old", JDBCType.INTEGER);

        public final SqlColumn<Integer> giftPointNew = column("gift_point_new", JDBCType.INTEGER);

        public final SqlColumn<Integer> usePointLimitOld = column("use_point_limit_old", JDBCType.INTEGER);

        public final SqlColumn<Integer> usePointLimitNew = column("use_point_limit_new", JDBCType.INTEGER);

        public final SqlColumn<String> operateMan = column("operate_man", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public GmsGoodsOperateLog() {
            super("gms_goods_operate_log");
        }
    }
}