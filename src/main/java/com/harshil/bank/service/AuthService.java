package com.harshil.bank.service;

import com.harshil.bank.dto.ServiceResponse;
import com.harshil.bank.dto.LoginUserDTO;
import com.harshil.bank.dto.RegisterUserDTO;
import com.harshil.bank.entity.User;
import com.harshil.bank.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private final UserRepository ur;

    public AuthService(UserRepository ur){
        this.ur = ur;
    }

    public ServiceResponse<User> register(RegisterUserDTO RuDTO) {

        if (ur.findByEmail(RuDTO.getEmail()).isPresent()) {
            return new ServiceResponse<>(false, "Email already exists", null);
        }

        User user = new User();
        user.setName(RuDTO.getName());
        user.setEmail(RuDTO.getEmail());
        user.setPassword(RuDTO.getPassword());

        User savedUser = ur.save(user);

        return new ServiceResponse<>(true, "User registered", savedUser);
    }

    public ServiceResponse<User> login(LoginUserDTO luDTO){
        String message = null;
        boolean success = true;
        Optional<User> optionalUser = ur.findByEmail(luDTO.getEmail());

        if(optionalUser.isEmpty()){
            message = "Invalid email address";
            success = false;
            return new ServiceResponse<>(success,message,null);
        }

        User user = optionalUser.get();

        return new ServiceResponse<>(success,message,user);
    }
}
