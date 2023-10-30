package com.alex.estruturais.adapter.models;

public class Computador implements Sistema {

    @Override
    public void ligar(){
        System.out.println("Ligando computador");
    }
    @Override
    public void desligar(){
        System.out.println("Desligando computador");
    }
    @Override
    public void reiniciar(){
        System.out.println("Reiniciando computador");
    }
}
