package com.logistics.LogisticsTracker.controller;

import com.logistics.LogisticsTracker.model.User;
import com.logistics.LogisticsTracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

@Autowired
private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
}

    @RequestMapping("/userSave")
    public void saveUser(@RequestParam("first_name") String firstName, @RequestParam("last_name") String lastName,@RequestParam("email") String email ) {

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);


        User newUser = new User();
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setEmail(email);

        System.out.println(userService.saveUser(newUser));
    }

    @GetMapping("/showAll")
    @ResponseBody
    public List<User> getAll(){
        return userService.getAllUsers();
    }



}
