package com.alex.builder.director;

import com.alex.builder.abstractBuilder.BuilderCelular;
import com.alex.builder.product.Celular;

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