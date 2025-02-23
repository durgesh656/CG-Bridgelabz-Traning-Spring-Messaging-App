package com.example.RestAPI.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MessageRestController {

    // api will return hello message
    @RequestMapping(value = {"", "/"})
    public String sayHello(){
        return "Hello from  BridgeLabz.";

    }
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String usingPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
