package com.kyaw.oo.inheritance;

public class Zoo {

    public static void main(String[] args) {

        Mammal monkey = new Monkey();

        monkey.eat();

        monkey.run();

        Monkey castedMonkey = (Monkey) monkey;

        castedMonkey.setColor("white");

        castedMonkey.dance();

        Mammal tiger = new Tiger();

        tiger.eat();

        tiger.run();

    }
}


