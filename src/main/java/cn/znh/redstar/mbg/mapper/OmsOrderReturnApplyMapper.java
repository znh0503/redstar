package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.OmsOrderReturnApplyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.OmsOrderReturnApply;
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
public interface OmsOrderReturnApplyMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, orderId, companyAddressId, goodsId, orderSn, createTime, memberUsername, returnAmount, returnName, returnPhone, status, handleTime, goodsPic, goodsName, goodsBrand, goodsAttr, goodsCount, goodsPrice, goodsRealPrice, reason, description, proofPics, handleNote, handleMan, receiveMan, receiveTime, receiveNote);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OmsOrderReturnApply> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OmsOrderReturnApply> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsOrderReturnApplyResult")
    Optional<OmsOrderReturnApply> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsOrderReturnApplyResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="company_address_id", property="companyAddressId", jdbcType=JdbcType.BIGINT),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="member_username", property="memberUsername", jdbcType=JdbcType.VARCHAR),
        @Result(column="return_amount", property="returnAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="return_name", property="returnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="return_phone", property="returnPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="handle_time", property="handleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="goods_pic", property="goodsPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_brand", property="goodsBrand", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_attr", property="goodsAttr", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_count", property="goodsCount", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_price", property="goodsPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="goods_real_price", property="goodsRealPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="proof_pics", property="proofPics", jdbcType=JdbcType.VARCHAR),
        @Result(column="handle_note", property="handleNote", jdbcType=JdbcType.VARCHAR),
        @Result(column="handle_man", property="handleMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_man", property="receiveMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_time", property="receiveTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="receive_note", property="receiveNote", jdbcType=JdbcType.VARCHAR)
    })
    List<OmsOrderReturnApply> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsOrderReturnApply, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsOrderReturnApply, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsOrderReturnApply record) {
        return MyBatis3Utils.insert(this::insert, record, omsOrderReturnApply, c ->
            c.map(id).toProperty("id")
            .map(orderId).toProperty("orderId")
            .map(companyAddressId).toProperty("companyAddressId")
            .map(goodsId).toProperty("goodsId")
            .map(orderSn).toProperty("orderSn")
            .map(createTime).toProperty("createTime")
            .map(memberUsername).toProperty("memberUsername")
            .map(returnAmount).toProperty("returnAmount")
            .map(returnName).toProperty("returnName")
            .map(returnPhone).toProperty("returnPhone")
            .map(status).toProperty("status")
            .map(handleTime).toProperty("handleTime")
            .map(goodsPic).toProperty("goodsPic")
            .map(goodsName).toProperty("goodsName")
            .map(goodsBrand).toProperty("goodsBrand")
            .map(goodsAttr).toProperty("goodsAttr")
            .map(goodsCount).toProperty("goodsCount")
            .map(goodsPrice).toProperty("goodsPrice")
            .map(goodsRealPrice).toProperty("goodsRealPrice")
            .map(reason).toProperty("reason")
            .map(description).toProperty("description")
            .map(proofPics).toProperty("proofPics")
            .map(handleNote).toProperty("handleNote")
            .map(handleMan).toProperty("handleMan")
            .map(receiveMan).toProperty("receiveMan")
            .map(receiveTime).toProperty("receiveTime")
            .map(receiveNote).toProperty("receiveNote")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsOrderReturnApply> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsOrderReturnApply, c ->
            c.map(id).toProperty("id")
            .map(orderId).toProperty("orderId")
            .map(companyAddressId).toProperty("companyAddressId")
            .map(goodsId).toProperty("goodsId")
            .map(orderSn).toProperty("orderSn")
            .map(createTime).toProperty("createTime")
            .map(memberUsername).toProperty("memberUsername")
            .map(returnAmount).toProperty("returnAmount")
            .map(returnName).toProperty("returnName")
            .map(returnPhone).toProperty("returnPhone")
            .map(status).toProperty("status")
            .map(handleTime).toProperty("handleTime")
            .map(goodsPic).toProperty("goodsPic")
            .map(goodsName).toProperty("goodsName")
            .map(goodsBrand).toProperty("goodsBrand")
            .map(goodsAttr).toProperty("goodsAttr")
            .map(goodsCount).toProperty("goodsCount")
            .map(goodsPrice).toProperty("goodsPrice")
            .map(goodsRealPrice).toProperty("goodsRealPrice")
            .map(reason).toProperty("reason")
            .map(description).toProperty("description")
            .map(proofPics).toProperty("proofPics")
            .map(handleNote).toProperty("handleNote")
            .map(handleMan).toProperty("handleMan")
            .map(receiveMan).toProperty("receiveMan")
            .map(receiveTime).toProperty("receiveTime")
            .map(receiveNote).toProperty("receiveNote")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsOrderReturnApply record) {
        return MyBatis3Utils.insert(this::insert, record, omsOrderReturnApply, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(orderId).toPropertyWhenPresent("orderId", record::getOrderId)
            .map(companyAddressId).toPropertyWhenPresent("companyAddressId", record::getCompanyAddressId)
            .map(goodsId).toPropertyWhenPresent("goodsId", record::getGoodsId)
            .map(orderSn).toPropertyWhenPresent("orderSn", record::getOrderSn)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(memberUsername).toPropertyWhenPresent("memberUsername", record::getMemberUsername)
            .map(returnAmount).toPropertyWhenPresent("returnAmount", record::getReturnAmount)
            .map(returnName).toPropertyWhenPresent("returnName", record::getReturnName)
            .map(returnPhone).toPropertyWhenPresent("returnPhone", record::getReturnPhone)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(handleTime).toPropertyWhenPresent("handleTime", record::getHandleTime)
            .map(goodsPic).toPropertyWhenPresent("goodsPic", record::getGoodsPic)
            .map(goodsName).toPropertyWhenPresent("goodsName", record::getGoodsName)
            .map(goodsBrand).toPropertyWhenPresent("goodsBrand", record::getGoodsBrand)
            .map(goodsAttr).toPropertyWhenPresent("goodsAttr", record::getGoodsAttr)
            .map(goodsCount).toPropertyWhenPresent("goodsCount", record::getGoodsCount)
            .map(goodsPrice).toPropertyWhenPresent("goodsPrice", record::getGoodsPrice)
            .map(goodsRealPrice).toPropertyWhenPresent("goodsRealPrice", record::getGoodsRealPrice)
            .map(reason).toPropertyWhenPresent("reason", record::getReason)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(proofPics).toPropertyWhenPresent("proofPics", record::getProofPics)
            .map(handleNote).toPropertyWhenPresent("handleNote", record::getHandleNote)
            .map(handleMan).toPropertyWhenPresent("handleMan", record::getHandleMan)
            .map(receiveMan).toPropertyWhenPresent("receiveMan", record::getReceiveMan)
            .map(receiveTime).toPropertyWhenPresent("receiveTime", record::getReceiveTime)
            .map(receiveNote).toPropertyWhenPresent("receiveNote", record::getReceiveNote)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderReturnApply> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsOrderReturnApply, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderReturnApply> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsOrderReturnApply, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderReturnApply> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsOrderReturnApply, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderReturnApply> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsOrderReturnApply, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsOrderReturnApply record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(orderId).equalTo(record::getOrderId)
                .set(companyAddressId).equalTo(record::getCompanyAddressId)
                .set(goodsId).equalTo(record::getGoodsId)
                .set(orderSn).equalTo(record::getOrderSn)
                .set(createTime).equalTo(record::getCreateTime)
                .set(memberUsername).equalTo(record::getMemberUsername)
                .set(returnAmount).equalTo(record::getReturnAmount)
                .set(returnName).equalTo(record::getReturnName)
                .set(returnPhone).equalTo(record::getReturnPhone)
                .set(status).equalTo(record::getStatus)
                .set(handleTime).equalTo(record::getHandleTime)
                .set(goodsPic).equalTo(record::getGoodsPic)
                .set(goodsName).equalTo(record::getGoodsName)
                .set(goodsBrand).equalTo(record::getGoodsBrand)
                .set(goodsAttr).equalTo(record::getGoodsAttr)
                .set(goodsCount).equalTo(record::getGoodsCount)
                .set(goodsPrice).equalTo(record::getGoodsPrice)
                .set(goodsRealPrice).equalTo(record::getGoodsRealPrice)
                .set(reason).equalTo(record::getReason)
                .set(description).equalTo(record::getDescription)
                .set(proofPics).equalTo(record::getProofPics)
                .set(handleNote).equalTo(record::getHandleNote)
                .set(handleMan).equalTo(record::getHandleMan)
                .set(receiveMan).equalTo(record::getReceiveMan)
                .set(receiveTime).equalTo(record::getReceiveTime)
                .set(receiveNote).equalTo(record::getReceiveNote);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsOrderReturnApply record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(companyAddressId).equalToWhenPresent(record::getCompanyAddressId)
                .set(goodsId).equalToWhenPresent(record::getGoodsId)
                .set(orderSn).equalToWhenPresent(record::getOrderSn)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(memberUsername).equalToWhenPresent(record::getMemberUsername)
                .set(returnAmount).equalToWhenPresent(record::getReturnAmount)
                .set(returnName).equalToWhenPresent(record::getReturnName)
                .set(returnPhone).equalToWhenPresent(record::getReturnPhone)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(handleTime).equalToWhenPresent(record::getHandleTime)
                .set(goodsPic).equalToWhenPresent(record::getGoodsPic)
                .set(goodsName).equalToWhenPresent(record::getGoodsName)
                .set(goodsBrand).equalToWhenPresent(record::getGoodsBrand)
                .set(goodsAttr).equalToWhenPresent(record::getGoodsAttr)
                .set(goodsCount).equalToWhenPresent(record::getGoodsCount)
                .set(goodsPrice).equalToWhenPresent(record::getGoodsPrice)
                .set(goodsRealPrice).equalToWhenPresent(record::getGoodsRealPrice)
                .set(reason).equalToWhenPresent(record::getReason)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(proofPics).equalToWhenPresent(record::getProofPics)
                .set(handleNote).equalToWhenPresent(record::getHandleNote)
                .set(handleMan).equalToWhenPresent(record::getHandleMan)
                .set(receiveMan).equalToWhenPresent(record::getReceiveMan)
                .set(receiveTime).equalToWhenPresent(record::getReceiveTime)
                .set(receiveNote).equalToWhenPresent(record::getReceiveNote);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsOrderReturnApply record) {
        return update(c ->
            c.set(orderId).equalTo(record::getOrderId)
            .set(companyAddressId).equalTo(record::getCompanyAddressId)
            .set(goodsId).equalTo(record::getGoodsId)
            .set(orderSn).equalTo(record::getOrderSn)
            .set(createTime).equalTo(record::getCreateTime)
            .set(memberUsername).equalTo(record::getMemberUsername)
            .set(returnAmount).equalTo(record::getReturnAmount)
            .set(returnName).equalTo(record::getReturnName)
            .set(returnPhone).equalTo(record::getReturnPhone)
            .set(status).equalTo(record::getStatus)
            .set(handleTime).equalTo(record::getHandleTime)
            .set(goodsPic).equalTo(record::getGoodsPic)
            .set(goodsName).equalTo(record::getGoodsName)
            .set(goodsBrand).equalTo(record::getGoodsBrand)
            .set(goodsAttr).equalTo(record::getGoodsAttr)
            .set(goodsCount).equalTo(record::getGoodsCount)
            .set(goodsPrice).equalTo(record::getGoodsPrice)
            .set(goodsRealPrice).equalTo(record::getGoodsRealPrice)
            .set(reason).equalTo(record::getReason)
            .set(description).equalTo(record::getDescription)
            .set(proofPics).equalTo(record::getProofPics)
            .set(handleNote).equalTo(record::getHandleNote)
            .set(handleMan).equalTo(record::getHandleMan)
            .set(receiveMan).equalTo(record::getReceiveMan)
            .set(receiveTime).equalTo(record::getReceiveTime)
            .set(receiveNote).equalTo(record::getReceiveNote)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsOrderReturnApply record) {
        return update(c ->
            c.set(orderId).equalToWhenPresent(record::getOrderId)
            .set(companyAddressId).equalToWhenPresent(record::getCompanyAddressId)
            .set(goodsId).equalToWhenPresent(record::getGoodsId)
            .set(orderSn).equalToWhenPresent(record::getOrderSn)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(memberUsername).equalToWhenPresent(record::getMemberUsername)
            .set(returnAmount).equalToWhenPresent(record::getReturnAmount)
            .set(returnName).equalToWhenPresent(record::getReturnName)
            .set(returnPhone).equalToWhenPresent(record::getReturnPhone)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(handleTime).equalToWhenPresent(record::getHandleTime)
            .set(goodsPic).equalToWhenPresent(record::getGoodsPic)
            .set(goodsName).equalToWhenPresent(record::getGoodsName)
            .set(goodsBrand).equalToWhenPresent(record::getGoodsBrand)
            .set(goodsAttr).equalToWhenPresent(record::getGoodsAttr)
            .set(goodsCount).equalToWhenPresent(record::getGoodsCount)
            .set(goodsPrice).equalToWhenPresent(record::getGoodsPrice)
            .set(goodsRealPrice).equalToWhenPresent(record::getGoodsRealPrice)
            .set(reason).equalToWhenPresent(record::getReason)
            .set(description).equalToWhenPresent(record::getDescription)
            .set(proofPics).equalToWhenPresent(record::getProofPics)
            .set(handleNote).equalToWhenPresent(record::getHandleNote)
            .set(handleMan).equalToWhenPresent(record::getHandleMan)
            .set(receiveMan).equalToWhenPresent(record::getReceiveMan)
            .set(receiveTime).equalToWhenPresent(record::getReceiveTime)
            .set(receiveNote).equalToWhenPresent(record::getReceiveNote)
            .where(id, isEqualTo(record::getId))
        );
    }
}