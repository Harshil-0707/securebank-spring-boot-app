package com.harshil.bank.controller;


import com.harshil.bank.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionsAPIController {

    private final TransactionService tr;

    public TransactionsAPIController(TransactionService tr){
        this.tr = tr;
    }

    @GetMapping("/dashboard/transactions/api/")
    public void transactions(){
        tr.getTransactions();
    }

}
