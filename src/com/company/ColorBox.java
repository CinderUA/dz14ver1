package com.company;

public class ColorBox extends Box {
    private String color;

    public ColorBox(double length, double width, double height, String material, String color) throws IllegalArgumentException {
        super(length, width, height, material);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + color;
    }
}