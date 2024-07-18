package com.example.fitnessClub.fitnessClub.Exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message)  {
        super(message);
    }
}
