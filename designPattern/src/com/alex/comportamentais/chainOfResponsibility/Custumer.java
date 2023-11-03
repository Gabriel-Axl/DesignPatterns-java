package com.alex.comportamentais.chainOfResponsibility;

public class Custumer {
    public static void main(String[] args) {
        VendedorHandler vendedor = new VendedorHandler(5000d);
        GerenteHandler gerente = new GerenteHandler(10000d);
        ChefeHandler chefe = new ChefeHandler();

        vendedor.setProximo(gerente);
        gerente.setProximo(chefe);
        vendedor.aprovar(400);
        vendedor.aprovar(6000);
        vendedor.aprovar(11000);
    }
}
