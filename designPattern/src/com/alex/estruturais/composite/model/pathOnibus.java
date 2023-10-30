package com.alex.estruturais.composite.model;

import com.alex.estruturais.composite.component.Caminho;

public class pathOnibus implements Caminho {
    @Override
    public void andar() {
        System.out.println("Andando de onibus");
    }
}
