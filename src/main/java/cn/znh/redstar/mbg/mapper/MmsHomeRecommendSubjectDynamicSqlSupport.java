package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MmsHomeRecommendSubjectDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MmsHomeRecommendSubject mmsHomeRecommendSubject = new MmsHomeRecommendSubject();

    public static final SqlColumn<Long> id = mmsHomeRecommendSubject.id;

    public static final SqlColumn<Long> subjectId = mmsHomeRecommendSubject.subjectId;

    public static final SqlColumn<String> subjectName = mmsHomeRecommendSubject.subjectName;

    public static final SqlColumn<Integer> recommendStatus = mmsHomeRecommendSubject.recommendStatus;

    public static final SqlColumn<Integer> sort = mmsHomeRecommendSubject.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MmsHomeRecommendSubject extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> subjectId = column("subject_id", JDBCType.BIGINT);

        public final SqlColumn<String> subjectName = column("subject_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> recommendStatus = column("recommend_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public MmsHomeRecommendSubject() {
            super("mms_home_recommend_subject");
        }
    }
}