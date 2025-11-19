package com.tamaris.exercices.ex1;

public class Triangle extends Shape {

    double a;
    double b;
    double c;

public Triangle(double a, double b, double c) {
    super("Triangle");
    this.a = a;
    this.b = b;
    this.c = c;
}

public double area() {
    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}

public double perimeter() {
    return a + b + c;
}
}




