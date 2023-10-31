package com.alex.estruturais.flyweight;

import com.alex.estruturais.flyweight.client.EditorTexto;
import com.alex.estruturais.flyweight.factoryCaracter.FabricaCaracteres;

public class Main {
    public static void main(String[] args) {
        FabricaCaracteres fabrica = new FabricaCaracteres();
        EditorTexto editor = new EditorTexto(fabrica);

        editor.adicionarCaractere(65);
        editor.adicionarCaractere(76);
        editor.adicionarCaractere(69);
        editor.adicionarCaractere(88);

        editor.imprimirConteudo();
    }
}
