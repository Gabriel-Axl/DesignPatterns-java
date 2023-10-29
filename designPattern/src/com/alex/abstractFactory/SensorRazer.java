package com.alex.abstractFactory;

public class SensorRazer extends Sensor{
    @Override
    public void tipoSensor() {
        System.out.println("Sensor mouse razer");
    }

    @Override
    public void valorDpi() {
        System.out.println("123123dpi mouse razer");
    }
}
