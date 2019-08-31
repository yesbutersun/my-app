package com.example.demo.controller;

import com.example.demo.vo.People;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class TestWebController {

    @Value("${mySelf.name}")
    private String name;

    @Value("${mySelf.age}")
    private Integer age;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String TestWeb() {
        People people = new People();
        return "hello Spring" + "  " + "Im" + "  " + name + people.getEmail();
    }
}
