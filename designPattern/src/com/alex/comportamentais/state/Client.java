package com.alex.comportamentais.state;

import com.alex.comportamentais.state.context.MaquinaVenda;
import com.alex.comportamentais.state.estados.EstadoMoedaInserida;
import com.alex.comportamentais.state.estados.EstadoProdutoSelecionado;
import com.alex.comportamentais.state.estados.EstadoSemMoeda;
import com.alex.comportamentais.state.estados.state;

public class Client {
    public static void main(String[] args) {
        MaquinaVenda maquina = new MaquinaVenda();
        state estadoSemMoeda = new EstadoSemMoeda();
        state estadoMoedaInserida = new EstadoMoedaInserida();
        state estadoProdutoSelecionado = new EstadoProdutoSelecionado();


        maquina.setEstado(estadoSemMoeda);

        maquina.inserirMoeda();
        maquina.selecionarProduto();
        maquina.ejetarMoeda();

        maquina.setEstado(estadoMoedaInserida);

        maquina.inserirMoeda();
        maquina.inserirMoeda();
        maquina.selecionarProduto();
        maquina.entregarProduto();

        maquina.setEstado(estadoProdutoSelecionado);

        maquina.inserirMoeda();
        maquina.selecionarProduto();
        maquina.ejetarMoeda();

    }
}
