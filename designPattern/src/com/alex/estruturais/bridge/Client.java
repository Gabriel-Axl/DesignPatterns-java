package com.alex.estruturais.bridge;

import com.alex.estruturais.bridge.abstraction.ControleRemoto;
import com.alex.estruturais.bridge.abstraction.Dispositivo;
import com.alex.estruturais.bridge.concret.ControleRemotoUniversal;
import com.alex.estruturais.bridge.concret.DVDPlayer;
import com.alex.estruturais.bridge.concret.Tv;

public class Client {
    public static void main(String[] args) {
        Dispositivo tv = new Tv();
        Dispositivo dvd = new DVDPlayer();
        ControleRemotoUniversal controle = new ControleRemotoUniversal(dvd);
        controle.ligarDispositivo();
        controle.setCanal(12);
        controle.desligarDispositivo();
    }
}
