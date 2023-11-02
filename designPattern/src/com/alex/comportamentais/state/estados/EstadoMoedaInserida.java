package com.alex.comportamentais.state.estados;

public class EstadoMoedaInserida implements state{
    @Override
    public void inserirMoeda() {
        System.out.println("Já foi inserido uma moeda");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Ejetando moeda");
    }

    @Override
    public void selecionarProduto() {
        System.out.println("Produto selecionado!");
    }

    @Override
    public void entregarProduto() {
        System.out.println("Selecione um produto.");
    }
}
