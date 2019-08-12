package com.logistics.LogisticsTracker.controller;

import com.logistics.LogisticsTracker.model.User;
import com.logistics.LogisticsTracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

private UserService userService;

@Autowired
    public UserController(UserService userService){
        this.userService = userService;
}

@RequestMapping("/userSave")
    public void saveUser(@RequestParam("first_name") String firstName, @RequestParam("last_name") String lastName ) {

    System.out.println(firstName);
    System.out.println(lastName);


    User newUser = new User();
    newUser.setFirstName(firstName);
    newUser.setLastName(lastName);

    userService.saveUser(newUser);

}


}
