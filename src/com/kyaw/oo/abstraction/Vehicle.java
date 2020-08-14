package com.kyaw.oo.abstraction;

public abstract class Vehicle {

    private final String modelNo;

    public Vehicle(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public abstract void drive();
}


