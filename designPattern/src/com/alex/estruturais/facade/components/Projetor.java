package com.alex.estruturais.facade.components;

public class Projetor {
    public void ligar(){
        System.out.println("Aquecendo projetor\nLigando canhão");
    }
    public void reproduzirMidia(Midia mp4){
        System.out.println("Reproduzindo midia: " + mp4.getMidia());
    }
    public void desligar(){
        System.out.println("Desligando projetor");
    }
}
