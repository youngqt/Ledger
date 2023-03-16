package com.tiger.ledger.application.controller;

import com.tiger.ledger.base.util.SpringSecurityUtil;
import com.tiger.ledger.domain.model.entity.User;
import com.tiger.ledger.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "无敌小阿鑫是个小可爱吧！";
    }

    @PostMapping ("/login")
    public String login(@RequestBody User paraStr) {

        User user = userService.getByUsername(paraStr.getUsername());
        if(Objects.isNull(user)||!paraStr.getPassword().equals(user.getPassword())){
            return "failed";
        }

        // 权限字符串，这个从你的数据库里读
        List<String> authorities = new ArrayList<>();
        authorities.add("YourController:YourMethod");
        // 判断是否登陆
        if (SpringSecurityUtil.isLogin()) {
            // 登陆了打印一下当前用户名
            System.out.println(SpringSecurityUtil.getCurrentUsername());
        } else {
            // 没登录则进行一次登录
            SpringSecurityUtil.login(user.getUsername(), user.getPassword(), authorities);
        }
        return "success";
    }
}
