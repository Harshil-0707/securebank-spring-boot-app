package com.harshil.bank.dto;

import java.math.BigDecimal;

public class TransactionDTO {

    private int userId;
    private String accountNumber;
    private BigDecimal amount;

    public TransactionDTO(){}

    // setter

    public void setUserId(int userId){
        this.userId = userId;
    }

    //getter

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public BigDecimal getAmount(){
        return this.amount;
    }

    public int getUserId(){
        return this.userId;
    }
}
