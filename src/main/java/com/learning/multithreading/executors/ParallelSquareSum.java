package com.learning.multithreading.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelSquareSum {

    private static final int NUM_THREADS = 4;

    public static void main(String[] args) {
//        int n = 1_000_000;
        int n = 6;
        int chunk = n / NUM_THREADS;

        List<Future<Long>> futures = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

        for (int i = 0; i < NUM_THREADS; ++i) {
            int start = i * chunk + 1;
            int end = (i == NUM_THREADS - 1) ? n : start + chunk - 1;

            Callable<Long> sumSquares = () -> {
                long sum = 0;
                for (int j = start; j <= end; ++j) {
                    sum += (long) j * j;
                }
                return sum;
            };

//            Callable<Long> task = new SumSquares(start, end);
            Future<Long> future = executor.submit(sumSquares);
            futures.add(future);
        }

        long result = futures.stream()
                .mapToLong(val -> {
                    try {
                        return val.get();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                })
                .sum();

        executor.shutdown();

        System.out.println("Sum of squares for " + n + ": " + result);
    }

    private static class SumSquares implements Callable {

        private final int start;
        private final int end;

        public SumSquares(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Long call() {
            long sum = 0;
            for (int i = start; i <= end; ++i) {
                sum += (long) i * i;
            }
            return sum;
        }
    }

}