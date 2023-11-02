package com.alex.comportamentais.state.estados;

public class EstadoProdutoSelecionado implements state{
    @Override
    public void inserirMoeda() {
        System.out.println("Moeda ja inserida");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Ejetando moeda");
    }

    @Override
    public void selecionarProduto() {
        System.out.println("Produto ja selecionadp");
    }

    @Override
    public void entregarProduto() {
        System.out.println("Entregando produto");
    }
}
