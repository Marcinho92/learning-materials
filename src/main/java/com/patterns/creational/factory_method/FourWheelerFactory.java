package com.patterns.creational.factory_method;

public class FourWheelerFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
