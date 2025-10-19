package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping; // URL Get Mapping
import org.springframework.web.bind.annotation.RestController; // REST API Controller Module

@RestController
public class HelloController {

    // print http://localhost:8080/hello in this string
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring!";
    }
}