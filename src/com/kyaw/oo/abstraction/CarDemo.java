package com.kyaw.oo.abstraction;

public class CarDemo {

    public static void main(String[] args) {

        ManualCar manualCar = new Lamborghini("L-1001");
        manualCar.changeGear(ManualGearbox.ONE);
        manualCar.changeGear(ManualGearbox.TWO);
        manualCar.pressCarHorn();
        manualCar.drive();
        manualCar.changeGear(ManualGearbox.THREE);

        AutoGearCar autoGearCar = new Toyota("Honda 2014");
        autoGearCar.drive();
        autoGearCar.pressCarHorn();
        autoGearCar.driveWithAutoPilot();

    }
}
