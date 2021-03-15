package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.GmsBrandDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.GmsBrand;
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
public interface GmsBrandMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, firstLetter, sort, factoryStatus, showStatus, goodsCount, goodsCommentCount, logo, bigPic, brandStory);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GmsBrand> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<GmsBrand> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GmsBrandResult")
    Optional<GmsBrand> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GmsBrandResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="first_letter", property="firstLetter", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="factory_status", property="factoryStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="show_status", property="showStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_count", property="goodsCount", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_comment_count", property="goodsCommentCount", jdbcType=JdbcType.INTEGER),
        @Result(column="logo", property="logo", jdbcType=JdbcType.VARCHAR),
        @Result(column="big_pic", property="bigPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand_story", property="brandStory", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<GmsBrand> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, gmsBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, gmsBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(GmsBrand record) {
        return MyBatis3Utils.insert(this::insert, record, gmsBrand, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(firstLetter).toProperty("firstLetter")
            .map(sort).toProperty("sort")
            .map(factoryStatus).toProperty("factoryStatus")
            .map(showStatus).toProperty("showStatus")
            .map(goodsCount).toProperty("goodsCount")
            .map(goodsCommentCount).toProperty("goodsCommentCount")
            .map(logo).toProperty("logo")
            .map(bigPic).toProperty("bigPic")
            .map(brandStory).toProperty("brandStory")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<GmsBrand> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, gmsBrand, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(firstLetter).toProperty("firstLetter")
            .map(sort).toProperty("sort")
            .map(factoryStatus).toProperty("factoryStatus")
            .map(showStatus).toProperty("showStatus")
            .map(goodsCount).toProperty("goodsCount")
            .map(goodsCommentCount).toProperty("goodsCommentCount")
            .map(logo).toProperty("logo")
            .map(bigPic).toProperty("bigPic")
            .map(brandStory).toProperty("brandStory")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(GmsBrand record) {
        return MyBatis3Utils.insert(this::insert, record, gmsBrand, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(firstLetter).toPropertyWhenPresent("firstLetter", record::getFirstLetter)
            .map(sort).toPropertyWhenPresent("sort", record::getSort)
            .map(factoryStatus).toPropertyWhenPresent("factoryStatus", record::getFactoryStatus)
            .map(showStatus).toPropertyWhenPresent("showStatus", record::getShowStatus)
            .map(goodsCount).toPropertyWhenPresent("goodsCount", record::getGoodsCount)
            .map(goodsCommentCount).toPropertyWhenPresent("goodsCommentCount", record::getGoodsCommentCount)
            .map(logo).toPropertyWhenPresent("logo", record::getLogo)
            .map(bigPic).toPropertyWhenPresent("bigPic", record::getBigPic)
            .map(brandStory).toPropertyWhenPresent("brandStory", record::getBrandStory)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsBrand> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, gmsBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsBrand> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, gmsBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<GmsBrand> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, gmsBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<GmsBrand> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, gmsBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(GmsBrand record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(firstLetter).equalTo(record::getFirstLetter)
                .set(sort).equalTo(record::getSort)
                .set(factoryStatus).equalTo(record::getFactoryStatus)
                .set(showStatus).equalTo(record::getShowStatus)
                .set(goodsCount).equalTo(record::getGoodsCount)
                .set(goodsCommentCount).equalTo(record::getGoodsCommentCount)
                .set(logo).equalTo(record::getLogo)
                .set(bigPic).equalTo(record::getBigPic)
                .set(brandStory).equalTo(record::getBrandStory);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GmsBrand record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(firstLetter).equalToWhenPresent(record::getFirstLetter)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(factoryStatus).equalToWhenPresent(record::getFactoryStatus)
                .set(showStatus).equalToWhenPresent(record::getShowStatus)
                .set(goodsCount).equalToWhenPresent(record::getGoodsCount)
                .set(goodsCommentCount).equalToWhenPresent(record::getGoodsCommentCount)
                .set(logo).equalToWhenPresent(record::getLogo)
                .set(bigPic).equalToWhenPresent(record::getBigPic)
                .set(brandStory).equalToWhenPresent(record::getBrandStory);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(GmsBrand record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(firstLetter).equalTo(record::getFirstLetter)
            .set(sort).equalTo(record::getSort)
            .set(factoryStatus).equalTo(record::getFactoryStatus)
            .set(showStatus).equalTo(record::getShowStatus)
            .set(goodsCount).equalTo(record::getGoodsCount)
            .set(goodsCommentCount).equalTo(record::getGoodsCommentCount)
            .set(logo).equalTo(record::getLogo)
            .set(bigPic).equalTo(record::getBigPic)
            .set(brandStory).equalTo(record::getBrandStory)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(GmsBrand record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(firstLetter).equalToWhenPresent(record::getFirstLetter)
            .set(sort).equalToWhenPresent(record::getSort)
            .set(factoryStatus).equalToWhenPresent(record::getFactoryStatus)
            .set(showStatus).equalToWhenPresent(record::getShowStatus)
            .set(goodsCount).equalToWhenPresent(record::getGoodsCount)
            .set(goodsCommentCount).equalToWhenPresent(record::getGoodsCommentCount)
            .set(logo).equalToWhenPresent(record::getLogo)
            .set(bigPic).equalToWhenPresent(record::getBigPic)
            .set(brandStory).equalToWhenPresent(record::getBrandStory)
            .where(id, isEqualTo(record::getId))
        );
    }
}