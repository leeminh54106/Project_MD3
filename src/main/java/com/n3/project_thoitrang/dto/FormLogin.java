package com.n3.project_thoitrang.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FormLogin {

    @NotBlank(message = "Username is empty!")
    private String userName;

    @NotBlank(message = "Username is empty!")
    private String password;

//    @NotBlank(message = "Username is empty!")
    private String fullName;

//    @NotBlank(message = "Username is empty!")
//    @Em/ail(message = "Email not valid")
    private String email;
}
