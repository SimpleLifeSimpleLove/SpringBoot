package com.wxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication : 标注这个类是一个SpringBoot的应用
@SpringBootApplication
public class Springboot02HelloworldApplication {

    public static void main(String[] args) {
        // run方法通过反射将SpringBoot启动
        SpringApplication.run(Springboot02HelloworldApplication.class, args);
    }

}
