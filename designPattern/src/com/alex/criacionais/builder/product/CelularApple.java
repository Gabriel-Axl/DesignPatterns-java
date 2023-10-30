package com.alex.criacionais.builder.product;

public class CelularApple implements Celular{
    private String tela;
    private int resolucao;
    private int autonomia;

    public CelularApple(String tela, int resolucao, int autonomia) {
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
        return "CelularApple{" +
                "tela='" + tela + '\'' +
                ", resolucao=" + resolucao +
                "px, autonomia=" + autonomia +
                "Mah}";
    }
}
