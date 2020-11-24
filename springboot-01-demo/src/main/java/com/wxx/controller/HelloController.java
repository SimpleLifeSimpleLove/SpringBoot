package com.wxx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date: 2020/11/24 21:42
 * Content:
 */
// SpringBoot的核心：自动装配!!!
@RestController
public class HelloController {

    // http://localhost:8080
    // http://localhost:8080/hello
    @RequestMapping({"/", "/hello"})
    public String hello() {
        // 接收前端的参数，调用业务
        return "Hello World!";
    }
}
