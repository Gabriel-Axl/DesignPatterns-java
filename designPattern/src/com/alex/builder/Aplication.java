package com.alex.builder;

import com.alex.builder.abstractBuilder.BuilderCelular;
import com.alex.builder.abstractBuilder.*;
import com.alex.builder.concretBuilder.*;
import com.alex.builder.director.DirectorCelular;
import com.alex.builder.product.Celular;

public class Aplication {
    public static void main(String[] args) {
        BuilderCelular contrutorCelular = new XiaomiBuilderCelular();
        DirectorCelular geradorCelular = new DirectorCelular(contrutorCelular);
        Celular celular = geradorCelular.construirCelular("gorilaGlass", 120, 5000);
        System.out.println(celular);
    }
}
