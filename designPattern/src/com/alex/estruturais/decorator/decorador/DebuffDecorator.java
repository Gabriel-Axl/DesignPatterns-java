package com.alex.estruturais.decorator.decorador;

import com.alex.estruturais.decorator.component.Debuff;

public class DebuffDecorator implements Debuff {
    private Debuff debuff;

    public DebuffDecorator(Debuff debuff) {
        this.debuff = debuff;
    }

    @Override
    public double getTime() {
        return this.debuff.getTime();
    }

    @Override
    public String getTipoDebuff() {
        return this.debuff.getTipoDebuff();
    }
}
