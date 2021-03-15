package cn.znh.redstar.mbg.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsGoodsLadderDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsGoodsLadder gmsGoodsLadder = new GmsGoodsLadder();

    public static final SqlColumn<Long> id = gmsGoodsLadder.id;

    public static final SqlColumn<Long> goodsId = gmsGoodsLadder.goodsId;

    public static final SqlColumn<Integer> count = gmsGoodsLadder.count;

    public static final SqlColumn<BigDecimal> discount = gmsGoodsLadder.discount;

    public static final SqlColumn<BigDecimal> price = gmsGoodsLadder.price;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsGoodsLadder extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> count = column("count", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> discount = column("discount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public GmsGoodsLadder() {
            super("gms_goods_ladder");
        }
    }
}