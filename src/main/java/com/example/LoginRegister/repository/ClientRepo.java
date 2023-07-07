package com.example.LoginRegister.repository;

import com.example.LoginRegister.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepo extends JpaRepository<Client, Long> {
    Optional<Client> findByUsername(String user);

}
