package com.alex.estruturais.adapter;

import com.alex.estruturais.adapter.models.Computador;
import com.alex.estruturais.adapter.models.Notebook;
import com.alex.estruturais.adapter.adaptador.NotebookAdaptee;
public class Cliente {
    public static void main(String[] args) {
        Computador pc = new Computador();
        pc.ligar();
        pc.desligar();
        pc.reiniciar();

        Notebook dell = new Notebook();
        NotebookAdaptee adapter = new NotebookAdaptee(dell);
        adapter.ligar();
        adapter.desligar();
        adapter.reiniciar();
    }
}
