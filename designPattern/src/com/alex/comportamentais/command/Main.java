package com.alex.comportamentais.command;

import com.alex.comportamentais.command.concreteCommand.ComandoPower;
import com.alex.comportamentais.command.iCommand.ICasaSmart;
import com.alex.comportamentais.command.invocador.Invoker;
import com.alex.comportamentais.command.receiver.LuzSmart;

public class Main {
    public static void main(String[] args) {
        LuzSmart luz = new LuzSmart();
        ICasaSmart comando = new ComandoPower(luz);
        Invoker controle = new Invoker();
        controle.addComand("btn1", comando);
        controle.addComand("btn2", comando);
        controle.executeCommand("btn1");
        controle.unduCommand("btn2");
    }
}
