package com.SpringSecurity.SpringSecurity.controller;

import com.SpringSecurity.SpringSecurity.model.User;
import com.SpringSecurity.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getAll")
    public List<User> getALlUsers() {
        return userService.getALlUsers();
    }



}
