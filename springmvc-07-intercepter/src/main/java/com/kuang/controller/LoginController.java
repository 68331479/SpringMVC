package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author: LDeng
 * @Date: 2020-03-17 10:57
 */

@Controller
public class LoginController {


    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/tologin")
    public String tologin(){
        return "login";
    }


    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model){
        //把用户信息存在session中

        session.setAttribute("userLoginInfo",username);
        model.addAttribute("username",username);
        return "main";
    }


    @RequestMapping("/logout")
    public String logout(HttpSession session, String username, String password, Model model){
        //把用户信息存在session中

        //session.invalidate();
        session.removeAttribute("userLoginInfo");

        return "login";
    }




}
