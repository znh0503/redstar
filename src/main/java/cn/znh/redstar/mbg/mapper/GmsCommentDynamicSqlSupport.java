package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsCommentDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsComment gmsComment = new GmsComment();

    public static final SqlColumn<Long> id = gmsComment.id;

    public static final SqlColumn<Long> goodsId = gmsComment.goodsId;

    public static final SqlColumn<String> memberNickName = gmsComment.memberNickName;

    public static final SqlColumn<String> goodsName = gmsComment.goodsName;

    public static final SqlColumn<Integer> star = gmsComment.star;

    public static final SqlColumn<String> memberIp = gmsComment.memberIp;

    public static final SqlColumn<Date> createTime = gmsComment.createTime;

    public static final SqlColumn<Integer> showStatus = gmsComment.showStatus;

    public static final SqlColumn<String> goodsAttribute = gmsComment.goodsAttribute;

    public static final SqlColumn<Integer> collectCouont = gmsComment.collectCouont;

    public static final SqlColumn<Integer> readCount = gmsComment.readCount;

    public static final SqlColumn<String> pics = gmsComment.pics;

    public static final SqlColumn<String> memberIcon = gmsComment.memberIcon;

    public static final SqlColumn<Integer> replayCount = gmsComment.replayCount;

    public static final SqlColumn<String> content = gmsComment.content;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsComment extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<String> memberNickName = column("member_nick_name", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> star = column("star", JDBCType.INTEGER);

        public final SqlColumn<String> memberIp = column("member_ip", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> showStatus = column("show_status", JDBCType.INTEGER);

        public final SqlColumn<String> goodsAttribute = column("goods_attribute", JDBCType.VARCHAR);

        public final SqlColumn<Integer> collectCouont = column("collect_couont", JDBCType.INTEGER);

        public final SqlColumn<Integer> readCount = column("read_count", JDBCType.INTEGER);

        public final SqlColumn<String> pics = column("pics", JDBCType.VARCHAR);

        public final SqlColumn<String> memberIcon = column("member_icon", JDBCType.VARCHAR);

        public final SqlColumn<Integer> replayCount = column("replay_count", JDBCType.INTEGER);

        public final SqlColumn<String> content = column("content", JDBCType.LONGVARCHAR);

        public GmsComment() {
            super("gms_comment");
        }
    }
}