package com.SpringSecurity.SpringSecurity.service;

import com.SpringSecurity.SpringSecurity.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService
{
    List<User> user=new ArrayList<>();
    public String addUser(User user) {
        if (user != null) {
            this.user.add(user);
            return "User Saved SuccessFully";
        }

        else
            return "Error Arises";
    }

    public List<User> getALlUsers() {
        return this.user;
    }

}
