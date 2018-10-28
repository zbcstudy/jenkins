package com.wondertek.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class testController {
    @RequestMapping("/index")
    public String hello() {
        return "hello index";
    }
}
