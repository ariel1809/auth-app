package com.example.loginjwt.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class RegisterUserDto {
    private String username;
    private String password;
}
