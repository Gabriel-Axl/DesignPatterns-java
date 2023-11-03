package com.alex.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class LojaPublisher {
    private List<Observador> subscritos = new ArrayList<>();

    public void adicionarObservador(Observador observador){
        this.subscritos.add(observador);
    }

    public void removerObservador(Observador observador){
        this.subscritos.remove(observador);
    }

    public void notificarObservadores(String mensagem){
        for (Observador ob:this.subscritos) {
            ob.receberNotificacao(mensagem);
        }
    }

}
