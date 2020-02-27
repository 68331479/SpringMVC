package com.kuang.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: LDeng
 * @Date: 2020-02-27 19:52
 */


public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        //业务代码
        String result="HelloSpringMVC3!!!!!!!!!!!";
        //放入数据
        modelAndView.addObject("msg",result);
        //视图跳转====>test.jsp
        modelAndView.setViewName("test");

        return modelAndView;
    }
}
