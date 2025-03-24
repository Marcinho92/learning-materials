package com.interview.multithreading;

import lombok.SneakyThrows;

public class MyThread extends Thread {

    private int id;

    public MyThread(int id) {
        this.id = id;
    }

    @SneakyThrows
    @Override
    public void run() {
        System.out.println("Thread " + id);
    }

    private static final Object LOCK = new Object();

    private static void sleepWaitExamples()
            throws InterruptedException {

        Thread.sleep(1000);
        System.out.println(
                "Thread '" + Thread.currentThread().getName() +
                        "' is woken after sleeping for 1 second");

        synchronized (LOCK) {
            LOCK.wait(1000);
            System.out.println("Object '" + LOCK + "' is woken after" +
                    " waiting for 1 second");
        }
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
