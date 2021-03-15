package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MmsHomeBrandDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MmsHomeBrand mmsHomeBrand = new MmsHomeBrand();

    public static final SqlColumn<Long> id = mmsHomeBrand.id;

    public static final SqlColumn<Long> brandId = mmsHomeBrand.brandId;

    public static final SqlColumn<String> brandName = mmsHomeBrand.brandName;

    public static final SqlColumn<Integer> recommendStatus = mmsHomeBrand.recommendStatus;

    public static final SqlColumn<Integer> sort = mmsHomeBrand.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MmsHomeBrand extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> brandId = column("brand_id", JDBCType.BIGINT);

        public final SqlColumn<String> brandName = column("brand_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> recommendStatus = column("recommend_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public MmsHomeBrand() {
            super("mms_home_brand");
        }
    }
}