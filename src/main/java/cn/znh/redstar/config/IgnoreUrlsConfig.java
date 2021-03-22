package cn.znh.redstar.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;


import java.util.ArrayList;
import java.util.List;

/**
 * @author : znh
 * @date : 11:57 2021/3/19
 * 白名单资源路径配置
 */

@Getter
@Setter
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {
    private List<String> ignoreUrls=new ArrayList<>();
}
