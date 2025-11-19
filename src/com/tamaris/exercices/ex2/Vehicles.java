package com.tamaris.exercices.ex2;

public class Vehicles {

    String brand;
    String color;
    double speed;
    int numberDoors;

    public Vehicles(String brand, String color, double speed, int numberDoors) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.numberDoors = numberDoors;
    }

    public void start() {
        System.out.println(brand + " (" + color + ") is starting.");
    }

    public void stop() {
        System.out.println(brand + " is stopping...");
    }

    public void accelerate(double value) {
        speed += value;
        System.out.println(brand + " accelerated to " + speed + " km/h.");
    }

}

