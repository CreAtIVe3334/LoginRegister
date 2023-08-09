package com.example.LoginRegister.mapper.impl;

import com.example.LoginRegister.dto.SignDTO;
import com.example.LoginRegister.entity.Client;
import com.example.LoginRegister.mapper.inter.ClientDTOMapper;
import org.springframework.stereotype.Component;

@Component
public class ClientDTOMapperimpl implements ClientDTOMapper {
    @Override
    public SignDTO entityTo(Client client){
        if(client==null) return null;

        return SignDTO.builder().gender(client.getGender())
                .name(client.getName())
                .password(client.getPassword())

                .username(client.getUsername())
                .build();
    }

    @Override
    public Client dtoTo(SignDTO signDTO) {
        if(signDTO==null) return null;
        String user = signDTO.getUsername().replaceAll("<[^>]*>","");

        return Client.builder()
                .gender(signDTO.getGender())
                .name(signDTO.getName())
                .password(signDTO.getPassword())
                .username(user).build();
    }
}
