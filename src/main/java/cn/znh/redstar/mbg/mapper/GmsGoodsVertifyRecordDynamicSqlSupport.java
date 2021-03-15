package cn.znh.redstar.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsGoodsVertifyRecordDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsGoodsVertifyRecord gmsGoodsVertifyRecord = new GmsGoodsVertifyRecord();

    public static final SqlColumn<Long> id = gmsGoodsVertifyRecord.id;

    public static final SqlColumn<Long> goodsId = gmsGoodsVertifyRecord.goodsId;

    public static final SqlColumn<Date> createTime = gmsGoodsVertifyRecord.createTime;

    public static final SqlColumn<String> vertifyMan = gmsGoodsVertifyRecord.vertifyMan;

    public static final SqlColumn<Integer> status = gmsGoodsVertifyRecord.status;

    public static final SqlColumn<String> detail = gmsGoodsVertifyRecord.detail;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsGoodsVertifyRecord extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsId = column("goods_id", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> vertifyMan = column("vertify_man", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<String> detail = column("detail", JDBCType.VARCHAR);

        public GmsGoodsVertifyRecord() {
            super("gms_goods_vertify_record");
        }
    }
}