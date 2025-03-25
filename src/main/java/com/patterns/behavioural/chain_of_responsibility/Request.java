package com.patterns.behavioural.chain_of_responsibility;

public class Request {

    private final Priority priority;
    private final String message;

    public Request(Priority priority, String message) {
        this.priority = priority;
        this.message = message;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getMessage() {
        return message;
    }

}