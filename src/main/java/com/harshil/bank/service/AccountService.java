package com.harshil.bank.service;

import com.harshil.bank.dto.ServiceResponse;
import com.harshil.bank.entity.Account;
import com.harshil.bank.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountService {

    private final AccountRepository repo;

    public AccountService(AccountRepository repo){
        this.repo = repo;
    }

    public ServiceResponse<Account> createAccount(Long userId, String accountType, BigDecimal balance){
//        repo.save();
        return null;
    }

    public BigDecimal getBalance(){
        return new BigDecimal("0.0");
    }

    public BigDecimal deposit(String accountNumber,BigDecimal amount){
        return amount;
    }

    public BigDecimal withdraw(String accountNumber,BigDecimal amount){
        return amount;
    }

}
