package com.alex.builder.concretBuilder;

import com.alex.builder.concretBuilder.builder.BuilderCelular;
import com.alex.builder.concretBuilder.concretBuilder.*;
import com.alex.builder.concretBuilder.director.DirectorCelular;
import com.alex.builder.concretBuilder.product.Celular;

public class Aplication {
    public static void main(String[] args) {
        BuilderCelular contrutorCelular = new AppleBuilderCelular();
        DirectorCelular geradorCelular = new DirectorCelular(contrutorCelular);
        Celular celular = geradorCelular.construirCelular("gorilaGlass", 120, 5000);
        System.out.println(celular);
    }
}
