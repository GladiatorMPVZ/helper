package org.example.hw3.PingPong;

public class PingPong implements Runnable {
    private String word;
    private Object lock;

    public PingPong(String word, Object lock) {
        this.word = word;
        this.lock = lock;
    }

    public void run() {
        while (true) {
            synchronized (lock) {
                System.out.println(word);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
