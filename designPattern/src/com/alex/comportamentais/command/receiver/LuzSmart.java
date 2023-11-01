package com.alex.comportamentais.command.receiver;

import org.w3c.dom.ls.LSOutput;

public class LuzSmart {
    private Boolean isOn = false;

    private void getStatus(){
        System.out.println(this.isOn? "ligado" : "desligado");
    }

    public void alterarStatus(){
        this.isOn = !this.isOn;
        this.getStatus();
    }


}
