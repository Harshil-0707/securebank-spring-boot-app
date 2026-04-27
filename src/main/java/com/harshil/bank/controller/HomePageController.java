package com.harshil.bank.controller;

import com.harshil.bank.dto.LoginUserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @RequestMapping("/")
    public String index(){
        return "forward:/index.html";
    }

}