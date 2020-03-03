package com.kuang.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: LDeng
 * @Date: 2020-03-03 10:51
 */
//@Controller
    @RestController//标注RestController的类的所有方法会自动返回JSON字符串
public class UserController {

    @RequestMapping("/j1")
    //@ResponseBody//不走视图解析器，返回字符串直接响应浏览器
    public String json1() throws JsonProcessingException {
        User user=new User("张三三",99,"女");
        //jackson ， ObjectMapper
        ObjectMapper mapper=new ObjectMapper();
        String s = mapper.writeValueAsString(user);
        return s;
        //return "test";
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        User user1=new User("张三三",99,"女");
        User user2=new User("张三四",33,"男");
        //jackson ， ObjectMapper
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);

        ObjectMapper mapper=new ObjectMapper();
        String s = mapper.writeValueAsString(userList);
        return s;
        //return "test";
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);
        String s = mapper.writeValueAsString(format);
        return s;
        //return "test";
    }

    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {
        User user1=new User("张三三",99,"女");
        User user2=new User("张三四",33,"男");
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        System.out.println("=========JAVA对象转JSON字符串=================");
        String s1 = JSON.toJSONString(user1);
        String s2 = JSON.toJSONString(user2);
        String sl = JSON.toJSONString(userList);
        System.out.println("JSON串表示s1对象=========>"+s1);
        System.out.println("JSON串表示s2对象=========>"+s2);
        System.out.println("JSON串表示userList数组对象=========>"+sl);

        System.out.println("==========JSON串转JAVA对象======================");
        User json_user1 = JSON.parseObject(s1,User.class);
        User json_user2 = JSON.parseObject(s2,User.class);
        List<User> json_list=JSON.parseArray(sl,User.class);
        System.out.println("s1对象转回JSON串=========>"+json_user1);
        System.out.println("s2对象转回JSON串=========>"+json_user2);
        System.out.println("sl对象转回JSON串=========>"+json_list);

        return sl;
    }
}
