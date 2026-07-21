package com.springRest.Greet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/greeting")
    public String greet(){
        return "Hello! World.";
    }
}
