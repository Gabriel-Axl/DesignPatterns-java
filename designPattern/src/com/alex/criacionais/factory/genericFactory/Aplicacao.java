package com.alex.criacionais.factory.genericFactory;

import com.alex.criacionais.factory.abstractProduct.Manga;

public abstract class Aplicacao {
    protected Manga manga;

    public abstract Manga fabricarManga();
}
