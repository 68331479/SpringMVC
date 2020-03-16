package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: LDeng
 * @Date: 2020-03-13 10:04
 */

@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){

        return "hello";
    }

    @RequestMapping("/t2")//此处name匹配的是ajax中的data中的键值对
    public void t2(String name, HttpServletResponse response) throws IOException {
        System.out.println("t2:param=====>"+name);
        if("baidu".equals(name)){
            response.getWriter().print("baidu");
        }else{
            response.getWriter().print("false");
        }

    }

    @RequestMapping("/a2")
    public List<User> a2(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("zs",10,"男"));
        users.add(new User("ls",20,"男"));
        users.add(new User("ww",30,"女"));


        return users;
    }

    @RequestMapping("/a3")
    public String a3(String username,String password){
        String msg=null;
        if(username!=null){
            if("admin".equals(username)){
                msg="ok";
            }else{
                msg="用户名不是admin";
            }
        }
        if(password!=null){
            if("111111".equals(password)){
                msg="ok";
            }else{
                msg="密码不正确";
            }
        }
        return msg;

    }
}
