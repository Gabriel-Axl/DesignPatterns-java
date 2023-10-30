package com.alex.estruturais.composite;

import com.alex.estruturais.composite.component.Caminho;
import com.alex.estruturais.composite.composta.TrajetoComposite;
import com.alex.estruturais.composite.model.pathCarro;
import com.alex.estruturais.composite.model.pathOnibus;

public class Client {
    public static void main(String[] args) {
        TrajetoComposite trajeto = new TrajetoComposite();
        Caminho carro = new pathCarro();
        Caminho carro2 = new pathCarro();
        Caminho onibus = new pathOnibus();
        trajeto.addCaminho(carro);
        trajeto.addCaminho(carro2);
        trajeto.addCaminho(onibus);
        trajeto.andar();
        trajeto.removeCaminho(carro2);
        trajeto.andar();

    }
}
