package com.harshil.bank.dto;

public class RegisterUserDTO {

    private String name;
    private String email;
    private String password;
    private String phoneNumber;

    public RegisterUserDTO(){}

    // getters

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}
