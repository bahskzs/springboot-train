package com.yqy.mybatis.controller;



import com.yqy.mybatis.domain.User;
import com.yqy.mybatis.dto.CommonResp;
import com.yqy.mybatis.dto.UserDTO;
import com.yqy.mybatis.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "UserController",value = "用户管理")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/list")
    @ApiOperation("用户列表")
    public CommonResp list() {
        CommonResp<List<UserDTO>> listCommonResp = new CommonResp<>();
        listCommonResp.setContent(userService.list());
        return listCommonResp;
    }
}
