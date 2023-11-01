package com.alex.comportamentais.iterator.concrete;

import com.alex.comportamentais.iterator.interfaces.Agregado;
import com.alex.comportamentais.iterator.interfaces.Iterator;

public class ListaNumeros implements Agregado {
    private final int[] elementos;

    public ListaNumeros(int[] elementos) {
        this.elementos = elementos;
    }

    @Override
    public Iterator criarIterador() {
        return new ListaIterador(elementos);
    }
}
