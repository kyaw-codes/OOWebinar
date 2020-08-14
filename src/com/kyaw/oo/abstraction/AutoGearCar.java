package com.kyaw.oo.abstraction;

public abstract class AutoGearCar extends Car {

    public AutoGearCar(String modelNo) {
        super(modelNo);
    }

    protected abstract void driveWithAutoPilot();

}

