package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsBrandDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsBrand gmsBrand = new GmsBrand();

    public static final SqlColumn<Long> id = gmsBrand.id;

    public static final SqlColumn<String> name = gmsBrand.name;

    public static final SqlColumn<String> firstLetter = gmsBrand.firstLetter;

    public static final SqlColumn<Integer> sort = gmsBrand.sort;

    public static final SqlColumn<Integer> factoryStatus = gmsBrand.factoryStatus;

    public static final SqlColumn<Integer> showStatus = gmsBrand.showStatus;

    public static final SqlColumn<Integer> goodsCount = gmsBrand.goodsCount;

    public static final SqlColumn<Integer> goodsCommentCount = gmsBrand.goodsCommentCount;

    public static final SqlColumn<String> logo = gmsBrand.logo;

    public static final SqlColumn<String> bigPic = gmsBrand.bigPic;

    public static final SqlColumn<String> brandStory = gmsBrand.brandStory;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsBrand extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> firstLetter = column("first_letter", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<Integer> factoryStatus = column("factory_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> showStatus = column("show_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> goodsCount = column("goods_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> goodsCommentCount = column("goods_comment_count", JDBCType.INTEGER);

        public final SqlColumn<String> logo = column("logo", JDBCType.VARCHAR);

        public final SqlColumn<String> bigPic = column("big_pic", JDBCType.VARCHAR);

        public final SqlColumn<String> brandStory = column("brand_story", JDBCType.LONGVARCHAR);

        public GmsBrand() {
            super("gms_brand");
        }
    }
}