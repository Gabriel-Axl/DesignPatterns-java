package com.alex.estruturais.proxy.concrete;

import com.alex.estruturais.proxy.iabstract.Conta;

import java.util.Objects;

public class Authenticacao implements Conta {
    private String user = "Alex";
    private String password = "123";

    @Override
    public void login(String us, String pw) {
           if(Objects.equals(this.user, us) && Objects.equals(this.password, pw)){
               System.out.println("Login realizado com sucesso");
           }else{
               System.out.println("Acesso negado");
           }
    }
}
