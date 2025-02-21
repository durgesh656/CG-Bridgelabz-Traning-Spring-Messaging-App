package com.example.RestAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MessageRestController {

    // api will return hello message
    @RequestMapping(value = {"", "/"})
    public String sayHello(){
        return "Hello from  BridgeLabz.";
    }
}
