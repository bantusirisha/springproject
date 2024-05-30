package com.example.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello World!!!!";
    }
}