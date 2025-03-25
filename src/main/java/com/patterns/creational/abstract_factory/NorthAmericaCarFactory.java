package com.patterns.creational.abstract_factory;

public class NorthAmericaCarFactory extends CarFactory {

    public Car createCar() {
        return new NorthAmericaCar();
    }

    public Specification createSpecification() {
        return new NorthAmericaSpecification();
    }

}
