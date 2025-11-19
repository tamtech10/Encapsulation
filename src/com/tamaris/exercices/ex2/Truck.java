package com.tamaris.exercices.ex2;

public class Truck extends Vehicles {

    public Truck(String brand, String color, double speed, int numberDoors) {
        super(brand, color, speed, numberDoors);
    }

    @Override
    public void start() {
        System.out.println("Truck " + brand + " (" + color + ") with " + numberDoors + " doors rumbles to life.");
    }

    @Override
    public void accelerate(double value) {
        speed += value * 0.5; // sporije ubrzava
        System.out.println("Truck " + brand + " slowly accelerates to " + speed + " km/h.");
    }


}
