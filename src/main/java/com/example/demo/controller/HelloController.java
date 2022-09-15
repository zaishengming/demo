package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "no directory, Spring Boot...";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello Spring Boot...";
    }

    @RequestMapping("/login")
    public String login(){
        return "I want to login Spring Boot...";
    }

}
