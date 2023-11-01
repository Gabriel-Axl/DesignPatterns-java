package com.alex.comportamentais.templateMethod.template;

public abstract class Bebida {
    public void preparar() {
        ferverAgua();
        prepararIngredientePrincipal();
        adicionarSuplementos();
        servir();
    }

    private void ferverAgua() {
        System.out.println("Fervendo água");
    }

    public abstract void prepararIngredientePrincipal();

    public abstract void adicionarSuplementos();

    private void servir() {
        System.out.println("Servindo a bebida");
    }
}