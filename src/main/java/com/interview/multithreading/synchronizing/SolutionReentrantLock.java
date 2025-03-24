package com.interview.multithreading.synchronizing;

import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SolutionReentrantLock {

    private final Set<String> services = new HashSet<>();
    private final Lock lock = new ReentrantLock();

    public Status registerService(String address) {
        lock.lock();
        try {
            if (address.isEmpty()) return Status.EMPTY_ADDRESS;

            if (services.contains(address)) {
                return Status.ALREADY_EXIST;
            }

            if (services.size() == 10) {
                return Status.REGISTER_IF_FULL;
            }

            services.add(address);
            return Status.OK;
        } finally {
            lock.unlock();
        }
    }

    public Optional<String> get() {
        lock.lock();
        try {
            if (services.isEmpty()) return Optional.empty();

            Random random = new Random();
            int rand = random.nextInt(services.size());

            return Optional.of((String) services.toArray()[rand]);
        } finally {
            lock.unlock();
        }
    }

}