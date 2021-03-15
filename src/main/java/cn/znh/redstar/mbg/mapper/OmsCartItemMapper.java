package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.OmsCartItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.OmsCartItem;
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
public interface OmsCartItemMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, goodsId, goodsSkuId, memberId, quantity, price, sp1, sp2, sp3, goodsPic, goodsName, goodsBrand, goodsSn, goodsSubTitle, goodsSkuCode, memberNickname, createDate, modifyDate, deleteStatus, goodsCategoryId, goodsAttr);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OmsCartItem> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OmsCartItem> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsCartItemResult")
    Optional<OmsCartItem> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsCartItemResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="goods_sku_id", property="goodsSkuId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="quantity", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="sp1", property="sp1", jdbcType=JdbcType.VARCHAR),
        @Result(column="sp2", property="sp2", jdbcType=JdbcType.VARCHAR),
        @Result(column="sp3", property="sp3", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_pic", property="goodsPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_brand", property="goodsBrand", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_sn", property="goodsSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_sub_title", property="goodsSubTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_sku_code", property="goodsSkuCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="member_nickname", property="memberNickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_date", property="modifyDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_status", property="deleteStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_category_id", property="goodsCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="goods_attr", property="goodsAttr", jdbcType=JdbcType.VARCHAR)
    })
    List<OmsCartItem> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsCartItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsCartItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsCartItem record) {
        return MyBatis3Utils.insert(this::insert, record, omsCartItem, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(goodsSkuId).toProperty("goodsSkuId")
            .map(memberId).toProperty("memberId")
            .map(quantity).toProperty("quantity")
            .map(price).toProperty("price")
            .map(sp1).toProperty("sp1")
            .map(sp2).toProperty("sp2")
            .map(sp3).toProperty("sp3")
            .map(goodsPic).toProperty("goodsPic")
            .map(goodsName).toProperty("goodsName")
            .map(goodsBrand).toProperty("goodsBrand")
            .map(goodsSn).toProperty("goodsSn")
            .map(goodsSubTitle).toProperty("goodsSubTitle")
            .map(goodsSkuCode).toProperty("goodsSkuCode")
            .map(memberNickname).toProperty("memberNickname")
            .map(createDate).toProperty("createDate")
            .map(modifyDate).toProperty("modifyDate")
            .map(deleteStatus).toProperty("deleteStatus")
            .map(goodsCategoryId).toProperty("goodsCategoryId")
            .map(goodsAttr).toProperty("goodsAttr")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsCartItem> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsCartItem, c ->
            c.map(id).toProperty("id")
            .map(goodsId).toProperty("goodsId")
            .map(goodsSkuId).toProperty("goodsSkuId")
            .map(memberId).toProperty("memberId")
            .map(quantity).toProperty("quantity")
            .map(price).toProperty("price")
            .map(sp1).toProperty("sp1")
            .map(sp2).toProperty("sp2")
            .map(sp3).toProperty("sp3")
            .map(goodsPic).toProperty("goodsPic")
            .map(goodsName).toProperty("goodsName")
            .map(goodsBrand).toProperty("goodsBrand")
            .map(goodsSn).toProperty("goodsSn")
            .map(goodsSubTitle).toProperty("goodsSubTitle")
            .map(goodsSkuCode).toProperty("goodsSkuCode")
            .map(memberNickname).toProperty("memberNickname")
            .map(createDate).toProperty("createDate")
            .map(modifyDate).toProperty("modifyDate")
            .map(deleteStatus).toProperty("deleteStatus")
            .map(goodsCategoryId).toProperty("goodsCategoryId")
            .map(goodsAttr).toProperty("goodsAttr")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsCartItem record) {
        return MyBatis3Utils.insert(this::insert, record, omsCartItem, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(goodsId).toPropertyWhenPresent("goodsId", record::getGoodsId)
            .map(goodsSkuId).toPropertyWhenPresent("goodsSkuId", record::getGoodsSkuId)
            .map(memberId).toPropertyWhenPresent("memberId", record::getMemberId)
            .map(quantity).toPropertyWhenPresent("quantity", record::getQuantity)
            .map(price).toPropertyWhenPresent("price", record::getPrice)
            .map(sp1).toPropertyWhenPresent("sp1", record::getSp1)
            .map(sp2).toPropertyWhenPresent("sp2", record::getSp2)
            .map(sp3).toPropertyWhenPresent("sp3", record::getSp3)
            .map(goodsPic).toPropertyWhenPresent("goodsPic", record::getGoodsPic)
            .map(goodsName).toPropertyWhenPresent("goodsName", record::getGoodsName)
            .map(goodsBrand).toPropertyWhenPresent("goodsBrand", record::getGoodsBrand)
            .map(goodsSn).toPropertyWhenPresent("goodsSn", record::getGoodsSn)
            .map(goodsSubTitle).toPropertyWhenPresent("goodsSubTitle", record::getGoodsSubTitle)
            .map(goodsSkuCode).toPropertyWhenPresent("goodsSkuCode", record::getGoodsSkuCode)
            .map(memberNickname).toPropertyWhenPresent("memberNickname", record::getMemberNickname)
            .map(createDate).toPropertyWhenPresent("createDate", record::getCreateDate)
            .map(modifyDate).toPropertyWhenPresent("modifyDate", record::getModifyDate)
            .map(deleteStatus).toPropertyWhenPresent("deleteStatus", record::getDeleteStatus)
            .map(goodsCategoryId).toPropertyWhenPresent("goodsCategoryId", record::getGoodsCategoryId)
            .map(goodsAttr).toPropertyWhenPresent("goodsAttr", record::getGoodsAttr)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsCartItem> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsCartItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsCartItem> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsCartItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsCartItem> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsCartItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsCartItem> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsCartItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsCartItem record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(goodsId).equalTo(record::getGoodsId)
                .set(goodsSkuId).equalTo(record::getGoodsSkuId)
                .set(memberId).equalTo(record::getMemberId)
                .set(quantity).equalTo(record::getQuantity)
                .set(price).equalTo(record::getPrice)
                .set(sp1).equalTo(record::getSp1)
                .set(sp2).equalTo(record::getSp2)
                .set(sp3).equalTo(record::getSp3)
                .set(goodsPic).equalTo(record::getGoodsPic)
                .set(goodsName).equalTo(record::getGoodsName)
                .set(goodsBrand).equalTo(record::getGoodsBrand)
                .set(goodsSn).equalTo(record::getGoodsSn)
                .set(goodsSubTitle).equalTo(record::getGoodsSubTitle)
                .set(goodsSkuCode).equalTo(record::getGoodsSkuCode)
                .set(memberNickname).equalTo(record::getMemberNickname)
                .set(createDate).equalTo(record::getCreateDate)
                .set(modifyDate).equalTo(record::getModifyDate)
                .set(deleteStatus).equalTo(record::getDeleteStatus)
                .set(goodsCategoryId).equalTo(record::getGoodsCategoryId)
                .set(goodsAttr).equalTo(record::getGoodsAttr);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsCartItem record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(goodsId).equalToWhenPresent(record::getGoodsId)
                .set(goodsSkuId).equalToWhenPresent(record::getGoodsSkuId)
                .set(memberId).equalToWhenPresent(record::getMemberId)
                .set(quantity).equalToWhenPresent(record::getQuantity)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(sp1).equalToWhenPresent(record::getSp1)
                .set(sp2).equalToWhenPresent(record::getSp2)
                .set(sp3).equalToWhenPresent(record::getSp3)
                .set(goodsPic).equalToWhenPresent(record::getGoodsPic)
                .set(goodsName).equalToWhenPresent(record::getGoodsName)
                .set(goodsBrand).equalToWhenPresent(record::getGoodsBrand)
                .set(goodsSn).equalToWhenPresent(record::getGoodsSn)
                .set(goodsSubTitle).equalToWhenPresent(record::getGoodsSubTitle)
                .set(goodsSkuCode).equalToWhenPresent(record::getGoodsSkuCode)
                .set(memberNickname).equalToWhenPresent(record::getMemberNickname)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(modifyDate).equalToWhenPresent(record::getModifyDate)
                .set(deleteStatus).equalToWhenPresent(record::getDeleteStatus)
                .set(goodsCategoryId).equalToWhenPresent(record::getGoodsCategoryId)
                .set(goodsAttr).equalToWhenPresent(record::getGoodsAttr);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsCartItem record) {
        return update(c ->
            c.set(goodsId).equalTo(record::getGoodsId)
            .set(goodsSkuId).equalTo(record::getGoodsSkuId)
            .set(memberId).equalTo(record::getMemberId)
            .set(quantity).equalTo(record::getQuantity)
            .set(price).equalTo(record::getPrice)
            .set(sp1).equalTo(record::getSp1)
            .set(sp2).equalTo(record::getSp2)
            .set(sp3).equalTo(record::getSp3)
            .set(goodsPic).equalTo(record::getGoodsPic)
            .set(goodsName).equalTo(record::getGoodsName)
            .set(goodsBrand).equalTo(record::getGoodsBrand)
            .set(goodsSn).equalTo(record::getGoodsSn)
            .set(goodsSubTitle).equalTo(record::getGoodsSubTitle)
            .set(goodsSkuCode).equalTo(record::getGoodsSkuCode)
            .set(memberNickname).equalTo(record::getMemberNickname)
            .set(createDate).equalTo(record::getCreateDate)
            .set(modifyDate).equalTo(record::getModifyDate)
            .set(deleteStatus).equalTo(record::getDeleteStatus)
            .set(goodsCategoryId).equalTo(record::getGoodsCategoryId)
            .set(goodsAttr).equalTo(record::getGoodsAttr)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsCartItem record) {
        return update(c ->
            c.set(goodsId).equalToWhenPresent(record::getGoodsId)
            .set(goodsSkuId).equalToWhenPresent(record::getGoodsSkuId)
            .set(memberId).equalToWhenPresent(record::getMemberId)
            .set(quantity).equalToWhenPresent(record::getQuantity)
            .set(price).equalToWhenPresent(record::getPrice)
            .set(sp1).equalToWhenPresent(record::getSp1)
            .set(sp2).equalToWhenPresent(record::getSp2)
            .set(sp3).equalToWhenPresent(record::getSp3)
            .set(goodsPic).equalToWhenPresent(record::getGoodsPic)
            .set(goodsName).equalToWhenPresent(record::getGoodsName)
            .set(goodsBrand).equalToWhenPresent(record::getGoodsBrand)
            .set(goodsSn).equalToWhenPresent(record::getGoodsSn)
            .set(goodsSubTitle).equalToWhenPresent(record::getGoodsSubTitle)
            .set(goodsSkuCode).equalToWhenPresent(record::getGoodsSkuCode)
            .set(memberNickname).equalToWhenPresent(record::getMemberNickname)
            .set(createDate).equalToWhenPresent(record::getCreateDate)
            .set(modifyDate).equalToWhenPresent(record::getModifyDate)
            .set(deleteStatus).equalToWhenPresent(record::getDeleteStatus)
            .set(goodsCategoryId).equalToWhenPresent(record::getGoodsCategoryId)
            .set(goodsAttr).equalToWhenPresent(record::getGoodsAttr)
            .where(id, isEqualTo(record::getId))
        );
    }
}