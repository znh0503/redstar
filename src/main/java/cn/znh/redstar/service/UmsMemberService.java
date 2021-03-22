package cn.znh.redstar.service;

import cn.znh.redstar.common.api.CommonResult;

/**
 * @author : znh
 * @date : 22:17 2021/3/16
 * 会员登录注册管理Service
 */
public interface UmsMemberService {

    /**
     * 生成验证码,通过邮箱发送
     * @param email 邮箱号
     * @return
     */
    CommonResult generateAuthCode(String email);

    /**
     * 验证手机号和验证码是否匹配
     * @param telephone
     * @param authCode
     * @return
     */
    CommonResult verifyAuthCode(String telephone,String authCode);
}
