package com.alex.comportamentais.command.concreteCommand;

import com.alex.comportamentais.command.receiver.LuzSmart;
import com.alex.comportamentais.command.iCommand.ICasaSmart;

public class ComandoPower implements ICasaSmart {
    private final LuzSmart luz;

    public ComandoPower(LuzSmart luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        this.luz.alterarStatus();
    }

    @Override
    public void undu() {
        this.luz.alterarStatus();
    }
}
