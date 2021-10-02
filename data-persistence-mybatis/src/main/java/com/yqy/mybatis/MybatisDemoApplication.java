package com.yqy.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author bahsk
 * @createTime 2021-10-02 20:29
 * @description
 */
@SpringBootApplication
@MapperScan("com.yqy.mybatis.*")
@EnableScheduling
@EnableAsync
public class MybatisDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisDemoApplication.class,args);
    }
}
