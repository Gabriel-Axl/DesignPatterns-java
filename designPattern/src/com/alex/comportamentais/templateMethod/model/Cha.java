package com.alex.comportamentais.templateMethod.model;

import com.alex.comportamentais.templateMethod.template.Bebida;

public class Cha extends Bebida {
    @Override
    public void prepararIngredientePrincipal() {
        System.out.println("Preparando chá");
    }

    @Override
    public void adicionarSuplementos() {
        System.out.println("Adicionando limão");
    }
}
