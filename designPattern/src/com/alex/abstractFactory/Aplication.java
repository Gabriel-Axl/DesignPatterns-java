package com.alex.abstractFactory;

import com.alex.abstractFactory.abstractProducts.Mouse;
import com.alex.abstractFactory.abstractProducts.Sensor;
import com.alex.abstractFactory.genericFactory.FabricaMouseRazer;

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
