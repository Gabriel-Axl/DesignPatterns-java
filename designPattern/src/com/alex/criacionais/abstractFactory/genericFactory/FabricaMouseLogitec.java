package com.alex.criacionais.abstractFactory.genericFactory;

import com.alex.criacionais.abstractFactory.abstractProducts.Mouse;
import com.alex.criacionais.abstractFactory.abstractProducts.MouseG403;
import com.alex.criacionais.abstractFactory.abstractProducts.Sensor;
import com.alex.criacionais.abstractFactory.abstractProducts.SensorHash;

public class FabricaMouseLogitec extends FabricaMouse{
    @Override
    public Mouse fabricaMouse() {
        return new MouseG403();
    }

    @Override
    public Sensor fabricaSensor() {
        return new SensorHash();
    }
}
