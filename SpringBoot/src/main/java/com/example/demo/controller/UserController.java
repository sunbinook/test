package com.example.demo.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("user")
public class UserController {
    @GetMapping("hello")

    public String hello(){
        return "hello userworld";
    }
    @RequestMapping("list")
    public String list(){
        return "user";
    }
}
