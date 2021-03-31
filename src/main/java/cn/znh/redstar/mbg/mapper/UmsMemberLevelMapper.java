package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.UmsMemberLevelDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.UmsMemberLevel;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UmsMemberLevelMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, growthPoint, defaultStatus, freeFreightPoint, commentGrowthPoint, priviledgeFreeFreight, priviledgeSignIn, priviledgeComment, priviledgePromotion, priviledgeMemberPrice, priviledgeBirthday, note);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UmsMemberLevel> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UmsMemberLevel> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMemberLevelResult")
    Optional<UmsMemberLevel> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMemberLevelResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="growth_point", property="growthPoint", jdbcType=JdbcType.INTEGER),
        @Result(column="default_status", property="defaultStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="free_freight_point", property="freeFreightPoint", jdbcType=JdbcType.DECIMAL),
        @Result(column="comment_growth_point", property="commentGrowthPoint", jdbcType=JdbcType.INTEGER),
        @Result(column="priviledge_free_freight", property="priviledgeFreeFreight", jdbcType=JdbcType.INTEGER),
        @Result(column="priviledge_sign_in", property="priviledgeSignIn", jdbcType=JdbcType.INTEGER),
        @Result(column="priviledge_comment", property="priviledgeComment", jdbcType=JdbcType.INTEGER),
        @Result(column="priviledge_promotion", property="priviledgePromotion", jdbcType=JdbcType.INTEGER),
        @Result(column="priviledge_member_price", property="priviledgeMemberPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="priviledge_birthday", property="priviledgeBirthday", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR)
    })
    List<UmsMemberLevel> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsMemberLevel, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsMemberLevel, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsMemberLevel record) {
        return MyBatis3Utils.insert(this::insert, record, umsMemberLevel, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(growthPoint).toProperty("growthPoint")
            .map(defaultStatus).toProperty("defaultStatus")
            .map(freeFreightPoint).toProperty("freeFreightPoint")
            .map(commentGrowthPoint).toProperty("commentGrowthPoint")
            .map(priviledgeFreeFreight).toProperty("priviledgeFreeFreight")
            .map(priviledgeSignIn).toProperty("priviledgeSignIn")
            .map(priviledgeComment).toProperty("priviledgeComment")
            .map(priviledgePromotion).toProperty("priviledgePromotion")
            .map(priviledgeMemberPrice).toProperty("priviledgeMemberPrice")
            .map(priviledgeBirthday).toProperty("priviledgeBirthday")
            .map(note).toProperty("note")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsMemberLevel> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsMemberLevel, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(growthPoint).toProperty("growthPoint")
            .map(defaultStatus).toProperty("defaultStatus")
            .map(freeFreightPoint).toProperty("freeFreightPoint")
            .map(commentGrowthPoint).toProperty("commentGrowthPoint")
            .map(priviledgeFreeFreight).toProperty("priviledgeFreeFreight")
            .map(priviledgeSignIn).toProperty("priviledgeSignIn")
            .map(priviledgeComment).toProperty("priviledgeComment")
            .map(priviledgePromotion).toProperty("priviledgePromotion")
            .map(priviledgeMemberPrice).toProperty("priviledgeMemberPrice")
            .map(priviledgeBirthday).toProperty("priviledgeBirthday")
            .map(note).toProperty("note")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsMemberLevel record) {
        return MyBatis3Utils.insert(this::insert, record, umsMemberLevel, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(growthPoint).toPropertyWhenPresent("growthPoint", record::getGrowthPoint)
            .map(defaultStatus).toPropertyWhenPresent("defaultStatus", record::getDefaultStatus)
            .map(freeFreightPoint).toPropertyWhenPresent("freeFreightPoint", record::getFreeFreightPoint)
            .map(commentGrowthPoint).toPropertyWhenPresent("commentGrowthPoint", record::getCommentGrowthPoint)
            .map(priviledgeFreeFreight).toPropertyWhenPresent("priviledgeFreeFreight", record::getPriviledgeFreeFreight)
            .map(priviledgeSignIn).toPropertyWhenPresent("priviledgeSignIn", record::getPriviledgeSignIn)
            .map(priviledgeComment).toPropertyWhenPresent("priviledgeComment", record::getPriviledgeComment)
            .map(priviledgePromotion).toPropertyWhenPresent("priviledgePromotion", record::getPriviledgePromotion)
            .map(priviledgeMemberPrice).toPropertyWhenPresent("priviledgeMemberPrice", record::getPriviledgeMemberPrice)
            .map(priviledgeBirthday).toPropertyWhenPresent("priviledgeBirthday", record::getPriviledgeBirthday)
            .map(note).toPropertyWhenPresent("note", record::getNote)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberLevel> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsMemberLevel, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberLevel> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsMemberLevel, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberLevel> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsMemberLevel, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberLevel> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsMemberLevel, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsMemberLevel record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(growthPoint).equalTo(record::getGrowthPoint)
                .set(defaultStatus).equalTo(record::getDefaultStatus)
                .set(freeFreightPoint).equalTo(record::getFreeFreightPoint)
                .set(commentGrowthPoint).equalTo(record::getCommentGrowthPoint)
                .set(priviledgeFreeFreight).equalTo(record::getPriviledgeFreeFreight)
                .set(priviledgeSignIn).equalTo(record::getPriviledgeSignIn)
                .set(priviledgeComment).equalTo(record::getPriviledgeComment)
                .set(priviledgePromotion).equalTo(record::getPriviledgePromotion)
                .set(priviledgeMemberPrice).equalTo(record::getPriviledgeMemberPrice)
                .set(priviledgeBirthday).equalTo(record::getPriviledgeBirthday)
                .set(note).equalTo(record::getNote);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsMemberLevel record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(growthPoint).equalToWhenPresent(record::getGrowthPoint)
                .set(defaultStatus).equalToWhenPresent(record::getDefaultStatus)
                .set(freeFreightPoint).equalToWhenPresent(record::getFreeFreightPoint)
                .set(commentGrowthPoint).equalToWhenPresent(record::getCommentGrowthPoint)
                .set(priviledgeFreeFreight).equalToWhenPresent(record::getPriviledgeFreeFreight)
                .set(priviledgeSignIn).equalToWhenPresent(record::getPriviledgeSignIn)
                .set(priviledgeComment).equalToWhenPresent(record::getPriviledgeComment)
                .set(priviledgePromotion).equalToWhenPresent(record::getPriviledgePromotion)
                .set(priviledgeMemberPrice).equalToWhenPresent(record::getPriviledgeMemberPrice)
                .set(priviledgeBirthday).equalToWhenPresent(record::getPriviledgeBirthday)
                .set(note).equalToWhenPresent(record::getNote);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsMemberLevel record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(growthPoint).equalTo(record::getGrowthPoint)
            .set(defaultStatus).equalTo(record::getDefaultStatus)
            .set(freeFreightPoint).equalTo(record::getFreeFreightPoint)
            .set(commentGrowthPoint).equalTo(record::getCommentGrowthPoint)
            .set(priviledgeFreeFreight).equalTo(record::getPriviledgeFreeFreight)
            .set(priviledgeSignIn).equalTo(record::getPriviledgeSignIn)
            .set(priviledgeComment).equalTo(record::getPriviledgeComment)
            .set(priviledgePromotion).equalTo(record::getPriviledgePromotion)
            .set(priviledgeMemberPrice).equalTo(record::getPriviledgeMemberPrice)
            .set(priviledgeBirthday).equalTo(record::getPriviledgeBirthday)
            .set(note).equalTo(record::getNote)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsMemberLevel record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(growthPoint).equalToWhenPresent(record::getGrowthPoint)
            .set(defaultStatus).equalToWhenPresent(record::getDefaultStatus)
            .set(freeFreightPoint).equalToWhenPresent(record::getFreeFreightPoint)
            .set(commentGrowthPoint).equalToWhenPresent(record::getCommentGrowthPoint)
            .set(priviledgeFreeFreight).equalToWhenPresent(record::getPriviledgeFreeFreight)
            .set(priviledgeSignIn).equalToWhenPresent(record::getPriviledgeSignIn)
            .set(priviledgeComment).equalToWhenPresent(record::getPriviledgeComment)
            .set(priviledgePromotion).equalToWhenPresent(record::getPriviledgePromotion)
            .set(priviledgeMemberPrice).equalToWhenPresent(record::getPriviledgeMemberPrice)
            .set(priviledgeBirthday).equalToWhenPresent(record::getPriviledgeBirthday)
            .set(note).equalToWhenPresent(record::getNote)
            .where(id, isEqualTo(record::getId))
        );
    }
}