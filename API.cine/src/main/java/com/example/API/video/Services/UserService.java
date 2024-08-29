package com.example.API.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.API.models.User;
import com.example.API.repositories.IUserRepository;
import com.example.API.video.Dtos.UserResponses;
import com.example.API.video.Mappers.UserMapper;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public UserResponses getUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        return UserMapper.toUserResponse(user);
    }

    public UserResponses getUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return UserMapper.toUserResponse(user);
    }

    public User registerUser(UserRequest request) {
        User user = UserMapper.toUserEntity(request);
        return userRepository.save(user);
    }

}
