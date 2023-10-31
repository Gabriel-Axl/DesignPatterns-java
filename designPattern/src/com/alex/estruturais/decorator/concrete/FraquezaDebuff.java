package com.alex.estruturais.decorator.concrete;

import com.alex.estruturais.decorator.component.Debuff;

public class FraquezaDebuff implements Debuff {
    private String tipoDebuff;
    private Double time;

    public FraquezaDebuff() {
        this.tipoDebuff = "Fraqueza";
        this.time = 15d;
    }

    @Override
    public double getTime() {
        return this.time;
    }

    @Override
    public String getTipoDebuff() {
        return this.tipoDebuff;
    }

}
