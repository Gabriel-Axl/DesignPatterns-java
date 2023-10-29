package com.alex.factory;

public class main {
    public static class Main {

        public static void main(String[] args) throws ClassNotFoundException {

            FabricaConcretaManhwa fabrica = new FabricaConcretaManhwa();
            Manga overgeared = fabrica.fabricarManga();
            overgeared.abrir();
        }
    }
}
