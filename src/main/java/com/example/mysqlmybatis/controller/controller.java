package com.example.mysqlmybatis.controller;

import com.example.mysqlmybatis.mapper.UserMapper;
import com.example.mysqlmybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

@Controller

public class controller {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/register")

    @RequestMapping("/register")
    public String register(HttpServletRequest request){
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");

        if(userName != null &&passWord != null){
            System.out.println(userName);
            System.out.println(passWord);
        }

        //创建User
        User user = new User();
        user.setUserName(userName);
        user.setPassWord(passWord);

        userMapper.addUser(user);

        return "register";
    }
}
