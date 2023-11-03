package com.alex.comportamentais.visitor.elemento;

import com.alex.comportamentais.visitor.iVisitor.Visitor;

public abstract class Produto {
    public abstract Double vistar(Visitor visitar);
}
