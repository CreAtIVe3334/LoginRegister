package com.example.LoginRegister.service;

import com.example.LoginRegister.entity.Role;
import com.example.LoginRegister.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleRepo roleRepo;

    public Role getRole(String name){
        return roleRepo.findByName(name);
    }
}
