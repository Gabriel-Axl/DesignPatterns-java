package com.alex.criacionais.multiton;

public class Main {
    public static void main(String[] args) {
        MultitonGameConfig config1 = MultitonGameConfig.getInstance("Jogador1");
        MultitonGameConfig config2 = MultitonGameConfig.getInstance("Jogador2");
        //Lança um exceção pois o limit de instacias é 2
        // MultitonGameConfig config3 = MultitonGameConfig.getInstance("Jogador3");

        // Alterando configurações para Jogador1
        config1.setVolume(70);
        config1.setIdioma("Espanhol");

        // Alterando configurações para Jogador2
        config2.setVolume(80);
        config2.setIdioma("ingles");

        // Obtendo configurações
        System.out.println("Configurações para Jogador1:");
        System.out.println("Volume: " + config1.getVolume());
        System.out.println("Idioma: " + config1.getIdioma());

        System.out.println("\nConfigurações para Jogador2:");
        System.out.println("Volume: " + config2.getVolume());
        System.out.println("Idioma: " + config2.getIdioma());
    }
}
