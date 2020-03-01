package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: LDeng
 * @Date: 2020-03-01 18:59
 */
@Controller
public class EncodingController {

    //使用过滤器解析乱码
    @PostMapping("/e/t1")
    public String test1(String name, Model model){
        System.out.println(name);
        model.addAttribute("msg",name);

        return "test";
    }
}
