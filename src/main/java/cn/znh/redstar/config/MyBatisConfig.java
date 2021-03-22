package cn.znh.redstar.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * @author : znh
 * @date : 19:00 2021/3/14
 */
@Configuration
@MapperScan({"cn.znh.redstar.mbg.mapper","com.znh.redstar.dao"})
public class MyBatisConfig {
}
