package com.yqy.mybatis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author bahsk
 * @createTime 2021-10-03 21:50
 * @description
 * @program: springboot-train
 */
@RestController
@Slf4j
public class TestRedisController {

    @Resource
    private RedisTemplate redisTemplate;

    @GetMapping("/redis/get/{key}")
    public Object get(@PathVariable String key) {
        Object o = redisTemplate.opsForValue().get(key);
        log.info("key: {}, value: {}", key, o);
        return o;
    }

    @GetMapping("/redis/set/{key}/{value}")
    public String set(@PathVariable String key, @PathVariable String value) {
        redisTemplate.opsForValue().set(key, value, 3600, TimeUnit.SECONDS);
        log.info("key: {}, value: {}", key, value);
        return "success";
    }
}
