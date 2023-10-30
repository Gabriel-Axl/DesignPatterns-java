package com.alex.criacionais.factory;

import com.alex.criacionais.factory.abstractProduct.Manga;
import com.alex.criacionais.factory.genericFactory.FabricaConcretaManhwa;

public class main {

        public static void main(String[] args) throws ClassNotFoundException {

            FabricaConcretaManhwa fabrica = new FabricaConcretaManhwa();
            Manga overgeared = fabrica.fabricarManga();
            overgeared.abrir();
            overgeared.fechar();
        }

}
