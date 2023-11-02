package com.alex.comportamentais.mediator;

import com.alex.comportamentais.mediator.colegas.ColegaComprador;
import com.alex.comportamentais.mediator.colegas.ColegaVendedor;
import com.alex.comportamentais.mediator.mediador.Mercado;

public class Main {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();

        ColegaComprador comprador1 = new ColegaComprador("Alice", mercado);
        ColegaComprador comprador2 = new ColegaComprador("Bob", mercado);

        ColegaVendedor vendedor1 = new ColegaVendedor("Charlie", mercado);
        ColegaVendedor vendedor2 = new ColegaVendedor("David", mercado);

        mercado.registrarComprador(comprador1);
        mercado.registrarComprador(comprador2);
        mercado.registrarVendedor(vendedor1);
        mercado.registrarVendedor(vendedor2);

        comprador1.comprar("Livro");
        vendedor2.vender("Câmera");
        vendedor1.vender("Celular");
    }
}