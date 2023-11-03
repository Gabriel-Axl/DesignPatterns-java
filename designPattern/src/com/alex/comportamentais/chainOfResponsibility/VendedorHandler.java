package com.alex.comportamentais.chainOfResponsibility;

public class VendedorHandler extends Handler{
    private final Double limite;
    private Handler proximo;

    public VendedorHandler(Double limit) {
        this.limite = limit;
    }

    public void setProximo(Handler proximo) {
        this.proximo = proximo;
    }

    @Override
    public void aprovar(double total) {
        if (total <= limite) {
            System.out.println("Pedido aprovado por um vendedor.");
        } else if (proximo != null) {
            proximo.aprovar(total);
        } else {
            System.out.println("O pedido não pôde ser aprovado.");
        }
    }
}
