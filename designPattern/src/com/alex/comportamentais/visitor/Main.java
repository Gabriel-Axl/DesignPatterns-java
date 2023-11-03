package com.alex.comportamentais.visitor;

import com.alex.comportamentais.visitor.elemento.Celular;
import com.alex.comportamentais.visitor.elemento.GPU;
import com.alex.comportamentais.visitor.elemento.Produto;
import com.alex.comportamentais.visitor.estruturaObjeto.Alfandega;
import com.alex.comportamentais.visitor.iVisitor.TaxaBrasil;
import com.alex.comportamentais.visitor.iVisitor.Visitor;

public class Main {
    public static void main(String[] args) {
        Produto iphone = new Celular(1000d);
        Produto xiaomi = new Celular(3000d);
        Produto nvidia3060 = new GPU(2000d);
        Produto amd580 = new GPU(500d);
        Visitor taxaBrasil = new TaxaBrasil();

        Alfandega alfandega = new Alfandega();

        alfandega.adicionarElemento(iphone);
        alfandega.adicionarElemento(xiaomi);
        alfandega.adicionarElemento(nvidia3060);
        alfandega.adicionarElemento(amd580);
        alfandega.aceitarVisitante(taxaBrasil);
    }
}
