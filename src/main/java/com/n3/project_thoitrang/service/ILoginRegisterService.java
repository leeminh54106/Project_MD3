package com.n3.project_thoitrang.service;

import com.n3.project_thoitrang.dto.FormLogin;
import com.n3.project_thoitrang.dto.FormRegister;
import com.n3.project_thoitrang.model.entity.User;

public interface ILoginRegisterService {
    User handleLogin(FormLogin formLogin);

    void handleRegisterUser(FormRegister formRegister);

    void handleLogout();

    void handleRegisterAdmin(FormRegister formRegister);
}
