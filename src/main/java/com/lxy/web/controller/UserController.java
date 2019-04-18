package com.lxy.web.controller;

import com.lxy.test.test1.service.UserServiceImpl;
import com.lxy.test.test2.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("user")
public class UserController {

    @Autowired//自动注入
    private UserServiceImpl userService;//数据库1
    @Autowired
    private CustomerServiceImpl customerService;//数据库2

    @ResponseBody
    @RequestMapping("register")
    public String register(String username,String password){
        //把数据保存在test1数据库
        userService.register(username,password);

        //把数据保存在test2数据库
        customerService.save(username,"110");
        return "success";
    }



}
