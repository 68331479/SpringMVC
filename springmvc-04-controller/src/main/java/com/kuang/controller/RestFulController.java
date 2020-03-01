package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: LDeng
 * @Date: 2020-02-29 20:14
 */

@Controller
public class RestFulController {

    //原来:        http://localhost:8080/add?a=1&b=2

    @RequestMapping("/add")
    public String test1(int a, int b, Model model){
        int res=a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }

    //RestFul风格:
    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }

    //通过提交方式控制执行的方法
    @GetMapping("/add")
    public String test3(Model model){
        model.addAttribute("msg","这是GetMapping");
        return "test";
    }

    @PostMapping("/add")
    public String test4(Model model){
        model.addAttribute("msg","这是PostMapping");
        return "test";
    }

}
