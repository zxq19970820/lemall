package com.zzzl.lemall.controller;

import com.zzzl.lemall.domain.User;
import com.zzzl.lemall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @CrossOrigin(value = "*")
    @PostMapping("/login")
    public User login(@RequestParam("username")String userName,
                      @RequestParam("password") String password){
        return userService.login(userName,password);
    }

    @CrossOrigin(value = "*")
    @RequestMapping("/icon/{userid}")
    public User getIcon(@PathVariable("userid") int userid){
        System.out.println(userService.getUserById(userid));
        return userService.getUserById(userid);
    }

    @CrossOrigin
    @RequestMapping("/modifyInformation")
    public String updateUser(User user){
        System.out.println(user);
        boolean flag = userService.updateUser(user);
        if(flag){
            return "success";
        }

        return "fail";
    }

}
