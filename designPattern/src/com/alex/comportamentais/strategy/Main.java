package com.alex.comportamentais.strategy;

import com.alex.comportamentais.strategy.context.ProcessarPagamento;
import com.alex.comportamentais.strategy.iPagamento.Pagamento;
import com.alex.comportamentais.strategy.tipoPagamento.Boleto;
import com.alex.comportamentais.strategy.tipoPagamento.Pix;

public class Main {
    public static void main(String[] args) {
        Pagamento pix = new Pix();
        ProcessarPagamento api = new ProcessarPagamento(pix);
        api.pagar(45d);
        api.setMetodo(new Boleto());
        api.pagar(80d);
    }
}
