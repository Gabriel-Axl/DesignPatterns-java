package com.alex.estruturais.proxy.proxyAuthentica;

import com.alex.estruturais.proxy.concrete.Authenticacao;
import com.alex.estruturais.proxy.iabstract.Conta;

public class Proxy implements Conta {
    private Authenticacao at;

    @Override
    public void login(String us, String pw) {
        if(this.at == null){
            this.at = new Authenticacao();
        }
        at.login(us, pw);
    }
}
