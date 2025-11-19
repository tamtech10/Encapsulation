package com.tamaris.exercices.ex2;

public class Car extends Vehicles {

    public Car(String brand, String color, double speed, int numberDoors) {
        super(brand, color, speed, numberDoors);
    }

    @Override
    public void start() {
        System.out.println("Car " + brand + " (" + color + ") with " + numberDoors + " doors is starting.");
    }

    @Override
    public void accelerate(double value) {
        speed += value;
        System.out.println("Car " + brand + " speeds up to " + speed + " km/h.");
    }
}
