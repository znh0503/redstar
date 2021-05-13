package cn.znh.redstar.service;

import cn.znh.redstar.common.api.CommonResult;
import cn.znh.redstar.dto.UmsMemberParam;
import cn.znh.redstar.mbg.model.UmsMember;
import cn.znh.redstar.mbg.model.UmsMemberReceiveAddress;

import java.util.List;

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

    /**
     * 获取全部用户
     * @return
     */
    List<UmsMember> get();

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    UmsMember get(String username);

    /**
     * 绑定手机号码
     * @param username
     * @param phone
     * @return
     */
    int phone(String username,String phone);

    /**
     * 获取会员的收货地址
     * @param memberId
     * @return
     */
    List<UmsMemberReceiveAddress> receiveAddressGet(Long memberId);

    /**
     * 创建一条会员的收货地址
     * @param memberReceiveAddress
     * @return
     */
    int receiveAddressCreate(UmsMemberReceiveAddress memberReceiveAddress);

    /**
     * 更新一条会员收货地址
     * @param memberReceiveAddress
     * @return
     */
    int receiveAddressUpdate(UmsMemberReceiveAddress memberReceiveAddress);

    /**
     * 根据id删除一条会员收货地址
     * @param id
     * @return
     */
    int receiveAddressDelete(Long id);


}
