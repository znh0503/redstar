package cn.znh.redstar.mbg.mapper;

import static cn.znh.redstar.mbg.mapper.OmsOrderItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.znh.redstar.mbg.model.OmsOrderItem;
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
public interface OmsOrderItemMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, orderId, orderSn, productId, productPic, productName, productBrand, productSn, productPrice, productQuantity, productSkuId, productSkuCode, productCategoryId, promotionName, promotionAmount, couponAmount, integrationAmount, realAmount, giftIntegration, giftGrowth, productAttr);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OmsOrderItem> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OmsOrderItem> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsOrderItemResult")
    Optional<OmsOrderItem> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsOrderItemResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_pic", property="productPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_brand", property="productBrand", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_sn", property="productSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_price", property="productPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="product_quantity", property="productQuantity", jdbcType=JdbcType.INTEGER),
        @Result(column="product_sku_id", property="productSkuId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_sku_code", property="productSkuCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_category_id", property="productCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="promotion_name", property="promotionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="promotion_amount", property="promotionAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="coupon_amount", property="couponAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="integration_amount", property="integrationAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="real_amount", property="realAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="gift_integration", property="giftIntegration", jdbcType=JdbcType.INTEGER),
        @Result(column="gift_growth", property="giftGrowth", jdbcType=JdbcType.INTEGER),
        @Result(column="product_attr", property="productAttr", jdbcType=JdbcType.VARCHAR)
    })
    List<OmsOrderItem> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsOrderItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsOrderItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsOrderItem record) {
        return MyBatis3Utils.insert(this::insert, record, omsOrderItem, c ->
            c.map(id).toProperty("id")
            .map(orderId).toProperty("orderId")
            .map(orderSn).toProperty("orderSn")
            .map(productId).toProperty("productId")
            .map(productPic).toProperty("productPic")
            .map(productName).toProperty("productName")
            .map(productBrand).toProperty("productBrand")
            .map(productSn).toProperty("productSn")
            .map(productPrice).toProperty("productPrice")
            .map(productQuantity).toProperty("productQuantity")
            .map(productSkuId).toProperty("productSkuId")
            .map(productSkuCode).toProperty("productSkuCode")
            .map(productCategoryId).toProperty("productCategoryId")
            .map(promotionName).toProperty("promotionName")
            .map(promotionAmount).toProperty("promotionAmount")
            .map(couponAmount).toProperty("couponAmount")
            .map(integrationAmount).toProperty("integrationAmount")
            .map(realAmount).toProperty("realAmount")
            .map(giftIntegration).toProperty("giftIntegration")
            .map(giftGrowth).toProperty("giftGrowth")
            .map(productAttr).toProperty("productAttr")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsOrderItem> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsOrderItem, c ->
            c.map(id).toProperty("id")
            .map(orderId).toProperty("orderId")
            .map(orderSn).toProperty("orderSn")
            .map(productId).toProperty("productId")
            .map(productPic).toProperty("productPic")
            .map(productName).toProperty("productName")
            .map(productBrand).toProperty("productBrand")
            .map(productSn).toProperty("productSn")
            .map(productPrice).toProperty("productPrice")
            .map(productQuantity).toProperty("productQuantity")
            .map(productSkuId).toProperty("productSkuId")
            .map(productSkuCode).toProperty("productSkuCode")
            .map(productCategoryId).toProperty("productCategoryId")
            .map(promotionName).toProperty("promotionName")
            .map(promotionAmount).toProperty("promotionAmount")
            .map(couponAmount).toProperty("couponAmount")
            .map(integrationAmount).toProperty("integrationAmount")
            .map(realAmount).toProperty("realAmount")
            .map(giftIntegration).toProperty("giftIntegration")
            .map(giftGrowth).toProperty("giftGrowth")
            .map(productAttr).toProperty("productAttr")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsOrderItem record) {
        return MyBatis3Utils.insert(this::insert, record, omsOrderItem, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(orderId).toPropertyWhenPresent("orderId", record::getOrderId)
            .map(orderSn).toPropertyWhenPresent("orderSn", record::getOrderSn)
            .map(productId).toPropertyWhenPresent("productId", record::getProductId)
            .map(productPic).toPropertyWhenPresent("productPic", record::getProductPic)
            .map(productName).toPropertyWhenPresent("productName", record::getProductName)
            .map(productBrand).toPropertyWhenPresent("productBrand", record::getProductBrand)
            .map(productSn).toPropertyWhenPresent("productSn", record::getProductSn)
            .map(productPrice).toPropertyWhenPresent("productPrice", record::getProductPrice)
            .map(productQuantity).toPropertyWhenPresent("productQuantity", record::getProductQuantity)
            .map(productSkuId).toPropertyWhenPresent("productSkuId", record::getProductSkuId)
            .map(productSkuCode).toPropertyWhenPresent("productSkuCode", record::getProductSkuCode)
            .map(productCategoryId).toPropertyWhenPresent("productCategoryId", record::getProductCategoryId)
            .map(promotionName).toPropertyWhenPresent("promotionName", record::getPromotionName)
            .map(promotionAmount).toPropertyWhenPresent("promotionAmount", record::getPromotionAmount)
            .map(couponAmount).toPropertyWhenPresent("couponAmount", record::getCouponAmount)
            .map(integrationAmount).toPropertyWhenPresent("integrationAmount", record::getIntegrationAmount)
            .map(realAmount).toPropertyWhenPresent("realAmount", record::getRealAmount)
            .map(giftIntegration).toPropertyWhenPresent("giftIntegration", record::getGiftIntegration)
            .map(giftGrowth).toPropertyWhenPresent("giftGrowth", record::getGiftGrowth)
            .map(productAttr).toPropertyWhenPresent("productAttr", record::getProductAttr)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderItem> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsOrderItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderItem> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsOrderItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderItem> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsOrderItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderItem> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsOrderItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsOrderItem record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(orderId).equalTo(record::getOrderId)
                .set(orderSn).equalTo(record::getOrderSn)
                .set(productId).equalTo(record::getProductId)
                .set(productPic).equalTo(record::getProductPic)
                .set(productName).equalTo(record::getProductName)
                .set(productBrand).equalTo(record::getProductBrand)
                .set(productSn).equalTo(record::getProductSn)
                .set(productPrice).equalTo(record::getProductPrice)
                .set(productQuantity).equalTo(record::getProductQuantity)
                .set(productSkuId).equalTo(record::getProductSkuId)
                .set(productSkuCode).equalTo(record::getProductSkuCode)
                .set(productCategoryId).equalTo(record::getProductCategoryId)
                .set(promotionName).equalTo(record::getPromotionName)
                .set(promotionAmount).equalTo(record::getPromotionAmount)
                .set(couponAmount).equalTo(record::getCouponAmount)
                .set(integrationAmount).equalTo(record::getIntegrationAmount)
                .set(realAmount).equalTo(record::getRealAmount)
                .set(giftIntegration).equalTo(record::getGiftIntegration)
                .set(giftGrowth).equalTo(record::getGiftGrowth)
                .set(productAttr).equalTo(record::getProductAttr);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsOrderItem record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(orderSn).equalToWhenPresent(record::getOrderSn)
                .set(productId).equalToWhenPresent(record::getProductId)
                .set(productPic).equalToWhenPresent(record::getProductPic)
                .set(productName).equalToWhenPresent(record::getProductName)
                .set(productBrand).equalToWhenPresent(record::getProductBrand)
                .set(productSn).equalToWhenPresent(record::getProductSn)
                .set(productPrice).equalToWhenPresent(record::getProductPrice)
                .set(productQuantity).equalToWhenPresent(record::getProductQuantity)
                .set(productSkuId).equalToWhenPresent(record::getProductSkuId)
                .set(productSkuCode).equalToWhenPresent(record::getProductSkuCode)
                .set(productCategoryId).equalToWhenPresent(record::getProductCategoryId)
                .set(promotionName).equalToWhenPresent(record::getPromotionName)
                .set(promotionAmount).equalToWhenPresent(record::getPromotionAmount)
                .set(couponAmount).equalToWhenPresent(record::getCouponAmount)
                .set(integrationAmount).equalToWhenPresent(record::getIntegrationAmount)
                .set(realAmount).equalToWhenPresent(record::getRealAmount)
                .set(giftIntegration).equalToWhenPresent(record::getGiftIntegration)
                .set(giftGrowth).equalToWhenPresent(record::getGiftGrowth)
                .set(productAttr).equalToWhenPresent(record::getProductAttr);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsOrderItem record) {
        return update(c ->
            c.set(orderId).equalTo(record::getOrderId)
            .set(orderSn).equalTo(record::getOrderSn)
            .set(productId).equalTo(record::getProductId)
            .set(productPic).equalTo(record::getProductPic)
            .set(productName).equalTo(record::getProductName)
            .set(productBrand).equalTo(record::getProductBrand)
            .set(productSn).equalTo(record::getProductSn)
            .set(productPrice).equalTo(record::getProductPrice)
            .set(productQuantity).equalTo(record::getProductQuantity)
            .set(productSkuId).equalTo(record::getProductSkuId)
            .set(productSkuCode).equalTo(record::getProductSkuCode)
            .set(productCategoryId).equalTo(record::getProductCategoryId)
            .set(promotionName).equalTo(record::getPromotionName)
            .set(promotionAmount).equalTo(record::getPromotionAmount)
            .set(couponAmount).equalTo(record::getCouponAmount)
            .set(integrationAmount).equalTo(record::getIntegrationAmount)
            .set(realAmount).equalTo(record::getRealAmount)
            .set(giftIntegration).equalTo(record::getGiftIntegration)
            .set(giftGrowth).equalTo(record::getGiftGrowth)
            .set(productAttr).equalTo(record::getProductAttr)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsOrderItem record) {
        return update(c ->
            c.set(orderId).equalToWhenPresent(record::getOrderId)
            .set(orderSn).equalToWhenPresent(record::getOrderSn)
            .set(productId).equalToWhenPresent(record::getProductId)
            .set(productPic).equalToWhenPresent(record::getProductPic)
            .set(productName).equalToWhenPresent(record::getProductName)
            .set(productBrand).equalToWhenPresent(record::getProductBrand)
            .set(productSn).equalToWhenPresent(record::getProductSn)
            .set(productPrice).equalToWhenPresent(record::getProductPrice)
            .set(productQuantity).equalToWhenPresent(record::getProductQuantity)
            .set(productSkuId).equalToWhenPresent(record::getProductSkuId)
            .set(productSkuCode).equalToWhenPresent(record::getProductSkuCode)
            .set(productCategoryId).equalToWhenPresent(record::getProductCategoryId)
            .set(promotionName).equalToWhenPresent(record::getPromotionName)
            .set(promotionAmount).equalToWhenPresent(record::getPromotionAmount)
            .set(couponAmount).equalToWhenPresent(record::getCouponAmount)
            .set(integrationAmount).equalToWhenPresent(record::getIntegrationAmount)
            .set(realAmount).equalToWhenPresent(record::getRealAmount)
            .set(giftIntegration).equalToWhenPresent(record::getGiftIntegration)
            .set(giftGrowth).equalToWhenPresent(record::getGiftGrowth)
            .set(productAttr).equalToWhenPresent(record::getProductAttr)
            .where(id, isEqualTo(record::getId))
        );
    }
}