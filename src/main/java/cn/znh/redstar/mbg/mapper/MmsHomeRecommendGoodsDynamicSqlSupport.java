package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MmsHomeRecommendGoodsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MmsHomeRecommendGoods mmsHomeRecommendGoods = new MmsHomeRecommendGoods();

    public static final SqlColumn<Long> id = mmsHomeRecommendGoods.id;

    public static final SqlColumn<Long> goodsId = mmsHomeRecommendGoods.goodsId;

    public static final SqlColumn<String> goodsName = mmsHomeRecommendGoods.goodsName;

    public static final SqlColumn<Integer> recommendStatus = mmsHomeRecommendGoods.recommendStatus;

    public static final SqlColumn<Integer> sort = mmsHomeRecommendGoods.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MmsHomeRecommendGoods extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> recommendStatus = column("recommend_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public MmsHomeRecommendGoods() {
            super("mms_home_recommend_goods");
        }
    }
}