package cn.znh.redstar.mbg.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsSkuStockDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsSkuStock gmsSkuStock = new GmsSkuStock();

    public static final SqlColumn<Long> id = gmsSkuStock.id;

    public static final SqlColumn<Long> goodsId = gmsSkuStock.goodsId;

    public static final SqlColumn<String> skuCode = gmsSkuStock.skuCode;

    public static final SqlColumn<BigDecimal> price = gmsSkuStock.price;

    public static final SqlColumn<Integer> stock = gmsSkuStock.stock;

    public static final SqlColumn<Integer> lowStock = gmsSkuStock.lowStock;

    public static final SqlColumn<String> sp1 = gmsSkuStock.sp1;

    public static final SqlColumn<String> sp2 = gmsSkuStock.sp2;

    public static final SqlColumn<String> sp3 = gmsSkuStock.sp3;

    public static final SqlColumn<String> pic = gmsSkuStock.pic;

    public static final SqlColumn<Integer> sale = gmsSkuStock.sale;

    public static final SqlColumn<BigDecimal> promotionPrice = gmsSkuStock.promotionPrice;

    public static final SqlColumn<Integer> lockStock = gmsSkuStock.lockStock;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsSkuStock extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<String> skuCode = column("sku_code", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> stock = column("stock", JDBCType.INTEGER);

        public final SqlColumn<Integer> lowStock = column("low_stock", JDBCType.INTEGER);

        public final SqlColumn<String> sp1 = column("sp1", JDBCType.VARCHAR);

        public final SqlColumn<String> sp2 = column("sp2", JDBCType.VARCHAR);

        public final SqlColumn<String> sp3 = column("sp3", JDBCType.VARCHAR);

        public final SqlColumn<String> pic = column("pic", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sale = column("sale", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> promotionPrice = column("promotion_price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> lockStock = column("lock_stock", JDBCType.INTEGER);

        public GmsSkuStock() {
            super("gms_sku_stock");
        }
    }
}