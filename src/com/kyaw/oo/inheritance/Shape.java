package com.kyaw.oo.inheritance;

public class Shape {

    private final int width;
    private final int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
}

