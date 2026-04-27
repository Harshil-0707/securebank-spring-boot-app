package com.harshil.bank.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupPageController {

    @RequestMapping("/signup")
    public String signup(){
        return "forward:/signup.html";
    }

}
