package com.kyaw.oo.interfaceDemo;

public class InterfaceDemo {

    public static void main(String[] args) {

        Laptop macbook = new Laptop();
        Button saveBtn = new MacintoshButton();
        Button closeBtn = new MacintoshButton();

        macbook.addButtons(saveBtn, closeBtn);
        macbook.drawOnScreen(saveBtn);
        macbook.drawOnScreen(closeBtn);
        macbook.getAllButtons().forEach(System.out::println);

        Laptop thinkpad = new Laptop();
        Button deleteBtn = new WindowButton();
        deleteBtn.draw(15, 15);

        thinkpad.addButtons(deleteBtn);
        thinkpad.drawOnScreen(deleteBtn);
    }
}
