package com.alex.prototype.prototipoConcreto;
import com.alex.prototype.prototipo.*;

public class Jarvis extends Personagem {
    public String getName() {
        return "Jarvis, o bagual";
    }

    public int getIdade() {
        return 76;
    }

    public String[] getFalas() {
        return new String[]{"Ola, boa tarde", "Vamos tomar chimarrão", "bem vindo ao sul guerreiro"};
    }

    @Override
    public Personagem clone() {
        return new Jarvis();
    }
}
