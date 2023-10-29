package com.alex.abstractFactory;

public class SensorHash extends Sensor{
    @Override
    public void tipoSensor() {
        System.out.println("Sensor mouse logitec");
    }

    @Override
    public void valorDpi() {
        System.out.println("123123dpi mouse logitec");
    }
}
