package com.alex.prototype.prototipo;

public abstract class Personagem implements Cloneable {
    protected String name;
    protected int idade;
    protected String[] falas;

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public String[] getFalas() {
        return falas;
    }

    public abstract Personagem clone();
}
