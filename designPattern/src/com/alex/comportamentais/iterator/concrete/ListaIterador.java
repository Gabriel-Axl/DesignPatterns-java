package com.alex.comportamentais.iterator.concrete;

import com.alex.comportamentais.iterator.interfaces.Iterator;

public class ListaIterador implements Iterator {
    private final int[] elementos;
    private int posicao = 0;

    public ListaIterador(int[] elementos) {
        this.elementos = elementos;
    }

    @Override
    public boolean hasNext() {
        return posicao < elementos.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return elementos[posicao++];
        } else {
            throw new IndexOutOfBoundsException("Não há mais elementos");
        }
    }
}