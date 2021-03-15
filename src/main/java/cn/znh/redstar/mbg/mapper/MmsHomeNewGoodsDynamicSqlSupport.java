package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MmsHomeNewGoodsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MmsHomeNewGoods mmsHomeNewGoods = new MmsHomeNewGoods();

    public static final SqlColumn<Long> id = mmsHomeNewGoods.id;

    public static final SqlColumn<Long> goodsId = mmsHomeNewGoods.goodsId;

    public static final SqlColumn<String> goodsName = mmsHomeNewGoods.goodsName;

    public static final SqlColumn<Integer> recommendStatus = mmsHomeNewGoods.recommendStatus;

    public static final SqlColumn<Integer> sort = mmsHomeNewGoods.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MmsHomeNewGoods extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> recommendStatus = column("recommend_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public MmsHomeNewGoods() {
            super("mms_home_new_goods");
        }
    }
}