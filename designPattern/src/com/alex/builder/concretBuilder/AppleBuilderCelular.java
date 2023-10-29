package com.alex.builder.concretBuilder;

import com.alex.builder.abstractBuilder.BuilderCelular;
import com.alex.builder.product.Celular;
import com.alex.builder.product.CelularApple;

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
