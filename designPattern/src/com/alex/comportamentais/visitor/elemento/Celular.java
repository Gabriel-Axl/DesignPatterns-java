package com.alex.comportamentais.visitor.elemento;

import com.alex.comportamentais.visitor.iVisitor.Visitor;

public class Celular extends Produto {
    private Double preco;

    public Celular(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public Double vistar(Visitor visitor) {
        return visitor.taxaCelular(this);
    }
}
