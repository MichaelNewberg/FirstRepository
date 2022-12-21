package com.example.boot.Exceptions;

public class EntityNotFound extends RuntimeException{
    public EntityNotFound(String message){
        super(message);
    }
    
}
