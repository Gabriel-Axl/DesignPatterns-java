package com.alex.builder.concretBuilder;

import com.alex.builder.abstractBuilder.BuilderCelular;
import com.alex.builder.product.Celular;
import com.alex.builder.product.CelularXiaomi;

public class XiaomiBuilderCelular implements BuilderCelular {
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
        return new CelularXiaomi(tela, resolucao, autonomia);
    }
}
