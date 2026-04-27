package com.harshil.bank.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreateAccountPageController {

    @RequestMapping("/create-account")
    public String createAccount() {
        return "forward:/create-account.html";
    }

}
