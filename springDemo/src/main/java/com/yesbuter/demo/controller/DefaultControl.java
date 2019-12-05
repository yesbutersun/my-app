package com.yesbuter.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultControl {

    @RequestMapping
    public String defaultFunction() {
        return "default Function running";
    }
}
