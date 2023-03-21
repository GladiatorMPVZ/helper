package org.example.hw1.ex3;

public class Square extends Shape {

    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String toString() {
        return "Square of side " + side + " and " + super.toString();
    }
}
