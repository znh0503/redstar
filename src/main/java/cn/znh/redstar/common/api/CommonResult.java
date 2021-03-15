package cn.znh.redstar.common.api;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : znh
 * @date : 0:18 2021/3/15
 * 通用返回对象
 */
@Getter
@Setter
public class CommonResult<T> {
    /**
     * 状态码
     */
    private long code;
    /**
     * 消息
     */
    private String message;
    /**
     * 数据
     */
    private T data;

    CommonResult()
    {

    }

    CommonResult(long code,String message,T data)
    {
        this.code=code;
        this.message=message;
        this.data=data;
    }

    /**
     * 成功返回结果
     * @param data  数据
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data)
    {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }

    /**
     * 成功返回结果
     * @param data 数据
     * @param message 信息
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), message, data);
    }



    /**
     * 失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<T>(ResultCode.FAILED.getCode(), message, null);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResult<T> validateFailed(String message) {
        return new CommonResult<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> CommonResult<T> unauthorized(T data) {
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> CommonResult<T> forbidden(T data) {
        return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
    }
}
