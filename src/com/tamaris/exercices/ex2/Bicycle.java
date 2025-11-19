package com.tamaris.exercices.ex2;

public class Bicycle extends Vehicles {

        public Bicycle(String brand, String color, double speed) {
            super(brand, color, speed, 0);
        }

        @Override
        public void start() {
            System.out.println("Bicycle " + brand + " (" + color + ") starts pedaling.");
        }

        @Override
        public void accelerate(double value) {
            speed += value;
            System.out.println("Bicycle " + brand + " accelerates to " + speed + " km/h.");
        }
    }

