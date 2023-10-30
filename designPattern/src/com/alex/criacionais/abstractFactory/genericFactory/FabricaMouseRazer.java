package com.alex.criacionais.abstractFactory.genericFactory;

import com.alex.criacionais.abstractFactory.abstractProducts.Mouse;
import com.alex.criacionais.abstractFactory.abstractProducts.MouseRazeCobra;
import com.alex.criacionais.abstractFactory.abstractProducts.Sensor;
import com.alex.criacionais.abstractFactory.abstractProducts.SensorRazer;

public class FabricaMouseRazer extends FabricaMouse{

    @Override
    public Mouse fabricaMouse() {
        return new MouseRazeCobra();
    }

    @Override
    public Sensor fabricaSensor() {
        return new SensorRazer();
    }
}
