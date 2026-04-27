package com.harshil.bank.enums;

public enum TransactionType {

    DEPOSIT("DEPOSIT"),
    WITHDARW("WITHDRAW");

    private final String label;

    TransactionType(String label){
        this.label = label;
    }

    public String getLabel(){
        return this.label;
    }

}
