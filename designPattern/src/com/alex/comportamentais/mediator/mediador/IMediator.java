package com.alex.comportamentais.mediator.mediador;

import com.alex.comportamentais.mediator.colegas.ColegaComprador;
import com.alex.comportamentais.mediator.colegas.ColegaVendedor;

public interface IMediator {
    void registrarComprador(ColegaComprador comprador);
    void registrarVendedor(ColegaVendedor vendedor);
    void notificarComprador(String mensagem);
    void notificarVendedor(String mensagem);
}
