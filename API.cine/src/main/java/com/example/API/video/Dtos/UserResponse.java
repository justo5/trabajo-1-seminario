package com.example.API.video.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@GetMapping("/user/connection-status")

public UserResponses getUserConnectionStatus() {
    UserResponses response = new UserResponses();
    return response;
}