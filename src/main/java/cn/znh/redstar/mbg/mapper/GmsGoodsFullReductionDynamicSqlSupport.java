package cn.znh.redstar.mbg.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsGoodsFullReductionDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsGoodsFullReduction gmsGoodsFullReduction = new GmsGoodsFullReduction();

    public static final SqlColumn<Long> id = gmsGoodsFullReduction.id;

    public static final SqlColumn<Long> goodsId = gmsGoodsFullReduction.goodsId;

    public static final SqlColumn<BigDecimal> fullPrice = gmsGoodsFullReduction.fullPrice;

    public static final SqlColumn<BigDecimal> reducePrice = gmsGoodsFullReduction.reducePrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsGoodsFullReduction extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> fullPrice = column("full_price", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> reducePrice = column("reduce_price", JDBCType.DECIMAL);

        public GmsGoodsFullReduction() {
            super("gms_goods_full_reduction");
        }
    }
}