package com.kyaw.oo;

class Person {

    String name;
    int age;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void sayHello() {
        System.out.println("Hello, I am Ko Kyaw");
    }

    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Monkey");

        person.getName();

        person.sayHello();
    }

}


