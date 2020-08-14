package com.kyaw.oo.inheritance;

public class Mammal {

    private String name = "Mammal";
    private int age = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("A mammal is eating.");
    }

    public void run() {
        System.out.println("A mammal is running");
    }

}
