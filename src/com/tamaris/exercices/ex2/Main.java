package com.tamaris.exercices.ex2;

public class Main {

    static void main(String[] args) {

        Car car = new Car("Audi", "Black", 0, 4);
        car.start();
        car.accelerate(20);

        System.out.println();

        Truck truck = new Truck("Volvo", "Blue", 0, 2);
        truck.start();
        truck.accelerate(20);

        System.out.println();

        Bicycle bike = new Bicycle("Peugeot", "Red", 0);
        bike.start();
        bike.accelerate(5);
    }
}
