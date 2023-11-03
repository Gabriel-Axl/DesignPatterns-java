package com.alex.comportamentais.observer;

public class Main {
    public static void main(String[] args) {
        LojaPublisher magalu = new LojaPublisher();
        Cliente client1 = new Cliente("Alex");
        Cliente client2 = new Cliente("Gabriel");
        Cliente client3 = new Cliente("Pedro");
        Cliente client4 = new Cliente("Paulo");
        Cliente client5 = new Cliente("Thiago");

        magalu.adicionarObservador(client1);
        magalu.adicionarObservador(client2);
        magalu.adicionarObservador(client3);
        magalu.adicionarObservador(client4);
        magalu.adicionarObservador(client5);

        magalu.removerObservador(client4);
        magalu.notificarObservadores("Nova promoção de novembro, todos os itens da categoria informatica com 10% de desconto!");
    }
}
