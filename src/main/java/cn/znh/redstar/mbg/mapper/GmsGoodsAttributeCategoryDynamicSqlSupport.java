package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsGoodsAttributeCategoryDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsGoodsAttributeCategory gmsGoodsAttributeCategory = new GmsGoodsAttributeCategory();

    public static final SqlColumn<Long> id = gmsGoodsAttributeCategory.id;

    public static final SqlColumn<String> name = gmsGoodsAttributeCategory.name;

    public static final SqlColumn<Integer> attributeCount = gmsGoodsAttributeCategory.attributeCount;

    public static final SqlColumn<Integer> paramCount = gmsGoodsAttributeCategory.paramCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsGoodsAttributeCategory extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> attributeCount = column("attribute_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> paramCount = column("param_count", JDBCType.INTEGER);

        public GmsGoodsAttributeCategory() {
            super("gms_goods_attribute_category");
        }
    }
}