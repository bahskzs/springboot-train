package com.yqy.tkmapper;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author bahsk
 * @createTime 2021-10-02 21:42
 * @description
 */
@SpringBootApplication
@MapperScan("com.yqy.tkmapper")
public class TkMapperDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(TkMapperDemoApplication.class, args);
    }
}
