package com.harshil.bank.controller;

import com.harshil.bank.dto.LoginUserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeAPIController {
    @PostMapping("/")
    public String loginData(@RequestBody LoginUserDTO luDTO){
        return "login successful";
    }
}
