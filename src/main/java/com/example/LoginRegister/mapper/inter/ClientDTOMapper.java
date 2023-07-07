package com.example.LoginRegister.mapper.inter;

import com.example.LoginRegister.dto.SignDTO;
import com.example.LoginRegister.entity.Client;
import org.mapstruct.Mapper;
@Mapper
public interface ClientDTOMapper {
    public SignDTO entityTo(Client client);

    public Client dtoTo(SignDTO signDTO);
}
