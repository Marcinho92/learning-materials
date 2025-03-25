package com.learning.multithreading.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ExecutorServiceMain {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//
//        Callable<Integer> task = () -> {
//            int[] arr = { 1, 2, 3, 4, 5 };
//            int sum = 0;
//            for (int val: arr) {
//                sum += val;
//            }
//            return sum;
//        };
//        Future<Integer> result = executorService.submit(task);
//        try {
//            Integer sum = result.get();
//            System.out.println(sum);
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//        executorService.shutdown();
//
//
//        ExecutorService executorService2 = Executors.newFixedThreadPool(2);
//        Runnable task2 = () -> {
//            int[] arr = { 1, 2, 3, 4, 5 };
//            int sum = 0;
//            for (int val: arr) {
//                sum += val;
//            }
//            System.out.println(sum);
//        };
//        executorService2.execute(task2);
//        executorService2.shutdown();
//
//
//        ExecutorService executor = Executors.newFixedThreadPool(5);
//        IntStream.range(0, 10).forEach(val -> executor.submit(() -> System.out.println(val + " " + Thread.currentThread().getName())));
//        executor.shutdown();
//
//
//        Thread.sleep(1000);
//
//        ThreadPoolExecutor executor2 =
//                (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
//        executor2.submit(() -> {
//            Thread.sleep(1000);
//            return null;
//        });
//        executor2.submit(() -> {
//            Thread.sleep(1000);
//            return null;
//        });
//        executor2.submit(() -> {
//            Thread.sleep(1000);
//            return null;
//        });
//
//        assertThat(executor2.getPoolSize()).isEqualTo(2);
//        assertThat(executor2.getQueue().size()).isEqualTo(1);
//
//        executor2.shutdown();
//
//
//        ThreadPoolExecutor executor3 =
//                (ThreadPoolExecutor) Executors.newCachedThreadPool();
//        executor3.submit(() -> {
//            Thread.sleep(1000);
//            return null;
//        });
//        executor3.submit(() -> {
//            Thread.sleep(1000);
//            return null;
//        });
//        executor3.submit(() -> {
//            Thread.sleep(1000);
//            return null;
//        });
//
//        assertThat(executor3.getPoolSize()).isEqualTo(3);
//        assertThat(executor3.getQueue().size()).isEqualTo(0);


        int number = 33;
        ExecutorService executorService1 = Executors.newFixedThreadPool(4);
        Future<Integer> result5 = executorService1.submit(() -> factorial(number));

        if (!result5.isDone()) {
            System.out.println("Calculating in progress...");
        }

        System.out.println("Factorial of " + number + ": " + result5.get());
        executorService1.shutdown();

    }

    private static int factorial(int val) {
        AtomicInteger res = new AtomicInteger(1);
        IntStream.range(1, val + 1)
                .forEach(num -> res.updateAndGet(v -> v * num));
        return res.get();
    }

}