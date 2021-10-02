package com.yqy.jpa.dao;

import com.yqy.jpa.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

/**
 * @author bahsk
 * @createTime 2021-10-02 21:09
 * @description
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {

}
