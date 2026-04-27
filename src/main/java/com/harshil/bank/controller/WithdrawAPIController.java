package com.harshil.bank.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class WithdrawAPIController {
    @PostMapping("/dashboard/withdarw/api/")
    public String deposit(
            @RequestParam String accountNumber,
            @RequestParam BigDecimal amount
    ){
        return "success";
    }
}
