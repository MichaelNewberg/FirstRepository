package com.example.boot.Exceptions;

public class AuthenticationFailed extends RuntimeException{
    public AuthenticationFailed(String message){
        super(message);
    }
}
