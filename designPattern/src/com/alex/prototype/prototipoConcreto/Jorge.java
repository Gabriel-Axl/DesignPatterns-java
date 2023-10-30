package com.alex.prototype.prototipoConcreto;

import com.alex.prototype.prototipo.Personagem;

public class Jorge extends Personagem {
    public String getName() {
        return "Jorge, o bardo";
    }

    public int getIdade() {
        return 25;
    }

    public String[] getFalas() {
        return new String[]{"Ola, boa tarde", "Vamos ouvir uma musica?", "posso cantar para voce?"};
    }

    @Override
    public Personagem clone() {
        return new Jorge();
    }
}
