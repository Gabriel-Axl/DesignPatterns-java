package com.alex.factory;

public class FabricaConcretaWebtoon extends Aplicacao{
    @Override
    public Manga fabricarManga() {
        super.manga = new Webtoon();
        return super.manga;
    }
}
