package com.alex.estruturais.flyweight.concretFlyweight;

import com.alex.estruturais.flyweight.abstractFlyweight.Flyweight;

public class Caractere implements Flyweight {
    private final char caractere;

    public Caractere(char caractere) {
        this.caractere = caractere;
    }

    public char getCaractere() {
        return caractere;
    }
}
