package com.alex.factory;

public class FabricaConcretaManhwa extends Aplicacao{
    @Override
    public Manga fabricarManga() {
        super.manga = new Manhwa();
        return super.manga;
    }
}
