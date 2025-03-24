package com.interview.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread1 = new MyThread(1);
//        MyThread myThread2 = new MyThread(2);
//
//        myThread1.setName("thread1");
//        myThread2.setName("thread2");
//
//        myThread1.setId(10);
//        myThread2.setId(1000);
//        myThread2.setDaemon(true);

//        myThread1.start();
//        myThread1.join();
//        myThread2.start();


        // Thread Pooling
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        executorService.execute(() -> System.out.println("From executor"));



        //TODO - important!!!
        // Advanced locking
        ReentrantLock reentrantLock = new ReentrantLock();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        //allows eg. lock resource only for writing (read operations are predominant, slow or negatively impacts the performance)


        //TODO - important!!!
        //Inter-thread communication
        Semaphore semaphore = new Semaphore(5);
        semaphore.acquire(5); //if there if free spot then takes it. Otherwise wait for other thread call release method
        semaphore.release();  //release spot for another thread



        //TODO - important!!!
        //Java Executor framework - more flexible and efficient way of handling tasks compared to using raw threads
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; ++i) {
            executorService.execute(new MyThread(i)); //submit tasks for execution but doesn’t return a Future
            Future<?> submit = executorService.submit(new MyThread(i)); //submit tasks for execution and returns Future object - result of the computation
        }

        executorService.shutdown();









    }

}