package com.alex.criacionais.abstractFactory.genericFactory;

import com.alex.criacionais.abstractFactory.abstractProducts.Mouse;
import com.alex.criacionais.abstractFactory.abstractProducts.Sensor;

public abstract class FabricaMouse {
     protected abstract Mouse fabricaMouse();
    protected abstract Sensor fabricaSensor();
}
