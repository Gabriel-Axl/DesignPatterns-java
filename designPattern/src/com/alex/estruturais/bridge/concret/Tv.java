package com.alex.estruturais.bridge.concret;

import com.alex.estruturais.bridge.abstraction.Dispositivo;

public class Tv implements Dispositivo {
    private int canal = 1;

    @Override
    public void ligar() {
        System.out.println("A TV está ligada");
    }

    @Override
    public void desligar() {
        System.out.println("A TV está desligada");
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
        System.out.println("Mudando para o canal " + canal);
    }
}
