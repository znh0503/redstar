package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsMemberTaskDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMemberTask umsMemberTask = new UmsMemberTask();

    public static final SqlColumn<Long> id = umsMemberTask.id;

    public static final SqlColumn<String> name = umsMemberTask.name;

    public static final SqlColumn<Integer> growth = umsMemberTask.growth;

    public static final SqlColumn<Integer> intergration = umsMemberTask.intergration;

    public static final SqlColumn<Integer> type = umsMemberTask.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMemberTask extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> growth = column("growth", JDBCType.INTEGER);

        public final SqlColumn<Integer> intergration = column("intergration", JDBCType.INTEGER);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public UmsMemberTask() {
            super("ums_member_task");
        }
    }
}