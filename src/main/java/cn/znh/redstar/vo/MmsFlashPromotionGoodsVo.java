package cn.znh.redstar.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author : znh
 * @date : 21:13 2021/5/5
 * 秒杀活动设置商品列表vo
 */
@Data
public class MmsFlashPromotionGoodsVo {
    private Long id;

    private Long goodsId;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "货号")
    private String goodsSn;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "库存")
    private Integer stock;

    @ApiModelProperty(value = "秒杀价格")
    private BigDecimal flashPromotionPrice;

    @ApiModelProperty(value = "秒杀数量")
    private Integer flashPromotionCount;

    @ApiModelProperty(value = "每人限购数量")
    private Integer flashPromotionLimit;

    @ApiModelProperty(value = "排序")
    private Integer sort;
}
