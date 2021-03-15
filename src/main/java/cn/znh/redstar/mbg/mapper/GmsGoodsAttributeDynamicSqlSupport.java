package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsGoodsAttributeDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsGoodsAttribute gmsGoodsAttribute = new GmsGoodsAttribute();

    public static final SqlColumn<Long> id = gmsGoodsAttribute.id;

    public static final SqlColumn<Long> goodsAttributeCategoryId = gmsGoodsAttribute.goodsAttributeCategoryId;

    public static final SqlColumn<String> name = gmsGoodsAttribute.name;

    public static final SqlColumn<Integer> selectType = gmsGoodsAttribute.selectType;

    public static final SqlColumn<Integer> inputType = gmsGoodsAttribute.inputType;

    public static final SqlColumn<String> inputList = gmsGoodsAttribute.inputList;

    public static final SqlColumn<Integer> sort = gmsGoodsAttribute.sort;

    public static final SqlColumn<Integer> filterType = gmsGoodsAttribute.filterType;

    public static final SqlColumn<Integer> searchType = gmsGoodsAttribute.searchType;

    public static final SqlColumn<Integer> relatedStatus = gmsGoodsAttribute.relatedStatus;

    public static final SqlColumn<Integer> handAddStatus = gmsGoodsAttribute.handAddStatus;

    public static final SqlColumn<Integer> type = gmsGoodsAttribute.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsGoodsAttribute extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsAttributeCategoryId = column("goods_attribute_category_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> selectType = column("select_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> inputType = column("input_type", JDBCType.INTEGER);

        public final SqlColumn<String> inputList = column("input_list", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<Integer> filterType = column("filter_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> searchType = column("search_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> relatedStatus = column("related_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> handAddStatus = column("hand_add_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public GmsGoodsAttribute() {
            super("gms_goods_attribute");
        }
    }
}