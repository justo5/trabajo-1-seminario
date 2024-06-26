package com.example.controllers;

import com.example.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> userList;

    public UserController() {
        this.userList = new ArrayList<>();
    }

    public void createUser(User user) {
        userList.add(user);
        System.out.println("Usuario creado: " + user.getName());
    }

   
}
