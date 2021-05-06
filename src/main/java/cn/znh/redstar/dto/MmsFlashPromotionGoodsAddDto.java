package cn.znh.redstar.dto;

import cn.znh.redstar.mbg.model.GmsGoods;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author : znh
 * @date : 23:11 2021/5/5
 * 秒杀活动添加商品dto
 */
@Data
public class MmsFlashPromotionGoodsAddDto {
    @ApiModelProperty("活动id")
    private Long flashPromotionId;
    @ApiModelProperty("活动时间段id")
    private Long flashPromotionSessionId;
    @ApiModelProperty("商品信息")
    private List<GmsGoods> goodsList;

}
