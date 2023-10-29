package com.alex.builder.concretBuilder.builder;

import com.alex.builder.concretBuilder.product.Celular;
import com.alex.builder.concretBuilder.product.CelularXiaomi;

public interface BuilderCelular {

    public void buildTela(String modelo);
    public void buildCamera(int resolucao);
    public void buildBateria(int autonomia);
    public Celular getCelular();

}
