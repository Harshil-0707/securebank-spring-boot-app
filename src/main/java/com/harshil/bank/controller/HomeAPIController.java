package com.harshil.bank.controller;

import com.harshil.bank.dto.ServiceResponse;
import com.harshil.bank.dto.LoginUserDTO;
import com.harshil.bank.entity.User;
import com.harshil.bank.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeAPIController {

    private AuthService as;

    public HomeAPIController(AuthService as){
        this.as = as;
    }

    @PostMapping("/")
    public ResponseEntity<ServiceResponse<User>> loginData(@RequestBody LoginUserDTO luDTO, HttpServletRequest request){
        ServiceResponse<User> user =  as.login(luDTO);

        if(!user.isSuccess()){
            return new ResponseEntity<>(user,HttpStatus.NOT_FOUND);
        }
        HttpSession session = request.getSession(false);
        session.setAttribute("userId",user.getData().getUserId());

        return new ResponseEntity<>(user,HttpStatus.OK);
    }
}
