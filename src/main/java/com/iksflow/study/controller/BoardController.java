package com.iksflow.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    public BoardController() {
        System.out.println("===> BootController 생성");
    }

    @GetMapping("/hello")
    public String hello(String name) {
        return "Hello : " + name;
    }
    @PostMapping("/hello")
    public String helloPost(String name) {
        return "Hello : " + name;
    }
}