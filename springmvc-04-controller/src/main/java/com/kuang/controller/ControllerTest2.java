package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: LDeng
 * @Date: 2020-02-29 17:01
 */

@Controller//代表该类会被spring托管
public class ControllerTest2 {
    @RequestMapping("/t2")//映射地址
    public String test1(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test";//返回跳转页面
    }

    @RequestMapping
    public String t3(Model model){
        model.addAttribute("msg","ControllerTest3");
        return "test";//返回跳转页面
    }

}
