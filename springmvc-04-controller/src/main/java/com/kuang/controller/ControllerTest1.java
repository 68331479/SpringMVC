package com.kuang.controller;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: LDeng
 * @Date: 2020-02-29 13:57
 */

//实现类Controller的类 说明就是一个Controller

public class ControllerTest1 implements Controller {
    @Nullable
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        System.out.println("debug================");
        mv.addObject("msg","ControllerTest1");
        mv.setViewName("test");



        return mv;
    }
}
