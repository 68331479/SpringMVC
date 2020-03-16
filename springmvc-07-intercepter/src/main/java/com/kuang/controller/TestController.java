package com.kuang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LDeng
 * @Date: 2020-03-16 17:12
 */

@RestController
public class TestController {

    @GetMapping("/t1")
    public String test(){
        System.out.println("test()methode....");
        return "ok";
    }
}
