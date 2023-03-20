package org.example.hw1.ex3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Red", 5);
        shapes[1] = new Square("Blue", 4);
        shapes[2] = new Triangle("Green", 3, 6);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
        }
    }
}
