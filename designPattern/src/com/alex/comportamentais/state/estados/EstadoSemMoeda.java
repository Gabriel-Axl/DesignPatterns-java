package com.alex.comportamentais.state.estados;

public class EstadoSemMoeda implements state{
    @Override
    public void inserirMoeda() {
        System.out.println("Moeda inserida.");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Nenhuma moeda inserida.");
    }

    @Override
    public void selecionarProduto() {
        System.out.println("Nenhuma moeda inserida, insira uma moeda antes de selecionar o produto");
    }

    @Override
    public void entregarProduto() {
        System.out.println("Nenhum produto selecionado.");
    }
}
