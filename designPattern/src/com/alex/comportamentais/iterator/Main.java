package com.alex.comportamentais.iterator;

import com.alex.comportamentais.iterator.concrete.ListaNumeros;
import com.alex.comportamentais.iterator.interfaces.Agregado;
import com.alex.comportamentais.iterator.interfaces.Iterator;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        Agregado lista = new ListaNumeros(numeros);
        Iterator iterador = lista.criarIterador();

        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
