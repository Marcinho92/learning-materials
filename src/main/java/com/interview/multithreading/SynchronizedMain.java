package com.interview.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;


public class SynchronizedMain {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        SynchronizedMethods summation = new SynchronizedMethods();

        IntStream.range(0, 1000)
                .forEach(count -> executorService.submit(summation::calculate));
        executorService.awaitTermination(1000, TimeUnit.MICROSECONDS);
        executorService.shutdown();

        assertThat(summation.getSum()).isEqualTo(1000);

    }

}