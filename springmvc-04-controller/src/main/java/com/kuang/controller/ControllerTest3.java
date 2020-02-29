package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: LDeng
 * @Date: 2020-02-29 17:15
 */
@Controller
@RequestMapping("/c3")
public class ControllerTest3 {

    @RequestMapping("/t1")
    public String test1(Model model){

        model.addAttribute("msg","ControllerTest3");

        return "test";
    }

}
