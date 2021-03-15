package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsGoodsAttributeValueDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsGoodsAttributeValue gmsGoodsAttributeValue = new GmsGoodsAttributeValue();

    public static final SqlColumn<Long> id = gmsGoodsAttributeValue.id;

    public static final SqlColumn<Long> goodsId = gmsGoodsAttributeValue.goodsId;

    public static final SqlColumn<Long> goodsAttributeId = gmsGoodsAttributeValue.goodsAttributeId;

    public static final SqlColumn<String> value = gmsGoodsAttributeValue.value;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsGoodsAttributeValue extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsAttributeId = column("goods_attribute_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public GmsGoodsAttributeValue() {
            super("gms_goods_attribute_value");
        }
    }
}