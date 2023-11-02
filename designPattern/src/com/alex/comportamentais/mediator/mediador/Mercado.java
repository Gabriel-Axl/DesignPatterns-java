package com.alex.comportamentais.mediator.mediador;

import com.alex.comportamentais.mediator.colegas.ColegaComprador;
import com.alex.comportamentais.mediator.colegas.ColegaVendedor;

import java.util.ArrayList;
import java.util.List;

public class Mercado implements IMediator {
    private final List<ColegaComprador> compradores = new ArrayList<>();
    private final List<ColegaVendedor> vendedores = new ArrayList<>();

    @Override
    public void registrarComprador(ColegaComprador comprador) {
        compradores.add(comprador);
    }

    @Override
    public void registrarVendedor(ColegaVendedor vendedor) {
        vendedores.add(vendedor);
    }

    @Override
    public void notificarComprador(String mensagem) {
        for (ColegaComprador comprador : compradores) {
            comprador.receberNotificacao(mensagem);
        }
    }

    @Override
    public void notificarVendedor(String mensagem) {
        for (ColegaVendedor vendedor : vendedores) {
            vendedor.receberNotificacao(mensagem);
        }
    }
}