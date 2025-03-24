package com.interview.multithreading;

public class YieldMain {

    private static int number;
    private static boolean ready;

    static class Reader extends Thread {

        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new Reader().start();
        number = 42;
        ready = true;
    }

}