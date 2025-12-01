package com.design_patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private int temperature;
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        observers.forEach(observer -> observer.update(this.temperature));
    }

}
