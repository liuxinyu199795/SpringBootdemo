package com.lxy.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@EnableAutoConfiguration//自动配置，相当于谢了Spring的配置文件
public class HelloController {
    @RequestMapping("hello/{name}")
    @ResponseBody//转换成json数据返回
    public String hello(@PathVariable("name") String name){
        return name +"Hello,SpringBoot";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class);
    }
}
