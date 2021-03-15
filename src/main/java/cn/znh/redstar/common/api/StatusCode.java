package cn.znh.redstar.common.api;

/**
 * 封装的状态码和消息
 * @author : znh
 * @date : 0:26 2021/3/15
 */
public interface StatusCode {
    /**
     * 返回状态码
     * @return
     */
    long getCode();

    /**
     * 返回信息
     * @return
     */
    String getMessage();
}
