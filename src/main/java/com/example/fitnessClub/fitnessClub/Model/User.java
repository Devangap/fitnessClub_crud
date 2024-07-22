package com.example.fitnessClub.fitnessClub.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    private String username;

    private String password;
    private String email;


}
