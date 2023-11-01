package com.alex.comportamentais.strategy.context;

import com.alex.comportamentais.strategy.iPagamento.Pagamento;

public class ProcessarPagamento {
    private Pagamento metodo;

    public ProcessarPagamento(Pagamento metodo) {
        this.metodo = metodo;
    }

    public void setMetodo(Pagamento metodo) {
        this.metodo = metodo;
    }

    public void pagar(Double total){
        metodo.pagar(total);
    }
}
