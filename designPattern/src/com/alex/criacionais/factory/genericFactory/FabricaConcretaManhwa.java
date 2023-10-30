package com.alex.criacionais.factory.genericFactory;

import com.alex.criacionais.factory.abstractProduct.Manga;
import com.alex.criacionais.factory.abstractProduct.Manhwa;

public class FabricaConcretaManhwa extends Aplicacao{
    @Override
    public Manga fabricarManga() {
        super.manga = new Manhwa();
        return super.manga;
    }
}
