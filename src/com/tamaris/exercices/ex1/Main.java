package com.tamaris.exercices.ex1;

public class Main {

    static void main(String[] args) {



    Circle c = new Circle(5);
    Rectangle r = new Rectangle(2, 7);
    Triangle t = new Triangle(3, 4, 5);

        System.out.println(c.name + " Area = " + c.area() + " Perimeter = " + c.perimeter());
        System.out.println(r.name + " Area = " + r.area() + " Perimeter = " + r.perimeter());
        System.out.println(t.name + " Area = " + t.area() + " Perimeter = " + t.perimeter());;

    }
}
