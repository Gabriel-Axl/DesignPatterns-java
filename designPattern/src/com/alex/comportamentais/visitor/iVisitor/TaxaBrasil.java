package com.alex.comportamentais.visitor.iVisitor;

import com.alex.comportamentais.visitor.elemento.Celular;
import com.alex.comportamentais.visitor.elemento.GPU;
import com.alex.comportamentais.visitor.elemento.Produto;

public class TaxaBrasil implements Visitor{
    @Override
    public Double taxaCelular(Celular produto) {
        return produto.getPreco() + produto.getPreco() * 0.3d;
    }

    @Override
    public Double taxaGPU(GPU produto) {
        return produto.getPreco() + produto.getPreco() * 0.9d;
    }
}
