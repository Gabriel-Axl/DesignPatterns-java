package com.alex.factory.genericFactory;

import com.alex.factory.abstractProduct.Manga;

public abstract class Aplicacao {
    protected Manga manga;

    public abstract Manga fabricarManga();
}
