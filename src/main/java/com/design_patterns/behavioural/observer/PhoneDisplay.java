package com.design_patterns.behavioural.observer;

public class PhoneDisplay implements Observer {

    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void display() {
        System.out.println("PhoneDisplay temperature: " + this.temperature);
    }
}
