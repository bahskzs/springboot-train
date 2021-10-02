package com.yqy.jpa.service;

import com.yqy.jpa.dao.UserDao;
import com.yqy.jpa.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author bahsk
 * @createTime 2021-10-02 20:22
 * @description
 */
@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public Optional<User> findById(Long id) {
        return  userDao.findById(id);
    }

    public Iterable<User> list() {
        return userDao.findAll();
    }
}
