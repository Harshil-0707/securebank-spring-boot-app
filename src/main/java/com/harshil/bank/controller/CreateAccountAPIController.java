package com.harshil.bank.controller;

import com.harshil.bank.dto.ServiceResponse;
import com.harshil.bank.entity.Account;
import com.harshil.bank.service.AccountService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CreateAccountAPIController {

    private final AccountService as;

    public CreateAccountAPIController(AccountService as){
        this.as = as;
    }

    @PostMapping("/create-account/api/")
    public ResponseEntity<ServiceResponse<Account>> createAccount(
            @RequestParam String accountType,
            @RequestParam BigDecimal balance,
            HttpServletRequest request
    ) {

        HttpSession session = request.getSession(false);

        if(session == null || session.getAttribute("userId") == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Long userId = (Long) session.getAttribute("userId");

        ServiceResponse<Account> account = as.createAccount(userId,accountType,balance);

        if(account == null || !account.isSuccess()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        session.setAttribute("accountNumber",account.getData().getAccountNumber());

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
