package com.alex.criacionais.factory.genericFactory;

import com.alex.criacionais.factory.abstractProduct.Manga;
import com.alex.criacionais.factory.abstractProduct.Webtoon;

public class FabricaConcretaWebtoon extends Aplicacao{
    @Override
    public Manga fabricarManga() {
        super.manga = new Webtoon();
        return super.manga;
    }
}
