package com.alex.comportamentais.observer;

public class Cliente implements Observador{
    private final String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
    @Override
    public void receberNotificacao(String mensagem) {
        System.out.println(nome +" recebeu notificação:\n"+ mensagem);
    }
}
