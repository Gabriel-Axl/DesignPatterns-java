package com.alex.estruturais.composite.composta;

import com.alex.estruturais.composite.component.Caminho;

import java.util.ArrayList;
import java.util.List;

public class TrajetoComposite implements Caminho {
    private List<Caminho> caminhos = new ArrayList<Caminho>();

    public void addCaminho(Caminho cm){
        this.caminhos.add(cm);
    }
    public void removeCaminho(Caminho cm){
        this.caminhos.remove(cm);
    }
    @Override
    public void andar() {
        for (Caminho i : caminhos){
            i.andar();
        }
    }
}
