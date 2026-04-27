package com.harshil.bank.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;
    private String email;
    private String password;

    @Column(name="phone")
    private String phoneNumber;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    public User(){}

    public User(String name,String email,String phoneNumber,String password){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    // getters
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public Long getUserId(){
        return userId;
    }

    public String getPassword(){
        return password;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setCreateAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

}