package com.kyaw.oo.abstraction;

public class Lamborghini extends ManualCar {

    public Lamborghini(String modelNo) {
        super(modelNo);
    }

    @Override
    protected void changeGear(ManualGearbox gearNo) {
        System.out.printf("Lamborghini %s is driving with gear no %s\n", this.getModelNo(), gearNo.toString());
    }

    @Override
    protected void pressCarHorn() {
        System.out.println("Pwan...pwan...pwan");
    }

    @Override
    public void drive() {
        System.out.println("Bam...bam..bam...the Lamborghini is driving.");
    }

}

