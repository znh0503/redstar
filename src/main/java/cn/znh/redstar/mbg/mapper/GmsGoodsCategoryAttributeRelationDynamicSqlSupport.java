package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsGoodsCategoryAttributeRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsGoodsCategoryAttributeRelation gmsGoodsCategoryAttributeRelation = new GmsGoodsCategoryAttributeRelation();

    public static final SqlColumn<Long> id = gmsGoodsCategoryAttributeRelation.id;

    public static final SqlColumn<Long> goodsCategoryId = gmsGoodsCategoryAttributeRelation.goodsCategoryId;

    public static final SqlColumn<Long> goodsAttributeId = gmsGoodsCategoryAttributeRelation.goodsAttributeId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsGoodsCategoryAttributeRelation extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsCategoryId = column("goods_category_id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsAttributeId = column("goods_attribute_id", JDBCType.BIGINT);

        public GmsGoodsCategoryAttributeRelation() {
            super("gms_goods_category_attribute_relation");
        }
    }
}