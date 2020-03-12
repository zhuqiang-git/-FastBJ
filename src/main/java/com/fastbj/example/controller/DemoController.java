package com.fastbj.example.controller;


import com.fastbj.user.model.User;
import com.fastbj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

@Controller
@RequestMapping("/home")
public class DemoController {

    @Autowired
    private UserService userService;





    @RequestMapping("/index")
    public String index() {


        ////新提交的

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now;
        now = new Date();
        User userInfo=new User();
        userInfo.setId(UUID.randomUUID().toString());
        userInfo.setLoginName("linux"+new Random().nextInt());
        userInfo.setUserName("duanxl"+new Random().nextInt());
        userInfo.setPassword(UUID.randomUUID().toString());
        userInfo.setCreateDate(now);
        int result=0;
        result=userService.insert(userInfo);
        System.out.println("================"+result);
        return "index";
    }

}
