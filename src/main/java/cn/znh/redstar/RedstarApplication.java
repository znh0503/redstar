package cn.znh.redstar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"cn.znh.redstar.mbg.mapper","cn.znh.redstar.dao"})
public class RedstarApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedstarApplication.class, args);
    }

}
