package com.alex.comportamentais.templateMethod.model;

import com.alex.comportamentais.templateMethod.template.Bebida;

public class Cafe extends Bebida {
    @Override
    public void prepararIngredientePrincipal() {
        System.out.println("Moendo café");
    }

    @Override
    public void adicionarSuplementos() {
        System.out.println("Adicionando leite e açúcar");
    }
}
