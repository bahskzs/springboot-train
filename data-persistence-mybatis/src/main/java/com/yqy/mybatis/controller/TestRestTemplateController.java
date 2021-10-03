package com.yqy.mybatis.controller;

import com.yqy.mybatis.dto.CommonResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author bahsk
 * @createTime 2021-10-03 21:58
 * @description
 * @program: springboot-train
 */
@RestController
@RequestMapping("/rest")
public class TestRestTemplateController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/list")
    public CommonResp list() {
       return restTemplate.getForObject("http://localhost:9520/wiki/list", CommonResp.class);
    }
}
