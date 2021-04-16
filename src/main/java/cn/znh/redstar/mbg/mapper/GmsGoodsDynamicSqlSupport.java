package cn.znh.redstar.mbg.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GmsGoodsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final GmsGoods gmsGoods = new GmsGoods();

    public static final SqlColumn<Long> id = gmsGoods.id;

    public static final SqlColumn<Long> brandId = gmsGoods.brandId;

    public static final SqlColumn<Long> goodsCategoryId = gmsGoods.goodsCategoryId;

    public static final SqlColumn<Long> feightTemplateId = gmsGoods.feightTemplateId;

    public static final SqlColumn<Long> goodsAttributeCategoryId = gmsGoods.goodsAttributeCategoryId;

    public static final SqlColumn<String> name = gmsGoods.name;

    public static final SqlColumn<String> pic = gmsGoods.pic;

    public static final SqlColumn<String> goodsSn = gmsGoods.goodsSn;

    public static final SqlColumn<Integer> deleteStatus = gmsGoods.deleteStatus;

    public static final SqlColumn<Integer> publishStatus = gmsGoods.publishStatus;

    public static final SqlColumn<Integer> newStatus = gmsGoods.newStatus;

    public static final SqlColumn<Integer> recommendStatus = gmsGoods.recommendStatus;

    public static final SqlColumn<Integer> verifyStatus = gmsGoods.verifyStatus;

    public static final SqlColumn<Integer> sort = gmsGoods.sort;

    public static final SqlColumn<Integer> sale = gmsGoods.sale;

    public static final SqlColumn<BigDecimal> price = gmsGoods.price;

    public static final SqlColumn<BigDecimal> promotionPrice = gmsGoods.promotionPrice;

    public static final SqlColumn<Integer> giftGrowth = gmsGoods.giftGrowth;

    public static final SqlColumn<Integer> giftPoint = gmsGoods.giftPoint;

    public static final SqlColumn<Integer> usePointLimit = gmsGoods.usePointLimit;

    public static final SqlColumn<String> subTitle = gmsGoods.subTitle;

    public static final SqlColumn<BigDecimal> originalPrice = gmsGoods.originalPrice;

    public static final SqlColumn<Integer> stock = gmsGoods.stock;

    public static final SqlColumn<Integer> lowStock = gmsGoods.lowStock;

    public static final SqlColumn<String> unit = gmsGoods.unit;

    public static final SqlColumn<BigDecimal> weight = gmsGoods.weight;

    public static final SqlColumn<Integer> previewStatus = gmsGoods.previewStatus;

    public static final SqlColumn<String> serviceIds = gmsGoods.serviceIds;

    public static final SqlColumn<String> keywords = gmsGoods.keywords;

    public static final SqlColumn<String> note = gmsGoods.note;

    public static final SqlColumn<String> albumPics = gmsGoods.albumPics;

    public static final SqlColumn<String> detailTitle = gmsGoods.detailTitle;

    public static final SqlColumn<Date> promotionStartTime = gmsGoods.promotionStartTime;

    public static final SqlColumn<Date> promotionEndTime = gmsGoods.promotionEndTime;

    public static final SqlColumn<Integer> promotionPerLimit = gmsGoods.promotionPerLimit;

    public static final SqlColumn<Integer> promotionType = gmsGoods.promotionType;

    public static final SqlColumn<String> goodsCategoryName = gmsGoods.goodsCategoryName;

    public static final SqlColumn<String> brandName = gmsGoods.brandName;

    public static final SqlColumn<String> description = gmsGoods.description;

    public static final SqlColumn<String> detailDesc = gmsGoods.detailDesc;

    public static final SqlColumn<String> detailHtml = gmsGoods.detailHtml;

    public static final SqlColumn<String> detailMobileHtml = gmsGoods.detailMobileHtml;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class GmsGoods extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> brandId = column("brand_id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsCategoryId = column("goods_category_id", JDBCType.BIGINT);

        public final SqlColumn<Long> feightTemplateId = column("feight_template_id", JDBCType.BIGINT);

        public final SqlColumn<Long> goodsAttributeCategoryId = column("goods_attribute_category_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> pic = column("pic", JDBCType.VARCHAR);

        public final SqlColumn<String> goodsSn = column("goods_sn", JDBCType.VARCHAR);

        public final SqlColumn<Integer> deleteStatus = column("delete_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> publishStatus = column("publish_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> newStatus = column("new_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> recommendStatus = column("recommend_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> verifyStatus = column("verify_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<Integer> sale = column("sale", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> promotionPrice = column("promotion_price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> giftGrowth = column("gift_growth", JDBCType.INTEGER);

        public final SqlColumn<Integer> giftPoint = column("gift_point", JDBCType.INTEGER);

        public final SqlColumn<Integer> usePointLimit = column("use_point_limit", JDBCType.INTEGER);

        public final SqlColumn<String> subTitle = column("sub_title", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> originalPrice = column("original_price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> stock = column("stock", JDBCType.INTEGER);

        public final SqlColumn<Integer> lowStock = column("low_stock", JDBCType.INTEGER);

        public final SqlColumn<String> unit = column("unit", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> weight = column("weight", JDBCType.DECIMAL);

        public final SqlColumn<Integer> previewStatus = column("preview_status", JDBCType.INTEGER);

        public final SqlColumn<String> serviceIds = column("service_ids", JDBCType.VARCHAR);

        public final SqlColumn<String> keywords = column("keywords", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<String> albumPics = column("album_pics", JDBCType.VARCHAR);

        public final SqlColumn<String> detailTitle = column("detail_title", JDBCType.VARCHAR);

        public final SqlColumn<Date> promotionStartTime = column("promotion_start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> promotionEndTime = column("promotion_end_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> promotionPerLimit = column("promotion_per_limit", JDBCType.INTEGER);

        public final SqlColumn<Integer> promotionType = column("promotion_type", JDBCType.INTEGER);

        public final SqlColumn<String> goodsCategoryName = column("goods_category_name", JDBCType.VARCHAR);

        public final SqlColumn<String> brandName = column("brand_name", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> detailDesc = column("detail_desc", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> detailHtml = column("detail_html", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> detailMobileHtml = column("detail_mobile_html", JDBCType.LONGVARCHAR);

        public GmsGoods() {
            super("gms_goods");
        }
    }
}