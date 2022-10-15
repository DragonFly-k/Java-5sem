package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
public class AuthUserDto {

    @NotBlank
    public String login;

    @NotBlank
    public String password;

}