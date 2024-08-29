package com.example.API.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.API.models.User;
import com.example.API.services.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.buscarPorEmail(email);
    }

    @GetMapping("/user/username/{username}")
    public UserResponses getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @PostMapping("/user/register")
    public UserResponses registerUser(@RequestBody UserRequest userRequest) {
        User user = userService.registerUser(userRequest);
        return UserMapper.toUserResponse(user);
    }
}
