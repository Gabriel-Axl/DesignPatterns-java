package com.alex.abstractFactory;

public class FabricaMouseLogitec extends FabricaMouse{
    @Override
    protected Mouse fabricaMouse() {
        return new MouseG403();
    }

    @Override
    protected Sensor fabricaSensor() {
        return new SensorHash();
    }
}
