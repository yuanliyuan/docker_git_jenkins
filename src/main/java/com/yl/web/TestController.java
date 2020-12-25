package com.yl.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 袁黎
 * @Date: 2020-12-25 18:03
 **/
@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/hello")
    public String hello() {

        return "hello world";
    }

}
