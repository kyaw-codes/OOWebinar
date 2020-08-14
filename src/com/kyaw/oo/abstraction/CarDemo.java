package com.kyaw.oo.abstraction;

public class CarDemo {

    public static void main(String[] args) {

        ManualCar manualCar = new Lamborghini("L-1001");

        manualCar.changeGear(ManualGearbox.ONE);


        manualCar.changeGear(ManualGearbox.TWO);


        manualCar.pressCarHorn();


        manualCar.drive();


        manualCar.changeGear(ManualGearbox.THREE);



        AutoGearCar gearCar = new Toyota("Honda 2014");

        gearCar.drive();


        gearCar.pressCarHorn();


        gearCar.driveWithAutoPilot();



    }
}
