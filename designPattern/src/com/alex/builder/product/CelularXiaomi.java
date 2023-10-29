package com.alex.builder.product;

public class CelularXiaomi implements Celular{
    private String tela;
    private int resolucao;
    private int autonomia;

    public CelularXiaomi(String tela, int resolucao, int autonomia) {
        this.tela = tela;
        this.resolucao = resolucao;
        this.autonomia = autonomia;
    }

    @Override
    public String getTela() {
        return tela;
    }

    @Override
    public int getResolucao() {
        return resolucao;
    }

    @Override
    public int getBateria() {
        return autonomia;
    }

    @Override
    public String toString() {
        return "CelularXiaomi{" +
                "tela='" + tela + '\'' +
                ", resolucao=" + resolucao +
                "px, autonomia=" + autonomia +
                "Mah}";
    }
}
