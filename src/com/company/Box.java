package com.company;

public class Box {
    private double length;
    private double width;
    private double height;
    private String material;

    public Box(double length, double width, double height, String material) throws IllegalArgumentException {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Side length must be greater than zero.");
        }
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Box dimensions: " + length + " x " + width + " x " + height + ", Material: " + material;
    }
}