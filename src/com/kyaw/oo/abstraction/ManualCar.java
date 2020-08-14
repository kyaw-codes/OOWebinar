package com.kyaw.oo.abstraction;

public abstract class ManualCar extends Car {

    public ManualCar(String modelNo) {
        super(modelNo);
    }

    protected abstract void changeGear(ManualGearbox gearNo);

}

enum ManualGearbox {
    R, ONE, TWO, THREE, FOUR, FIVE, SIX
}

