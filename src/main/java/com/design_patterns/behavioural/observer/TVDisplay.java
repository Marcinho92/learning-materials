package com.design_patterns.behavioural.observer;

public class TVDisplay implements Observer {

    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void display() {
        System.out.println("TVDisplay temperature: " + this.temperature);
    }
}
