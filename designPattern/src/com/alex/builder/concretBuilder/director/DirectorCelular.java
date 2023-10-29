package com.alex.builder.concretBuilder.director;

import com.alex.builder.concretBuilder.builder.BuilderCelular;
import com.alex.builder.concretBuilder.product.Celular;

public class DirectorCelular {
    private BuilderCelular contrutor;

    public DirectorCelular(BuilderCelular construtor){
        this.contrutor = construtor;
    }

    public Celular construirCelular(String modelo, int resoulcao, int autonomia){
        contrutor.buildTela(modelo);
        contrutor.buildCamera(resoulcao);
        contrutor.buildBateria(autonomia);
        return contrutor.getCelular();
    }
}