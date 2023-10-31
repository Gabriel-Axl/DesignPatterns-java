package com.alex.estruturais.decorator;

import com.alex.estruturais.decorator.component.Debuff;
import com.alex.estruturais.decorator.concrete.FraquezaDebuff;
import com.alex.estruturais.decorator.concrete.ParalisiaDebuffDecorator;
import com.alex.estruturais.decorator.decorador.DebuffDecorator;

public class Client {
    public static void main(String[] args) {
        FraquezaDebuff debuff = new FraquezaDebuff();
        DebuffDecorator decorador = new DebuffDecorator(debuff);
        System.out.println("Debuff: "+decorador.getTime()+"s de "+ decorador.getTipoDebuff());
        ParalisiaDebuffDecorator paralisia = new ParalisiaDebuffDecorator(debuff);

        System.out.println("Debuff: "+paralisia.getTime()+"s de "+ paralisia.getTipoDebuff());
    }
}
