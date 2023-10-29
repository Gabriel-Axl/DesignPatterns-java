package com.alex.abstractFactory.genericFactory;

import com.alex.abstractFactory.abstractProducts.Mouse;
import com.alex.abstractFactory.abstractProducts.MouseRazeCobra;
import com.alex.abstractFactory.abstractProducts.Sensor;
import com.alex.abstractFactory.abstractProducts.SensorRazer;

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
