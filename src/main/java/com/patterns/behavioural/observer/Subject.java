package com.patterns.behavioural.observer;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

}
