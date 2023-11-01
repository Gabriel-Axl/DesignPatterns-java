package com.alex.comportamentais.strategy.tipoPagamento;

import com.alex.comportamentais.strategy.iPagamento.Pagamento;

public class Cartao implements Pagamento {
    @Override
    public void pagar(Double total) {
        System.out.println("Pagando R$"+total+", com cartão");
    }
}
