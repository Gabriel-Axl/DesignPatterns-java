package com.alex.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonConfiguracaoJogo config = SingletonConfiguracaoJogo.getInstance();

        config.setVolume(70);
        config.setIdioma("Espanhol");

        SingletonConfiguracaoJogo config2 = SingletonConfiguracaoJogo.getInstance();

        config2.setVolume(80);
        config.setIdioma("Japones");

        System.out.println("Volume: " + config.getVolume());
        System.out.println("Idioma: " + config.getIdioma());
        System.out.println("Volume: " + config2.getVolume());
        System.out.println("Idioma: " + config2.getIdioma());

    }
}
