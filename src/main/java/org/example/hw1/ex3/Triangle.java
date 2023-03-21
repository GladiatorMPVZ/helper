package org.example.hw1.ex3;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public String toString() {
        return "Triangle of base " + base + " and height " + height + " and " + super.toString();
    }
}
