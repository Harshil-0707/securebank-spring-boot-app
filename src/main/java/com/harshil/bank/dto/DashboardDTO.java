package com.harshil.bank.dto;

import com.harshil.bank.entity.Transaction;

import java.math.BigDecimal;
import java.util.ArrayList;

public class DashboardDTO {

    private String name;
    private BigDecimal balance;
    private BigDecimal lastTransactionAmount;
    private String accountNumber;
    private ArrayList<Transaction> transactions;

    public DashboardDTO(){}

    public DashboardDTO(String name,BigDecimal balance,BigDecimal lastTransactionAmount,String accountNumber,ArrayList<Transaction> transactions){
        this.name = name;
        this.balance = balance;
        this.lastTransactionAmount = lastTransactionAmount;
        this.accountNumber = accountNumber;
        this.transactions = transactions;
    }

    // getters

    public String getName(){
        return this.name;
    }

    public BigDecimal getBalance(){
        return this.balance;
    }

    public BigDecimal getLastTransactionAmount(){
        return this.lastTransactionAmount;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public ArrayList<Transaction> getTransactions(){
        return this.transactions;
    }

}
