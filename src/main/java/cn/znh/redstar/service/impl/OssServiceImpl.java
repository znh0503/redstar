package cn.znh.redstar.service.impl;

import cn.hutool.json.JSONUtil;
import cn.znh.redstar.dto.OssCallbackParam;
import cn.znh.redstar.dto.OssCallbackResult;
import cn.znh.redstar.dto.OssPolicyResult;
import cn.znh.redstar.service.OssService;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : znh
 * @date : 13:35 2021/4/4
 */
@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class OssServiceImpl implements OssService {
    /**
     * 签名有效期
     */
    @Value("${aliyun.oss.policy.expire}")
    private int ALIYUN_OSS_EXPIRE;
    /**
     * 上传文件大小
     */
    @Value("${aliyun.oss.maxSize}")
    private int ALIYUN_OSS_MAX_SIZE;
    /**
     * 文件上传成功后的回调地址
     */
    @Value("${aliyun.oss.callback}")
    private String ALIYUN_OSS_CALLBACK;
    /**
     * oss的存储空间名称
     */
    @Value("${aliyun.oss.bucketName}")
    private String ALIYUN_OSS_BUCKET_NAME;
    /**
     * oss对外服务的访问域名
     */
    @Value("${aliyun.oss.endpoint}")
    private String ALIYUN_OSS_ENDPOINT;
    /**
     * 上传文件夹路径前缀
     */
    @Value("${aliyun.oss.dir.prefix}")
    private String ALIYUN_OSS_DIR_PREFIX;
    /**
     * oss连接客户端
     */
    @Resource
    private OSSClient ossClient;

    @Override
    public OssPolicyResult policy() {
        OssPolicyResult ossPolicyResult=new OssPolicyResult();
        //存储目录
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        String dir=ALIYUN_OSS_DIR_PREFIX+sdf.format(new Date());
        //签名有效期
        long expireEndTime=System.currentTimeMillis()+ALIYUN_OSS_EXPIRE*1000;
        Date expiration=new Date(expireEndTime);
        //文件大小
        long maxSize=ALIYUN_OSS_MAX_SIZE*1024*1024;
        //回调
        OssCallbackParam ossCallbackParam=new OssCallbackParam();
        ossCallbackParam.setCallbackUrl(ALIYUN_OSS_CALLBACK);
        ossCallbackParam.setCallbackBody("filename=${object}&size=${size}&mimeType=${mimeType}&height=${imageInfo.height}&width=${imageInfo.width}");
        ossCallbackParam.setCallbackBodyType("application/x-www-form-urlencoded");
        // 提交节点
        String action = "http://" + ALIYUN_OSS_BUCKET_NAME + "." + ALIYUN_OSS_ENDPOINT;
        try{
            PolicyConditions policyConditions = new PolicyConditions();
            policyConditions.addConditionItem(PolicyConditions.COND_CONTENT_LENGTH_RANGE, 0, maxSize);
            policyConditions.addConditionItem(MatchMode.StartWith, PolicyConditions.COND_KEY, dir);
            String postPolicy = ossClient.generatePostPolicy(expiration, policyConditions);
            byte[] binaryData = postPolicy.getBytes("utf-8");
            String policy = BinaryUtil.toBase64String(binaryData);
            String signature = ossClient.calculatePostSignature(postPolicy);
            String callbackData = BinaryUtil.toBase64String(JSONUtil.parse(ossCallbackParam).toString().getBytes("utf-8"));
            // 返回结果
            ossPolicyResult.setAccessKeyId(ossClient.getCredentialsProvider().getCredentials().getAccessKeyId());
            ossPolicyResult.setPolicy(policy);
            ossPolicyResult.setSignature(signature);
            ossPolicyResult.setDir(dir);
            ossPolicyResult.setCallback(callbackData);
            ossPolicyResult.setHost(action);
        }
        catch (Exception e)
        {
            log.error("签名生成失败:{}",e);
        }

        return ossPolicyResult;
    }

    @Override
    public OssCallbackResult callback(HttpServletRequest request) {
        OssCallbackResult ossCallbackResult=new OssCallbackResult();
        //获取文件名字
        String filename=request.getParameter("filename");
        filename = "http://".concat(ALIYUN_OSS_BUCKET_NAME).concat(".").concat(ALIYUN_OSS_ENDPOINT).concat("/").concat(filename);
        ossCallbackResult.setFilename(filename);
        ossCallbackResult.setSize(request.getParameter("size"));
        ossCallbackResult.setMimeType(request.getParameter("mimeType"));
        ossCallbackResult.setWidth(request.getParameter("width"));
        ossCallbackResult.setHeight(request.getParameter("height"));
        return ossCallbackResult;
    }
}
