package com.example.simplewebapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SimpleWebController {

    @GetMapping
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/{name}")
    public String sayHelloWithName(@PathVariable String name) {
        return "Hello " + name;
    }
}

