package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test success!";
    }

    @RequestMapping("/devtest")
    public String devtest(){
        return "devtest success!";
    }
}
