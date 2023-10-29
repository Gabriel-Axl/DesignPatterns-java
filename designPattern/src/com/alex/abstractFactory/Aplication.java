package com.alex.abstractFactory;

public class Aplication {
    public static void main(String[] args) {
        FabricaMouse fabrica = new FabricaMouseRazer();
        Mouse g403 = fabrica.fabricaMouse();
        Sensor sodiad = fabrica.fabricaSensor();

        g403.clicar();
        g403.mover();
        sodiad.tipoSensor();
        sodiad.valorDpi();
    }
}
