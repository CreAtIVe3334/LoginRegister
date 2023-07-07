package com.example.LoginRegister.conroller;

import com.example.LoginRegister.dto.SignDTO;
import com.example.LoginRegister.entity.Client;
import com.example.LoginRegister.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("auth")
public class AuthConroller {

    @Autowired
    ClientService clientService;

    @PostMapping("/sign_up")
    public ResponseEntity <Client> resgister(@RequestBody SignDTO signDTO){
        return ResponseEntity.accepted().body(clientService.signup(signDTO));
    }


}
