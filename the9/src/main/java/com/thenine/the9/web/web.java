package com.thenine.the9.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class web {
    @GetMapping("/demo")
    public String demo(String test) {
        return "Hello world";
    }
}
