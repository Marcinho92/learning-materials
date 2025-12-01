package com.design_patterns.structural.decorator;

public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }

}