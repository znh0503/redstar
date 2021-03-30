package cn.znh.redstar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : znh
 * @date : 23:18 2021/3/28
 * 自定义mvc配置
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //设置项目访问首页
        registry.addViewController("/").setViewName("forward:login.html");
    }
}
