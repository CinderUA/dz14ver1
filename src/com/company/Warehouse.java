package com.company;

import java.util.Arrays;

public class Warehouse {
    private Box[] boxes;
    private int numBoxes;

    public Warehouse(int capacity) {
        boxes = new Box[capacity];
        numBoxes = 0;
    }

    public void addBox(Box box) throws IllegalArgumentException {
        if (numBoxes == boxes.length) {
            throw new IllegalArgumentException("Warehouse is full.");
        }
        boxes[numBoxes] = box;
        numBoxes++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Warehouse contains ").append(numBoxes).append(" boxes: \n");
        for (int i = 0; i < numBoxes; i++) {
            sb.append(i+1).append(". ").append(boxes[i].toString()).append("\n");
        }
        return sb.toString();
    }
}