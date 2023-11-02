package com.alex.comportamentais.state.context;

import com.alex.comportamentais.state.estados.state;

public class MaquinaVenda {
    private state estadoAtual;

    public void setEstado(state estado) {
        this.estadoAtual = estado;
    }

    public void inserirMoeda() {
        estadoAtual.inserirMoeda();
    }

    public void ejetarMoeda() {
        estadoAtual.ejetarMoeda();
    }

    public void selecionarProduto() {
        estadoAtual.selecionarProduto();
    }

    public void entregarProduto() {
        estadoAtual.entregarProduto();
    }
}