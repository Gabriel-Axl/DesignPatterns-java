package com.alex.estruturais.bridge.concret;

import com.alex.estruturais.bridge.abstraction.Dispositivo;

public class DVDPlayer implements Dispositivo {
    private int track = 1;

    @Override
    public void ligar() {
        System.out.println("O DVD Player está ligado");
    }

    @Override
    public void desligar() {
        System.out.println("O DVD Player está desligado");
    }

    @Override
    public void setCanal(int canal) {
        this.track = canal;
        System.out.println("Mudando para a faixa " + canal);
    }
}