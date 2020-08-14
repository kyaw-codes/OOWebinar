package com.kyaw.oo.abstraction;

public abstract class Car extends Vehicle {

    public Car(String modelNo) {
        super(modelNo);
    }

    protected abstract void pressCarHorn();

}

