package com.alex.estruturais.flyweight.client;

import com.alex.estruturais.flyweight.concretFlyweight.Caractere;
import com.alex.estruturais.flyweight.factoryCaracter.FabricaCaracteres;

public class EditorTexto {
    private final FabricaCaracteres fabricaCaracteres;
    private final StringBuilder conteudo;

    public EditorTexto(FabricaCaracteres fabricaCaracteres) {
        this.fabricaCaracteres = fabricaCaracteres;
        this.conteudo = new StringBuilder();
    }

    public void adicionarCaractere(int codigo) {
        Caractere caractere = fabricaCaracteres.obterCaractere(codigo);
        conteudo.append(caractere.getCaractere());
    }

    public void imprimirConteudo() {
        System.out.println(conteudo);
    }
}