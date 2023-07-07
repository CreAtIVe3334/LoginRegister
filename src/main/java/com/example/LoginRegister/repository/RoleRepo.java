package com.example.LoginRegister.repository;

import com.example.LoginRegister.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role,Long> {
   Role findByName(String name);
}
