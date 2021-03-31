package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsMemberMemberTagRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMemberMemberTagRelation umsMemberMemberTagRelation = new UmsMemberMemberTagRelation();

    public static final SqlColumn<Long> id = umsMemberMemberTagRelation.id;

    public static final SqlColumn<Long> memberId = umsMemberMemberTagRelation.memberId;

    public static final SqlColumn<Long> tagId = umsMemberMemberTagRelation.tagId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMemberMemberTagRelation extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<Long> tagId = column("tag_id", JDBCType.BIGINT);

        public UmsMemberMemberTagRelation() {
            super("ums_member_member_tag_relation");
        }
    }
}