package com.harshil.bank.dto;

import java.math.BigDecimal;

public class CreateAccountDTO {

    private BigDecimal balance;
    private String accountType;
    private int userId;

    public CreateAccountDTO(){}

    public CreateAccountDTO(BigDecimal balance,String accountType,int userId){
        this.balance = balance;
        this.accountType = accountType;
        this.userId = userId;
    }

    // setter

    public void setUserId(int userId){
        this.userId = userId;
    }

    // getter

    public BigDecimal getBalance(){
        return this.balance;
    }

    public String getAccountType(){
        return this.accountType;
    }

    public int getUserId(){
        return this.userId;
    }

}
