package com.interview.multithreading.synchronizing;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

public class SolutionSynchronizedSet {

    private final Set<String> services = Collections.synchronizedSet(new HashSet<>());

    public Status registerService(String address) {
        synchronized (services) {
            if (address.isEmpty()) return Status.EMPTY_ADDRESS;

            if (services.contains(address)) {
                return Status.ALREADY_EXIST;
            }

            if (services.size() == 10) {
                return Status.REGISTER_IF_FULL;
            }

            services.add(address);
            return Status.OK;
        }
    }

    public Optional<String> get() {
        synchronized (services) {
            if (services.isEmpty()) return Optional.empty();

            Random random = new Random();
            int rand = random.nextInt(services.size());

            return Optional.of((String) services.toArray()[rand]);
        }
    }

}