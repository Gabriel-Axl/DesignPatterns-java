package com.alex.criacionais.objectpool;

class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }

    public void frear() {
        System.out.println("O veículo está freando.");
    }
}