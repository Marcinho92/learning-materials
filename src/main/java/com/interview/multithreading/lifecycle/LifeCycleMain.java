package com.interview.multithreading.lifecycle;

public class LifeCycleMain {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> System.out.println("Test thread"));
        Thread thread2 = new Thread(() -> System.out.println("Test thread"));
        System.out.println("thread state: " + thread.getState());

        thread.start();
        System.out.println("thread state: " + thread.getState());

        Thread.sleep(1000);
        System.out.println("thread state: " + thread.getState());

        thread.wait();

        thread.notify();


    }

}