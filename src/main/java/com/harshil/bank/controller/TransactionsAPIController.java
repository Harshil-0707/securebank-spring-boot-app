package com.harshil.bank.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionsAPIController {
    @GetMapping("/dashboard/transactions/api/")
    public void transactions(){

    }

}
