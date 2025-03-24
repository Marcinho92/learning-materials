package com.interview.multithreading.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class FutureMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SquareCalculator squareCalculator = new SquareCalculator();

        Future<Integer> result = squareCalculator.calculate(10);
        Future<Integer> result2 = squareCalculator.calculate(100);

        while(!(result.isDone() && result2.isDone())) {
            System.out.println("result id ready: " + result.isDone() + ", result2 is ready: " + result2.isDone());
            Thread.sleep(300);
        }

        Integer res = result.get();
        Integer res2 = result2.get();

        System.out.println("result: " + res);
        System.out.println("result2: " + res2);

        squareCalculator.shutdown();


        ForkJoinPool forkJoinPool = new ForkJoinPool();
        FactorialSquareCalculator factorialSquareCalculator = new FactorialSquareCalculator(1000);
        forkJoinPool.execute(factorialSquareCalculator);
        Integer resultForkJoin = factorialSquareCalculator.get();
        System.out.println("resultForkJoin: " + resultForkJoin);
    }

}