package com.patterns.structural.decorator;

public class HeaderNotifierDecorator extends NotifierDecorator {

    public HeaderNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        this.notifier.send("Header: " + message);
    }

}