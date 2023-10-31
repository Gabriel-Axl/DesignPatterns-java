package com.alex.estruturais.bridge.concret;

import com.alex.estruturais.bridge.abstraction.ControleRemoto;
import com.alex.estruturais.bridge.abstraction.Dispositivo;

public class ControleRemotoUniversal implements ControleRemoto {
    private Dispositivo dispositivo;

    public ControleRemotoUniversal(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void ligarDispositivo() {
        dispositivo.ligar();
    }

    @Override
    public void desligarDispositivo() {
        dispositivo.desligar();
    }

    @Override
    public void setCanal(int canal) {
        dispositivo.setCanal(canal);
    }
}
