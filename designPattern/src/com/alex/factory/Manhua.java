package com.alex.factory;

public class Manhua extends Manga{

    @Override
    public void abrir() {
        System.out.println("Abrindo manga coreano");
    }

    @Override
    public void fechar() {
        System.out.println("fechando manga coreano");
    }

    @Override
    public void passarPagina() {
        System.out.println("passando pagina manga coreano");
    }
}
