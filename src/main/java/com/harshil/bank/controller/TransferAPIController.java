package com.harshil.bank.controller;

import com.harshil.bank.service.TransactionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferAPIController {

    private final TransactionService tr;

    public TransferAPIController(TransactionService tr){
        this.tr = tr;
    }

    @PostMapping("/dashboard/transfer/api/")
    public void transfer(){
        tr.transfer();
        tr.saveTransaction();
    }

}
