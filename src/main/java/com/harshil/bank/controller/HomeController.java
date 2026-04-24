package com.harshil.bank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //method to show index.html on root "/"
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}

