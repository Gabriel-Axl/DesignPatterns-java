package com.alex.comportamentais.mediator.colegas;

import com.alex.comportamentais.mediator.mediador.IMediator;

public class ColegaComprador {
    private final String nome;
    private final IMediator mercado;

    public ColegaComprador(String nome, IMediator mercado) {
        this.nome = nome;
        this.mercado = mercado;
    }

    public String getNome() {
        return nome;
    }

    public void comprar(String produto) {
        mercado.notificarVendedor(nome + " comprou " + produto);
    }

    public void receberNotificacao(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}
