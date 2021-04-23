package com.annieliu.test.hello.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuna
 * @Description: ${description}
 * @Date: 2021-04-23 09:52
 * @Version: 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello CICD";
    }
}
