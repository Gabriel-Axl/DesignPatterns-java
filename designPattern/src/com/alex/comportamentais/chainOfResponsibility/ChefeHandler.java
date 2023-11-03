package com.alex.comportamentais.chainOfResponsibility;

public class ChefeHandler extends Handler{
    private Handler proximo;

    public void setProximo(Handler proximo) {
        this.proximo = proximo;
    }

    @Override
    public void aprovar(double total) {
        System.out.println("Pedido aprovado por um chefe.");
    }
}
