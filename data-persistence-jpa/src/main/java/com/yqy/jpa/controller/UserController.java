package com.yqy.jpa.controller;



import com.yqy.jpa.dao.UserDao;
import com.yqy.jpa.domain.User;
import com.yqy.jpa.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author bahsk
 * @createTime 2021-10-02 20:25
 * @description
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/list")
    public Iterable<User> list() {
        return userService.list();
    }
}
