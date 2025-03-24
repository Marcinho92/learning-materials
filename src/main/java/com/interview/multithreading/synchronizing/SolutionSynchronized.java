package com.interview.multithreading.synchronizing;

import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

public class SolutionSynchronized {

    private final Set<String> services = new HashSet<>();

    public synchronized Status registerService(String address) {
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

    public synchronized Optional<String> get() {
        if (services.isEmpty()) return Optional.empty();

        Random random = new Random();
        int rand = random.nextInt(services.size());

        return Optional.of((String) services.toArray()[rand]);
    }

}
