package com.alex.criacionais.builder;

import com.alex.criacionais.builder.abstractBuilder.BuilderCelular;
import com.alex.criacionais.builder.concretBuilder.*;
import com.alex.criacionais.builder.director.DirectorCelular;
import com.alex.criacionais.builder.product.Celular;

public class Aplication {
    public static void main(String[] args) {
        BuilderCelular contrutorCelular = new XiaomiBuilderCelular();
        DirectorCelular geradorCelular = new DirectorCelular(contrutorCelular);
        Celular celular = geradorCelular.construirCelular("gorilaGlass", 120, 5000);
        System.out.println(celular);
    }
}
