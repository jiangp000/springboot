package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @RequestMapping("/hello")
    public String hello(){
//        调用业务 接受参数
        return "hello world";
    }
}


