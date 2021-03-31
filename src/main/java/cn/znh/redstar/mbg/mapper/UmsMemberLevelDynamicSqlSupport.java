package cn.znh.redstar.mbg.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsMemberLevelDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMemberLevel umsMemberLevel = new UmsMemberLevel();

    public static final SqlColumn<Long> id = umsMemberLevel.id;

    public static final SqlColumn<String> name = umsMemberLevel.name;

    public static final SqlColumn<Integer> growthPoint = umsMemberLevel.growthPoint;

    public static final SqlColumn<Integer> defaultStatus = umsMemberLevel.defaultStatus;

    public static final SqlColumn<BigDecimal> freeFreightPoint = umsMemberLevel.freeFreightPoint;

    public static final SqlColumn<Integer> commentGrowthPoint = umsMemberLevel.commentGrowthPoint;

    public static final SqlColumn<Integer> priviledgeFreeFreight = umsMemberLevel.priviledgeFreeFreight;

    public static final SqlColumn<Integer> priviledgeSignIn = umsMemberLevel.priviledgeSignIn;

    public static final SqlColumn<Integer> priviledgeComment = umsMemberLevel.priviledgeComment;

    public static final SqlColumn<Integer> priviledgePromotion = umsMemberLevel.priviledgePromotion;

    public static final SqlColumn<Integer> priviledgeMemberPrice = umsMemberLevel.priviledgeMemberPrice;

    public static final SqlColumn<Integer> priviledgeBirthday = umsMemberLevel.priviledgeBirthday;

    public static final SqlColumn<String> note = umsMemberLevel.note;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMemberLevel extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> growthPoint = column("growth_point", JDBCType.INTEGER);

        public final SqlColumn<Integer> defaultStatus = column("default_status", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> freeFreightPoint = column("free_freight_point", JDBCType.DECIMAL);

        public final SqlColumn<Integer> commentGrowthPoint = column("comment_growth_point", JDBCType.INTEGER);

        public final SqlColumn<Integer> priviledgeFreeFreight = column("priviledge_free_freight", JDBCType.INTEGER);

        public final SqlColumn<Integer> priviledgeSignIn = column("priviledge_sign_in", JDBCType.INTEGER);

        public final SqlColumn<Integer> priviledgeComment = column("priviledge_comment", JDBCType.INTEGER);

        public final SqlColumn<Integer> priviledgePromotion = column("priviledge_promotion", JDBCType.INTEGER);

        public final SqlColumn<Integer> priviledgeMemberPrice = column("priviledge_member_price", JDBCType.INTEGER);

        public final SqlColumn<Integer> priviledgeBirthday = column("priviledge_birthday", JDBCType.INTEGER);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public UmsMemberLevel() {
            super("ums_member_level");
        }
    }
}