package com.harshil.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardPageController {

    @RequestMapping("/dashboard")
    public String dashboard(){
        return "forward:dashboard.html";
    }

    @RequestMapping("/dashboard/deposit")
    public String deposit(){
        return "forward:/deposit.html";
    }

    @RequestMapping("/dashboard/withdraw")
    public String withdraw(){
        return "forward:/withdraw.html";
    }

    @RequestMapping("/dashboard/transactions")
    public String transactions(){
        return "forward:/transactions.html";
    }

    @RequestMapping("/dashboard/transfer")
    public String transfer(){
        return "forward:/transfer.html";
    }

}