package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.OmsOrderDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.OmsOrder;
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
public interface OmsOrderMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberId, couponId, orderSn, createTime, memberUsername, totalAmount, payAmount, freightAmount, promotionAmount, integrationAmount, couponAmount, discountAmount, payType, sourceType, status, orderType, deliveryCompany, deliverySn, autoConfirmDay, integration, growth, promotionInfo, billType, billHeader, billContent, billReceiverPhone, billReceiverEmail, receiverName, receiverPhone, receiverPostCode, receiverProvince, receiverCity, receiverRegion, receiverDetailAddress, note, confirmStatus, deleteStatus, useIntegration, paymentTime, deliveryTime, receiveTime, commentTime, modifyTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OmsOrder> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OmsOrder> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsOrderResult")
    Optional<OmsOrder> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsOrderResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="coupon_id", property="couponId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="member_username", property="memberUsername", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_amount", property="totalAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="pay_amount", property="payAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="freight_amount", property="freightAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="promotion_amount", property="promotionAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="integration_amount", property="integrationAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="coupon_amount", property="couponAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="discount_amount", property="discountAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="pay_type", property="payType", jdbcType=JdbcType.INTEGER),
        @Result(column="source_type", property="sourceType", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="order_type", property="orderType", jdbcType=JdbcType.INTEGER),
        @Result(column="delivery_company", property="deliveryCompany", jdbcType=JdbcType.VARCHAR),
        @Result(column="delivery_sn", property="deliverySn", jdbcType=JdbcType.VARCHAR),
        @Result(column="auto_confirm_day", property="autoConfirmDay", jdbcType=JdbcType.INTEGER),
        @Result(column="integration", property="integration", jdbcType=JdbcType.INTEGER),
        @Result(column="growth", property="growth", jdbcType=JdbcType.INTEGER),
        @Result(column="promotion_info", property="promotionInfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="bill_type", property="billType", jdbcType=JdbcType.INTEGER),
        @Result(column="bill_header", property="billHeader", jdbcType=JdbcType.VARCHAR),
        @Result(column="bill_content", property="billContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="bill_receiver_phone", property="billReceiverPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="bill_receiver_email", property="billReceiverEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_name", property="receiverName", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_phone", property="receiverPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_post_code", property="receiverPostCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_province", property="receiverProvince", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_city", property="receiverCity", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_region", property="receiverRegion", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_detail_address", property="receiverDetailAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="confirm_status", property="confirmStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="delete_status", property="deleteStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="use_integration", property="useIntegration", jdbcType=JdbcType.INTEGER),
        @Result(column="payment_time", property="paymentTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delivery_time", property="deliveryTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="receive_time", property="receiveTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="comment_time", property="commentTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<OmsOrder> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsOrder, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsOrder, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsOrder record) {
        return MyBatis3Utils.insert(this::insert, record, omsOrder, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(couponId).toProperty("couponId")
            .map(orderSn).toProperty("orderSn")
            .map(createTime).toProperty("createTime")
            .map(memberUsername).toProperty("memberUsername")
            .map(totalAmount).toProperty("totalAmount")
            .map(payAmount).toProperty("payAmount")
            .map(freightAmount).toProperty("freightAmount")
            .map(promotionAmount).toProperty("promotionAmount")
            .map(integrationAmount).toProperty("integrationAmount")
            .map(couponAmount).toProperty("couponAmount")
            .map(discountAmount).toProperty("discountAmount")
            .map(payType).toProperty("payType")
            .map(sourceType).toProperty("sourceType")
            .map(status).toProperty("status")
            .map(orderType).toProperty("orderType")
            .map(deliveryCompany).toProperty("deliveryCompany")
            .map(deliverySn).toProperty("deliverySn")
            .map(autoConfirmDay).toProperty("autoConfirmDay")
            .map(integration).toProperty("integration")
            .map(growth).toProperty("growth")
            .map(promotionInfo).toProperty("promotionInfo")
            .map(billType).toProperty("billType")
            .map(billHeader).toProperty("billHeader")
            .map(billContent).toProperty("billContent")
            .map(billReceiverPhone).toProperty("billReceiverPhone")
            .map(billReceiverEmail).toProperty("billReceiverEmail")
            .map(receiverName).toProperty("receiverName")
            .map(receiverPhone).toProperty("receiverPhone")
            .map(receiverPostCode).toProperty("receiverPostCode")
            .map(receiverProvince).toProperty("receiverProvince")
            .map(receiverCity).toProperty("receiverCity")
            .map(receiverRegion).toProperty("receiverRegion")
            .map(receiverDetailAddress).toProperty("receiverDetailAddress")
            .map(note).toProperty("note")
            .map(confirmStatus).toProperty("confirmStatus")
            .map(deleteStatus).toProperty("deleteStatus")
            .map(useIntegration).toProperty("useIntegration")
            .map(paymentTime).toProperty("paymentTime")
            .map(deliveryTime).toProperty("deliveryTime")
            .map(receiveTime).toProperty("receiveTime")
            .map(commentTime).toProperty("commentTime")
            .map(modifyTime).toProperty("modifyTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsOrder> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsOrder, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(couponId).toProperty("couponId")
            .map(orderSn).toProperty("orderSn")
            .map(createTime).toProperty("createTime")
            .map(memberUsername).toProperty("memberUsername")
            .map(totalAmount).toProperty("totalAmount")
            .map(payAmount).toProperty("payAmount")
            .map(freightAmount).toProperty("freightAmount")
            .map(promotionAmount).toProperty("promotionAmount")
            .map(integrationAmount).toProperty("integrationAmount")
            .map(couponAmount).toProperty("couponAmount")
            .map(discountAmount).toProperty("discountAmount")
            .map(payType).toProperty("payType")
            .map(sourceType).toProperty("sourceType")
            .map(status).toProperty("status")
            .map(orderType).toProperty("orderType")
            .map(deliveryCompany).toProperty("deliveryCompany")
            .map(deliverySn).toProperty("deliverySn")
            .map(autoConfirmDay).toProperty("autoConfirmDay")
            .map(integration).toProperty("integration")
            .map(growth).toProperty("growth")
            .map(promotionInfo).toProperty("promotionInfo")
            .map(billType).toProperty("billType")
            .map(billHeader).toProperty("billHeader")
            .map(billContent).toProperty("billContent")
            .map(billReceiverPhone).toProperty("billReceiverPhone")
            .map(billReceiverEmail).toProperty("billReceiverEmail")
            .map(receiverName).toProperty("receiverName")
            .map(receiverPhone).toProperty("receiverPhone")
            .map(receiverPostCode).toProperty("receiverPostCode")
            .map(receiverProvince).toProperty("receiverProvince")
            .map(receiverCity).toProperty("receiverCity")
            .map(receiverRegion).toProperty("receiverRegion")
            .map(receiverDetailAddress).toProperty("receiverDetailAddress")
            .map(note).toProperty("note")
            .map(confirmStatus).toProperty("confirmStatus")
            .map(deleteStatus).toProperty("deleteStatus")
            .map(useIntegration).toProperty("useIntegration")
            .map(paymentTime).toProperty("paymentTime")
            .map(deliveryTime).toProperty("deliveryTime")
            .map(receiveTime).toProperty("receiveTime")
            .map(commentTime).toProperty("commentTime")
            .map(modifyTime).toProperty("modifyTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsOrder record) {
        return MyBatis3Utils.insert(this::insert, record, omsOrder, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(memberId).toPropertyWhenPresent("memberId", record::getMemberId)
            .map(couponId).toPropertyWhenPresent("couponId", record::getCouponId)
            .map(orderSn).toPropertyWhenPresent("orderSn", record::getOrderSn)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(memberUsername).toPropertyWhenPresent("memberUsername", record::getMemberUsername)
            .map(totalAmount).toPropertyWhenPresent("totalAmount", record::getTotalAmount)
            .map(payAmount).toPropertyWhenPresent("payAmount", record::getPayAmount)
            .map(freightAmount).toPropertyWhenPresent("freightAmount", record::getFreightAmount)
            .map(promotionAmount).toPropertyWhenPresent("promotionAmount", record::getPromotionAmount)
            .map(integrationAmount).toPropertyWhenPresent("integrationAmount", record::getIntegrationAmount)
            .map(couponAmount).toPropertyWhenPresent("couponAmount", record::getCouponAmount)
            .map(discountAmount).toPropertyWhenPresent("discountAmount", record::getDiscountAmount)
            .map(payType).toPropertyWhenPresent("payType", record::getPayType)
            .map(sourceType).toPropertyWhenPresent("sourceType", record::getSourceType)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(orderType).toPropertyWhenPresent("orderType", record::getOrderType)
            .map(deliveryCompany).toPropertyWhenPresent("deliveryCompany", record::getDeliveryCompany)
            .map(deliverySn).toPropertyWhenPresent("deliverySn", record::getDeliverySn)
            .map(autoConfirmDay).toPropertyWhenPresent("autoConfirmDay", record::getAutoConfirmDay)
            .map(integration).toPropertyWhenPresent("integration", record::getIntegration)
            .map(growth).toPropertyWhenPresent("growth", record::getGrowth)
            .map(promotionInfo).toPropertyWhenPresent("promotionInfo", record::getPromotionInfo)
            .map(billType).toPropertyWhenPresent("billType", record::getBillType)
            .map(billHeader).toPropertyWhenPresent("billHeader", record::getBillHeader)
            .map(billContent).toPropertyWhenPresent("billContent", record::getBillContent)
            .map(billReceiverPhone).toPropertyWhenPresent("billReceiverPhone", record::getBillReceiverPhone)
            .map(billReceiverEmail).toPropertyWhenPresent("billReceiverEmail", record::getBillReceiverEmail)
            .map(receiverName).toPropertyWhenPresent("receiverName", record::getReceiverName)
            .map(receiverPhone).toPropertyWhenPresent("receiverPhone", record::getReceiverPhone)
            .map(receiverPostCode).toPropertyWhenPresent("receiverPostCode", record::getReceiverPostCode)
            .map(receiverProvince).toPropertyWhenPresent("receiverProvince", record::getReceiverProvince)
            .map(receiverCity).toPropertyWhenPresent("receiverCity", record::getReceiverCity)
            .map(receiverRegion).toPropertyWhenPresent("receiverRegion", record::getReceiverRegion)
            .map(receiverDetailAddress).toPropertyWhenPresent("receiverDetailAddress", record::getReceiverDetailAddress)
            .map(note).toPropertyWhenPresent("note", record::getNote)
            .map(confirmStatus).toPropertyWhenPresent("confirmStatus", record::getConfirmStatus)
            .map(deleteStatus).toPropertyWhenPresent("deleteStatus", record::getDeleteStatus)
            .map(useIntegration).toPropertyWhenPresent("useIntegration", record::getUseIntegration)
            .map(paymentTime).toPropertyWhenPresent("paymentTime", record::getPaymentTime)
            .map(deliveryTime).toPropertyWhenPresent("deliveryTime", record::getDeliveryTime)
            .map(receiveTime).toPropertyWhenPresent("receiveTime", record::getReceiveTime)
            .map(commentTime).toPropertyWhenPresent("commentTime", record::getCommentTime)
            .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrder> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsOrder, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrder> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsOrder, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrder> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsOrder, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrder> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsOrder, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsOrder record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(memberId).equalTo(record::getMemberId)
                .set(couponId).equalTo(record::getCouponId)
                .set(orderSn).equalTo(record::getOrderSn)
                .set(createTime).equalTo(record::getCreateTime)
                .set(memberUsername).equalTo(record::getMemberUsername)
                .set(totalAmount).equalTo(record::getTotalAmount)
                .set(payAmount).equalTo(record::getPayAmount)
                .set(freightAmount).equalTo(record::getFreightAmount)
                .set(promotionAmount).equalTo(record::getPromotionAmount)
                .set(integrationAmount).equalTo(record::getIntegrationAmount)
                .set(couponAmount).equalTo(record::getCouponAmount)
                .set(discountAmount).equalTo(record::getDiscountAmount)
                .set(payType).equalTo(record::getPayType)
                .set(sourceType).equalTo(record::getSourceType)
                .set(status).equalTo(record::getStatus)
                .set(orderType).equalTo(record::getOrderType)
                .set(deliveryCompany).equalTo(record::getDeliveryCompany)
                .set(deliverySn).equalTo(record::getDeliverySn)
                .set(autoConfirmDay).equalTo(record::getAutoConfirmDay)
                .set(integration).equalTo(record::getIntegration)
                .set(growth).equalTo(record::getGrowth)
                .set(promotionInfo).equalTo(record::getPromotionInfo)
                .set(billType).equalTo(record::getBillType)
                .set(billHeader).equalTo(record::getBillHeader)
                .set(billContent).equalTo(record::getBillContent)
                .set(billReceiverPhone).equalTo(record::getBillReceiverPhone)
                .set(billReceiverEmail).equalTo(record::getBillReceiverEmail)
                .set(receiverName).equalTo(record::getReceiverName)
                .set(receiverPhone).equalTo(record::getReceiverPhone)
                .set(receiverPostCode).equalTo(record::getReceiverPostCode)
                .set(receiverProvince).equalTo(record::getReceiverProvince)
                .set(receiverCity).equalTo(record::getReceiverCity)
                .set(receiverRegion).equalTo(record::getReceiverRegion)
                .set(receiverDetailAddress).equalTo(record::getReceiverDetailAddress)
                .set(note).equalTo(record::getNote)
                .set(confirmStatus).equalTo(record::getConfirmStatus)
                .set(deleteStatus).equalTo(record::getDeleteStatus)
                .set(useIntegration).equalTo(record::getUseIntegration)
                .set(paymentTime).equalTo(record::getPaymentTime)
                .set(deliveryTime).equalTo(record::getDeliveryTime)
                .set(receiveTime).equalTo(record::getReceiveTime)
                .set(commentTime).equalTo(record::getCommentTime)
                .set(modifyTime).equalTo(record::getModifyTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsOrder record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(memberId).equalToWhenPresent(record::getMemberId)
                .set(couponId).equalToWhenPresent(record::getCouponId)
                .set(orderSn).equalToWhenPresent(record::getOrderSn)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(memberUsername).equalToWhenPresent(record::getMemberUsername)
                .set(totalAmount).equalToWhenPresent(record::getTotalAmount)
                .set(payAmount).equalToWhenPresent(record::getPayAmount)
                .set(freightAmount).equalToWhenPresent(record::getFreightAmount)
                .set(promotionAmount).equalToWhenPresent(record::getPromotionAmount)
                .set(integrationAmount).equalToWhenPresent(record::getIntegrationAmount)
                .set(couponAmount).equalToWhenPresent(record::getCouponAmount)
                .set(discountAmount).equalToWhenPresent(record::getDiscountAmount)
                .set(payType).equalToWhenPresent(record::getPayType)
                .set(sourceType).equalToWhenPresent(record::getSourceType)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(orderType).equalToWhenPresent(record::getOrderType)
                .set(deliveryCompany).equalToWhenPresent(record::getDeliveryCompany)
                .set(deliverySn).equalToWhenPresent(record::getDeliverySn)
                .set(autoConfirmDay).equalToWhenPresent(record::getAutoConfirmDay)
                .set(integration).equalToWhenPresent(record::getIntegration)
                .set(growth).equalToWhenPresent(record::getGrowth)
                .set(promotionInfo).equalToWhenPresent(record::getPromotionInfo)
                .set(billType).equalToWhenPresent(record::getBillType)
                .set(billHeader).equalToWhenPresent(record::getBillHeader)
                .set(billContent).equalToWhenPresent(record::getBillContent)
                .set(billReceiverPhone).equalToWhenPresent(record::getBillReceiverPhone)
                .set(billReceiverEmail).equalToWhenPresent(record::getBillReceiverEmail)
                .set(receiverName).equalToWhenPresent(record::getReceiverName)
                .set(receiverPhone).equalToWhenPresent(record::getReceiverPhone)
                .set(receiverPostCode).equalToWhenPresent(record::getReceiverPostCode)
                .set(receiverProvince).equalToWhenPresent(record::getReceiverProvince)
                .set(receiverCity).equalToWhenPresent(record::getReceiverCity)
                .set(receiverRegion).equalToWhenPresent(record::getReceiverRegion)
                .set(receiverDetailAddress).equalToWhenPresent(record::getReceiverDetailAddress)
                .set(note).equalToWhenPresent(record::getNote)
                .set(confirmStatus).equalToWhenPresent(record::getConfirmStatus)
                .set(deleteStatus).equalToWhenPresent(record::getDeleteStatus)
                .set(useIntegration).equalToWhenPresent(record::getUseIntegration)
                .set(paymentTime).equalToWhenPresent(record::getPaymentTime)
                .set(deliveryTime).equalToWhenPresent(record::getDeliveryTime)
                .set(receiveTime).equalToWhenPresent(record::getReceiveTime)
                .set(commentTime).equalToWhenPresent(record::getCommentTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsOrder record) {
        return update(c ->
            c.set(memberId).equalTo(record::getMemberId)
            .set(couponId).equalTo(record::getCouponId)
            .set(orderSn).equalTo(record::getOrderSn)
            .set(createTime).equalTo(record::getCreateTime)
            .set(memberUsername).equalTo(record::getMemberUsername)
            .set(totalAmount).equalTo(record::getTotalAmount)
            .set(payAmount).equalTo(record::getPayAmount)
            .set(freightAmount).equalTo(record::getFreightAmount)
            .set(promotionAmount).equalTo(record::getPromotionAmount)
            .set(integrationAmount).equalTo(record::getIntegrationAmount)
            .set(couponAmount).equalTo(record::getCouponAmount)
            .set(discountAmount).equalTo(record::getDiscountAmount)
            .set(payType).equalTo(record::getPayType)
            .set(sourceType).equalTo(record::getSourceType)
            .set(status).equalTo(record::getStatus)
            .set(orderType).equalTo(record::getOrderType)
            .set(deliveryCompany).equalTo(record::getDeliveryCompany)
            .set(deliverySn).equalTo(record::getDeliverySn)
            .set(autoConfirmDay).equalTo(record::getAutoConfirmDay)
            .set(integration).equalTo(record::getIntegration)
            .set(growth).equalTo(record::getGrowth)
            .set(promotionInfo).equalTo(record::getPromotionInfo)
            .set(billType).equalTo(record::getBillType)
            .set(billHeader).equalTo(record::getBillHeader)
            .set(billContent).equalTo(record::getBillContent)
            .set(billReceiverPhone).equalTo(record::getBillReceiverPhone)
            .set(billReceiverEmail).equalTo(record::getBillReceiverEmail)
            .set(receiverName).equalTo(record::getReceiverName)
            .set(receiverPhone).equalTo(record::getReceiverPhone)
            .set(receiverPostCode).equalTo(record::getReceiverPostCode)
            .set(receiverProvince).equalTo(record::getReceiverProvince)
            .set(receiverCity).equalTo(record::getReceiverCity)
            .set(receiverRegion).equalTo(record::getReceiverRegion)
            .set(receiverDetailAddress).equalTo(record::getReceiverDetailAddress)
            .set(note).equalTo(record::getNote)
            .set(confirmStatus).equalTo(record::getConfirmStatus)
            .set(deleteStatus).equalTo(record::getDeleteStatus)
            .set(useIntegration).equalTo(record::getUseIntegration)
            .set(paymentTime).equalTo(record::getPaymentTime)
            .set(deliveryTime).equalTo(record::getDeliveryTime)
            .set(receiveTime).equalTo(record::getReceiveTime)
            .set(commentTime).equalTo(record::getCommentTime)
            .set(modifyTime).equalTo(record::getModifyTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsOrder record) {
        return update(c ->
            c.set(memberId).equalToWhenPresent(record::getMemberId)
            .set(couponId).equalToWhenPresent(record::getCouponId)
            .set(orderSn).equalToWhenPresent(record::getOrderSn)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(memberUsername).equalToWhenPresent(record::getMemberUsername)
            .set(totalAmount).equalToWhenPresent(record::getTotalAmount)
            .set(payAmount).equalToWhenPresent(record::getPayAmount)
            .set(freightAmount).equalToWhenPresent(record::getFreightAmount)
            .set(promotionAmount).equalToWhenPresent(record::getPromotionAmount)
            .set(integrationAmount).equalToWhenPresent(record::getIntegrationAmount)
            .set(couponAmount).equalToWhenPresent(record::getCouponAmount)
            .set(discountAmount).equalToWhenPresent(record::getDiscountAmount)
            .set(payType).equalToWhenPresent(record::getPayType)
            .set(sourceType).equalToWhenPresent(record::getSourceType)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(orderType).equalToWhenPresent(record::getOrderType)
            .set(deliveryCompany).equalToWhenPresent(record::getDeliveryCompany)
            .set(deliverySn).equalToWhenPresent(record::getDeliverySn)
            .set(autoConfirmDay).equalToWhenPresent(record::getAutoConfirmDay)
            .set(integration).equalToWhenPresent(record::getIntegration)
            .set(growth).equalToWhenPresent(record::getGrowth)
            .set(promotionInfo).equalToWhenPresent(record::getPromotionInfo)
            .set(billType).equalToWhenPresent(record::getBillType)
            .set(billHeader).equalToWhenPresent(record::getBillHeader)
            .set(billContent).equalToWhenPresent(record::getBillContent)
            .set(billReceiverPhone).equalToWhenPresent(record::getBillReceiverPhone)
            .set(billReceiverEmail).equalToWhenPresent(record::getBillReceiverEmail)
            .set(receiverName).equalToWhenPresent(record::getReceiverName)
            .set(receiverPhone).equalToWhenPresent(record::getReceiverPhone)
            .set(receiverPostCode).equalToWhenPresent(record::getReceiverPostCode)
            .set(receiverProvince).equalToWhenPresent(record::getReceiverProvince)
            .set(receiverCity).equalToWhenPresent(record::getReceiverCity)
            .set(receiverRegion).equalToWhenPresent(record::getReceiverRegion)
            .set(receiverDetailAddress).equalToWhenPresent(record::getReceiverDetailAddress)
            .set(note).equalToWhenPresent(record::getNote)
            .set(confirmStatus).equalToWhenPresent(record::getConfirmStatus)
            .set(deleteStatus).equalToWhenPresent(record::getDeleteStatus)
            .set(useIntegration).equalToWhenPresent(record::getUseIntegration)
            .set(paymentTime).equalToWhenPresent(record::getPaymentTime)
            .set(deliveryTime).equalToWhenPresent(record::getDeliveryTime)
            .set(receiveTime).equalToWhenPresent(record::getReceiveTime)
            .set(commentTime).equalToWhenPresent(record::getCommentTime)
            .set(modifyTime).equalToWhenPresent(record::getModifyTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}