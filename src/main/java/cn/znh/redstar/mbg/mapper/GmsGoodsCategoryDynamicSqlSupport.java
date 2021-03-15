package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsGoodsCategoryDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsGoodsCategory gmsGoodsCategory = new GmsGoodsCategory();

    public static final SqlColumn<Long> id = gmsGoodsCategory.id;

    public static final SqlColumn<Long> parentId = gmsGoodsCategory.parentId;

    public static final SqlColumn<String> name = gmsGoodsCategory.name;

    public static final SqlColumn<Integer> level = gmsGoodsCategory.level;

    public static final SqlColumn<Integer> goodsCount = gmsGoodsCategory.goodsCount;

    public static final SqlColumn<String> goodsUnit = gmsGoodsCategory.goodsUnit;

    public static final SqlColumn<Integer> navStatus = gmsGoodsCategory.navStatus;

    public static final SqlColumn<Integer> showStatus = gmsGoodsCategory.showStatus;

    public static final SqlColumn<Integer> sort = gmsGoodsCategory.sort;

    public static final SqlColumn<String> icon = gmsGoodsCategory.icon;

    public static final SqlColumn<String> keywords = gmsGoodsCategory.keywords;

    public static final SqlColumn<String> description = gmsGoodsCategory.description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsGoodsCategory extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentId = column("parent_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> level = column("level", JDBCType.INTEGER);

        public final SqlColumn<Integer> goodsCount = column("goods_count", JDBCType.INTEGER);

        public final SqlColumn<String> goodsUnit = column("goods_unit", JDBCType.VARCHAR);

        public final SqlColumn<Integer> navStatus = column("nav_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> showStatus = column("show_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<String> keywords = column("keywords", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.LONGVARCHAR);

        public GmsGoodsCategory() {
            super("gms_goods_category");
        }
    }
}