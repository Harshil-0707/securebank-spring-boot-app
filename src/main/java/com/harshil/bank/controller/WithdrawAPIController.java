package com.harshil.bank.controller;

import com.harshil.bank.service.AccountService;
import com.harshil.bank.service.TransactionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class WithdrawAPIController {

    private final AccountService as;
    private final TransactionService tr;

    public WithdrawAPIController(AccountService as,TransactionService tr){
        this.as = as;
        this.tr = tr;
    }

    @PostMapping("/dashboard/withdarw/api/")
    public String withdraw(
            @RequestParam String accountNumber,
            @RequestParam BigDecimal amount
    ){
        as.withdraw(accountNumber,amount);
        tr.saveTransaction();
        return "success";
    }
}
