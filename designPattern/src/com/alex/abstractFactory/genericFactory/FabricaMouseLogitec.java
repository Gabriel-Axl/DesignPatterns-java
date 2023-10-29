package com.alex.abstractFactory.genericFactory;

import com.alex.abstractFactory.abstractProducts.Mouse;
import com.alex.abstractFactory.abstractProducts.MouseG403;
import com.alex.abstractFactory.abstractProducts.Sensor;
import com.alex.abstractFactory.abstractProducts.SensorHash;

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
