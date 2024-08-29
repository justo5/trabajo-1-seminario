package com.example.API.video.Repositories;

import com.example.API.video.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository <User, Integer > {

    User findByUsername(
            String username
    );

    User findByEmail(
            String email
    );
}
