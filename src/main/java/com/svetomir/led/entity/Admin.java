package com.svetomir.led.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

    @JsonFormat(pattern = "")
    private String login;

    @JsonFormat(pattern = "")
    private String password;

    public String getLogin(){ return login;}
    public String getPassword(){ return password;}
    public void setLogin(String login ){ this.login = login;}
    public void setPassword(String password){this.password = password;}
}
