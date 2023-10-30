package com.alex.criacionais.builder.director;

import com.alex.criacionais.builder.abstractBuilder.BuilderCelular;
import com.alex.criacionais.builder.product.Celular;

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