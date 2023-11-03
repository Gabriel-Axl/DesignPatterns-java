package com.alex.comportamentais.visitor.iVisitor;

import com.alex.comportamentais.visitor.elemento.Celular;
import com.alex.comportamentais.visitor.elemento.GPU;
import com.alex.comportamentais.visitor.elemento.Produto;

public interface Visitor {
    public Double taxaCelular(Celular produto);
    public Double taxaGPU(GPU produto);
}
