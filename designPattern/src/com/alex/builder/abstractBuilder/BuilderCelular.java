package com.alex.builder.abstractBuilder;

import com.alex.builder.product.Celular;

public interface BuilderCelular {

    public void buildTela(String modelo);
    public void buildCamera(int resolucao);
    public void buildBateria(int autonomia);
    public Celular getCelular();

}
