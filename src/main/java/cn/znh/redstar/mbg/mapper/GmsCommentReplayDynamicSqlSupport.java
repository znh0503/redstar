package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsCommentReplayDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsCommentReplay gmsCommentReplay = new GmsCommentReplay();

    public static final SqlColumn<Long> id = gmsCommentReplay.id;

    public static final SqlColumn<Long> commentId = gmsCommentReplay.commentId;

    public static final SqlColumn<String> memberNickName = gmsCommentReplay.memberNickName;

    public static final SqlColumn<String> memberIcon = gmsCommentReplay.memberIcon;

    public static final SqlColumn<String> content = gmsCommentReplay.content;

    public static final SqlColumn<Date> createTime = gmsCommentReplay.createTime;

    public static final SqlColumn<Integer> type = gmsCommentReplay.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsCommentReplay extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> commentId = column("comment_id", JDBCType.BIGINT);

        public final SqlColumn<String> memberNickName = column("member_nick_name", JDBCType.VARCHAR);

        public final SqlColumn<String> memberIcon = column("member_icon", JDBCType.VARCHAR);

        public final SqlColumn<String> content = column("content", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public GmsCommentReplay() {
            super("gms_comment_replay");
        }
    }
}