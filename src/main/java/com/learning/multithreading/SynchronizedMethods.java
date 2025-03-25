package com.learning.multithreading;

public class SynchronizedMethods {

    private int sum = 0;

//    public synchronized void calculate() {
    public void calculate() {
        synchronized (this) {
            sum += 1;
        }
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
