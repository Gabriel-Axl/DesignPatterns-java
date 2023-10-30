package com.alex.singleton;

public class SingletonConfiguracaoJogo {
    private static SingletonConfiguracaoJogo instance;

    private int volume;
    private String idioma;

    private SingletonConfiguracaoJogo() {
        this.volume = 50;
        this.idioma = "Inglês";
    }

    public static synchronized SingletonConfiguracaoJogo getInstance() {
        if (instance == null) {
            instance = new SingletonConfiguracaoJogo();
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}


