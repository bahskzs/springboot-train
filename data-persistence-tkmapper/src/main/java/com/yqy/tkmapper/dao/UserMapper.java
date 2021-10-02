package com.yqy.tkmapper.dao;

import com.yqy.tkmapper.domain.User;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author bahsk
 */
public interface UserMapper extends Mapper<User>, MySqlMapper<User> {
}
