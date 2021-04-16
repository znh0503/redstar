package cn.znh.redstar.config;

import com.aliyun.oss.OSSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : znh
 * @date : 13:11 2021/4/4
 * 阿里云oss配置
 */
@Configuration
public class OssConfig {
    /**
     * oss对外服务的访问域名
     */
    @Value("${aliyun.oss.endpoint}")
    private String ALIYUN_OSS_ENDPOINT;
    /**
     * 访问身份验证中用到用户标识
     */
    @Value("${aliyun.oss.accessKeyId}")
    private String ALIYUN_OSS_ACCESSKEYID;
    /**
     * 用户用于加密签名字符串和oss用来验证签名字符串的密钥
     */
    @Value("${aliyun.oss.accessKeySecret}")
    private String ALIYUN_OSS_ACCESSKEYSECRET;

    /**
     * 注入oss连接客户端
     * @return
     */
    @Bean
    public OSSClient ossClient()
    {
        return new OSSClient(ALIYUN_OSS_ENDPOINT,ALIYUN_OSS_ACCESSKEYID,ALIYUN_OSS_ACCESSKEYSECRET);
    }
}
