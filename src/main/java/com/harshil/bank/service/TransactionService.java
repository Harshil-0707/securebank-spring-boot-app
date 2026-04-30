package com.harshil.bank.service;

import com.harshil.bank.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private final TransactionRepository tr;

    public TransactionService(TransactionRepository tr){
        this.tr = tr;
    }

    public void getTransactions(){}

    public void transfer(){}

    public void saveTransaction(){}

}
