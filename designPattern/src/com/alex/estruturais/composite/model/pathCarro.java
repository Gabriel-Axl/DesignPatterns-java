package com.alex.estruturais.composite.model;

import com.alex.estruturais.composite.component.Caminho;

public class pathCarro implements Caminho {
    @Override
    public void andar() {
        System.out.println("Andando de carro");
    }
}
