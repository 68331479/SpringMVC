package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: LDeng
 * @Date: 2020-03-01 18:31
 */

@Controller
@RequestMapping("/user")
public class UserController {

    //localhost:8080/user/t1?name=xxx
    @GetMapping("/t1")
    public String test1(String name, Model model){
        //接收前端参数
        System.out.println("接受的前端参数为---"+name);
        //将返回结果返回前端
        model.addAttribute("msg",name);
        return "test";
    }

    //localhost:8080/user/t1?username=xxx
    @GetMapping("/t2")
    //可以通过@RequestParam来显式指定前端传递的参数名
    public String test2(@RequestParam("username") String name, Model model){
        //接收前端参数
        System.out.println("接受的前端参数为---"+name);
        //将返回结果返回前端
        model.addAttribute("msg",name);
        return "test";
    }

    //前端接收的是对象: id,name,age
    @GetMapping("/t3")//匹配字段名
    public String test3(User user){
        System.out.println(user);
        return "test";
    }


    @GetMapping("/t4")
    public String test4(ModelMap map){

        return "test";
    }
}
