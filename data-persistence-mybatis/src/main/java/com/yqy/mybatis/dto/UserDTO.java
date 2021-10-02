package com.yqy.mybatis.dto;

import lombok.Data;

/**
 * @author bahsk
 * @createTime 2021-10-02 22:23
 * @description
 */
@Data
public class UserDTO {
    /**
     * ID
     */
    private Long id;

    /**
     * 登陆名
     */
    private String loginName;

    /**
     * 昵称
     */
    private String name;

    /**
     * 密码
     */
    private String password;
}
