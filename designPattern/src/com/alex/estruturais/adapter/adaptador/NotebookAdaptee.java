package com.alex.estruturais.adapter.adaptador;

import com.alex.estruturais.adapter.models.Notebook;
import com.alex.estruturais.adapter.models.Sistema;

public class NotebookAdaptee implements Sistema {
    private Notebook notebook;

    public NotebookAdaptee(Notebook notebook) {
        this.notebook = notebook;
    }

    @Override
    public void ligar() {
        notebook.ligarNotebook();
    }

    @Override
    public void desligar() {
        notebook.desligarNotebook();
    }

    @Override
    public void reiniciar() {
        notebook.reiniciarNotebook();
    }
}
