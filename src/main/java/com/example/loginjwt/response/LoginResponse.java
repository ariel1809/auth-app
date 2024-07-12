package com.example.loginjwt.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class LoginResponse {
    private String token;
    private long expiresIn;
}
