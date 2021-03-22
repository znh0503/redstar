package cn.znh.redstar.common.exception;

import cn.znh.redstar.common.api.StatusCode;

/**
 * @author : znh
 * @date : 17:00 2021/3/20
 * 断言处理类，用于抛出各种api异常
 */
public class Asserts {
    public static void fail(String message)
    {
        throw new ApiException(message);
    }

    public static void fail(StatusCode errorCode) {
        throw new ApiException(errorCode);
    }
}
