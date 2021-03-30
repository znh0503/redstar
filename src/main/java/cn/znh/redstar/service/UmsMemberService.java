package cn.znh.redstar.service;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.dto.UmsMemberParam;
import cn.znh.redstar.mbg.model.UmsMember;

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
     * 验证邮箱号和验证码是否匹配
     * @param email
     * @param authCode
     * @return
     */
    CommonResult verifyAuthCode(String email,String authCode);

    /**
     * 会员注册
     * @param umsMemberParam 会员注册参数
     * @return
     */
    UmsMember register(UmsMemberParam umsMemberParam);

    /**
     * 根据验证码登录
     * @param username
     * @param authCode
     * @return
     */
    CommonResult loginByAuthCode(String username,String authCode);

    /**
     * 根据密码登录
     * @param username
     * @param password
     * @return
     */
    CommonResult loginByPassword(String username,String password);
}
