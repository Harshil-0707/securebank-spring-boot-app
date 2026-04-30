package com.harshil.bank.controller;

import com.harshil.bank.service.AccountService;
import com.harshil.bank.service.TransactionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class DepositAPIController {

    private final AccountService as;
    private final TransactionService tr;

    public DepositAPIController(AccountService as,TransactionService tr){
        this.as = as;
        this.tr = tr;
    }

    @PostMapping("/dashboard/deposit/api/")
    public String deposit(
            @RequestParam String accountNumber,
            @RequestParam BigDecimal amount
    ){
        as.deposit(accountNumber,amount);
        tr.saveTransaction();
        return "success";
    }

}
