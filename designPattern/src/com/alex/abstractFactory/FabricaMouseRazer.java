package com.alex.abstractFactory;

public class FabricaMouseRazer extends FabricaMouse{

    @Override
    protected Mouse fabricaMouse() {
        return new MouseRazeCobra();
    }

    @Override
    protected Sensor fabricaSensor() {
        return new SensorRazer();
    }
}
