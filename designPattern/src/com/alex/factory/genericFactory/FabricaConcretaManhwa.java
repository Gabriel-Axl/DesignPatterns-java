package com.alex.factory.genericFactory;

import com.alex.factory.abstractProduct.Manga;
import com.alex.factory.abstractProduct.Manhwa;

public class FabricaConcretaManhwa extends Aplicacao{
    @Override
    public Manga fabricarManga() {
        super.manga = new Manhwa();
        return super.manga;
    }
}
