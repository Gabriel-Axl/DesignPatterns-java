package com.alex.comportamentais.templateMethod;

import com.alex.comportamentais.templateMethod.model.Cafe;
import com.alex.comportamentais.templateMethod.model.Cha;
import com.alex.comportamentais.templateMethod.template.Bebida;

public class Main {
    public static void main(String[] args) {
        Bebida cha = new Cha();
        cha.preparar();

        System.out.println("-- Mudando de bebida --");

        Bebida cafe = new Cafe();
        cafe.preparar();
    }
}