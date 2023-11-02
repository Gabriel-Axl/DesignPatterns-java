package com.alex.comportamentais.mediator.colegas;

import com.alex.comportamentais.mediator.mediador.IMediator;

public class ColegaVendedor {
    private final String nome;
    private final IMediator mercado;

    public ColegaVendedor(String nome, IMediator mercado) {
        this.nome = nome;
        this.mercado = mercado;
    }

    public String getNome() {
        return nome;
    }

    public void vender(String produto) {
        mercado.notificarComprador(nome + " está vendendo " + produto);
    }

    public void receberNotificacao(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}
