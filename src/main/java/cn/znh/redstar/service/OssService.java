package cn.znh.redstar.service;

import cn.hutool.http.HttpRequest;
import cn.znh.redstar.dto.OssCallbackResult;
import cn.znh.redstar.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : znh
 * @date : 13:28 2021/4/4
 * 阿里云oss上传管理service
 */
public interface OssService {
    /**
     * oss上传策略生成
     * @return
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     * @param request
     * @return
     */
    OssCallbackResult callback(HttpServletRequest request);
}
