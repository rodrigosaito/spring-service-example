package com.github.rodrigosaito.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class Hello {

    @Value("${config.name}")
    private String name;

    @GetMapping
    public String hello() {
        return "Hello " + name;
    }
}
