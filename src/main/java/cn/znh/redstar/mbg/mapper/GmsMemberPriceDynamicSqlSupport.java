package cn.znh.redstar.mbg.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsMemberPriceDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsMemberPrice gmsMemberPrice = new GmsMemberPrice();

    public static final SqlColumn<Long> id = gmsMemberPrice.id;

    public static final SqlColumn<Long> goodsId = gmsMemberPrice.goodsId;

    public static final SqlColumn<Long> memberLevelId = gmsMemberPrice.memberLevelId;

    public static final SqlColumn<BigDecimal> memberPrice = gmsMemberPrice.memberPrice;

    public static final SqlColumn<String> memberLevelName = gmsMemberPrice.memberLevelName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsMemberPrice extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberLevelId = column("member_level_id", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> memberPrice = column("member_price", JDBCType.DECIMAL);

        public final SqlColumn<String> memberLevelName = column("member_level_name", JDBCType.VARCHAR);

        public GmsMemberPrice() {
            super("gms_member_price");
        }
    }
}