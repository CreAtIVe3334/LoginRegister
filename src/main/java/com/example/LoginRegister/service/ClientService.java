package com.example.LoginRegister.service;

import com.example.LoginRegister.dto.SignDTO;
import com.example.LoginRegister.entity.Client;
import com.example.LoginRegister.entity.Role;
import com.example.LoginRegister.mapper.inter.ClientDTOMapper;
import com.example.LoginRegister.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ClientService {

    @Autowired
    BCryptPasswordEncoder encoder;

    @Autowired
    RoleService roleService;

    @Autowired
    ClientDTOMapper clientDTOMapper;

    public Client signup(SignDTO signDTO){
        Client client = clientDTOMapper.dtoTo(signDTO);
        var role = roleService.getRole("USER");
        client.setRoles(List.of(role));
        client.setPassword(encoder.encode(client.getPassword()));
        return client;
    }


}
