package com.alex.comportamentais.memento;

public class EditorTexto {
    private String texto;

    public void escreverTexto(String texto) {
        this.texto = texto;
    }

    public Memento salvar() {
        return new Memento(texto);
    }

    public void restaurar(Memento memento) {
        this.texto = memento.getEstado();
    }

    public void imprimirTexto() {
        System.out.println(texto);
    }
}