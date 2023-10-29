package com.alex.abstractFactory.genericFactory;

import com.alex.abstractFactory.abstractProducts.Mouse;
import com.alex.abstractFactory.abstractProducts.Sensor;

public abstract class FabricaMouse {
     protected abstract Mouse fabricaMouse();
    protected abstract Sensor fabricaSensor();
}
