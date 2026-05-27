package com.careercompass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }


//    @GetMapping("/register")
//    public String register() {
//        return "register";
//    }
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
//    @GetMapping("/quiz")
//    public String quiz() {
//        return "quiz";
//    }
    @GetMapping("/result")
    public String result() {
        return "result";
    }
//    @GetMapping("/dashboard")
//    public String dashboard() {
//        return "dashboard";
//    }


}