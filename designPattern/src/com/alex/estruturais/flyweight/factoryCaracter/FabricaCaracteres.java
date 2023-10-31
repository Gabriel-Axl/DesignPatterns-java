package com.alex.estruturais.flyweight.factoryCaracter;

import com.alex.estruturais.flyweight.concretFlyweight.Caractere;

public class FabricaCaracteres {
    private final Caractere[] caracteres;

    public FabricaCaracteres() {
        caracteres = new Caractere[256];
        for (int i = 0; i < 256; i++) {
            caracteres[i] = new Caractere((char) i);
        }
    }

    public Caractere obterCaractere(int codigo) {
        if (codigo >= 0 && codigo < 256) {
            return caracteres[codigo];
        } else {
            throw new IllegalArgumentException("Código de caractere inválido");
        }
    }
}