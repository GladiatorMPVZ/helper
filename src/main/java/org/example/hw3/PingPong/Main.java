package org.example.hw3.PingPong;

public class Main {
    public static void main(String[] args) {
        Object lock = new Object();
        new Thread(new PingPong("ping", lock)).start();
        new Thread(new PingPong("pong", lock)).start();
    }
}
