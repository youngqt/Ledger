package com.tiger.ledger.application.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * 需要登录才能访问的控制器**

 @since 2022-12-11*/
@RestController
@RequestMapping("/controller")
public class YourController {
    @RequestMapping("method")@PreAuthorize("hasAuthority('YourController:YourMethod')")
    public String yourMethod(){
        return "这个信息只有登录才能看到";
    }
}