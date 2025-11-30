package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping; // URL Get Mapping
import org.springframework.web.bind.annotation.RestController; // REST API Controller Module
import org.springframework.stereotype.Controller;

@RestController // HTTP Response Body Return Module
public class HelloRestController {

    @GetMapping("/") // http://localhost:8543/
    public String index() {
        return "Welcome to Demo Application!";
    }

    @GetMapping("/hello") // http://localhost:8543/hello
    public String hello() {
        return "Hello, Spring!";
    }

    @GetMapping("/api/hello") // http://localhost:8080/api/hello (클라이언트 요청에 JSON 등 데이터 응답)  
    public String apiHello() {
        // 데이터 처리...
        return "안녕하세요! 이건 REST API 응답입니다.";
    }
}

@Controller // HTML View Return Module
class HelloPageController {

    @GetMapping("/hellohtml") // http://localhost:8080/hellohtml
    public String helloPage() {
        return "hello"; // templates/hello.html rendering
    }
}