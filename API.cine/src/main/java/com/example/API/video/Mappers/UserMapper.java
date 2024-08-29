package com.example.API.video.Mappers;

import com.example.API.models.User;
import com.example.API.video.Dtos.UserResponses;

public class UserMapper {

    public static UserResponses toUserResponse(User user) {
        UserResponses response = new UserResponses();
        response.setConnection(true);
        return response;
    }

    public static User toUserEntity(UserRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        return user;
    }
}
