package com.alex.criacionais.objectpool;


import java.util.ArrayList;
import java.util.List;

public class Pool {
    private List<Veiculo> pool;
    private int maxSize;

    public  Pool(int maxSize) {
        this.pool = new ArrayList<>();
        this.maxSize = maxSize;
        initializePool();
    }

    private void initializePool() {
        for (int i = 0; i < maxSize; i++) {
            pool.add(new Veiculo("Modelo " + (i + 1)));
        }
    }

    public Veiculo pegarVeiculo() {
        if (pool.isEmpty()) {
            throw new IllegalStateException("O pool de veículos está vazio.");
        }
        return pool.remove(pool.size() - 1);
    }

    public void devolverVeiculo(Veiculo veiculo) {
        if (pool.size() < maxSize) {
            pool.add(veiculo);
        }
    }
}

