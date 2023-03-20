package org.example.hw1.ex3;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String toString() {
        return "Shape of color " + color;
    }
}
