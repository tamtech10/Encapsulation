package com.tamaris.heritage;

public class SingleIn { //ovde stavljamo i klau i main jer je vezba
    static void main() {
        B b = new B();
        b.bike();
    }

}


class A {
    int speed = 100;
}

class B extends A {
    void bike() {
        System.out.println("Bike is running at " + speed + "km/h");
    }
}
