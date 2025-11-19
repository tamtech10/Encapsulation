package com.tamaris.exercices.ex1;

public class Rectangle extends Shape {

    double width;
    double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }


public double area() {
        return width * height;
}

public double perimeter() {
    return 2 * (width + height);
}

}
