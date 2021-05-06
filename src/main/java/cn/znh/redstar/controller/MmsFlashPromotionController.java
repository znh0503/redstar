package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.dto.MmsFlashPromotionGoodsAddDto;
import cn.znh.redstar.mbg.model.GmsGoods;
import cn.znh.redstar.mbg.model.MmsFlashPromotion;
import cn.znh.redstar.mbg.model.MmsFlashPromotionGoodsRelation;
import cn.znh.redstar.mbg.model.MmsHomeAdvertise;
import cn.znh.redstar.service.MmsFlashPromotionService;
import cn.znh.redstar.vo.MmsFlashPromotionGoodsVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : znh
 * @date : 19:02 2021/4/29
 * 秒杀活动controller
 */
@Slf4j
@Api(tags = "MmsFlashPromotionController",description = "营销秒杀活动")
@RestController
@RequestMapping("/flashPromotion")
public class MmsFlashPromotionController {
    @Resource
    MmsFlashPromotionService mmsFlashPromotionService;

    @ApiOperation("获取全部秒杀活动")
    @GetMapping("")
    public CommonResult get()
    {
        List<MmsFlashPromotion> flashPromotionList = mmsFlashPromotionService.get();
        return CommonResult.success(flashPromotionList);
    }

    @ApiOperation("根据上线状态获取秒杀活动列表")
    @GetMapping("/{status}")
    public CommonResult get(@PathVariable("status") int status)
    {
        List<MmsFlashPromotion> flashPromotionList = mmsFlashPromotionService.get(status);
        return CommonResult.success(flashPromotionList);
    }

    @ApiOperation("创建一个秒杀活动")
    @PostMapping("")
    public CommonResult create(@RequestBody MmsFlashPromotion flashPromotion)
    {
        CommonResult commonResult;
        int result = mmsFlashPromotionService.create(flashPromotion);
        if (result!=0) {
            commonResult = CommonResult.success(result);
        }
        else {
            commonResult=CommonResult.failed("创建秒杀活动失败");
            log.debug("创建秒杀活动失败");
        }
        return commonResult;
    }

    @ApiOperation("根据id更新秒杀活动")
    @PutMapping("/{id}")
    @ResponseBody
    public CommonResult update(@PathVariable("id") Long id,@RequestBody MmsFlashPromotion flashPromotion)
    {
        CommonResult commonResult;
        int result = mmsFlashPromotionService.update(id, flashPromotion);
        if (result==1)
        {
            //更新成功
            commonResult=CommonResult.success(flashPromotion);
        }
        else {
            //更新失败
            commonResult=CommonResult.failed("更新秒杀活动失败");
            log.debug("更新秒杀活动失败,id={},data={}",id,flashPromotion);
        }
        return commonResult;
    }

    @ApiOperation("根据id删除秒杀活动")
    @DeleteMapping("/{id}")
    public CommonResult delete(@PathVariable("id")Long id)
    {
        CommonResult commonResult;
        int result = mmsFlashPromotionService.delete(id);
        if (result==1)
        {
            //删除成功
            commonResult=CommonResult.success(id);
        }
        else
        {
            //删除失败
            commonResult=CommonResult.failed("删除秒杀活动失败,id="+id);
            log.debug("删除秒杀活动失败,id={}",id);
        }
        return commonResult;
    }

    @ApiOperation("删除多条秒杀活动")
    @DeleteMapping("")
    public CommonResult delete(@RequestBody List<Long> ids)
    {
        CommonResult commonResult;
        int result = mmsFlashPromotionService.delete(ids);
        //删除成功
        commonResult=CommonResult.success("执行完成，共删除"+result+"条");
        return commonResult;
    }

    @ApiOperation("批量添加秒杀商品")
    @PostMapping("goods")
    public CommonResult createGoods(@RequestBody MmsFlashPromotionGoodsAddDto flashPromotionGoodsAddDto)
    {
        List<GmsGoods> goodsList = flashPromotionGoodsAddDto.getGoodsList();
        List<MmsFlashPromotionGoodsRelation> flashPromotionGoodsRelationList=new LinkedList<>();
        for (int i=0;i<goodsList.size();i++)
        {
            MmsFlashPromotionGoodsRelation flashPromotionGoodsRelation=new MmsFlashPromotionGoodsRelation();
            flashPromotionGoodsRelation.setFlashPromotionId(flashPromotionGoodsAddDto.getFlashPromotionId());
            flashPromotionGoodsRelation.setFlashPromotionSessionId(flashPromotionGoodsAddDto.getFlashPromotionSessionId());
            flashPromotionGoodsRelation.setGoodsId(goodsList.get(i).getId());
            flashPromotionGoodsRelationList.add(flashPromotionGoodsRelation);
        }
        int result = mmsFlashPromotionService.createGoods(flashPromotionGoodsRelationList);
        return CommonResult.success("执行完成，共添加"+result+"条");
    }

    @ApiOperation("根据活动场次和时间段获取秒杀商品")
    @GetMapping("goods/{flashPromotionId}/{flashPromotionSessionId}")
    public CommonResult getGoods(@PathVariable("flashPromotionId") Long flashPromotionId,@PathVariable("flashPromotionSessionId")Long flashPromotionSessionId)
    {
        List<MmsFlashPromotionGoodsVo> flashPromotionGoodsVoList = mmsFlashPromotionService.getFlashPromotionGoods(flashPromotionId, flashPromotionSessionId);
        return CommonResult.success(flashPromotionGoodsVoList);
    }
}
