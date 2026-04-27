package com.harshil.bank.controller;

import com.harshil.bank.dto.RegisterUserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupAPIController {

    @PostMapping("/signup/api")
    public String signup(@RequestBody RegisterUserDTO RuDTO){
        return "Signup successful";
    }
}
