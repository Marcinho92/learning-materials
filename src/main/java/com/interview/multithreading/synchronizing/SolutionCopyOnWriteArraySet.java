package com.interview.multithreading.synchronizing;

import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class SolutionCopyOnWriteArraySet {

    private final Set<String> services = new CopyOnWriteArraySet<>();

    public Status registerService(String address) {
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

    public Optional<String> get() {
        if (services.isEmpty()) return Optional.empty();

        Random random = new Random();
        int rand = random.nextInt(services.size());

        return Optional.of((String) services.toArray()[rand]);
    }

}