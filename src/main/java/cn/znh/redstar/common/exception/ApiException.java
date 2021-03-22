package cn.znh.redstar.common.exception;

import cn.znh.redstar.common.api.StatusCode;

/**
 * @author : znh
 * @date : 17:01 2021/3/20
 */
public class ApiException extends RuntimeException{
    private StatusCode errorCode;

    public ApiException(StatusCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public StatusCode getErrorCode() {
        return errorCode;
    }
}
