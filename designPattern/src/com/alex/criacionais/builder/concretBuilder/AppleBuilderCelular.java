package com.alex.criacionais.builder.concretBuilder;

import com.alex.criacionais.builder.abstractBuilder.BuilderCelular;
import com.alex.criacionais.builder.product.Celular;
import com.alex.criacionais.builder.product.CelularApple;

public class AppleBuilderCelular implements BuilderCelular {
    private String tela;
    private int resolucao;
    private int autonomia;

    @Override
    public void buildTela(String modelo) {
        this.tela = modelo;
    }

    @Override
    public void buildCamera(int resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public void buildBateria(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public Celular getCelular() {
        return new CelularApple(tela, resolucao, autonomia);
    }
}
