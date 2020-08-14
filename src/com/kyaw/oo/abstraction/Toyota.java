package com.kyaw.oo.abstraction;

public class Toyota extends AutoGearCar {

    public Toyota(String modelNo) {
        super(modelNo);
    }

    @Override
    public void driveWithAutoPilot() {
        System.out.printf("Toyota %s is driving with auto pilot mode.\n", this.getModelNo());
    }

    @Override
    protected void pressCarHorn() {
        System.out.println("Tttt..tttt.ttt");
    }

    @Override
    public void drive() {
        System.out.printf("Buu..buu.buu...Toyota %s is driving.\n", this.getModelNo());
    }

}

