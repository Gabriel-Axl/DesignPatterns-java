package com.alex.comportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<Memento> mementos = new ArrayList<Memento>();

    public void salvarMemento(Memento memento) {
        this.mementos.add(memento);
    }

    public Memento getMemento() {
        return mementos.remove(this.mementos.size() -1 );
    }
}