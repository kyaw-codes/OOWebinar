package com.kyaw.oo.inheritance;

public class ShapeRectangle extends Shape {

    public ShapeRectangle(int width, int height) {
        // override parent constructor
        super(width, height);
    }

    public static void main(String[] args) {
        Shape shape = new ShapeRectangle(2,4);
        System.out.println(shape.calculateArea());
    }
}

