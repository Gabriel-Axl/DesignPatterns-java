package com.alex.factory;

public class Webtoon extends Manga{
    @Override
    public void abrir() {
        System.out.println("Abrindo webtoon");
    }

    @Override
    public void fechar() {
        System.out.println("fechando webtoon");
    }

    @Override
    public void passarPagina() {
        System.out.println("passando pagina webton");
    }

}
