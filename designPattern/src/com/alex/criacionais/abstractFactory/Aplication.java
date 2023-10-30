package com.alex.criacionais.abstractFactory;

import com.alex.criacionais.abstractFactory.abstractProducts.Mouse;
import com.alex.criacionais.abstractFactory.abstractProducts.Sensor;
import com.alex.criacionais.abstractFactory.genericFactory.FabricaMouseRazer;

public class Aplication {
    public static void main(String[] args) {
        FabricaMouseRazer fabrica = new FabricaMouseRazer();
        Mouse g403 = fabrica.fabricaMouse();
        Sensor sodiad = fabrica.fabricaSensor();

        g403.clicar();
        g403.mover();
        sodiad.tipoSensor();
        sodiad.valorDpi();
    }
}
