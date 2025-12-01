package com.design_patterns.creational.abstract_factory;

public class EuropeCarFactory extends CarFactory {

    public Car createCar() {
        return new EuropeCar();
    }

    public Specification createSpecification() {
        return new EuropeSpecification();
    }

}
