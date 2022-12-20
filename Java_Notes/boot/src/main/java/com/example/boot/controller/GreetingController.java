package com.example.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.boot.entities.User;

@RestController
public class GreetingController {

    /*private static List<User> users;
    private int count =1;
    public GreetingController(){
        users = new ArrayList<>();
    }*/
    @GetMapping("/hello")     //same as app.get()
    public String hellowWorld(){
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String personalGreeting(@PathVariable String name){ //specifies that the input of name correlates to the path {name}
    return "Hello "+ name;
    }

    /*@PostMapping("/add")       //same as app.post()
    public int addition(int num){
        return num + 5;
    }
    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        user.setId(count);
        users.add(user);
        count++;
        return user;
    }
    @GetMapping("/user/{index}")
    public ResponseEntity<User> getUser(@PathVariable int index){
        return new ResponseEntity<>(users.get(index), HttpStatus.OK); //setting HTTP status as a custom (I_AM_A_TEAPOT) returns I am a teapot 418
    }*/
}


