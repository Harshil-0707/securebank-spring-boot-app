package com.harshil.bank.controller;

import com.harshil.bank.dto.ServiceResponse;
import com.harshil.bank.dto.RegisterUserDTO;
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
public class SignupAPIController {

    private final AuthService as;

    public SignupAPIController(AuthService as){
        this.as = as;
    }

    @PostMapping("/signup/api")
    public ResponseEntity<ServiceResponse<User>> signup(@RequestBody RegisterUserDTO RuDTO, HttpServletRequest request){

        ServiceResponse<User> user = as.register(RuDTO);

        if (!user.isSuccess()) {
            return new ResponseEntity<>(user,HttpStatus.CONFLICT);
        }

        HttpSession session = request.getSession(false);
        session.setAttribute("userId",user.getData().getUserId());

        return new ResponseEntity<>(user,HttpStatus.CREATED);
    }
}
