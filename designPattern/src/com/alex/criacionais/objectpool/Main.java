package com.alex.criacionais.objectpool;

public class Main {
    public static void main(String[] args) {
        Pool pool = new Pool(3);

        Veiculo veiculo1 = pool.pegarVeiculo();
        Veiculo veiculo2 = pool.pegarVeiculo();

        veiculo1.acelerar();
        veiculo2.frear();

        pool.devolverVeiculo(veiculo1);
        pool.devolverVeiculo(veiculo2);

        Veiculo veiculo3 = pool.pegarVeiculo();
        veiculo3.acelerar();
    }
}
