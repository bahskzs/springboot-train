package com.yqy.mybatis.controller;



import com.yqy.mybatis.domain.User;
import com.yqy.mybatis.dto.CommonResp;
import com.yqy.mybatis.dto.UserDTO;
import com.yqy.mybatis.service.UserService;
import org.springframework.validation.annotation.Validated;
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
    public CommonResp list() {
        CommonResp<List<UserDTO>> listCommonResp = new CommonResp<>();
        listCommonResp.setContent(userService.list());
        return listCommonResp;
    }
}
