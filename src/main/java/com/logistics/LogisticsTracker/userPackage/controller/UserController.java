package com.logistics.LogisticsTracker.userPackage.controller;

import com.logistics.LogisticsTracker.userPackage.entity.User;
import com.logistics.LogisticsTracker.userPackage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {


private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
}

    @RequestMapping("/userSave")
    @ResponseBody
    public User saveUser(@RequestBody User newUser ) {

        System.out.println(userService.saveUser(newUser));

        return newUser;
    }

    @RequestMapping("/saveWholeUser")
    @ResponseBody
    public User saveWholeUser(@RequestBody User user){

        System.out.println(userService.saveUser(user));

        user.getEmail();

        return user;

    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public User upsateUser(@RequestBody User user){

        System.out.println(userService.saveUser(user));

        return user;

    }


    @GetMapping("/showAll")
    @ResponseBody
    public List<User> getAll(){
        return userService.getAllUsers();
    }



}
