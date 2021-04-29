package cn.znh.redstar.controller;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.mbg.model.MmsFlashPromotion;
import cn.znh.redstar.mbg.model.MmsFlashPromotionSession;
import cn.znh.redstar.service.MmsFlashPromotionSessionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : znh
 * @date : 2:47 2021/4/30
 * 秒杀时间段controller
 */
@Slf4j
@Api(tags = "MmsFlashPromotionSessionController",description = "营销秒杀时间段")
@RestController
@RequestMapping("/flashPromotionSession")
public class MmsFlashPromotionSessionController {
    @Resource
    MmsFlashPromotionSessionService mmsFlashPromotionSessionService;

    @ApiOperation("获取全部秒杀时间段")
    @GetMapping("")
    public CommonResult get()
    {
        List<MmsFlashPromotionSession> flashPromotionSessionList = mmsFlashPromotionSessionService.get();
        return CommonResult.success(flashPromotionSessionList);
    }

    @ApiOperation("根据上线状态获取秒杀时间段")
    @GetMapping("/{status}")
    public CommonResult get(@PathVariable("status") int status)
    {
        List<MmsFlashPromotionSession> flashPromotionSessionList = mmsFlashPromotionSessionService.get(status);
        return CommonResult.success(flashPromotionSessionList);
    }

    @ApiOperation("创建一个秒杀时间段")
    @PostMapping("")
    public CommonResult create(@RequestBody MmsFlashPromotionSession flashPromotionSession)
    {
        CommonResult commonResult;
        int result = mmsFlashPromotionSessionService.create(flashPromotionSession);
        if (result!=0) {
            commonResult = CommonResult.success(result);
        }
        else {
            commonResult=CommonResult.failed("创建秒杀时间段失败");
            log.debug("创建秒杀时间段失败");
        }
        return commonResult;
    }

    @ApiOperation("根据id更新秒杀时间段")
    @PutMapping("/{id}")
    @ResponseBody
    public CommonResult update(@PathVariable("id") Long id,@RequestBody MmsFlashPromotionSession flashPromotionSession)
    {
        CommonResult commonResult;
        int result = mmsFlashPromotionSessionService.update(id, flashPromotionSession);
        if (result==1)
        {
            //更新成功
            commonResult=CommonResult.success(flashPromotionSession);
        }
        else {
            //更新失败
            commonResult=CommonResult.failed("更新秒杀时间段失败");
            log.debug("更新秒杀时间段失败,id={},data={}",id,flashPromotionSession);
        }
        return commonResult;
    }

    @ApiOperation("根据id删除秒杀时间段")
    @DeleteMapping("/{id}")
    public CommonResult delete(@PathVariable("id")Long id)
    {
        CommonResult commonResult;
        int result = mmsFlashPromotionSessionService.delete(id);
        if (result==1)
        {
            //删除成功
            commonResult=CommonResult.success(id);
        }
        else
        {
            //删除失败
            commonResult=CommonResult.failed("删除秒杀时间段失败,id="+id);
            log.debug("删除秒杀时间段失败,id={}",id);
        }
        return commonResult;
    }

    @ApiOperation("删除多条秒杀时间段")
    @DeleteMapping("")
    public CommonResult delete(@RequestBody List<Long> ids)
    {
        CommonResult commonResult;
        int result = mmsFlashPromotionSessionService.delete(ids);
        //删除成功
        commonResult=CommonResult.success("执行完成，共删除"+result+"条");
        return commonResult;
    }
}
