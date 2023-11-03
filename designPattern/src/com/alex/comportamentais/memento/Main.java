package com.alex.comportamentais.memento;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();

        editor.escreverTexto("Versão 0");
        historico.salvarMemento(editor.salvar());
        editor.escreverTexto("Versão 1");
        historico.salvarMemento(editor.salvar());
        editor.escreverTexto("Versão 2");
        editor.imprimirTexto();
        editor.restaurar(historico.getMemento());
        editor.imprimirTexto();
        editor.restaurar(historico.getMemento());
        editor.imprimirTexto();
    }
}
