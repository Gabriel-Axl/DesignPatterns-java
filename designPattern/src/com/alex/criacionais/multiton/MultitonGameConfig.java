package com.alex.criacionais.multiton;

import java.util.HashMap;
import java.util.Map;

public class MultitonGameConfig {

    private static int contadorInstancias = 0;
    private static final int LIMITE_INSTANCIAS = 2;
    private static final Map<String, MultitonGameConfig> instances = new HashMap<>();

    private int volume;
    private String idioma;

    private MultitonGameConfig() {
        this.volume = 50;
        this.idioma = "Inglês";
    }

    public static MultitonGameConfig getInstance(String nome) {
        if (contadorInstancias < LIMITE_INSTANCIAS) {
            contadorInstancias++;
            return new MultitonGameConfig();
        } else {
            throw new IllegalStateException("Limite máximo de instâncias atingido.");
        }
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
// Restante do código...