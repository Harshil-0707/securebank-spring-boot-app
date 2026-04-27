package com.harshil.bank.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name="accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    private Long userId;

    @Column(name="account_number")
    private String accountNumber;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal balance;

    @Column(name="account_type")
    private String accountType;

    public Account(){}

    public Account(Long userId,String accountType,BigDecimal balance) {
        this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
        this.userId = userId;
        this.accountType = accountType;
        this.balance = balance;
    }

    // getters
    public Long getAccountId(){
        return accountId;
    }

    public Long getUserId(){
        return userId;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public BigDecimal getBalance(){
        return balance;
    }

    public String getAccountType(){
        return accountType;
    }

    // setters

    public void setAccountId(Long accountId){
        this.accountId = accountId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
}
