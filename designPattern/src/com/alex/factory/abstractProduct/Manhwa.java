package com.alex.factory.abstractProduct;

public class Manhwa extends Manga{

    @Override
    public void abrir() {
        System.out.println("Abrindo manhwa");
    }

    @Override
    public void fechar() {
        System.out.println("fechando manhwa");
    }

    @Override
    public void passarPagina() {
        System.out.println("passando pagina manhwa");
    }
}
