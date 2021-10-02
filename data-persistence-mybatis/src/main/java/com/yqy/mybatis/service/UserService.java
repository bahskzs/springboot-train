package com.yqy.mybatis.service;

import com.yqy.mybatis.dao.UserDao;
import com.yqy.mybatis.domain.User;

import com.yqy.mybatis.dto.UserDTO;
import com.yqy.mybatis.util.CopyUtil;
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
    private UserDao userDao;

    public User findById(Long id) {
        User user = userDao.selectByPrimaryKey(id);
        return  user;
    }

    public List<UserDTO> list() {
        List<User> userList = userDao.selectByExample(null);
        List<UserDTO> users = CopyUtil.copyList(userList ,UserDTO.class);
        return users;
    }
}
