package com.example.API.video.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table (name = "usuario")

public class User {

    @Id
    private Long id;
    private String username;
    private String email;
    private String password;

 }
