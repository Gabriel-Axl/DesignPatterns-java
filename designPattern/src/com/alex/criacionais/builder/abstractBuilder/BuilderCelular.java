package com.alex.criacionais.builder.abstractBuilder;

import com.alex.criacionais.builder.product.Celular;

public interface BuilderCelular {

    public void buildTela(String modelo);
    public void buildCamera(int resolucao);
    public void buildBateria(int autonomia);
    public Celular getCelular();

}
