package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsMemberGoodsCategoryRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMemberGoodsCategoryRelation umsMemberGoodsCategoryRelation = new UmsMemberGoodsCategoryRelation();

    public static final SqlColumn<Long> id = umsMemberGoodsCategoryRelation.id;

    public static final SqlColumn<Long> memberId = umsMemberGoodsCategoryRelation.memberId;

    public static final SqlColumn<Long> goodsCategoryId = umsMemberGoodsCategoryRelation.goodsCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMemberGoodsCategoryRelation extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsCategoryId = column("goods_category_id", JDBCType.BIGINT);

        public UmsMemberGoodsCategoryRelation() {
            super("ums_member_goods_category_relation");
        }
    }
}