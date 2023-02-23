package com.company;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(5);

        try {
            Box box1 = new Box(10, 20, 30, "Cardboard");
            warehouse.addBox(box1);
            Box box2 = new Box(15, 25, 35, "Plastic");
            warehouse.addBox(box2);
            ColorBox box3 = new ColorBox(12, 22, 32, "Wood", "Red");
            warehouse.addBox(box3);
            ColorBox box4 = new ColorBox(13, 23, 33, "Metal", "Blue");
            warehouse.addBox(box4);
            Box box5 = new Box(14, 24, 34, "Glass");
            warehouse.addBox(box5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(warehouse.toString());
    }
}