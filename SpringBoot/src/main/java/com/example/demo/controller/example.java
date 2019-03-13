package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class example {
    @RequestMapping("/")
    String home(){
        return "helloWorld!!";
    }
    @RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName){
    return "hello"+myName+"!!!";
    }
}
