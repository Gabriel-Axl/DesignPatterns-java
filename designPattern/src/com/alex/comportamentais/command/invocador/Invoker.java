package com.alex.comportamentais.command.invocador;

import com.alex.comportamentais.command.iCommand.ICasaSmart;

import java.util.*;

public class Invoker {
    private Map<String, ICasaSmart> comandos;
    public Invoker() {
        this.comandos = new HashMap<String, ICasaSmart>();
    }

    public void addComand(String nome, ICasaSmart command){
        comandos.put(nome, command);
    }
    public void executeCommand(String nome){
        ICasaSmart cmd = comandos.get(nome);
        cmd.execute();
    }
    public void unduCommand(String nome){
        ICasaSmart cmd = comandos.get(nome);
        cmd.undu();
    }
}
