package org.example.hw1.ex2;

class Lorry extends Car implements Moveable, Stopable {

    @Override
    public void move(){
        System.out.println("Car is moving");
    }

    @Override
    public void stop(){
        System.out.println("Car is stopping");
    }

    @Override
    void open() {
        System.out.println("Car is open");
    }
}

