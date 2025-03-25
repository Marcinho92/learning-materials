package com.learning.multithreading.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculator {

    private final ExecutorService executorService = Executors.newFixedThreadPool(3);

    public Future<Integer> calculate(int value) {
        Future<Integer> result = executorService.submit(() -> {
            try {
                Thread.sleep(1000);
                return value * value;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        return result;
    }

    public void shutdown() {
        executorService.shutdown();
    }

}