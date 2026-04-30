package com.harshil.bank.repository;

import com.harshil.bank.dto.RegisterUserDTO;
import com.harshil.bank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);

    Optional<User> save(RegisterUserDTO RuDTO);

}
