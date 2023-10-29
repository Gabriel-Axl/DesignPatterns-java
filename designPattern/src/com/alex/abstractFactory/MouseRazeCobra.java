package com.alex.abstractFactory;

public class MouseRazeCobra extends Mouse{
    @Override
    public void mover() {
        System.out.println("Movendo cobra");
    }

    @Override
    public void clicar() {
        System.out.println("clicando cobra");
    }

}
