package com.talentotech2.enviroment.dto;

//CLASE CREADA PARA VALIDAR SI ESTAMOS LOGUEANDO AL USUARIO
public class LoginRequest {
    private String username;
    private String password;
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
