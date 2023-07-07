package com.example.LoginRegister.dto;

import com.example.LoginRegister.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SignDTO {
    private String name;
    private String username;
    private Gender gender;
    private String password;
}
