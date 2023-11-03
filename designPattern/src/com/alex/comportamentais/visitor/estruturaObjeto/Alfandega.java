package com.alex.comportamentais.visitor.estruturaObjeto;

import com.alex.comportamentais.visitor.elemento.Produto;
import com.alex.comportamentais.visitor.iVisitor.Visitor;


import java.util.List;
import java.util.ArrayList;

public class Alfandega {
    private List<Produto> elementos = new ArrayList<>();

    public void adicionarElemento(Produto elemento) {
        elementos.add(elemento);
    }

    public void aceitarVisitante(Visitor visitante) {
        for (Produto elemento : elementos) {
            System.out.println("taxa:"+elemento.vistar(visitante));
        }
    }
}
