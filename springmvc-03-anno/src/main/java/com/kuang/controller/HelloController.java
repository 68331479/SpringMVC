package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: LDeng
 * @Date: 2020-02-27 19:52
 */


@Controller
public class HelloController{

    @RequestMapping("/hello")
    public String hello(Model model){
        //封装数据
        System.out.println("debug=========>");
        model.addAttribute("msg","Hello,Annotation1");
        return "hello";// 会被视图解析器处理
    }

    @RequestMapping("/hello2")
    public String hello2(Model model){
        //封装数据
        model.addAttribute("msg","Hello,Annotation2");
        return "hello";// 会被视图解析器处理
    }

    @RequestMapping("/hello3")
    public String hello3(Model model){
        //封装数据
        model.addAttribute("msg","Hello,Annotation3");
        return "hello";// 会被视图解析器处理
    }

}
