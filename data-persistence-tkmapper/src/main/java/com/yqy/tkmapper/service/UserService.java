package com.yqy.tkmapper.service;


import com.yqy.tkmapper.dao.UserMapper;
import com.yqy.tkmapper.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author bahsk
 * @createTime 2021-10-02 20:22
 * @description
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User findById(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return  user;
    }

    public List<User> list() {
        List<User> users = userMapper.selectAll();
        return users;
    }


}
