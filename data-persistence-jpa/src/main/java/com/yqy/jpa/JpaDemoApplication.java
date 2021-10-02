package com.yqy.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.swing.*;

/**
 * @author bahsk
 * @createTime 2021-10-02 21:14
 * @description
 */
@SpringBootApplication
public class JpaDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class,args);
    }
}
