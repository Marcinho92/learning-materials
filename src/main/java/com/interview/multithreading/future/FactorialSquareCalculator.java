package com.interview.multithreading.future;

import java.util.concurrent.RecursiveTask;

public class FactorialSquareCalculator extends RecursiveTask<Integer> {

    private final int n;

    public FactorialSquareCalculator(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= 1) return 1;

        FactorialSquareCalculator calculator = new FactorialSquareCalculator(n - 1);

        calculator.fork();

        return n * n + calculator.join();
    }
}
