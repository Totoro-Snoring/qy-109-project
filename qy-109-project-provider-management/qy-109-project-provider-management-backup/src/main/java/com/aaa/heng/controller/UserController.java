package com.aaa.heng.controller;

import com.aaa.heng.base.BaseService;
import com.aaa.heng.base.CommonController;
import com.aaa.heng.base.ResultData;
import com.aaa.heng.model.User;
import com.aaa.heng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zjh
 * @Date 2020/7/8
 * @Description //TODO
 */
@RestController
public class UserController extends CommonController<User> {

    @Autowired
    private UserService userService;

    @Override
    public BaseService<User> getBaseService() {
        return userService;
    }

    @PostMapping("/add")
    public ResultData add(User user) {
        return userService.insertDta(user);
    }

    @PostMapping("/add")
    public ResultData selectAllRoles() {
        return userService.selectAllRoles();
    }

}
