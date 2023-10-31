package com.alex.estruturais.decorator.concrete;

import com.alex.estruturais.decorator.component.Debuff;
import com.alex.estruturais.decorator.decorador.DebuffDecorator;

public class ParalisiaDebuffDecorator extends DebuffDecorator {

    public ParalisiaDebuffDecorator(Debuff debuff) {
        super(debuff);
    }
    public double getTime() {
        return super.getTime() + 15d;
    }

    public String getTipoDebuff() {
        return super.getTipoDebuff() + " e Paralisia";
    }
}
