package com.alex.factory.genericFactory;

import com.alex.factory.abstractProduct.Manga;
import com.alex.factory.abstractProduct.Webtoon;

public class FabricaConcretaWebtoon extends Aplicacao{
    @Override
    public Manga fabricarManga() {
        super.manga = new Webtoon();
        return super.manga;
    }
}
