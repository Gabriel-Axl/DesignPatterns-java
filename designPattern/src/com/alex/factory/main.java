package com.alex.factory;

import com.alex.factory.abstractProduct.Manga;
import com.alex.factory.genericFactory.FabricaConcretaManhwa;

public class main {

        public static void main(String[] args) throws ClassNotFoundException {

            FabricaConcretaManhwa fabrica = new FabricaConcretaManhwa();
            Manga overgeared = fabrica.fabricarManga();
            overgeared.abrir();
            overgeared.fechar();
        }

}
