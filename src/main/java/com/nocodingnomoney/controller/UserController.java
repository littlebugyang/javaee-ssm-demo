package com.nocodingnomoney.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/getUser")
    public String getUser() {
        return "hello world";
    }
}
