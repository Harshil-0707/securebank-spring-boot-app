package com.harshil.bank.entity;

import com.harshil.bank.enums.TransactionType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @Column(name="account_number")
    private String accountNumber;

    @Column(name="type")
    private TransactionType transactionType;

    @Column(name="amount")
    private BigDecimal transactionAmount;

    @Column(
            name="transaction_date",
            insertable = false,
            updatable = false,
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
    )
    private LocalDateTime transactionTime;

    public Transaction(){}

    public Transaction(String accountNumber,TransactionType transactionType,BigDecimal transactionAmount){
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
    }

    // getters

    public Long getTransactionId(){
        return transactionId;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public TransactionType getTransactionType(){
        return transactionType;
    }

    public BigDecimal getTransactionAmount(){
        return transactionAmount;
    }

    public LocalDateTime getTransactionTime(){
        return transactionTime;
    }

    // setters
    public void setTransactionId(Long transactionId){
        this.transactionId = transactionId;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setTransactionType(TransactionType transactionType){
        this.transactionType = transactionType;
    }

    public void setTransactionAmount(BigDecimal transactionAmount){
        this.transactionAmount = transactionAmount;
    }

    public void setTransactionTime(LocalDateTime transactionTime){
        this.transactionTime = transactionTime;
    }

}
