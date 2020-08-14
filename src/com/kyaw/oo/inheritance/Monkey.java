package com.kyaw.oo.inheritance;

class Monkey extends Mammal { // Monkey is-a mammal

    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void dance() {
        System.out.printf("Da-da-da...A %s monkey is dancing.\n",
                this.color != null ? this.color : "black");
    }

    @Override
    public void eat() {
        System.out.println("Monkey is eating banana");
    }

    @Override
    public void run() {
        super.run();
    }

}

