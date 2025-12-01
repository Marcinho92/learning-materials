package com.design_patterns.structural.decorator;

public class LoggingNotifierDecorator extends NotifierDecorator {

    public LoggingNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        System.out.println("Logging sending message.");
        this.notifier.send(message);
    }

}